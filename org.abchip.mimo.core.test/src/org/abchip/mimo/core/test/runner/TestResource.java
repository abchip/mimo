package org.abchip.mimo.core.test.runner;

import java.io.IOException;

import javax.inject.Inject;

import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
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
	@Inject
	private TestRunner testRunner;
	@Inject
	public transient TestAsserter asserter;

	@SuppressWarnings("rawtypes")
	@TestStarted
	public void start() throws IOException {

		Frame<Resource> resourceFrame = frameManager.getFrame(Resource.class);
		try (ResourceSerializer<Frame> frameSerializer = resourceManager.createResourceSerializer(testRunner, Frame.class, SerializationType.XMI)) {
			frameSerializer.add(resourceFrame);
			frameSerializer.save(System.out);
		}
		try (ResourceSerializer<Frame> frameSerializer = resourceManager.createResourceSerializer(testRunner, Frame.class, SerializationType.XMI)) {
			frameSerializer.add(resourceFrame);
			frameSerializer.save(System.out);
		}
		"".toString();
	}

	@TestStopped
	public void stop() {
	}
}
