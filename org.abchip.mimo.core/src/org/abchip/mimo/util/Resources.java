/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.util.Collection;
import java.util.Iterator;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceEvent;
import org.abchip.mimo.resource.ResourceEventType;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourceWriter;

public class Resources {

	public static <E extends EntityIdentifiable> EntityIterator<E> wrapIterator(Collection<E> collection) {
		return Resources.wrapIterator(collection.iterator());
	}

	public static <E extends EntityIdentifiable> EntityIterator<E> wrapIterator(Iterator<E> iterator) {
		return new MyEntityIterator<E>(iterator);
	}

	public static <E extends EntityIdentifiable> void firePreDeleteEvent(final ResourceWriter<E> resourceWriter, final E source) {

		ResourceNotifier<E> resourceNotifier = resourceWriter.getNotifier();
		if (resourceNotifier != null) {
			ResourceEvent<E> event = new ResourceEvent<E>() {

				@Override
				public ResourceEventType getEventType() {
					return ResourceEventType.BEFORE_DELETE;
				}

				@Override
				public E getSource() {
					return source;
				}

				@Override
				public String getNewName() {
					return null;
				}

				@Override
				public String getOldName() {
					return null;
				}

				@Override
				public Context getContext() {
					return resourceWriter.getContext();
				}
			};
			resourceNotifier.fireEvent(event);
		}
	}

	public static <E extends EntityIdentifiable> void firePostDeleteEvent(final ResourceWriter<E> resourceWriter, final E source) {

		ResourceNotifier<E> resourceNotifier = resourceWriter.getNotifier();
		if (resourceNotifier != null) {
			ResourceEvent<E> event = new ResourceEvent<E>() {

				@Override
				public ResourceEventType getEventType() {
					return ResourceEventType.AFTER_DELETE;
				}

				@Override
				public E getSource() {
					return source;
				}

				@Override
				public String getNewName() {
					return null;
				}

				@Override
				public String getOldName() {
					return null;
				}

				@Override
				public Context getContext() {
					return resourceWriter.getContext();
				}
			};
			resourceNotifier.fireEvent(event);
		}
	}

	public static <E extends EntityIdentifiable> void firePreSaveEvent(final ResourceWriter<E> resourceWriter, final E source) {

		ResourceNotifier<E> resourceNotifier = resourceWriter.getNotifier();
		if (resourceNotifier != null) {
			ResourceEvent<E> event = new ResourceEvent<E>() {

				@Override
				public ResourceEventType getEventType() {
					return ResourceEventType.BEFORE_SAVE;
				}

				@Override
				public E getSource() {
					return source;
				}

				@Override
				public String getNewName() {
					return null;
				}

				@Override
				public String getOldName() {
					return null;
				}

				@Override
				public Context getContext() {
					return resourceWriter.getContext();
				}
			};
			resourceNotifier.fireEvent(event);
		}
	}

	public static <E extends EntityIdentifiable> void firePostSaveEvent(final ResourceWriter<E> resourceWriter, final E source) {

		ResourceNotifier<E> resourceNotifier = resourceWriter.getNotifier();
		if (resourceNotifier != null) {
			ResourceEvent<E> event = new ResourceEvent<E>() {

				@Override
				public ResourceEventType getEventType() {
					return ResourceEventType.AFTER_SAVE;
				}

				@Override
				public E getSource() {
					return source;
				}

				@Override
				public String getNewName() {
					return null;
				}

				@Override
				public String getOldName() {
					return null;
				}

				@Override
				public Context getContext() {
					return resourceWriter.getContext();
				}
			};
			resourceNotifier.fireEvent(event);
		}
	}

	private static class MyEntityIterator<E extends EntityIdentifiable> implements EntityIterator<E> {

		private Iterator<E> iterator;

		public MyEntityIterator(Iterator<E> iterator) {
			this.iterator = iterator;
		}

		@Override
		public boolean hasNext() {
			return iterator.hasNext();
		}

		@Override
		public E next() {
			return iterator.next();
		}

		@Override
		public void remove() {
			iterator.remove();
		}

		@Override
		public Iterator<E> iterator() {
			return this;
		}

		@Override
		public void close() {
			this.iterator = null;
		}
	}
}