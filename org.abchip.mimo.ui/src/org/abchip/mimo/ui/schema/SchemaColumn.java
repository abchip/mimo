/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.schema;

import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.ui.widget.Widget;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#isAdjust <em>Adjust</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#isContextMenu <em>Context Menu</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#getGroup <em>Group</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#getHeader <em>Header</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#getId <em>Id</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#isLeftSplit <em>Left Split</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#getSort <em>Sort</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#getWidget <em>Widget</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn()
 * @model
 * @generated
 */
public interface SchemaColumn extends Entity {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Left Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Split</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Split</em>' attribute.
	 * @see #setLeftSplit(boolean)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_LeftSplit()
	 * @model
	 * @generated
	 */
	boolean isLeftSplit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#isLeftSplit <em>Left Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Split</em>' attribute.
	 * @see #isLeftSplit()
	 * @generated
	 */
	void setLeftSplit(boolean value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' attribute.
	 * @see #setSort(String)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Sort()
	 * @model
	 * @generated
	 */
	String getSort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#getSort <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' attribute.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(String value);

	/**
	 * Returns the value of the '<em><b>Widget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget</em>' containment reference.
	 * @see #setWidget(Widget)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Widget()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Widget getWidget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#getWidget <em>Widget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget</em>' containment reference.
	 * @see #getWidget()
	 * @generated
	 */
	void setWidget(Widget value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(Domain)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Domain()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjust</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjust</em>' attribute.
	 * @see #setAdjust(boolean)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Adjust()
	 * @model
	 * @generated
	 */
	boolean isAdjust();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#isAdjust <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjust</em>' attribute.
	 * @see #isAdjust()
	 * @generated
	 */
	void setAdjust(boolean value);

	/**
	 * Returns the value of the '<em><b>Context Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Menu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Menu</em>' attribute.
	 * @see #setContextMenu(boolean)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_ContextMenu()
	 * @model annotation="mimo-ent frame='frame'"
	 * @generated
	 */
	boolean isContextMenu();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#isContextMenu <em>Context Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Menu</em>' attribute.
	 * @see #isContextMenu()
	 * @generated
	 */
	void setContextMenu(boolean value);

} // SchemaColumn
