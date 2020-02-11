/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.FtpAddress;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ftp Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl#isBinaryTransfer <em>Binary Transfer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl#getDefaultTimeout <em>Default Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl#getFtpPassword <em>Ftp Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl#isPassiveMode <em>Passive Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl#isZipFile <em>Zip File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FtpAddressImpl extends ContactMechImpl implements FtpAddress {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FtpAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.FTP_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBinaryTransfer() {
		return (Boolean)eGet(ContactPackage.Literals.FTP_ADDRESS__BINARY_TRANSFER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinaryTransfer(boolean newBinaryTransfer) {
		eSet(ContactPackage.Literals.FTP_ADDRESS__BINARY_TRANSFER, newBinaryTransfer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDefaultTimeout() {
		return (Long)eGet(ContactPackage.Literals.FTP_ADDRESS__DEFAULT_TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeout(long newDefaultTimeout) {
		eSet(ContactPackage.Literals.FTP_ADDRESS__DEFAULT_TIMEOUT, newDefaultTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilePath() {
		return (String)eGet(ContactPackage.Literals.FTP_ADDRESS__FILE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilePath(String newFilePath) {
		eSet(ContactPackage.Literals.FTP_ADDRESS__FILE_PATH, newFilePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFtpPassword() {
		return (String)eGet(ContactPackage.Literals.FTP_ADDRESS__FTP_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFtpPassword(String newFtpPassword) {
		eSet(ContactPackage.Literals.FTP_ADDRESS__FTP_PASSWORD, newFtpPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostname() {
		return (String)eGet(ContactPackage.Literals.FTP_ADDRESS__HOSTNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostname(String newHostname) {
		eSet(ContactPackage.Literals.FTP_ADDRESS__HOSTNAME, newHostname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPassiveMode() {
		return (Boolean)eGet(ContactPackage.Literals.FTP_ADDRESS__PASSIVE_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassiveMode(boolean newPassiveMode) {
		eSet(ContactPackage.Literals.FTP_ADDRESS__PASSIVE_MODE, newPassiveMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPort() {
		return (Long)eGet(ContactPackage.Literals.FTP_ADDRESS__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(long newPort) {
		eSet(ContactPackage.Literals.FTP_ADDRESS__PORT, newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return (String)eGet(ContactPackage.Literals.FTP_ADDRESS__USERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		eSet(ContactPackage.Literals.FTP_ADDRESS__USERNAME, newUsername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZipFile() {
		return (Boolean)eGet(ContactPackage.Literals.FTP_ADDRESS__ZIP_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZipFile(boolean newZipFile) {
		eSet(ContactPackage.Literals.FTP_ADDRESS__ZIP_FILE, newZipFile);
	}

} //FtpAddressImpl
