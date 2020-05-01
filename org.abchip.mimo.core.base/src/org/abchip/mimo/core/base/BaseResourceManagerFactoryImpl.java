package org.abchip.mimo.core.base;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Factory;
import org.abchip.mimo.resource.ResourceManager;

public class BaseResourceManagerFactoryImpl implements Factory<ResourceManager> {

	@Override
	public ResourceManager create(Context context) {
		return new BaseResourceManagerImpl(context);
	}

	@Override
	public Class<ResourceManager> getInterfaceClass() {
		return ResourceManager.class;
	}
}
