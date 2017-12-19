/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.expression;

import org.abchip.mimo.entity.EntityRegistry;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Expression Parser Rgistry</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.expression.ExpressionPackage#getExpressionParserRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExpressionParserRegistry extends EntityRegistry<ExpressionParser> {

	public static String DEFAULT_PARSER = "MIMO";
} // ExpressionParserRegistry
