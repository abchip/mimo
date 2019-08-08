/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio.test.runner;

import java.io.ByteArrayOutputStream;

import javax.inject.Inject;

import org.abchip.mimo.audio.Audio;
import org.abchip.mimo.audio.AudioFactory;
import org.abchip.mimo.audio.AudioManager;
import org.abchip.mimo.audio.AudioRecorder;
import org.abchip.mimo.audio.AudioStyle;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Twitter")
public class TestAudio {

	@Inject
	private AudioManager audioManager;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private LanguageManager languageManager;
	@Inject
	private TestAsserter asserter;
	@Inject
	private TestRunner testRunner;
	@Inject
	private FrameManager frameManger;

	@TestStarted
	public void start() throws InterruptedException {

		audioManager.play(testRunner, AudioStyle.A, "Hi Diana, there is a kitchen to clean!!", true, true);

		audioManager.play(testRunner, AudioStyle.A, "Hi Mattia, how are you?", true, true);

		readFrames();

		// recordAudio();

		EntityReader<Audio> audioReader = resourceManager.getEntityReader(testRunner, Audio.class, ResourceScope.CONTEXT);
		for (Audio audio : audioReader.find(null)) {

			asserter.assertNotNull("Audio content", audio.getContent());

			audioManager.play(testRunner, audio, true, true);

			Classification<Language> classification = languageManager.classifyLanguage(testRunner, audio.getText());
			System.out.println(classification);
		}
	}

	private void readFrames() throws InterruptedException {

		audioManager.play(testRunner, AudioStyle.A, "I found the following frames in the system", true, true);

		for (Frame<Entity> frame : frameManger.getFrameReader(testRunner).find(null)) {
			audioManager.play(testRunner, AudioStyle.B, frame.getName(), true, true);
		}

		audioManager.play(testRunner, AudioStyle.A, "I found the following languages in the system", true, true);

		EntityReader<Language> languageReader = resourceManager.getEntityReader(testRunner, Language.class, ResourceScope.CONTEXT);
		for (Language language : languageReader.find(null)) {
			audioManager.play(testRunner, AudioStyle.B, language.getText(), true, true);
		}
	}

	@SuppressWarnings("unused")
	private void recordAudio() throws InterruptedException {

		AudioRecorder audioRecorder = audioManager.record(testRunner);
		audioRecorder.start();
		Thread.sleep(5000);
		audioRecorder.stop();

		Audio audio = AudioFactory.eINSTANCE.createAudio();
		audio.setName("mimo-test");
		audio.setText("Mimo audio test");
		audio.setContent(((ByteArrayOutputStream) audioRecorder.getOutputStream()).toByteArray());

		EntityWriter<Audio> audioWriter = resourceManager.getEntityWriter(testRunner, Audio.class, testRunner.getContext().getContextDescription().getResourceTemporary());
		audioWriter.save(audio, true);
	}
}
