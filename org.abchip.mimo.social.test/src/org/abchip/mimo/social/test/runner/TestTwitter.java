/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.abchip.mimo.audio.AudioStyle;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.mining.MiningManager;
import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.mining.classification.Classifier;
import org.abchip.mimo.mining.classification.Evaluator;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.social.twitter.Tweet;
import org.abchip.mimo.social.twitter.TwitterManager;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Twitter")
public class TestTwitter {

	@Inject
	private TwitterManager twitterManager;
	@Inject
	private ResourceManager resourceManager;
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

	@TestStarted
	public void start() throws InterruptedException {

		loadTweets();

		testConfusionMatrix();

		ResourceReader<Tweet> tweetReader = resourceManager.getResourceReader(testRunner.getContext(), Tweet.class);
		ResourceReader<Language> languageReader = resourceManager.getResourceReader(testRunner.getContext(), Language.class);

		for (Frame<?> frame : resourceManager.getResourceReader(testRunner.getContext(), Frame.class).find()) {
			String text = "The frame " + frame.getName() + " has the following properties:";
			audioManager.play(testRunner.getContext(), AudioStyle.A, text, true, true);
			StringBuffer sb = new StringBuffer();
			for (Slot slot : frame.getSlots()) {
				sb.append(slot.getName() + ". ");
			}
			audioManager.play(testRunner.getContext(), AudioStyle.B, sb.toString(), true, true);
		}

		Set<String> users = new HashSet<String>();
		Set<String> languages = new HashSet<String>();
		for (Tweet tweet : tweetReader.find()) {
			users.add(tweet.getUser());
			if (tweet.getLanguage() != null)
				languages.add(tweet.getLanguage());
		}

		audioManager.play(testRunner.getContext(), AudioStyle.A, "The following languages have been spoken on Twitter", true, true);

		for (String languageName : languages) {
			Language language = languageReader.lookup(languageName.toUpperCase());
			audioManager.play(testRunner.getContext(), AudioStyle.A, language.getText(), true, true);
		}

		audioManager.play(testRunner.getContext(), AudioStyle.A, "The following users have written on Twitter", true, true);

		Thread.sleep(1000);

		for (String user : users) {
			audioManager.play(testRunner.getContext(), AudioStyle.A, user, true, true);
		}

		audioManager.play(testRunner.getContext(), AudioStyle.A, "I found the following tweets in the system", true, true);

		for (Tweet tweet : tweetReader.find()) {

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
				audioManager.play(testRunner.getContext(), AudioStyle.A, tweet.getUser() + " wrote:", true, true);
			}
			Classification<Language> classification = languageManager.classifyLanguage(testRunner.getContext(), text);
			asserter.assertEquals("Tweet language: " + tweet.getText(), tweet.getLanguage().toUpperCase(), classification.getEntity().getName());
		}
	}

	private void testConfusionMatrix() {

		List<Language> languages = new ArrayList<Language>();
		ResourceReader<Language> languageReader = resourceManager.getResourceReader(testRunner.getContext(), Language.class);
		for (Language language : languageReader.find())
			languages.add(language);

		Classifier classifier = miningManager.lookupClassifier(Language.class, String.class);
		Evaluator evaluator = classifier.buildEvaluator(Language.class, String.class);

		ResourceReader<Tweet> tweetReader = resourceManager.getResourceReader(testRunner.getContext(), Tweet.class);
		for (Tweet tweet : tweetReader.find()) {

			Language language = lookupLanguageByIso(languages, tweet.getLanguage());
			if (language != null)
				evaluator.evaluate(tweet.getText(), language.getText().toLowerCase());
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

	private void loadTweets() {

		ResourceWriter<Tweet> tweetWriter = resourceManager.getResourceWriter(testRunner.getContext(), Tweet.class);
		for (Tweet tweet : twitterManager.search(testRunner.getContext(), null, "#ai", 1000)) {
			try {
				tweetWriter.create(tweet, true);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
