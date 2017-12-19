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
package org.abchip.mimo.entity.impl;

import java.util.Iterator;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.ResourceNotifier;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.expression.LogicalExpression;
import org.abchip.mimo.expression.LogicalOperator;
import org.abchip.mimo.expression.PredicateExpression;
import org.abchip.mimo.expression.RelationalExpression;
import org.abchip.mimo.expression.TermExpression;
import org.abchip.mimo.expression.impl.ExpressionVisitorImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.impl.EntityReaderImpl#getContextProvider <em>Context Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.EntityReaderImpl#getNotifier <em>Notifier</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.EntityReaderImpl#getEntityProvider <em>Entity Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityReaderImpl<E extends EntityNameable> extends MinimalEObjectImpl.Container implements EntityReader<E> {
	/**
	 * The cached value of the '{@link #getContextProvider() <em>Context Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextProvider()
	 * @generated
	 * @ordered
	 */
	protected ContextProvider contextProvider;

	/**
	 * The cached value of the '{@link #getNotifier() <em>Notifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifier()
	 * @generated
	 * @ordered
	 */
	protected ResourceNotifier<E> notifier;

	/**
	 * The cached value of the '{@link #getEntityProvider() <em>Entity Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityProvider()
	 * @generated
	 * @ordered
	 */
	protected EntityProvider entityProvider;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY_READER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextProvider getContextProvider() {
		return contextProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextProvider(ContextProvider newContextProvider) {
		ContextProvider oldContextProvider = contextProvider;
		contextProvider = newContextProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY_READER__CONTEXT_PROVIDER, oldContextProvider, contextProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public ResourceNotifier<E> getNotifier() {
		if (notifier != null && ((EObject)notifier).eIsProxy()) {
			InternalEObject oldNotifier = (InternalEObject)notifier;
			notifier = (ResourceNotifier<E>)eResolveProxy(oldNotifier);
			if (notifier != oldNotifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityPackage.ENTITY_READER__NOTIFIER, oldNotifier, notifier));
			}
		}
		return notifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceNotifier<E> basicGetNotifier() {
		return notifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotifier(ResourceNotifier<E> newNotifier) {
		ResourceNotifier<E> oldNotifier = notifier;
		notifier = newNotifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY_READER__NOTIFIER, oldNotifier, notifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityProvider getEntityProvider() {
		return entityProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityProvider(EntityProvider newEntityProvider) {
		EntityProvider oldEntityProvider = entityProvider;
		entityProvider = newEntityProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY_READER__ENTITY_PROVIDER, oldEntityProvider, entityProvider));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean exists(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityIterator<E> find(String filter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EntityIterator<E> findByExpression(PredicateExpression filter) {
		return new EntityPredicateIterator(find(null), filter);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E lookup(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.ENTITY_READER__CONTEXT_PROVIDER:
				return getContextProvider();
			case EntityPackage.ENTITY_READER__NOTIFIER:
				if (resolve) return getNotifier();
				return basicGetNotifier();
			case EntityPackage.ENTITY_READER__ENTITY_PROVIDER:
				return getEntityProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.ENTITY_READER__CONTEXT_PROVIDER:
				setContextProvider((ContextProvider)newValue);
				return;
			case EntityPackage.ENTITY_READER__NOTIFIER:
				setNotifier((ResourceNotifier<E>)newValue);
				return;
			case EntityPackage.ENTITY_READER__ENTITY_PROVIDER:
				setEntityProvider((EntityProvider)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityPackage.ENTITY_READER__CONTEXT_PROVIDER:
				setContextProvider((ContextProvider)null);
				return;
			case EntityPackage.ENTITY_READER__NOTIFIER:
				setNotifier((ResourceNotifier<E>)null);
				return;
			case EntityPackage.ENTITY_READER__ENTITY_PROVIDER:
				setEntityProvider((EntityProvider)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityPackage.ENTITY_READER__CONTEXT_PROVIDER:
				return contextProvider != null;
			case EntityPackage.ENTITY_READER__NOTIFIER:
				return notifier != null;
			case EntityPackage.ENTITY_READER__ENTITY_PROVIDER:
				return entityProvider != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	private class EntityPredicateIterator implements EntityIterator<E> {

		private EntityIterator<E> iterator;
		private PredicateExpression filter;

		private E nextEntity;

		public EntityPredicateIterator(EntityIterator<E> delegate, PredicateExpression filter) {
			this.iterator = delegate;
			this.filter = filter;

			doNext();
		}

		@Override
		public void close() {
			this.iterator.close();
		}

		@Override
		public boolean hasNext() {
			return this.nextEntity != null;
		}

		@Override
		public E next() {

			E entity = nextEntity;
			doNext();

			return entity;

		}

		@Override
		public void remove() {
			this.iterator.remove();
		}

		private void doNext() {

			nextEntity = null;
			while (iterator.hasNext()) {
				E entity = iterator.next();
				MyExpressionVisitor expressionVisitor = new MyExpressionVisitor((EObject) entity);
				filter.accept(expressionVisitor);

				if (!expressionVisitor.isValid())
					continue;

				nextEntity = entity;
				break;
			}
		}
		
		@Override
		public Iterator<E> iterator() {
			return this;
		}
	}

	private class MyExpressionVisitor extends ExpressionVisitorImpl {

		boolean result = true;

		private EObject eObject;

		public MyExpressionVisitor(EObject eObject) {
			this.eObject = eObject;
		}

		public boolean isValid() {
			return result;
		}

		@Override
		public boolean visit(LogicalExpression expression) {

			expression.getLeftOperand().accept(this);
			if (isValid() || expression.getOperator().equals(LogicalOperator.OR))
				expression.getRightOperand().accept(this);

			return isValid();
		}

		@Override
		public boolean visit(RelationalExpression expression) {

			// TODO
			TermExpression leftOperand = (TermExpression) expression.getLeftOperand();
			String feature = leftOperand.getValue();
			
			String eValue = getValue(feature);
			
			// TODO
			TermExpression rightOperand = (TermExpression) expression.getRightOperand();
			String value = rightOperand.getValue();

			switch (expression.getOperator()) {
			case EQUAL:
				this.result = value.equalsIgnoreCase(eValue);
				break;
			case GREATER_THAN:
				this.result = value.compareTo(eValue) > 0;
				break;
			case GREATER_THAN_EQUAL:
				this.result = value.compareTo(eValue) >= 0;
				break;
			case LESS_THAN:
				this.result = value.compareTo(eValue) < 0;
				break;
			case LESS_THAN_EQUAL:
				this.result = value.compareTo(eValue) <= 0;
				break;
			case NOT_EQUAL:
				this.result = !value.equalsIgnoreCase(eValue);
				break;
			}

			return result;
		}

		private String getValue(String feature) {
			
			String[] features = feature.split("\\.");
			
			String eValue = null;
			EObject tempObject = eObject;
			for(int f = 0; f < features.length; f++) {
				EStructuralFeature eFeature = tempObject.eClass().getEStructuralFeature(features[f]);
				if(eFeature == null)
					break;
				Object object = tempObject.eGet(eFeature);
				if(object instanceof EObject) {
					tempObject = (EObject) object;
					continue;
				}
				else {
					if (object == null)
						eValue = eFeature.getDefaultValueLiteral();
					else
						eValue = object.toString();
					break;
				}
			}

			return eValue;
		}

	}
} // QResourceImpl