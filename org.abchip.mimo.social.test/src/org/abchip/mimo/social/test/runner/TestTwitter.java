/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.social.test.runner;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import org.abchip.mimo.audio.AudioManager;
import org.abchip.mimo.audio.AudioStyle;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.social.twitter.Tweet;
import org.abchip.mimo.social.twitter.TwitterManager;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Twitter")
public class TestTwitter {

	@Inject
	private FrameManager frameManager;
	@Inject
	private TwitterManager twitterManager;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private LanguageManager languageManager;	
	@Inject
	private TestAsserter asserter;
	@Inject
	private TestRunner testRunner;
	@Inject
	private AudioManager audioManager;
	
	@SuppressWarnings("unused")
	@TestStarted
	public void start() throws InterruptedException {
		
//		loadTweets();
		
		EntityReader<Tweet> tweetReader = resourceManager.getEntityReader(testRunner, Tweet.class, ResourceScope.CONTEXT);
		EntityReader<Language> languageReader = resourceManager.getEntityReader(testRunner, Language.class, ResourceScope.CONTEXT);
		
		Tweet t = tweetReader.lookup("939830847619944449");

		EntityReader<Frame<Entity>> frameReader = frameManager.getFrameReader(testRunner);
		
		for(Frame<?> frame: frameReader.find(null)) {
			String text = "The frame " + frame.getName() + " has the following properties:";
//			audioManager.play(testRunner, AudioStyle.A, text, true, true);
			StringBuffer sb = new StringBuffer();
			for(Slot slot: frame.getSlots()) {
				sb.append(slot.getName() + ". ");
			}
//			audioManager.play(testRunner, AudioStyle.B, sb.toString(), true, true);
		}
		

		Set<String> users = new HashSet<String>();
		Set<String> languages = new HashSet<String>();
		for (Tweet tweet : tweetReader.find(null)) {
			users.add(tweet.getUser());
			if(tweet.getLanguage() != null)
				languages.add(tweet.getLanguage());
		}
		
		audioManager.play(testRunner, AudioStyle.A, "The following languages have been spoken on Twitter", true, true);

		for(String languageName: languages) {
			Language language = languageReader.lookup(languageName.toUpperCase());
			if(language == null)
				"".toCharArray();
//				audioManager.play(testRunner, AudioStyle.A, "Unknown language: " + languageName, true, true);
			else
				audioManager.play(testRunner, AudioStyle.A, language.getText(), true, true);
		}
		
		audioManager.play(testRunner, AudioStyle.A, "The following users have written on Twitter", true, true);

		Thread.sleep(1000);
		
		for(String user: users) {
//			audioManager.play(testRunner, AudioStyle.A, user, true, true);
		}
		
		audioManager.play(testRunner, AudioStyle.A, "I found the following tweets in the system", true, true);

		for (Tweet tweet : tweetReader.find(null)) {
			
			if(tweet.getLanguage() == null)
				continue;
			String text = tweet.getText();
			for(String entity: tweet.getEntities()) {
				text = text.replaceAll(entity, "");
			}
			for(String hashtag: tweet.getHashtags()) {
				text = text.replaceAll("#"+hashtag, "");
			}
			
			if(tweet.getLanguage().equalsIgnoreCase("EN")) {
				audioManager.play(testRunner, AudioStyle.A, tweet.getUser() + " wrote:", true, true);
				audioManager.play(testRunner, AudioStyle.A, text, true, true);
			}
			Classification<Language> classification = languageManager.classifyLanguage(testRunner, text);
			asserter.assertEquals("Tweet language: " + tweet.getText(), tweet.getLanguage().toUpperCase(), classification.getEntity().getName());
		}
	}
	
	@SuppressWarnings("unused")
	private void loadTweets() {
		
		EntityIterator<Tweet> tweetIterator = twitterManager.search(testRunner, null, "#ai", 100);
		asserter.assertTrue("Count tweets", tweetIterator.hasNext());

		EntityWriter<Tweet> tweetWriter = resourceManager.getEntityWriter(testRunner, Tweet.class, testRunner.getContext().getContextDescription().getResourceTemporary());
		for (Tweet tweet : tweetIterator) {
			try {
				tweetWriter.save(tweet, true);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
