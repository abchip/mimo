/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.MimoUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.impl.ResourceReaderImpl;

public class ResourceHelper {

	public static <E extends EntityIdentifiable> EntityIterator<E> wrapIterator(Collection<E> collection) {
		return ResourceHelper.wrapIterator(collection.iterator());
	}

	public static <E extends EntityIdentifiable> EntityIterator<E> wrapIterator(Iterator<E> iterator) {
		return new MyEntityIterator<E>(iterator);
	}

	public static <E extends EntityIdentifiable> ResourceReader<E> wrapReader(Context context, Frame<E> frame, Map<String, E> entities) {
		return new MapReader<E>(context, frame, entities);
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

	private static class MapReader<E extends EntityIdentifiable> extends ResourceReaderImpl<E> {

		private Frame<E> frame;
		private Context context;
		private Map<String, E> entities = null;

		public MapReader(Context context, Frame<E> frame, Map<String, E> entities) {
			this.context = context;
			this.frame = frame;
			this.entities = entities;
		}

		@Override
		public EntityIterator<E> find(String filter, String fields, String order, int limit, boolean proxy) {

			List<E> values = new ArrayList<E>(entities.values());
			if (limit > 0)
				values = MimoUtils.slice(new ArrayList<E>(values), 0, limit);

			Collections.sort(values, new Comparator<E>() {

				@Override
				public int compare(E o1, E o2) {
					return o1.getID().compareTo(o2.getID());
				}
			});

			Collections.sort(values, new Comparator<E>() {
				@Override
				public int compare(E o1, E o2) {
					return o1.getID().compareTo(o2.getID());
				}
			});

			return ResourceHelper.wrapIterator(values);
		}

		@Override
		public E lookup(String name, boolean proxyOs) {

			E entity = entities.get(name);

			return entity;
		}

		@Override
		public Frame<E> getFrame() {
			return this.frame;
		}

		@Override
		public Context getContext() {
			return this.context;
		}

		@Override
		public String getTenant() {
			return context.getContextDescription().getTenant();
		}
	}
}