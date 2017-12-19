package org.abchip.mimo.audio.sph4.demo;

import javax.sound.sampled.AudioFileFormat;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;

public class JsapiDemo {

	public static void main(String[] args) {

//		System.setProperty("mbrola.base", "file:///home/mattia/Software/Java/freetts-1.2.2-bin/freetts-1.2/mbrola");

		JsapiDemo obj = new JsapiDemo();

		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= 1; i++)
			sb.append("Hi, Diana, how are you?");

		obj.dospeak(sb.toString(), "kevin");
	}

	public void dospeak(String speak, String voiceName) {

		try {

			VoiceManager voiceManager = VoiceManager.getInstance();
			Voice voice = voiceManager.getVoice(voiceName);
			voice.setStyle("casual");
			voice.allocate();         

			SingleFileAudioPlayer audioPlayer = new SingleFileAudioPlayer("/home/mattia/speek", AudioFileFormat.Type.WAVE);
			voice.setAudioPlayer(audioPlayer);
			voice.setVolume(70);
			voice.speak(speak); // Speaks the text
			voice.deallocate();
			audioPlayer.close();

//			voice.allocate();
//			voice.speak(speak);
		} catch (Exception e) {
			e.printStackTrace();
			e.toString();
		} finally {
//			voice.deallocate();
		}
	}
}
