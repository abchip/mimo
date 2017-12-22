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
import java.io.Reader;
import java.io.StringReader;

import org.abchip.mimo.logic.Term;
import org.abchip.mimo.logic.Theory;

public class GNUTheoryReader extends Reader {

	private StringReader sr;
	
	public GNUTheoryReader(Theory theory) {		

		StringBuffer sb = new StringBuffer();
		
		for(Term term: theory.getFacts()) 
			sb.append(term.getName()+"\n");

		sr = new StringReader(sb.toString());
	}
	
	@Override
	public void close() throws IOException {
		sr.close();
	}
	
	@Override
	public int read(char[] arg0, int arg1, int arg2) throws IOException {
		return sr.read(arg0, arg1, arg2);
	}
}