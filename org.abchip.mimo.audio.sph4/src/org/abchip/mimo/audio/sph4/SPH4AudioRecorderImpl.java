/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio.sph4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

import org.abchip.mimo.audio.AudioRecorder;
import org.abchip.mimo.util.Thread;
import org.abchip.mimo.util.ThreadManager;

public class SPH4AudioRecorderImpl implements AudioRecorder {

	private AudioFormat audioFormat = null;
	private DataLine.Info audioInfo = null;

	private Thread audioRecorder = null;

	private TargetDataLine line = null;
	private ByteArrayOutputStream outputStream = null;

	public SPH4AudioRecorderImpl() {
		this.audioFormat = buildAudioFormat();
		this.audioInfo = new DataLine.Info(TargetDataLine.class, audioFormat);
	}

	@Override
	public OutputStream getOutputStream() {
		return outputStream;
	}

	@Override
	public void start() {

		audioRecorder = ThreadManager.qINSTANCE.createThread("mimo-audio", new Runnable() {

			@Override
			public void run() {
				outputStream = new ByteArrayOutputStream();

				try {

					line = (TargetDataLine) AudioSystem.getLine(audioInfo);

					line.open(audioFormat);
					line.start();

					System.out.println("Start capturing...");
					AudioInputStream ais = new AudioInputStream(line);

					System.out.println("Start recording...");

					AudioSystem.write(ais, AudioFileFormat.Type.AU, outputStream);
				} catch (LineUnavailableException ex) {
					ex.printStackTrace();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		});

		ThreadManager.qINSTANCE.start(audioRecorder);
	}

	@Override
	public void stop() {

		ThreadManager.qINSTANCE.stop(audioRecorder);

		line.stop();
		line.close();

		line = null;
		System.out.println("Finished");
	}

	@Override
	public boolean isStopped() {
		if (audioRecorder != null)
			return audioRecorder.isInterrupted();
		else
			return true;
	}

	private AudioFormat buildAudioFormat() {
		float sampleRate = 16000;
		int sampleSizeInBits = 8;
		int channels = 2;
		boolean signed = true;
		boolean bigEndian = true;
		AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits, channels, signed, bigEndian);
		return format;
	}

	@Override
	public void close() {
		this.stop();
	}
}