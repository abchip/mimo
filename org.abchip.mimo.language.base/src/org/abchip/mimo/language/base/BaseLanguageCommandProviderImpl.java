/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.language.base;

import javax.inject.Inject;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguagePlanet;
import org.abchip.mimo.resource.ResourceManager;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public class BaseLanguageCommandProviderImpl implements CommandProvider {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private FrameManager frameManager;
	
	public void _lang(CommandInterpreter interpreter) throws Exception {

		for (Language language : resourceManager.getResourceReader(contextRoot, Language.class).find()) {
			System.out.println(language);

			LanguagePlanet mars = frameManager.getFrame(contextRoot, LanguagePlanet.class).createProxy("mars");
			language.getPlanets().add(mars);
			language.getPlanets().get(0);

			LanguagePlanet moon = frameManager.getFrame(contextRoot, LanguagePlanet.class).createProxy("moon");
			language.getPlanetsCont().add(moon);
			language.getPlanetsCont().get(0);

		}
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
