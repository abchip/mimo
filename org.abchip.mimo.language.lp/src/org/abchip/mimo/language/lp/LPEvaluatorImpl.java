/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.lp;

import org.abchip.mimo.mining.classification.Evaluator;

import com.aliasi.classify.BaseClassifierEvaluator;
import com.aliasi.classify.Classification;
import com.aliasi.classify.Classified;

public class LPEvaluatorImpl implements Evaluator {

	BaseClassifierEvaluator<CharSequence> evaluator;
	
	public LPEvaluatorImpl(BaseClassifierEvaluator<CharSequence> evaluator) {
		this.evaluator = evaluator;
	}

	@Override
	public void evaluate(Object object, Object classification) {

		Classified<CharSequence> classified = new Classified<CharSequence>((String)object, new Classification((String)classification));

		evaluator.handle(classified);
	}

	@Override
	public void printConfusionMatrix() {
		
		StringBuilder sb = new StringBuilder();
		String[] labels = evaluator.confusionMatrix().categories();
		int[][] outcomes = evaluator.confusionMatrix().matrix();
		sb.append("reference\\response\n");
		sb.append("          \\");
		for (String category : labels) {
			sb.append(category + ",");
		}
		for (int i = 0; i < outcomes.length; ++i) {
			sb.append("\n         " + labels[i] + " ");
			for (int j = 0; j < outcomes[i].length; ++j) {
				sb.append(outcomes[i][j] + ",");
			}
		}

		System.out.println(sb);
		
	}
}
