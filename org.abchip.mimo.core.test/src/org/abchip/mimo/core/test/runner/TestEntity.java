package org.abchip.mimo.core.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.core.test.Enum1;
import org.abchip.mimo.core.test.ObjectA;
import org.abchip.mimo.core.test.ObjectB;
import org.abchip.mimo.core.test.TestFactory;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.ResourceScope;
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
	public void start() {

		testWrite();
		
		testRead();
		
		testDelete();
	}

	private void testRead() {
		try {
			EntityReader<ObjectA> entityReader = resourceManager.getEntityReader(testRunner, ObjectA.class, ResourceScope.ROOT);

			EntityIterator<ObjectA> entityIterator = entityReader.find(null);
			while (entityIterator.hasNext()) {
				ObjectA objectA = entityIterator.next();
				asserter.assertNotNull("Read object", objectA);
			}

			entityIterator.close();

		} catch (Exception exc) {
			asserter.fail("Resource reading failed: " + exc.getMessage());
		}
	}

	private void testWrite() {
		try {
			EntityWriter<ObjectA> entityWriter = resourceManager.getEntityWriter(testRunner, ObjectA.class, "mimo-test");

			ObjectA objectA = TestFactory.eINSTANCE.createObjectA();
			objectA.setName("PIPPO");
			objectA.setText("Pippo text");

			ObjectB objectB = TestFactory.eINSTANCE.createObjectB();
			objectB.setName("PLUTO");
			objectB.setEnum1(Enum1.VALUE1);
			objectA.setObjectB(objectB);

			entityWriter.save(objectA);

			objectA = TestFactory.eINSTANCE.createObjectA();
			objectA.setName("PAPERINO");
			objectA.setText("Paperino text");

			objectB = TestFactory.eINSTANCE.createObjectB();
			objectB.setName("PAPEROGA");
			objectB.setEnum1(Enum1.VALUE2);
			objectA.setObjectB(objectB);

			entityWriter.save(objectA);
		} catch (Exception exc) {
			asserter.fail("Resource writing failed: " + exc.getMessage());
		}
	}
	

	private void testDelete() {
		try {
			EntityWriter<ObjectA> entityWriter = resourceManager.getEntityWriter(testRunner, ObjectA.class, "mimo-test");

			EntityIterator<ObjectA> objectIterator = entityWriter.find(null);
			while (objectIterator.hasNext()) {				
				ObjectA objectA = objectIterator.next();
				entityWriter.delete(objectA);
				asserter.assertNull("Delete object", entityWriter.lookup(objectA.getName()));
			}

			objectIterator.close();

		} catch (Exception exc) {
			asserter.fail("Resource reading failed: " + exc.getMessage());
		}		
	}
}
