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
package org.abchip.mimo.core.base;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;

public class BaseEntityActivator {

	@ComponentStarted
	private void start(Application application, ResourceManager resourceManager) {

		EntityWriter<Resource> resourceWriter = resourceManager.getEntityWriter(application, Resource.class, ResourceScope.ROOT);
		Resource tempResource = resourceWriter.lookup(application.getContextDescription().getResourceTemporary());
		if (tempResource != null)
			return;

		tempResource = EntityFactory.eINSTANCE.createResource();
		tempResource.setName(application.getContextDescription().getResourceTemporary());
		tempResource.setText(application.getContextDescription().getResourceTemporary() + " Text");
		
		resourceWriter.save(tempResource);
	}
}
