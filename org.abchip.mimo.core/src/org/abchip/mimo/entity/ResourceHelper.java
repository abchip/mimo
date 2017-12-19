/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.entity;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.impl.EntityReaderImpl;

public class ResourceHelper {

	public static <E extends EntityNameable> EntityIterator<E> wrapIterator(Collection<E> collection) {
		return ResourceHelper.wrapIterator(collection.iterator());
	}

	public static <E extends EntityNameable> EntityIterator<E> wrapIterator(Iterator<E> iterator) {
		return new MyEntityIterator<E>(iterator);
	}
	
	public static <E extends EntityNameable> EntityReader<E> wrapReader(List<EntityReader<E>>resources) {
		return new ListReaderImpl<E>(resources);
	}

	public static <E extends EntityNameable> EntityReader<E> wrapReader(ContextProvider contextProvider, Map<String, E> entities) {
		return new MapReader<E>(contextProvider, entities);
	}
	
	public static <E extends EntityNameable> void firePreDeleteEvent(final EntityWriter<E> resourceWriter, final E source) {
		ResourceEvent<E> event = new ResourceEvent<E>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.PRE_DELETE;
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
			public Resource getResource() {
				return resourceWriter.getResource();
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

	public static <E extends EntityNameable> void firePostDeleteEvent(final EntityWriter<E> resourceWriter, final E source) {
		ResourceEvent<E> event = new ResourceEvent<E>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.POST_DELETE;
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
			public Resource getResource() {
				return resourceWriter.getResource();
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

	public static <E extends EntityNameable> void firePreRenameEvent(final EntityWriter<E> resourceWriter, final E source, final String newName) {
		ResourceEvent<E> event = new ResourceEvent<E>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.PRE_RENAME;
			}

			@Override
			public E getSource() {
				return source;
			}

			@Override
			public String getNewName() {
				return newName;
			}

			@Override
			public String getOldName() {
				return null;
			}

			@Override
			public Resource getResource() {
				return resourceWriter.getResource();
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

	public static <E extends EntityNameable> void firePostRenameEvent(final EntityWriter<E> resourceWriter, final E source, final String oldName) {
		ResourceEvent<E> event = new ResourceEvent<E>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.POST_RENAME;
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
				return oldName;
			}

			@Override
			public Resource getResource() {
				return resourceWriter.getResource();
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

	public static <E extends EntityNameable> void firePreSaveEvent(final EntityWriter<E> resourceWriter, final E source) {

		ResourceEvent<E> event = new ResourceEvent<E>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.PRE_SAVE;
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
			public Resource getResource() {
				return resourceWriter.getResource();
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

	public static <E extends EntityNameable> void firePostSaveEvent(final EntityWriter<E> resourceWriter, final E source) {

		ResourceEvent<E> event = new ResourceEvent<E>() {

			@Override
			public ResourceEventType getEventType() {
				return ResourceEventType.POST_SAVE;
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
			public Resource getResource() {
				return resourceWriter.getResource();
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
		public void close() {

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

	private static class ListReaderImpl<E extends EntityNameable> extends EntityReaderImpl<E> {


		private List<EntityReader<E>> readers = null;
		
		public ListReaderImpl(List<EntityReader<E>> readers) {
			this.readers = readers;
		}
		
		@Override
		public boolean exists(String name) {

			for (EntityReader<E> resourceReader : readers) {
				if(resourceReader.exists(name))
					return true;
			}

			return false;
		}

		@Override
		public EntityIterator<E> find(String nameFilter) {
			return new QueueReaderIteratorImpl<E>(readers, nameFilter);
		}

		@Override
		public E lookup(String name) {

			E object = null;
			for (EntityReader<E> resourceReader : readers) {
				object = resourceReader.lookup(name);
				if (object != null)
					break;
			}

			return object;
		}
		
	}
	
	private static class QueueReaderIteratorImpl<E extends EntityNameable> implements EntityIterator<E> {

		private Queue<EntityReader<E>> readers;
		private EntityIterator<E> currentIterator;
		private String namePrefix;
		private E nextObject = null;

		public QueueReaderIteratorImpl(List<EntityReader<E>> resources, String namePrefix) {

			readers = new LinkedList<EntityReader<E>>();
			for (EntityReader<E> resourceReader : resources)
				readers.add(resourceReader);

			this.namePrefix = namePrefix;
			if(!readers.isEmpty())
				this.currentIterator = readers.poll().find(namePrefix);
			doNext();
		}

		@Override
		public void close() {
			this.currentIterator = null;
			this.readers = null;
		}

		@Override
		public boolean hasNext() {
			return nextObject != null;
		}

		@Override
		public E next() {
			E object = nextObject;
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
				currentIterator = readers.poll().find(namePrefix);
				while (currentIterator.hasNext()) {
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
	
	private static class MapReader<E extends EntityNameable> extends EntityReaderImpl<E> {

		private Map<String, E> entities = null;
		
		public MapReader(ContextProvider contextProvider, Map<String, E> entities) {
			setContextProvider(contextProvider);
			this.entities = entities;
		}

		@Override
		public boolean exists(String name) {
			return lookup(name) != null;
		}

		@Override
		public EntityIterator<E> find(String nameFilter) {

			// TODO filter frames
			return ResourceHelper.wrapIterator(entities.values());
		}

		@Override
		public E lookup(String name) {

			E entity = entities.get(name);
			
			return entity;
		}
	}
}