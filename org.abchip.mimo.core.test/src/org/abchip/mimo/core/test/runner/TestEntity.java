package org.abchip.mimo.core.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.core.test.Enum1;
import org.abchip.mimo.core.test.ObjectA;
import org.abchip.mimo.core.test.ObjectB;
import org.abchip.mimo.core.test.TestFactory;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Entity")
public class TestEntity {
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private TestRunner testRunner;
	@Inject
	public transient TestAsserter asserter;

	@TestStarted
	public void start() throws ResourceException {

		testWrite();

		testRead();

		testDelete();
	}

	private void testRead() throws ResourceException {

		ResourceReader<ObjectA> entityReader = resourceManager.getResourceReader(testRunner.getContext(), ObjectA.class);

		try (EntityIterator<ObjectA> entityIterator = entityReader.find()) {
			while (entityIterator.hasNext()) {
				ObjectA objectA = entityIterator.next();
				asserter.assertNotNull("Read object", objectA);
			}
		}
	}

	private void testWrite() {
		try {
			ResourceWriter<ObjectA> entityWriter = resourceManager.getResourceWriter(testRunner.getContext(), ObjectA.class);

			ObjectA objectA = TestFactory.eINSTANCE.createObjectA();
			objectA.setName("PIPPO");
			objectA.setText("Pippo text");

			ObjectB objectB = TestFactory.eINSTANCE.createObjectB();
			objectB.setName("PLUTO");
			objectB.setEnum1(Enum1.VALUE1);
			objectA.setObjectB(objectB);

			entityWriter.create(objectA);

			objectA = TestFactory.eINSTANCE.createObjectA();
			objectA.setName("PAPERINO");
			objectA.setText("Paperino text");

			objectB = TestFactory.eINSTANCE.createObjectB();
			objectB.setName("PAPEROGA");
			objectB.setEnum1(Enum1.VALUE2);
			objectA.setObjectB(objectB);

			entityWriter.create(objectA);
		} catch (Exception exc) {
			asserter.fail("Resource writing failed: " + exc.getMessage());
		}
	}

	private void testDelete() throws ResourceException {

		ResourceWriter<ObjectA> entityWriter = resourceManager.getResourceWriter(testRunner.getContext(), ObjectA.class);

		try (EntityIterator<ObjectA> objectIterator = entityWriter.find()) {
			while (objectIterator.hasNext()) {
				ObjectA objectA = objectIterator.next();
				entityWriter.delete(objectA);
				asserter.assertNull("Delete object", entityWriter.lookup(objectA.getName()));
			}
		}
	}
}
