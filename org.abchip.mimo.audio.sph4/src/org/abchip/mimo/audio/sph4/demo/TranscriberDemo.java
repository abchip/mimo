package org.abchip.mimo.audio.sph4.demo;

import java.io.InputStream;
import java.util.logging.Logger;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import edu.cmu.sphinx.decoder.adaptation.Stats;
import edu.cmu.sphinx.decoder.adaptation.Transform;
import edu.cmu.sphinx.result.WordResult;

public class TranscriberDemo {

	public static void main(String[] args) throws Exception {
		Logger cmRootLogger = Logger.getLogger("default.config");
		cmRootLogger.setLevel(java.util.logging.Level.OFF);
		String conFile = System.getProperty("java.util.logging.config.file");
		if (conFile == null) {
			System.setProperty("java.util.logging.config.file", "ignoreAllSphinx4LoggingOutput");
		}

		System.out.println("Loading models...");

		Configuration configuration = new Configuration();

		// Load model from the jar
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");

		// You can also load model from folder
		// configuration.setAcousticModelPath("file:en-us");

		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		SpeechResult result;
		try (InputStream stream = TranscriberDemo.class.getResourceAsStream("10001-90210-01803.wav")) {
			stream.skip(44);

			// Simple recognition with generic model
			recognizer.startRecognition(stream);

			while ((result = recognizer.getResult()) != null) {

				System.out.format("Hypothesis: %s\n", result.getHypothesis());

				System.out.println("List of recognized words and their times:");
				for (WordResult r : result.getWords()) {
					System.out.println(r);
				}

				System.out.println("Best 3 hypothesis:");
				for (String s : result.getNbest(3))
					System.out.println(s);

			}
			recognizer.stopRecognition();
		}

		// Live adaptation to speaker with speaker profiles

		try (InputStream stream = TranscriberDemo.class.getResourceAsStream("10001-90210-01803.wav")) {
			stream.skip(44);

			// Stats class is used to collect speaker-specific data
			Stats stats = recognizer.createStats(1);
			recognizer.startRecognition(stream);
			while ((result = recognizer.getResult()) != null) {
				stats.collect(result);
			}
			recognizer.stopRecognition();

			// Transform represents the speech profile
			Transform transform = stats.createTransform();
			recognizer.setTransform(transform);

			// Decode again with updated transform
			try (InputStream stream2 = TranscriberDemo.class.getResourceAsStream("10001-90210-01803.wav")) {
				stream2.skip(44);
				recognizer.startRecognition(stream2);
				while ((result = recognizer.getResult()) != null) {
					System.out.format("Hypothesis: %s\n", result.getHypothesis());
				}
				recognizer.stopRecognition();
			}

		}

	}

}
