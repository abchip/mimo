/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.social.test.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.abchip.mimo.audio.AudioManager;
import org.abchip.mimo.audio.AudioPlayer;
import org.abchip.mimo.audio.AudioStyle;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguageException;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.mining.MiningManager;
import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.mining.classification.Classifier;
import org.abchip.mimo.mining.classification.Evaluator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.social.twitter.Tweet;
import org.abchip.mimo.social.twitter.TwitterManager;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

@Test(entity = "Twitter")
public class TestTwitter {

	private static final Logger LOGGER = Logs.getLogger(TestTwitter.class);

	@Inject
	private TwitterManager twitterManager;
	@Inject
	private LanguageManager languageManager;
	@Inject
	private MiningManager miningManager;
	@Inject
	private TestAsserter asserter;
	@Inject
	private TestRunner testRunner;
	@Inject
	private AudioManager audioManager;

	@SuppressWarnings("rawtypes")
	@TestStarted
	public void start() throws InterruptedException, ResourceException, LanguageException {

		loadTweets();

		testConfusionMatrix();

		ResourceReader<Tweet> tweetReader = testRunner.getContext().getResourceManager().getResourceReader(Tweet.class);
		ResourceReader<Language> languageReader = testRunner.getContext().getResourceManager().getResourceReader(Language.class);

		try (EntityIterator<Frame> frames = testRunner.getContext().getResourceManager().getResourceReader(Frame.class).find()) {
			for (Frame<?> frame : frames) {
				String text = "The frame " + frame.getName() + " has the following properties:";
				try (AudioPlayer audioPlayer = audioManager.play(testRunner.getContext(), AudioStyle.A, text, true, true)) {
					audioPlayer.start();
				}
				StringBuffer sb = new StringBuffer();
				for (Slot slot : frame.getSlots()) {
					sb.append(slot.getName() + ". ");
				}
				try (AudioPlayer audioPlayer = audioManager.play(testRunner.getContext(), AudioStyle.B, sb.toString(), true, true)) {
					audioPlayer.start();
				}
			}
		}

		Set<String> users = new HashSet<String>();
		Set<String> languages = new HashSet<String>();
		try (EntityIterator<Tweet> tweets = tweetReader.find()) {
			for (Tweet tweet : tweets) {
				users.add(tweet.getUser());
				if (tweet.getLanguage() != null)
					languages.add(tweet.getLanguage());
			}
		}

		try (AudioPlayer audioPlayer = audioManager.play(testRunner.getContext(), AudioStyle.A, "The following languages have been spoken on Twitter", true, true)) {
			audioPlayer.start();
		}

		for (String languageName : languages) {
			Language language = languageReader.lookup(languageName.toUpperCase());
			try (AudioPlayer audioPlayer = audioManager.play(testRunner.getContext(), AudioStyle.A, language.getText(), true, true)) {
				audioPlayer.start();
			}
		}
		try (AudioPlayer audioPlayer = audioManager.play(testRunner.getContext(), AudioStyle.A, "The following users have written on Twitter", true, true)) {
			audioPlayer.start();
		}

		Thread.sleep(1000);

		for (String user : users) {
			try (AudioPlayer audioPlayer = audioManager.play(testRunner.getContext(), AudioStyle.A, user, true, true)) {
				audioPlayer.start();
			}
		}

		try (AudioPlayer audioPlayer = audioManager.play(testRunner.getContext(), AudioStyle.A, "I found the following tweets in the system", true, true)) {
			audioPlayer.start();
		}

		try (EntityIterator<Tweet> tweets = tweetReader.find()) {
			for (Tweet tweet : tweets) {

				if (tweet.getLanguage() == null)
					continue;
				String text = tweet.getText();
				for (String entity : tweet.getEntities()) {
					text = text.replaceAll(entity, "");
				}
				for (String hashtag : tweet.getHashtags()) {
					text = text.replaceAll("#" + hashtag, "");
				}

				if (tweet.getLanguage().equalsIgnoreCase("EN")) {
					try (AudioPlayer audioPlayer = audioManager.play(testRunner.getContext(), AudioStyle.A, tweet.getUser() + " wrote:", true, true)) {
						audioPlayer.start();
					}
				}
				Classification<Language> classification = languageManager.classifyLanguage(testRunner.getContext(), text);
				asserter.assertEquals("Tweet language: " + tweet.getText(), tweet.getLanguage().toUpperCase(), classification.getEntity().getName());
			}
		}
	}

	private void testConfusionMatrix() throws ResourceException {

		List<Language> languages = new ArrayList<Language>();
		ResourceReader<Language> languageReader = testRunner.getContext().getResourceManager().getResourceReader(Language.class);
		try (EntityIterator<Language> languageIterator = languageReader.find()) {
			for (Language language : languageIterator)
				languages.add(language);
		}

		Classifier classifier = miningManager.lookupClassifier(Language.class, String.class);
		Evaluator evaluator = classifier.buildEvaluator(Language.class, String.class);

		ResourceReader<Tweet> tweetReader = testRunner.getContext().getResourceManager().getResourceReader(Tweet.class);
		try (EntityIterator<Tweet> tweets = tweetReader.find()) {
			for (Tweet tweet : tweets) {

				Language language = lookupLanguageByIso(languages, tweet.getLanguage());
				if (language != null)
					evaluator.evaluate(tweet.getText(), language.getText().toLowerCase());
			}
		}

		evaluator.printConfusionMatrix();
	}

	private Language lookupLanguageByIso(List<Language> languages, String iso) {
		for (Language language : languages) {
			if (language.getIso_639_1().equalsIgnoreCase(iso))
				return language;
		}
		return null;
	}

	private void loadTweets() throws ResourceException {

		ResourceWriter<Tweet> tweetWriter = testRunner.getContext().getResourceManager().getResourceWriter(Tweet.class);
		try (EntityIterator<Tweet> tweets = twitterManager.search(testRunner.getContext(), null, "#ai", 1000)) {
			for (Tweet tweet : tweets) {
				try {
					tweetWriter.create(tweet, true);
				} catch (Exception e) {
					LOGGER.error(e.getMessage());
				}
			}
		}
	}
}
