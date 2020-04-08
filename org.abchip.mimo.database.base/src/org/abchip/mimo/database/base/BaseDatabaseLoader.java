/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.database.CatalogContainer;
import org.abchip.mimo.database.DatabaseContainer;
import org.abchip.mimo.database.connection.ConnectionConfig;
import org.abchip.mimo.database.definition.DefinitionWriter;
import org.abchip.mimo.database.definition.DefinitionWriterRegistry;
import org.abchip.mimo.database.query.QueryWriter;
import org.abchip.mimo.database.query.QueryWriterRegistry;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class BaseDatabaseLoader {

	private static final Logger LOGGER = Logs.getLogger(BaseDatabaseLoader.class);

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private QueryWriterRegistry queryWriterRegistry;
	@Inject
	private DefinitionWriterRegistry definitionWriterRegistry;

	public void loadDatabase(DatabaseContainer databaseContainer) {

		// prepare catalog containers
		List<CatalogContainer> catalogContainers = new ArrayList<CatalogContainer>();
		catalogContainers.addAll(databaseContainer.getCatalogContainers());

		for (CatalogContainer catalogContainer : catalogContainers) {

			if (!catalogContainer.isActive())
				continue;

			// build catalog context
			@SuppressWarnings("resource")
			Context catalogContext = contextRoot.createChildContext(catalogContainer.getName()).get();

			ConnectionConfig connectionConfig = catalogContainer.getConnectionConfig();
			QueryWriter queryWriter = queryWriterRegistry.lookup(connectionConfig);
			catalogContext.set(QueryWriter.class, queryWriter);
			DefinitionWriter definitionWriter = definitionWriterRegistry.lookup(connectionConfig);
			catalogContext.set(DefinitionWriter.class, definitionWriter);

			try {
				// initialize new container
				BaseCatalogContainerImpl newCatalogContainer = new BaseCatalogContainerImpl(catalogContext);
				newCatalogContainer.setName(catalogContainer.getName());
				newCatalogContainer.setActive(true);
				newCatalogContainer.setGenerationStrategy(catalogContainer.getGenerationStrategy());
				newCatalogContainer.setConnectionConfig(catalogContainer.getConnectionConfig());
				newCatalogContainer.setSupportsGuestAccess(catalogContainer.isSupportsGuestAccess());
				newCatalogContainer.setSearchStrategy(catalogContainer.getSearchStrategy());
				newCatalogContainer.initialize();

				// update references
				databaseContainer.getCatalogContainers().remove(catalogContainer);
				databaseContainer.getCatalogContainers().add(newCatalogContainer);
				if (databaseContainer.getDefaultCatalogContainer() == catalogContainer)
					databaseContainer.setDefaultCatalogContainer(newCatalogContainer);

			} catch (Exception e) {
				LOGGER.error(e.getMessage());
				continue;
			}

		}

		// printDatabase(databaseContainer);
	}
}