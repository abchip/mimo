/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.gf;

import org.grammaticalframework.pgf.Concr;
import org.grammaticalframework.pgf.PGF;

public class GFGrammarLoader {

	private static GFGrammarLoader grammarLoader = null;

	public static GFGrammarLoader get() {
	
		if(grammarLoader == null) {
			synchronized (GFGrammarLoader.class) {
				grammarLoader = new GFGrammarLoader();
			}			
		}
		
		return grammarLoader;
	}

	private PGF pgf = null;

	private GFGrammarLoader() {
		
		try {
			pgf = PGF.readPGF("/home/mattia/Dati/git/abchip/mimo/org.abchip.mimo.language.gf/gf/app/App.pgf");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public Concr getConcr(String language) {
		return pgf.getLanguages().get(language);
	}
}