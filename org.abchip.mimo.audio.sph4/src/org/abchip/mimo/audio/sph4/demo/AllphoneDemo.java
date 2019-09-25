package org.abchip.mimo.audio.sph4.demo;

import java.io.InputStream;
import java.util.logging.Logger;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.Context;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.result.WordResult;
import edu.cmu.sphinx.util.TimeFrame;

public class AllphoneDemo {
	public static void main(String[] args) throws Exception {
		Logger cmRootLogger = Logger.getLogger("default.config");
		cmRootLogger.setLevel(java.util.logging.Level.OFF);
		String conFile = System.getProperty("java.util.logging.config.file");
		if (conFile == null) {
			System.setProperty("java.util.logging.config.file", "ignoreAllSphinx4LoggingOutput");
		}

		Configuration configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");

		Context context = new Context(configuration);
		context.setLocalProperty("decoder->searchManager", "allphoneSearchManager");

		Recognizer recognizer = context.getInstance(Recognizer.class);
		try (InputStream stream = AllphoneDemo.class.getResourceAsStream("10001-90210-01803.wav")) {
			stream.skip(44);

			// Simple recognition with generic model
			recognizer.allocate();
			context.setSpeechSource(stream, TimeFrame.INFINITE);
			Result result;
			while ((result = recognizer.recognize()) != null) {
				SpeechResult speechResult = new SpeechResult(result);
				System.out.format("Hypothesis: %s\n", speechResult.getHypothesis());

				System.out.println("List of recognized words and their times:");
				for (WordResult r : speechResult.getWords()) {
					System.out.println(r);
				}
			}
		} finally {
			recognizer.deallocate();
		}

	}
}
