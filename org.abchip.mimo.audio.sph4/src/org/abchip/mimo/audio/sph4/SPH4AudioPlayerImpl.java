/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio.sph4;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.abchip.mimo.audio.Audio;
import org.abchip.mimo.audio.AudioPlayer;
import org.abchip.mimo.context.Thread;
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.context.ThreadStatus;

public class SPH4AudioPlayerImpl implements AudioPlayer {

	private ThreadManager threadManager;
	private Thread audioPlayer;
	private Audio audio;

	public SPH4AudioPlayerImpl(ThreadManager threadManager, Audio audio) {
		this.threadManager = threadManager;
		this.audio = audio;
	}

	@Override
	public Audio getAudio() {
		return audio;
	}

	@Override
	public boolean isStopped() {
		if (audioPlayer != null) {
			return audioPlayer.getThreadStatus() == ThreadStatus.TERMINATED;
		} else
			return true;
	}

	@Override
	public void start() {

		audioPlayer = threadManager.createThread("mimo-audio", new Runnable() {

			@Override
			public void run() {

				InputStream stream = new ByteArrayInputStream(audio.getContent());

				try (AudioInputStream in = AudioSystem.getAudioInputStream(stream)) {

					AudioFormat format = in.getFormat();
					Info info = new Info(SourceDataLine.class, format);

					try (@SuppressWarnings("resource")
					SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info)) {

						line.open(format);
						line.start();

						final byte[] buffer = new byte[4096];
						for (int n = 0; n != -1; n = in.read(buffer, 0, buffer.length)) {
							line.write(buffer, 0, n);
						}

						line.drain();
						line.stop();
					} catch (LineUnavailableException e) {
						throw new IllegalStateException(e);
					}

				} catch (UnsupportedAudioFileException | IOException e) {
					throw new IllegalStateException(e);
				}
			}
		});

		threadManager.start(audioPlayer);
	}

	@Override
	public void stop() {
		threadManager.stop(audioPlayer);
	}

	@Override
	public void close() {
		this.stop();
	}
}