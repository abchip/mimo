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
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;

public class BaseEntityActivator {

	@ComponentStarted
	private void start(ContextRoot contextRoot, ResourceManager resourceManager) {

		EntityWriter<Resource> resourceWriter = resourceManager.getEntityWriter(contextRoot, Resource.class, ResourceScope.ROOT);
		if(resourceWriter == null)
			return;
		
		Resource tempResource = resourceWriter.lookup(contextRoot.getContextDescription().getResourceTemporary());
		if (tempResource != null)
			return;

		tempResource = EntityFactory.eINSTANCE.createResource();
		tempResource.setName(contextRoot.getContextDescription().getResourceTemporary());
		tempResource.setText(contextRoot.getContextDescription().getResourceTemporary() + " Text");
		
		resourceWriter.create(tempResource);
	}
}
