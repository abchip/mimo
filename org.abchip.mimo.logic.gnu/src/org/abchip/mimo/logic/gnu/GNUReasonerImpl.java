/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.logic.gnu;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.logic.Goal;
import org.abchip.mimo.logic.LogicFactory;
import org.abchip.mimo.logic.Question;
import org.abchip.mimo.logic.Reasoner;
import org.abchip.mimo.logic.Theory;

import gnu.prolog.database.PrologTextLoader;
import gnu.prolog.database.PrologTextLoaderError;
import gnu.prolog.database.PrologTextLoaderState;
import gnu.prolog.vm.Environment;

public class GNUReasonerImpl implements Reasoner {

	private ContextProvider contextProvider;

	private Environment environment = null;
	private Map<String, Theory> theories = null;

	public GNUReasonerImpl(ContextProvider contextProvider) {
		this.contextProvider = contextProvider;

		theories = new HashMap<String, Theory>();
	}

	@Override
	public void close() {
		if(environment != null)
			environment.closeStreams();
	}

	@Override
	public List<Goal> query(String question) {

		Question qQuestion = buildQuestion(question);
		
		return query(qQuestion);
	}

	@Override
	public List<Goal> query(Question question) {
		GNUQuestionResolver questionResolver = new GNUQuestionResolver(environment);
		return questionResolver.resolve(question);
	}

	@Override
	public void reload() throws IOException {

		environment = new GNUEnvironment();

		ContextRoot contextRoot = contextProvider.getContext().getContextRoot();
		URL resource = contextRoot.getResource(this.getClass(), "/theories/asup_base.pl");
		// environment.ensureLoaded(AtomTerm.get(resource.getFile()));

		PrologTextLoaderState ptls = environment.getPrologTextLoaderState();
		try {
			InputStream inputStream = resource.openStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			new PrologTextLoader(ptls, inputStreamReader);
			inputStream.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		List<PrologTextLoaderError> errors = environment.getLoadingErrors();
		for (PrologTextLoaderError error : errors) {
			error.printStackTrace();
		}

		Iterator<Theory> theory = theories.values().iterator();
		while (theory.hasNext())
			loadTheory(theory.next());

	}

	@Override
	public void loadTheory(Theory theory) {

		GNUTheoryReader theoryReader = null;
		try {
			theoryReader = new GNUTheoryReader(theory);

			PrologTextLoaderState ptls = environment.getPrologTextLoaderState();
			new PrologTextLoader(ptls, theoryReader);

			List<PrologTextLoaderError> errors = environment.getLoadingErrors();
			for (PrologTextLoaderError error : errors) {
				error.printStackTrace();
			}

			if (!errors.isEmpty())
				throw new RuntimeException(errors.get(0));

			theories.put(theory.getName(), theory);
		} finally {
			if (theoryReader != null)
				try {
					theoryReader.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
		}
	}
	
	@Override
	public Question buildQuestion(String question) {

		Question qQuestion = LogicFactory.eINSTANCE.createQuestion();
		
		StringTokenizer st = new StringTokenizer(question);

		for(int x=0; st.hasMoreTokens(); x++) {
			switch(x) {
				case 0:
					qQuestion.setSubject(GNUTheoryBuilder.buildTerm(st.nextToken()));
					break;
				case 1:
					qQuestion.setRelation(GNUTheoryBuilder.buildTerm(st.nextToken()));
					break;
				case 2:
					qQuestion.setObject(GNUTheoryBuilder.buildTerm(st.nextToken()));
					break;
				case 3:
					qQuestion.setRule(GNUTheoryBuilder.buildTerm(st.nextToken()));				
					break;
			}				
		}
		return qQuestion;		
	}
}