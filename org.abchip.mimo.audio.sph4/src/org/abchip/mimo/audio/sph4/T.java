package org.abchip.mimo.audio.sph4;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
 
public class T {
     
    private static final String VOICENAME= "kevin16";
 
    public static void main(String[] args) {
         
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
             
        voice = voiceManager.getVoice(VOICENAME);
        voice.allocate();
        voice.speak("hello world");
    }
}