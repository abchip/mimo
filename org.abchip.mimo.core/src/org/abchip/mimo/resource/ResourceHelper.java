/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.resource.impl.ResourceImpl;
import org.abchip.mimo.resource.impl.ResourceReaderImpl;
import org.abchip.mimo.util.Lists;

public class ResourceHelper {

	public static <E extends EntityNameable> EntityIterator<E> wrapIterator(Collection<E> collection) {
		return ResourceHelper.wrapIterator(collection.iterator());
	}

	public static <E extends EntityNameable> EntityIterator<E> wrapIterator(Iterator<E> iterator) {
		return new MyEntityIterator<E>(iterator);
	}

	public static <E extends EntityNameable> ResourceReader<E> wrapReader(List<ResourceReader<E>> resources) {
		return new ListReaderImpl<E>(resources);
	}

	public static <E extends EntityNameable> ResourceReader<E> wrapReader(ContextProvider contextProvider, Map<String, E> entities) {
		return new MapReader<E>(contextProvider, entities);
	}

	public static <E extends EntityNameable> Resource<E> wrapResource(Map<String, E> entities) {
		Resource<E> resource = new MapResource<E>(entities);
		return resource;
	}

	public static <E extends EntityNameable> void firePreDeleteEvent(final ResourceWriter<E> resourceWriter, final E source) {
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
			public ContextProvider getContextProvider() {
				return resourceWriter.getContextProvider();
			}
		};

		ResourceNotifier<E> resourceNotifier = resourceWriter.getNotifier();
		if (resourceNotifier != null)
			resourceNotifier.fireEvent(event);
	}

	public static <E extends EntityNameable> void firePostDeleteEvent(final ResourceWriter<E> resourceWriter, final E source) {
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
			public ContextProvider getContextProvider() {
				return resourceWriter.getContextProvider();
			}
		};

		ResourceNotifier<E> resourceNotifier = resourceWriter.getNotifier();
		if (resourceNotifier != null)
			resourceNotifier.fireEvent(event);
	}

	public static <E extends EntityNameable> void firePreSaveEvent(final ResourceWriter<E> resourceWriter, final E source) {

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
			public ContextProvider getContextProvider() {
				return resourceWriter.getContextProvider();
			}
		};

		ResourceNotifier<E> resourceNotifier = resourceWriter.getNotifier();
		if (resourceNotifier != null)
			resourceNotifier.fireEvent(event);
	}

	public static <E extends EntityNameable> void firePostSaveEvent(final ResourceWriter<E> resourceWriter, final E source) {

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
			public ContextProvider getContextProvider() {
				return resourceWriter.getContextProvider();
			}
		};

		ResourceNotifier<E> resourceNotifier = resourceWriter.getNotifier();
		if (resourceNotifier != null)
			resourceNotifier.fireEvent(event);
	}

	private static class MyEntityIterator<E extends EntityNameable> implements EntityIterator<E> {

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
	}

	private static class ListReaderImpl<E extends EntityNameable> extends ResourceReaderImpl<E> {

		private List<ResourceReader<E>> readers = null;

		public ListReaderImpl(List<ResourceReader<E>> readers) {
			this.readers = readers;
		}

		@Override
		public EntityIterator<E> find(String filter, String fields, int limit, boolean proxy) {
			return new QueueReaderIteratorImpl<E>(readers, filter, fields, limit, proxy);
		}

		@Override
		public E lookup(String name, boolean proxy) {

			E object = null;
			for (ResourceReader<E> resourceReader : readers) {
				object = resourceReader.lookup(name, proxy);
				if (object != null)
					break;
			}

			return object;
		}
	}

	private static class QueueReaderIteratorImpl<E extends EntityNameable> implements EntityIterator<E> {

		private Queue<ResourceReader<E>> readers;
		private EntityIterator<E> currentIterator;
		private String filter = null;
		private String fields = null;
		private int limit = 0;
		private boolean proxy = false;
		private E nextObject = null;
		private int count = 0;

		public QueueReaderIteratorImpl(List<ResourceReader<E>> resources, String filter, String fields, int limit, boolean proxy) {

			this.filter = filter;
			this.fields = fields;
			this.limit = limit;
			this.proxy = proxy;

			readers = new LinkedList<ResourceReader<E>>();
			for (ResourceReader<E> resourceReader : resources)
				readers.add(resourceReader);

			if (!readers.isEmpty())
				this.currentIterator = readers.poll().find(filter, fields, limit, proxy);
			doNext();
		}

		@Override
		public boolean hasNext() {
			return nextObject != null;
		}

		@Override
		public E next() {
			E object = nextObject;
			count++;

			if (limit > 0 && count >= limit)
				nextObject = null;
			else
				doNext();

			return object;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

		private void doNext() {
			nextObject = null;
			if (currentIterator == null)
				return;

			if (currentIterator.hasNext()) {
				nextObject = currentIterator.next();
				return;
			}

			while (readers.peek() != null) {
				currentIterator = readers.poll().find(filter, fields, limit - count, proxy);
				while (currentIterator != null && currentIterator.hasNext()) {
					nextObject = currentIterator.next();
					return;
				}
			}
		}

		@Override
		public Iterator<E> iterator() {
			return this;
		}
	}

	private static class MapReader<E extends EntityNameable> extends ResourceReaderImpl<E> {

		private Map<String, E> entities = null;

		public MapReader(ContextProvider contextProvider, Map<String, E> entities) {
			setContextProvider(contextProvider);
			this.entities = entities;
		}

		@Override
		public EntityIterator<E> find(String filter, String fields, int limit, boolean proxy) {

			List<E> values = new ArrayList<E>(entities.values());
			if (limit > 0)
				values = Lists.qINSTANCE.slice(new ArrayList<E>(values), 0, limit);

			Collections.sort(values, new Comparator<E>() {

				@Override
				public int compare(E o1, E o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});

			Collections.sort(values, new Comparator<E>() {
				@Override
				public int compare(E o1, E o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});

			return ResourceHelper.wrapIterator(values);
		}

		@Override
		public E lookup(String name, boolean proxyOs) {

			E entity = entities.get(name);

			return entity;
		}
	}

	private static class MapResource<E extends EntityNameable> extends ResourceImpl<E> {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private Map<String, E> entities = null;

		protected MapResource(Map<String, E> entities) {
			this.entities = entities;
		}

		@Override
		public void create(E entity, boolean update) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void delete(E entity) {
			throw new UnsupportedOperationException();
		}

		@Override
		public List<E> read(String filter, String fields, int limit, boolean proxy) {
			List<E> entities = new ArrayList<E>(this.entities.values());

			Collections.sort(entities, new Comparator<E>() {
				@Override
				public int compare(E e1, E e2) {
					return e1.getName().compareTo(e2.getName());
				}
			});

			return entities;
		}

		@Override
		public void update(E entity) {
			throw new UnsupportedOperationException();
		}

		@Override
		public String nextSequence() {
			throw new UnsupportedOperationException();
		}

		@Override
		public E read(String name, String fields, boolean proxy) {
			return this.entities.get(name);
		}
	}
}