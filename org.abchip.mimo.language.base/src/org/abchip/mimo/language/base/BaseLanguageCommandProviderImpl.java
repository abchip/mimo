/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.language.base;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.BaseCommandProviderImpl;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.language.LanguagePlanet;
import org.abchip.mimo.resource.ResourceManager;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class BaseLanguageCommandProviderImpl extends BaseCommandProviderImpl {

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private LanguageManager languageManager;

	public void _lang(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		System.out.println(languageManager.translate(context, "eng", "man", "ita"));

		try (EntityIterator<Language> languages = resourceManager.getResourceReader(context, Language.class).find()) {
			for (Language language : languages) {
				System.out.println(language);

				LanguagePlanet mars = resourceManager.getFrame(context, LanguagePlanet.class).createProxy("mars");
				language.getPlanets().add(mars);
				language.getPlanets().get(0);

				LanguagePlanet moon = resourceManager.getFrame(context, LanguagePlanet.class).createProxy("moon");
				language.getPlanetsCont().add(moon);
				language.getPlanetsCont().get(0);
			}
		}
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
