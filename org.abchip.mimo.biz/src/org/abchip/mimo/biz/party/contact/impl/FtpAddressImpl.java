/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.FtpAddress;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #isBinaryTransfer() <em>Binary Transfer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBinaryTransfer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BINARY_TRANSFER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBinaryTransfer() <em>Binary Transfer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBinaryTransfer()
	 * @generated
	 * @ordered
	 */
	protected boolean binaryTransfer = BINARY_TRANSFER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTimeout() <em>Default Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final long DEFAULT_TIMEOUT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDefaultTimeout() <em>Default Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeout()
	 * @generated
	 * @ordered
	 */
	protected long defaultTimeout = DEFAULT_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFtpPassword() <em>Ftp Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String FTP_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtpPassword() <em>Ftp Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpPassword()
	 * @generated
	 * @ordered
	 */
	protected String ftpPassword = FTP_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPassiveMode() <em>Passive Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassiveMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASSIVE_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassiveMode() <em>Passive Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassiveMode()
	 * @generated
	 * @ordered
	 */
	protected boolean passiveMode = PASSIVE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final long PORT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected long port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isZipFile() <em>Zip File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZipFile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZIP_FILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZipFile() <em>Zip File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZipFile()
	 * @generated
	 * @ordered
	 */
	protected boolean zipFile = ZIP_FILE_EDEFAULT;

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
		return binaryTransfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinaryTransfer(boolean newBinaryTransfer) {
		boolean oldBinaryTransfer = binaryTransfer;
		binaryTransfer = newBinaryTransfer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.FTP_ADDRESS__BINARY_TRANSFER, oldBinaryTransfer, binaryTransfer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDefaultTimeout() {
		return defaultTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeout(long newDefaultTimeout) {
		long oldDefaultTimeout = defaultTimeout;
		defaultTimeout = newDefaultTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.FTP_ADDRESS__DEFAULT_TIMEOUT, oldDefaultTimeout, defaultTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.FTP_ADDRESS__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFtpPassword() {
		return ftpPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFtpPassword(String newFtpPassword) {
		String oldFtpPassword = ftpPassword;
		ftpPassword = newFtpPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.FTP_ADDRESS__FTP_PASSWORD, oldFtpPassword, ftpPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.FTP_ADDRESS__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPassiveMode() {
		return passiveMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassiveMode(boolean newPassiveMode) {
		boolean oldPassiveMode = passiveMode;
		passiveMode = newPassiveMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.FTP_ADDRESS__PASSIVE_MODE, oldPassiveMode, passiveMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(long newPort) {
		long oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.FTP_ADDRESS__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.FTP_ADDRESS__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZipFile() {
		return zipFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZipFile(boolean newZipFile) {
		boolean oldZipFile = zipFile;
		zipFile = newZipFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.FTP_ADDRESS__ZIP_FILE, oldZipFile, zipFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.FTP_ADDRESS__BINARY_TRANSFER:
				return isBinaryTransfer();
			case ContactPackage.FTP_ADDRESS__DEFAULT_TIMEOUT:
				return getDefaultTimeout();
			case ContactPackage.FTP_ADDRESS__FILE_PATH:
				return getFilePath();
			case ContactPackage.FTP_ADDRESS__FTP_PASSWORD:
				return getFtpPassword();
			case ContactPackage.FTP_ADDRESS__HOSTNAME:
				return getHostname();
			case ContactPackage.FTP_ADDRESS__PASSIVE_MODE:
				return isPassiveMode();
			case ContactPackage.FTP_ADDRESS__PORT:
				return getPort();
			case ContactPackage.FTP_ADDRESS__USERNAME:
				return getUsername();
			case ContactPackage.FTP_ADDRESS__ZIP_FILE:
				return isZipFile();
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
			case ContactPackage.FTP_ADDRESS__BINARY_TRANSFER:
				setBinaryTransfer((Boolean)newValue);
				return;
			case ContactPackage.FTP_ADDRESS__DEFAULT_TIMEOUT:
				setDefaultTimeout((Long)newValue);
				return;
			case ContactPackage.FTP_ADDRESS__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case ContactPackage.FTP_ADDRESS__FTP_PASSWORD:
				setFtpPassword((String)newValue);
				return;
			case ContactPackage.FTP_ADDRESS__HOSTNAME:
				setHostname((String)newValue);
				return;
			case ContactPackage.FTP_ADDRESS__PASSIVE_MODE:
				setPassiveMode((Boolean)newValue);
				return;
			case ContactPackage.FTP_ADDRESS__PORT:
				setPort((Long)newValue);
				return;
			case ContactPackage.FTP_ADDRESS__USERNAME:
				setUsername((String)newValue);
				return;
			case ContactPackage.FTP_ADDRESS__ZIP_FILE:
				setZipFile((Boolean)newValue);
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
			case ContactPackage.FTP_ADDRESS__BINARY_TRANSFER:
				setBinaryTransfer(BINARY_TRANSFER_EDEFAULT);
				return;
			case ContactPackage.FTP_ADDRESS__DEFAULT_TIMEOUT:
				setDefaultTimeout(DEFAULT_TIMEOUT_EDEFAULT);
				return;
			case ContactPackage.FTP_ADDRESS__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case ContactPackage.FTP_ADDRESS__FTP_PASSWORD:
				setFtpPassword(FTP_PASSWORD_EDEFAULT);
				return;
			case ContactPackage.FTP_ADDRESS__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case ContactPackage.FTP_ADDRESS__PASSIVE_MODE:
				setPassiveMode(PASSIVE_MODE_EDEFAULT);
				return;
			case ContactPackage.FTP_ADDRESS__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ContactPackage.FTP_ADDRESS__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case ContactPackage.FTP_ADDRESS__ZIP_FILE:
				setZipFile(ZIP_FILE_EDEFAULT);
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
			case ContactPackage.FTP_ADDRESS__BINARY_TRANSFER:
				return binaryTransfer != BINARY_TRANSFER_EDEFAULT;
			case ContactPackage.FTP_ADDRESS__DEFAULT_TIMEOUT:
				return defaultTimeout != DEFAULT_TIMEOUT_EDEFAULT;
			case ContactPackage.FTP_ADDRESS__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case ContactPackage.FTP_ADDRESS__FTP_PASSWORD:
				return FTP_PASSWORD_EDEFAULT == null ? ftpPassword != null : !FTP_PASSWORD_EDEFAULT.equals(ftpPassword);
			case ContactPackage.FTP_ADDRESS__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case ContactPackage.FTP_ADDRESS__PASSIVE_MODE:
				return passiveMode != PASSIVE_MODE_EDEFAULT;
			case ContactPackage.FTP_ADDRESS__PORT:
				return port != PORT_EDEFAULT;
			case ContactPackage.FTP_ADDRESS__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case ContactPackage.FTP_ADDRESS__ZIP_FILE:
				return zipFile != ZIP_FILE_EDEFAULT;
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
		result.append(" (binaryTransfer: ");
		result.append(binaryTransfer);
		result.append(", defaultTimeout: ");
		result.append(defaultTimeout);
		result.append(", filePath: ");
		result.append(filePath);
		result.append(", ftpPassword: ");
		result.append(ftpPassword);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(", passiveMode: ");
		result.append(passiveMode);
		result.append(", port: ");
		result.append(port);
		result.append(", username: ");
		result.append(username);
		result.append(", zipFile: ");
		result.append(zipFile);
		result.append(')');
		return result.toString();
	}

} //FtpAddressImpl
