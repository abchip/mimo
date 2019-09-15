/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.base;

import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.ResourceManager;

public class BaseEntityActivator {

	@ComponentStarted
	private void start(ContextRoot contextRoot, ResourceManager resourceManager) {

	}
}
