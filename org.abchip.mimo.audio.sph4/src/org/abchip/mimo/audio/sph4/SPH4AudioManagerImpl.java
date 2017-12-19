/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio.sph4;

import java.io.File;
import java.nio.file.Files;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.sound.sampled.AudioFileFormat;
import javax.speech.Central;
import javax.speech.Engine;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

import org.abchip.mimo.audio.Audio;
import org.abchip.mimo.audio.AudioFactory;
import org.abchip.mimo.audio.AudioManager;
import org.abchip.mimo.audio.AudioPlayer;
import org.abchip.mimo.audio.AudioRecorder;
import org.abchip.mimo.audio.AudioStyle;
import org.abchip.mimo.context.ContextProvider;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;

public class SPH4AudioManagerImpl implements AudioManager {

	@PostConstruct
	private void init() {
		String conFile = System.getProperty("java.util.logging.config.file");
		if (conFile == null) {
			System.setProperty("java.util.logging.config.file", "ignoreAllSphinx4LoggingOutput");
		}
	}

	@Override
	public AudioRecorder record(ContextProvider contextProvider) {
		return new SPH4AudioRecorderImpl();
	}

	@Override
	public AudioPlayer play(ContextProvider contextProvider, Audio audio, boolean start, boolean waitEnd) {

		AudioPlayer audioPlayer = new SPH4AudioPlayerImpl(audio);
		if (start)
			audioPlayer.start();
		if (waitEnd) {
			while (!audioPlayer.isStopped()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
		return audioPlayer;
	}

	@Override
	public AudioPlayer play(ContextProvider contextProvider, AudioStyle style, String text, boolean start, boolean waitEnd) {

//		play(text);
		
		Audio audio = AudioFactory.eINSTANCE.createAudio();
		audio.setName("Kevin");
		audio.setText("Kevin voice");

		try {

			VoiceManager voiceManager = VoiceManager.getInstance();
			Voice voice = voiceManager.getVoice("kevin16");
			// voice.setStyle("casual");
			voice.allocate();

			File tempFile = File.createTempFile("mimo-audio", ".wav");
			String fileName = tempFile.getAbsolutePath();
			fileName = fileName.substring(0, fileName.lastIndexOf('.'));

			com.sun.speech.freetts.audio.AudioPlayer audioPlayer = new SingleFileAudioPlayer(fileName, AudioFileFormat.Type.WAVE);
			voice.setAudioPlayer(audioPlayer);
			voice.setVolume(100);

			voice.setRate((float) style.getValue());
			if(style == AudioStyle.B)
				voice.setPitch((float) 185);
			else
				voice.setPitch((float) 100);
					

//			voice.setPitch((float) 100);

			voice.speak(text);
			voice.deallocate();
			audioPlayer.close();

			audio.setContent(Files.readAllBytes(tempFile.toPath()));

			tempFile.delete();
		} catch (Exception e) {
			e.printStackTrace();
			e.toString();
		}

		AudioPlayer audioPlayer = new SPH4AudioPlayerImpl(audio);
		
		if (start)
			audioPlayer.start();
		
		if (waitEnd) {
			while (!audioPlayer.isStopped()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
		
		return audioPlayer;
	}

	@SuppressWarnings("unused")
	private void play(String text) {
		try {
			System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

			SynthesizerModeDesc desc = new SynthesizerModeDesc(Locale.US);
			Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
			Synthesizer synthesizer = Central.createSynthesizer(desc);
			synthesizer.allocate();
			synthesizer.resume();

			SynthesizerModeDesc smd = (SynthesizerModeDesc) synthesizer.getEngineModeDesc();
			javax.speech.synthesis.Voice[] voices = smd.getVoices();
			javax.speech.synthesis.Voice voice = null;
			for (javax.speech.synthesis.Voice voice1 : voices) {
				if (voice1.getName().equals("kevin")) {
					voice = voice1;
					break;
				}
			}
			synthesizer.getSynthesizerProperties().setVoice(voice);
			// synthesizer.getSynthesizerProperties().setVolume(100);
			// synthesizer.allocate();
			// synthesizer.resume();
			synthesizer.speakPlainText("Hello", null);
			synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
			synthesizer.deallocate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static void printState(Synthesizer synth) {
		System.out.println("The current States are:");
		if (synth.testEngineState(Synthesizer.QUEUE_EMPTY))
			System.out.println("State = QUEUE_EMPTY");
		if (synth.testEngineState(Synthesizer.QUEUE_NOT_EMPTY))
			System.out.println("State = QUEUE_NOT_EMPTY");
		if (synth.testEngineState(Engine.ALLOCATED))
			System.out.println("State = ALLOCATED");
		if (synth.testEngineState(Engine.DEALLOCATED))
			System.out.println("State = DEALLOCATED");
		if (synth.testEngineState(Engine.ALLOCATING_RESOURCES))
			System.out.println("State = ALLOCATING_RESOURCES");
		if (synth.testEngineState(Engine.DEALLOCATING_RESOURCES))
			System.out.println("State = DEALLOCATING_RESOURCES");

		if (synth.testEngineState(Engine.RESUMED))
			System.out.println("State = RESUMED");
		if (synth.testEngineState(Engine.PAUSED))
			System.out.println("State = PAUSED");

	}
}