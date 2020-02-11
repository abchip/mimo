/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.content.content.Content;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Hit Bin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerHitBinId <em>Server Hit Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getBinEndDateTime <em>Bin End Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getBinStartDateTime <em>Bin Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getHitTypeId <em>Hit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getInternalContentId <em>Internal Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getMaxTimeMillis <em>Max Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getMinTimeMillis <em>Min Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getNumberHits <em>Number Hits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerHostName <em>Server Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerIpAddress <em>Server Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getTotalTimeMillis <em>Total Time Millis</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin()
 * @model
 * @generated
 */
public interface ServerHitBin extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Server Hit Bin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Hit Bin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Hit Bin Id</em>' attribute.
	 * @see #setServerHitBinId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_ServerHitBinId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getServerHitBinId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerHitBinId <em>Server Hit Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Hit Bin Id</em>' attribute.
	 * @see #getServerHitBinId()
	 * @generated
	 */
	void setServerHitBinId(String value);

	/**
	 * Returns the value of the '<em><b>Bin End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin End Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin End Date Time</em>' attribute.
	 * @see #setBinEndDateTime(Date)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_BinEndDateTime()
	 * @model
	 * @generated
	 */
	Date getBinEndDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getBinEndDateTime <em>Bin End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin End Date Time</em>' attribute.
	 * @see #getBinEndDateTime()
	 * @generated
	 */
	void setBinEndDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Bin Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Start Date Time</em>' attribute.
	 * @see #setBinStartDateTime(Date)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_BinStartDateTime()
	 * @model
	 * @generated
	 */
	Date getBinStartDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getBinStartDateTime <em>Bin Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin Start Date Time</em>' attribute.
	 * @see #getBinStartDateTime()
	 * @generated
	 */
	void setBinStartDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_ContentId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

	/**
	 * Returns the value of the '<em><b>Hit Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hit Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit Type Id</em>' reference.
	 * @see #setHitTypeId(ServerHitType)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_HitTypeId()
	 * @model keys="hitTypeId"
	 * @generated
	 */
	ServerHitType getHitTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getHitTypeId <em>Hit Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit Type Id</em>' reference.
	 * @see #getHitTypeId()
	 * @generated
	 */
	void setHitTypeId(ServerHitType value);

	/**
	 * Returns the value of the '<em><b>Internal Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Content Id</em>' reference.
	 * @see #setInternalContentId(Content)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_InternalContentId()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getInternalContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getInternalContentId <em>Internal Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Content Id</em>' reference.
	 * @see #getInternalContentId()
	 * @generated
	 */
	void setInternalContentId(Content value);

	/**
	 * Returns the value of the '<em><b>Max Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time Millis</em>' attribute.
	 * @see #setMaxTimeMillis(long)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_MaxTimeMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxTimeMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getMaxTimeMillis <em>Max Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time Millis</em>' attribute.
	 * @see #getMaxTimeMillis()
	 * @generated
	 */
	void setMaxTimeMillis(long value);

	/**
	 * Returns the value of the '<em><b>Min Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Time Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time Millis</em>' attribute.
	 * @see #setMinTimeMillis(long)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_MinTimeMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMinTimeMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getMinTimeMillis <em>Min Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time Millis</em>' attribute.
	 * @see #getMinTimeMillis()
	 * @generated
	 */
	void setMinTimeMillis(long value);

	/**
	 * Returns the value of the '<em><b>Number Hits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Hits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Hits</em>' attribute.
	 * @see #setNumberHits(long)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_NumberHits()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNumberHits();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getNumberHits <em>Number Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Hits</em>' attribute.
	 * @see #getNumberHits()
	 * @generated
	 */
	void setNumberHits(long value);

	/**
	 * Returns the value of the '<em><b>Server Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Host Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Host Name</em>' attribute.
	 * @see #setServerHostName(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_ServerHostName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getServerHostName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerHostName <em>Server Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Host Name</em>' attribute.
	 * @see #getServerHostName()
	 * @generated
	 */
	void setServerHostName(String value);

	/**
	 * Returns the value of the '<em><b>Server Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Ip Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Ip Address</em>' attribute.
	 * @see #setServerIpAddress(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_ServerIpAddress()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getServerIpAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerIpAddress <em>Server Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Ip Address</em>' attribute.
	 * @see #getServerIpAddress()
	 * @generated
	 */
	void setServerIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Total Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Time Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Time Millis</em>' attribute.
	 * @see #setTotalTimeMillis(long)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHitBin_TotalTimeMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTotalTimeMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getTotalTimeMillis <em>Total Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Time Millis</em>' attribute.
	 * @see #getTotalTimeMillis()
	 * @generated
	 */
	void setTotalTimeMillis(long value);

} // ServerHitBin
