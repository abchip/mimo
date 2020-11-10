/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Find;
import org.abchip.mimo.entity.FindResponse;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.abchip.mimo.util.Lists;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Find</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.impl.FindImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FindImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FindImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FindImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FindImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FindImpl#isProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindImpl<E extends EntityIdentifiable> extends ServiceRequestImpl<FindResponse<E>> implements Find<E> {
	/**
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected String frame = FRAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;
	/**
	 * The default value of the '{@link #getFields() <em>Fields</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELDS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected String fields = FIELDS_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected String order = ORDER_EDEFAULT;
	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected int limit = LIMIT_EDEFAULT;
	/**
	 * The default value of the '{@link #isProxy() <em>Proxy</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isProxy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROXY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isProxy() <em>Proxy</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isProxy()
	 * @generated
	 * @ordered
	 */
	protected boolean proxy = PROXY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.FIND;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrame(String newFrame) {
		String oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FIND__FRAME, oldFrame, frame));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FIND__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFields() {
		return fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFields(String newFields) {
		String oldFields = fields;
		fields = newFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FIND__FIELDS, oldFields, fields));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(String newOrder) {
		String oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FIND__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(int newLimit) {
		int oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FIND__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxy(boolean newProxy) {
		boolean oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FIND__PROXY, oldProxy, proxy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.FIND__FRAME:
				return getFrame();
			case EntityPackage.FIND__FILTER:
				return getFilter();
			case EntityPackage.FIND__FIELDS:
				return getFields();
			case EntityPackage.FIND__ORDER:
				return getOrder();
			case EntityPackage.FIND__LIMIT:
				return getLimit();
			case EntityPackage.FIND__PROXY:
				return isProxy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.FIND__FRAME:
				setFrame((String)newValue);
				return;
			case EntityPackage.FIND__FILTER:
				setFilter((String)newValue);
				return;
			case EntityPackage.FIND__FIELDS:
				setFields((String)newValue);
				return;
			case EntityPackage.FIND__ORDER:
				setOrder((String)newValue);
				return;
			case EntityPackage.FIND__LIMIT:
				setLimit((Integer)newValue);
				return;
			case EntityPackage.FIND__PROXY:
				setProxy((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityPackage.FIND__FRAME:
				setFrame(FRAME_EDEFAULT);
				return;
			case EntityPackage.FIND__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case EntityPackage.FIND__FIELDS:
				setFields(FIELDS_EDEFAULT);
				return;
			case EntityPackage.FIND__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case EntityPackage.FIND__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case EntityPackage.FIND__PROXY:
				setProxy(PROXY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityPackage.FIND__FRAME:
				return FRAME_EDEFAULT == null ? frame != null : !FRAME_EDEFAULT.equals(frame);
			case EntityPackage.FIND__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case EntityPackage.FIND__FIELDS:
				return FIELDS_EDEFAULT == null ? fields != null : !FIELDS_EDEFAULT.equals(fields);
			case EntityPackage.FIND__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case EntityPackage.FIND__LIMIT:
				return limit != LIMIT_EDEFAULT;
			case EntityPackage.FIND__PROXY:
				return proxy != PROXY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (frame: ");
		result.append(frame);
		result.append(", filter: ");
		result.append(filter);
		result.append(", fields: ");
		result.append(fields);
		result.append(", order: ");
		result.append(order);
		result.append(", limit: ");
		result.append(limit);
		result.append(", proxy: ");
		result.append(proxy);
		result.append(')');
		return result.toString();
	}

	@Override
	public FindResponse<E> call() throws Exception {

		Context context = this.getContext();
		FindResponse<E> response = this.buildResponse();

		ResourceReader<E> entityReader = context.getResourceManager().getResourceReader(this.getFrame());
		try (EntityIterator<E> entityIterator = entityReader.find(getFilter(), getFields(), getOrder(), getLimit(), isProxy())) {
			Lists.addAll(response.getEntities(), entityIterator);
		}

		return response;
	}

} // FindImpl
