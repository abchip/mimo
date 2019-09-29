/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.logic.gnu;

import java.util.LinkedList;
import java.util.List;

import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.logic.Goal;
import org.abchip.mimo.logic.LogicFactory;
import org.abchip.mimo.logic.Question;
import org.abchip.mimo.logic.Term;

import gnu.prolog.io.ParseException;
import gnu.prolog.io.TermReader;
import gnu.prolog.io.TermWriter;
import gnu.prolog.term.AtomTerm;
import gnu.prolog.term.CompoundTerm;
import gnu.prolog.term.JavaObjectTerm;
import gnu.prolog.term.VariableTerm;
import gnu.prolog.vm.Environment;
import gnu.prolog.vm.Interpreter;
import gnu.prolog.vm.PrologCode;
import gnu.prolog.vm.PrologException;

public class GNUQuestionResolver {

	private Environment environment;
	private static final Term[] EMPTY_TERM = new Term[0];

	public GNUQuestionResolver(Environment environment) {
		this.environment = environment;
	}

	public List<Goal> resolve(Question question) {

		if (question.getSubject() == null)
			return null;

		if (question.getRelation() == null)
			return null;

		Interpreter interpreter = environment.createInterpreter();
		environment.runInitialization(interpreter);

		List<gnu.prolog.term.Term> vars = new LinkedList<gnu.prolog.term.Term>();

		// subject
		gnu.prolog.term.Term subject = buildTerm(question.getSubject().getName());
		vars.add(subject);

		// relation
		AtomTerm relation = null;
		if (!question.getRelation().getName().startsWith("asup_"))
			relation = AtomTerm.get("asup_" + question.getRelation().getName());
		else
			relation = AtomTerm.get(question.getRelation().getName());

		// object
		gnu.prolog.term.Term object = null;
		if (question.getObject() != null) {
			object = buildTerm(question.getObject().getName());
			vars.add(object);
		}

		// rule
		gnu.prolog.term.Term rule = null;
		if (question.getRule() != null) {
			rule = buildTerm(question.getRule().getName());
			vars.add(rule);
		}

		Object[] v = vars.toArray(EMPTY_TERM);

		CompoundTerm goalTerm = new CompoundTerm(relation, (gnu.prolog.term.Term[]) v);
		gnu.prolog.vm.Interpreter.Goal goal = interpreter.prepareGoal(goalTerm);

		List<Goal> goals = new LinkedList<Goal>();

		while (true) {
			try {
				int rc = interpreter.execute(goal);
				if (rc == PrologCode.FAIL || rc == PrologCode.HALT)
					break;

				Term subjectResponse = buildTerm(subject);
				Term objectResponse = buildTerm(object);

				Goal qGoal = LogicFactory.eINSTANCE.createGoal();
				qGoal.getTerms().add(subjectResponse);
				if (objectResponse != null)
					qGoal.getTerms().add(objectResponse);
				goals.add(qGoal);

				if (rc == PrologCode.SUCCESS_LAST)
					break;

			} catch (PrologException e) {
				break;
			}
		}

		return goals;
	}

	private Term buildTerm(gnu.prolog.term.Term term) {
		if (term == null)
			return null;

		term = term.dereference();
		Term mindTerm = LogicFactory.eINSTANCE.createTerm();
		if (term instanceof CompoundTerm) {
			CompoundTerm ct = (CompoundTerm) term;
			System.out.println(ct.tag.functor.value);
			mindTerm.setName(ct.args[0].toString());
		} else if (term instanceof JavaObjectTerm) {
			JavaObjectTerm jo = (JavaObjectTerm) term;
			if (jo.value instanceof Frame) {
				mindTerm.setName(((Frame<?>) jo.value).getName());
			} else if (jo.value instanceof EntityNameable) {
				mindTerm.setName(((EntityNameable) jo.value).getName());
			}
		} else {
			mindTerm.setName(TermWriter.toString(term));
		}

		return mindTerm;
	}

	private gnu.prolog.term.Term buildTerm(String s) {
		if (s == null)
			return null;

		gnu.prolog.term.Term term = null;
		if (s.equals("?")) {
			term = new VariableTerm("X");
		} else {
			try {
				term = TermReader.stringToTerm(s, environment);
				if (term instanceof VariableTerm)
					term = AtomTerm.get(s);
			} catch (ParseException e) {
				term = AtomTerm.get(s);
			}
		}
		return term;
	}
}