package org.abchip.mimo.core.test.runner;

import java.io.IOException;

import javax.inject.Inject;

import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;
import org.abchip.mimo.tester.TestStopped;

@Test(entity = "Resource")
public class TestResource {

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private FrameManager frameManager;
	@SuppressWarnings("unused")
	@Inject
	private TestRunner testRunner;
	@Inject
	public transient TestAsserter asserter;

	@SuppressWarnings("rawtypes")
	@TestStarted
	public void start() throws IOException {

		Frame<Resource> resourceFrame = frameManager.getFrame(Resource.class);
		
		ResourceSerializer<Frame> frameSerializer = resourceManager.createEntitySerializer(Frame.class, SerializationType.XML_METADATA_INTERCHANGE);
		frameSerializer.add(resourceFrame);
		frameSerializer.save(System.out);

		frameSerializer.clear();
		frameSerializer.add(resourceFrame);
		frameSerializer.save(System.out);
	}

	@TestStopped
	public void stop() {
	}
}
