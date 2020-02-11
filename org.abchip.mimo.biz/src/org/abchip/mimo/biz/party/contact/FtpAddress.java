/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ftp Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.FtpAddress#isBinaryTransfer <em>Binary Transfer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.FtpAddress#getDefaultTimeout <em>Default Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.FtpAddress#getFilePath <em>File Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.FtpAddress#getFtpPassword <em>Ftp Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.FtpAddress#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.FtpAddress#isPassiveMode <em>Passive Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.FtpAddress#getPort <em>Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.FtpAddress#getUsername <em>Username</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.FtpAddress#isZipFile <em>Zip File</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress()
 * @model annotation="mimo-ent-frame title='Ftp server'"
 * @generated
 */
public interface FtpAddress extends ContactMech {
	/**
	 * Returns the value of the '<em><b>Binary Transfer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Transfer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Transfer</em>' attribute.
	 * @see #setBinaryTransfer(boolean)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress_BinaryTransfer()
	 * @model
	 * @generated
	 */
	boolean isBinaryTransfer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.FtpAddress#isBinaryTransfer <em>Binary Transfer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Transfer</em>' attribute.
	 * @see #isBinaryTransfer()
	 * @generated
	 */
	void setBinaryTransfer(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Timeout</em>' attribute.
	 * @see #setDefaultTimeout(long)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress_DefaultTimeout()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getDefaultTimeout();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getDefaultTimeout <em>Default Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Timeout</em>' attribute.
	 * @see #getDefaultTimeout()
	 * @generated
	 */
	void setDefaultTimeout(long value);

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress_FilePath()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Ftp Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftp Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp Password</em>' attribute.
	 * @see #setFtpPassword(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress_FtpPassword()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getFtpPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getFtpPassword <em>Ftp Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ftp Password</em>' attribute.
	 * @see #getFtpPassword()
	 * @generated
	 */
	void setFtpPassword(String value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress_Hostname()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Passive Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passive Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive Mode</em>' attribute.
	 * @see #setPassiveMode(boolean)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress_PassiveMode()
	 * @model
	 * @generated
	 */
	boolean isPassiveMode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.FtpAddress#isPassiveMode <em>Passive Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive Mode</em>' attribute.
	 * @see #isPassiveMode()
	 * @generated
	 */
	void setPassiveMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(long)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress_Port()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(long value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress_Username()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Zip File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip File</em>' attribute.
	 * @see #setZipFile(boolean)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getFtpAddress_ZipFile()
	 * @model
	 * @generated
	 */
	boolean isZipFile();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.FtpAddress#isZipFile <em>Zip File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip File</em>' attribute.
	 * @see #isZipFile()
	 * @generated
	 */
	void setZipFile(boolean value);

} // FtpAddress
