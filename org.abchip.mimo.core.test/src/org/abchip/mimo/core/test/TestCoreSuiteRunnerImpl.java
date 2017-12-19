package org.abchip.mimo.core.test;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;
import org.abchip.mimo.tester.base.BaseTestSuiteDirectoryRunnerImpl;

@Test(category = "Core")
public class TestCoreSuiteRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

	public TestCoreSuiteRunnerImpl(Context context, TestManager testManager, String category) {
		super(context, testManager, category);
	}

	@TestStarted
	public void start() {

		Application application = getContext().get(Application.class);
		ResourceManager resourceManager = getContext().get(ResourceManager.class);

		EntityWriter<Resource> resourceWriter = resourceManager.getEntityWriter(application, Resource.class, ResourceScope.ROOT);
		String resourceName = "mimo-test";

		Resource resource = resourceWriter.lookup(resourceName);
		if (resource != null)
			return;

		resource = EntityFactory.eINSTANCE.createResource();
		resource.setName(resourceName);
		resource.setText("Text " + resourceName);

		resourceWriter.save(resource);
	}

	@TestStopped
	public void stop() {

		Application application = getContext().get(Application.class);
		ResourceManager resourceManager = getContext().get(ResourceManager.class);

		EntityWriter<Resource> resourceWriter = resourceManager.getEntityWriter(application, Resource.class, ResourceScope.ROOT);
		String resourceName = "mimo-test";

		Resource resource = resourceWriter.lookup(resourceName);
		if (resource == null)
			return;

		resourceWriter.delete(resource);
	}
}
