/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.logic;

import java.io.Closeable;

import java.io.IOException;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reasoner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.logic.LogicPackage#getReasoner()
 * @model interface="true" abstract="true" superTypes="org.abchip.mimo.util.JavaCloseable"
 * @generated
 */
public interface Reasoner extends Closeable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" questionRequired="true"
	 * @generated
	 */
	Question buildQuestion(String question);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.util.JavaIOException" theoryRequired="true"
	 * @generated
	 */
	void loadTheory(Theory theory) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" questionRequired="true"
	 * @generated
	 */
	List<Goal> query(String question);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" questionRequired="true"
	 * @generated
	 */
	List<Goal> query(Question question);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.util.JavaIOException"
	 * @generated
	 */
	void reload() throws IOException;

} // Reasoner
