/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.impl.EntityReaderImpl;
import org.abchip.mimo.util.Lists;

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

	public static <E extends EntityNameable> EntityReader<E> wrapReader(ContextProvider contextProvider, String resource, Map<String, E> entities) {
		return new MapReader<E>(contextProvider, resource, entities);
	}
	
	public static <E extends EntityNameable> void firePreDeleteEvent(final EntityWriter<E> resourceWriter, final E source) {
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
			public String getResourceName() {
				return resourceWriter.getResourceName();
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
			public String getResourceName() {
				return resourceWriter.getResourceName();
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
			public String getResourceName() {
				return resourceWriter.getResourceName();
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
			public String getResourceName() {
				return resourceWriter.getResourceName();
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
		public EntityIterator<E> find(String filter, String fields, int nrElem) {
			return new QueueReaderIteratorImpl<E>(readers, filter, fields, nrElem);
		}
		
		public List<String> findNames(String filter) {
			Set<String> names = new TreeSet<String>();
			
			for(EntityReader<E> reader: readers) {
				names.addAll(reader.findNames(filter));
			}

			return new ArrayList<String>(names);
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

		@Override
		public String getResourceName() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	private static class QueueReaderIteratorImpl<E extends EntityNameable> implements EntityIterator<E> {

		private Queue<EntityReader<E>> readers;
		private EntityIterator<E> currentIterator;
		private String filter = null;
		private String fields = null;
		private int nrElem = 0;
		private E nextObject = null;
		private int count = 0;
		
		public QueueReaderIteratorImpl(List<EntityReader<E>> resources, String filter, String fields, int nrElem) {

			this.filter = filter;
			this.fields = fields;
			this.nrElem = nrElem;
			
			readers = new LinkedList<EntityReader<E>>();
			for (EntityReader<E> resourceReader : resources)
				readers.add(resourceReader);
			
			if(!readers.isEmpty())
				this.currentIterator = readers.poll().find(filter, fields, nrElem);
			doNext();
		}

		@Override
		public void close() {
			if(this.currentIterator != null)
				this.currentIterator.close();
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
			count++;
			
			if(nrElem > 0 && count >= nrElem)		
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
				currentIterator = readers.poll().find(filter, fields, nrElem - count);
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
	
	private static class MapReader<E extends EntityNameable> extends EntityReaderImpl<E> {

		private String resource = null;
		private Map<String, E> entities = null;
		
		public MapReader(ContextProvider contextProvider, String resource, Map<String, E> entities) {
			setContextProvider(contextProvider);
			this.resource = resource;
			this.entities = entities;
		}

		@Override
		public boolean exists(String name) {
			return lookup(name) != null;
		}

		@Override
		public EntityIterator<E> find(String filter, String fields, int nrElem) {

			List<E> values = new ArrayList<E>(entities.values());
			if(nrElem > 0)
				values = Lists.qINSTANCE.slice(new ArrayList<E>(values), 0, nrElem);				

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
		
		public List<String> findNames(String filter) {
			Set<String> names = new TreeSet<String>();
			
			for(E entity: entities.values()) {
				names.add(entity.getName());
			}

			return new ArrayList<String>(names);
		}

		@Override
		public E lookup(String name) {

			E entity = entities.get(name);
			
			return entity;
		}

		@Override
		public String getResourceName() {
			return this.resource;
		}
	}
}