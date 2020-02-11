/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 * @model interface="true" abstract="true" superTypes="org.abchip.mimo.java.JavaCloseable"
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
	@Override
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.java.JavaIOException" theoryRequired="true"
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
	 * @model exceptions="org.abchip.mimo.java.JavaIOException"
	 * @generated
	 */
	void reload() throws IOException;

} // Reasoner
