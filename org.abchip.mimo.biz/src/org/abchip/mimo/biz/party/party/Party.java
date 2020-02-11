/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.humanres.ability.PartySkill;
import org.abchip.mimo.biz.product.supplier.SupplierProductFeature;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#isIsUnread <em>Is Unread</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPartyAttributes <em>Party Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPartyIdentifications <em>Party Identifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPartyNameHistories <em>Party Name Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPartyNotes <em>Party Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPartyProfileDefaults <em>Party Profile Defaults</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPartyRoles <em>Party Roles</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPartySkills <em>Party Skills</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPartyTypeId <em>Party Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getPreferredCurrencyUomId <em>Preferred Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Party#getSupplierProductFeatures <em>Supplier Product Features</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Party extends BizEntityTyped<PartyType> {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Id</em>' reference.
	 * @see #setDataSourceId(DataSource)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_DataSourceId()
	 * @model keys="dataSourceId"
	 * @generated
	 */
	DataSource getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getDataSourceId <em>Data Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' reference.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(DataSource value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_ExternalId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

	/**
	 * Returns the value of the '<em><b>Is Unread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unread</em>' attribute.
	 * @see #setIsUnread(boolean)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_IsUnread()
	 * @model
	 * @generated
	 */
	boolean isIsUnread();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#isIsUnread <em>Is Unread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unread</em>' attribute.
	 * @see #isIsUnread()
	 * @generated
	 */
	void setIsUnread(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #setLastModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_LastModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.party.PartyAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PartyAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyAttribute> getPartyAttributes();

	/**
	 * Returns the value of the '<em><b>Party Identifications</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.party.PartyIdentification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Identifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Identifications</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PartyIdentifications()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyIdentification> getPartyIdentifications();

	/**
	 * Returns the value of the '<em><b>Party Name Histories</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.party.PartyNameHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Name Histories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Name Histories</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PartyNameHistories()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyNameHistory> getPartyNameHistories();

	/**
	 * Returns the value of the '<em><b>Party Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.party.PartyNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Notes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PartyNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyNote> getPartyNotes();

	/**
	 * Returns the value of the '<em><b>Party Profile Defaults</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.party.PartyProfileDefault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Profile Defaults</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Profile Defaults</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PartyProfileDefaults()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyProfileDefault> getPartyProfileDefaults();

	/**
	 * Returns the value of the '<em><b>Party Roles</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.party.PartyRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Roles</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PartyRoles()
	 * @model derived="true"
	 * @generated
	 */
	List<PartyRole> getPartyRoles();

	/**
	 * Returns the value of the '<em><b>Party Skills</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.humanres.ability.PartySkill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Skills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Skills</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PartySkills()
	 * @model derived="true"
	 * @generated
	 */
	List<PartySkill> getPartySkills();

	/**
	 * Returns the value of the '<em><b>Preferred Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Currency Uom Id</em>' reference.
	 * @see #setPreferredCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PreferredCurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getPreferredCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getPreferredCurrencyUomId <em>Preferred Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Currency Uom Id</em>' reference.
	 * @see #getPreferredCurrencyUomId()
	 * @generated
	 */
	void setPreferredCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Supplier Product Features</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Product Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Product Features</em>' reference list.
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_SupplierProductFeatures()
	 * @model derived="true"
	 * @generated
	 */
	List<SupplierProductFeature> getSupplierProductFeatures();

	/**
	 * Returns the value of the '<em><b>Party Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Type Id</em>' reference.
	 * @see #setPartyTypeId(PartyType)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PartyTypeId()
	 * @model keys="partyTypeId"
	 * @generated
	 */
	PartyType getPartyTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getPartyTypeId <em>Party Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Type Id</em>' reference.
	 * @see #getPartyTypeId()
	 * @generated
	 */
	void setPartyTypeId(PartyType value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getParty_PartyId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Party#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

} // Party
