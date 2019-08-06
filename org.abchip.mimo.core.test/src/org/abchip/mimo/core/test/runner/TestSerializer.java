package org.abchip.mimo.core.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;

@Test(entity = "Resource")
public class TestSerializer {
	
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private TestRunner testRunner;
	@Inject
	public transient TestAsserter asserter;

	@TestStarted
	public void start() {

		EntityWriter<Resource> resourceWriter = resourceManager.getEntityWriter(testRunner, Resource.class, ResourceScope.ROOT);
		String resourcePrefix = "mimo-test";

		for (int i = 1; i <= 5; i++) {
			String resourceName = resourcePrefix + "-" + i;
			String resourceText = resourcePrefix + "-" + i + " Text";

			Resource resource = resourceWriter.lookup(resourceName);
			if(resource != null)
				continue;
			
			resource = EntityFactory.eINSTANCE.createResource();
			resource.setName(resourceName);
			resource.setText(resourceText);
			resourceWriter.save(resource);
		}
	}
	
	@TestStopped
	public void stop() {
		EntityWriter<Resource> resourceWriter = resourceManager.getEntityWriter(testRunner, Resource.class, ResourceScope.ROOT);
		String resourcePrefix = "mimo-test";

		for (int i = 1; i <= 5; i++) {
			String resourceName = resourcePrefix + "-" + i;

			Resource resource = resourceWriter.lookup(resourceName);
			if(resource != null)
				resourceWriter.delete(resource);
		}		
	}
}
