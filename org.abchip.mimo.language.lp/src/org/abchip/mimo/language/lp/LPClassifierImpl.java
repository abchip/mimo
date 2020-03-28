package org.abchip.mimo.language.lp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.mining.classification.ClassificationFactory;
import org.abchip.mimo.mining.classification.Classifier;
import org.abchip.mimo.mining.classification.Evaluator;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.util.Files;
import org.osgi.framework.FrameworkUtil;

import com.aliasi.classify.BaseClassifierEvaluator;
import com.aliasi.classify.ScoredClassification;
import com.aliasi.classify.ScoredClassifier;
import com.aliasi.util.AbstractExternalizable;

public class LPClassifierImpl implements Classifier {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private Files files;
	@Inject
	private ResourceManager resourceManager;

	private ScoredClassifier<CharSequence> classifier;

	@PostConstruct
	private void init() {
		loadModels();
	}

	@Override
	public boolean isClassifierFor(Class<?> klass, Class<?> object) {

		if (Language.class.isAssignableFrom(klass)) {

			if (String.class.isAssignableFrom(object))
				return true;
			else
				return false;
		} else
			return false;

	}

	@Override
	public <E extends Entity> List<Classification<E>> classify(Context context, Class<E> klass, Object object) {
		return classifyLanguage(context, (String) object);
	}

	@Override
	public <E extends EntityIdentifiable> Evaluator buildEvaluator(Class<E> klass, Class<?> object) {

		List<Language> languages = new ArrayList<Language>();
		ResourceReader<Language> languageReader = resourceManager.getResourceReader(contextRoot, Language.class);
		try (EntityIterator<Language> languageIterator = languageReader.find()) {
			for (Language language : languageIterator)
				languages.add(language);
		}

		String[] categories = new String[languages.size()];
		int i = 0;
		for (Language language : languages) {
			categories[i] = language.getText().toLowerCase();
			i++;
		}

		Evaluator evaluator = new LPEvaluatorImpl(new BaseClassifierEvaluator<CharSequence>(classifier, categories, false));

		return evaluator;
	}

	@SuppressWarnings("unchecked")
	private <E extends Entity> List<Classification<E>> classifyLanguage(Context context, String text) {

		ScoredClassification lpClassification = classifier.classify(text);

		List<Classification<E>> classifications = new ArrayList<Classification<E>>();

		List<Language> languages = new ArrayList<Language>();
		ResourceReader<Language> languageReader = resourceManager.getResourceReader(contextRoot, Language.class);
		try (EntityIterator<Language> languageIterator = languageReader.find()) {
			for (Language language : languageIterator)
				languages.add(language);
		}

		for (int i = 0; i < lpClassification.size(); i++) {
			E languageClassified = null;
			for (Language language : languages) {
				String category = lpClassification.category(i);
				if (language.getText().equalsIgnoreCase(category)) {
					languageClassified = (E) language;
					break;
				}
			}
			Classification<E> classification = ClassificationFactory.eINSTANCE.createClassification();
			classification.setEntity(languageClassified);
			classification.setScore(lpClassification.score(i));

			classifications.add(classification);
		}

		return classifications;
	}

	@SuppressWarnings("unchecked")
	private void loadModels() {
		try {
			String classifierPath = "model/3LangId.LMClassifier";
			URL url = FrameworkUtil.getBundle(this.getClass()).getResource(classifierPath);
			try (InputStream stream = url.openStream()) {
				File serializedClassifier = files.copyToFile(stream);
				classifier = (ScoredClassifier<CharSequence>) AbstractExternalizable.readObject(serializedClassifier);
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
