/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.schema.impl;

import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.ui.schema.SchemaColumn;
import org.abchip.mimo.ui.schema.SchemaPackage;
import org.abchip.mimo.ui.widget.Widget;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#isAdjust <em>Adjust</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#isContextMenu <em>Context Menu</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#isLeftSplit <em>Left Split</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl#getWidget <em>Widget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaColumnImpl extends EntityImpl implements SchemaColumn {

	/**
	 * The default value of the '{@link #isAdjust() <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADJUST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdjust() <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdjust()
	 * @generated
	 * @ordered
	 */
	protected boolean adjust = ADJUST_EDEFAULT;

	/**
	 * The default value of the '{@link #isContextMenu() <em>Context Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextMenu()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTEXT_MENU_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContextMenu() <em>Context Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextMenu()
	 * @generated
	 * @ordered
	 */
	protected boolean contextMenu = CONTEXT_MENU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain domain;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isLeftSplit() <em>Left Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftSplit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEFT_SPLIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeftSplit() <em>Left Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftSplit()
	 * @generated
	 * @ordered
	 */
	protected boolean leftSplit = LEFT_SPLIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSort() <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected String sort = SORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected Widget widget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.Literals.SCHEMA_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLeftSplit() {
		return leftSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftSplit(boolean newLeftSplit) {
		boolean oldLeftSplit = leftSplit;
		leftSplit = newLeftSplit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__LEFT_SPLIT, oldLeftSplit, leftSplit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSort(String newSort) {
		String oldSort = sort;
		sort = newSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__SORT, oldSort, sort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Widget getWidget() {
		if (widget != null && ((EObject)widget).eIsProxy()) {
			InternalEObject oldWidget = (InternalEObject)widget;
			widget = (Widget)eResolveProxy(oldWidget);
			if (widget != oldWidget) {
				InternalEObject newWidget = (InternalEObject)widget;
				NotificationChain msgs = oldWidget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SCHEMA_COLUMN__WIDGET, null, null);
				if (newWidget.eInternalContainer() == null) {
					msgs = newWidget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SCHEMA_COLUMN__WIDGET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaPackage.SCHEMA_COLUMN__WIDGET, oldWidget, widget));
			}
		}
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget basicGetWidget() {
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidget(Widget newWidget, NotificationChain msgs) {
		Widget oldWidget = widget;
		widget = newWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__WIDGET, oldWidget, newWidget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidget(Widget newWidget) {
		if (newWidget != widget) {
			NotificationChain msgs = null;
			if (widget != null)
				msgs = ((InternalEObject)widget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SCHEMA_COLUMN__WIDGET, null, msgs);
			if (newWidget != null)
				msgs = ((InternalEObject)newWidget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SCHEMA_COLUMN__WIDGET, null, msgs);
			msgs = basicSetWidget(newWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__WIDGET, newWidget, newWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain getDomain() {
		if (domain != null && ((EObject)domain).eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (Domain)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				InternalEObject newDomain = (InternalEObject)domain;
				NotificationChain msgs = oldDomain.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SCHEMA_COLUMN__DOMAIN, null, null);
				if (newDomain.eInternalContainer() == null) {
					msgs = newDomain.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SCHEMA_COLUMN__DOMAIN, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaPackage.SCHEMA_COLUMN__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		Domain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(Domain newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SCHEMA_COLUMN__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SCHEMA_COLUMN__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.SCHEMA_COLUMN__DOMAIN:
				return basicSetDomain(null, msgs);
			case SchemaPackage.SCHEMA_COLUMN__WIDGET:
				return basicSetWidget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAdjust() {
		return adjust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdjust(boolean newAdjust) {
		boolean oldAdjust = adjust;
		adjust = newAdjust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__ADJUST, oldAdjust, adjust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContextMenu() {
		return contextMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextMenu(boolean newContextMenu) {
		boolean oldContextMenu = contextMenu;
		contextMenu = newContextMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_COLUMN__CONTEXT_MENU, oldContextMenu, contextMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.SCHEMA_COLUMN__ADJUST:
				return isAdjust();
			case SchemaPackage.SCHEMA_COLUMN__CONTEXT_MENU:
				return isContextMenu();
			case SchemaPackage.SCHEMA_COLUMN__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case SchemaPackage.SCHEMA_COLUMN__GROUP:
				return getGroup();
			case SchemaPackage.SCHEMA_COLUMN__HEADER:
				return getHeader();
			case SchemaPackage.SCHEMA_COLUMN__ICON:
				return getIcon();
			case SchemaPackage.SCHEMA_COLUMN__ID:
				return getId();
			case SchemaPackage.SCHEMA_COLUMN__LEFT_SPLIT:
				return isLeftSplit();
			case SchemaPackage.SCHEMA_COLUMN__SORT:
				return getSort();
			case SchemaPackage.SCHEMA_COLUMN__WIDGET:
				if (resolve) return getWidget();
				return basicGetWidget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.SCHEMA_COLUMN__ADJUST:
				setAdjust((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA_COLUMN__CONTEXT_MENU:
				setContextMenu((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA_COLUMN__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case SchemaPackage.SCHEMA_COLUMN__GROUP:
				setGroup((String)newValue);
				return;
			case SchemaPackage.SCHEMA_COLUMN__HEADER:
				setHeader((String)newValue);
				return;
			case SchemaPackage.SCHEMA_COLUMN__ICON:
				setIcon((String)newValue);
				return;
			case SchemaPackage.SCHEMA_COLUMN__ID:
				setId((String)newValue);
				return;
			case SchemaPackage.SCHEMA_COLUMN__LEFT_SPLIT:
				setLeftSplit((Boolean)newValue);
				return;
			case SchemaPackage.SCHEMA_COLUMN__SORT:
				setSort((String)newValue);
				return;
			case SchemaPackage.SCHEMA_COLUMN__WIDGET:
				setWidget((Widget)newValue);
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
			case SchemaPackage.SCHEMA_COLUMN__ADJUST:
				setAdjust(ADJUST_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA_COLUMN__CONTEXT_MENU:
				setContextMenu(CONTEXT_MENU_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA_COLUMN__DOMAIN:
				setDomain((Domain)null);
				return;
			case SchemaPackage.SCHEMA_COLUMN__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA_COLUMN__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA_COLUMN__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA_COLUMN__ID:
				setId(ID_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA_COLUMN__LEFT_SPLIT:
				setLeftSplit(LEFT_SPLIT_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA_COLUMN__SORT:
				setSort(SORT_EDEFAULT);
				return;
			case SchemaPackage.SCHEMA_COLUMN__WIDGET:
				setWidget((Widget)null);
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
			case SchemaPackage.SCHEMA_COLUMN__ADJUST:
				return adjust != ADJUST_EDEFAULT;
			case SchemaPackage.SCHEMA_COLUMN__CONTEXT_MENU:
				return contextMenu != CONTEXT_MENU_EDEFAULT;
			case SchemaPackage.SCHEMA_COLUMN__DOMAIN:
				return domain != null;
			case SchemaPackage.SCHEMA_COLUMN__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case SchemaPackage.SCHEMA_COLUMN__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case SchemaPackage.SCHEMA_COLUMN__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case SchemaPackage.SCHEMA_COLUMN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SchemaPackage.SCHEMA_COLUMN__LEFT_SPLIT:
				return leftSplit != LEFT_SPLIT_EDEFAULT;
			case SchemaPackage.SCHEMA_COLUMN__SORT:
				return SORT_EDEFAULT == null ? sort != null : !SORT_EDEFAULT.equals(sort);
			case SchemaPackage.SCHEMA_COLUMN__WIDGET:
				return widget != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (adjust: ");
		result.append(adjust);
		result.append(", contextMenu: ");
		result.append(contextMenu);
		result.append(", group: ");
		result.append(group);
		result.append(", header: ");
		result.append(header);
		result.append(", icon: ");
		result.append(icon);
		result.append(", id: ");
		result.append(id);
		result.append(", leftSplit: ");
		result.append(leftSplit);
		result.append(", sort: ");
		result.append(sort);
		result.append(')');
		return result.toString();
	}

} //SchemaColumnImpl
