/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website.impl;

import org.abchip.mimo.biz.content.website.WebSitePublishPoint;
import org.abchip.mimo.biz.content.website.WebsitePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site Publish Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getAboutContentId <em>About Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getContentDept <em>Content Dept</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getLeftBarId <em>Left Bar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getLineLogo <em>Line Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getLogo <em>Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getMedallionLogo <em>Medallion Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getRightBarId <em>Right Bar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getStyleSheetFile <em>Style Sheet File</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl#getTemplateTitle <em>Template Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSitePublishPointImpl extends BizEntityImpl implements WebSitePublishPoint {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAboutContentId() <em>About Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAboutContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAboutContentId() <em>About Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAboutContentId()
	 * @generated
	 * @ordered
	 */
	protected String aboutContentId = ABOUT_CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentDept() <em>Content Dept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDept()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_DEPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentDept() <em>Content Dept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDept()
	 * @generated
	 * @ordered
	 */
	protected String contentDept = CONTENT_DEPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeftBarId() <em>Left Bar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBarId()
	 * @generated
	 * @ordered
	 */
	protected static final String LEFT_BAR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeftBarId() <em>Left Bar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBarId()
	 * @generated
	 * @ordered
	 */
	protected String leftBarId = LEFT_BAR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineLogo() <em>Line Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineLogo()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineLogo() <em>Line Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineLogo()
	 * @generated
	 * @ordered
	 */
	protected String lineLogo = LINE_LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected String logo = LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedallionLogo() <em>Medallion Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedallionLogo()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDALLION_LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedallionLogo() <em>Medallion Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedallionLogo()
	 * @generated
	 * @ordered
	 */
	protected String medallionLogo = MEDALLION_LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightBarId() <em>Right Bar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBarId()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHT_BAR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightBarId() <em>Right Bar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBarId()
	 * @generated
	 * @ordered
	 */
	protected String rightBarId = RIGHT_BAR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleSheetFile() <em>Style Sheet File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSheetFile()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_SHEET_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleSheetFile() <em>Style Sheet File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSheetFile()
	 * @generated
	 * @ordered
	 */
	protected String styleSheetFile = STYLE_SHEET_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateTitle() <em>Template Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateTitle() <em>Template Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateTitle()
	 * @generated
	 * @ordered
	 */
	protected String templateTitle = TEMPLATE_TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSitePublishPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAboutContentId() {
		return aboutContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAboutContentId(String newAboutContentId) {
		String oldAboutContentId = aboutContentId;
		aboutContentId = newAboutContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__ABOUT_CONTENT_ID, oldAboutContentId, aboutContentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentDept() {
		return contentDept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentDept(String newContentDept) {
		String oldContentDept = contentDept;
		contentDept = newContentDept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_DEPT, oldContentDept, contentDept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLeftBarId() {
		return leftBarId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftBarId(String newLeftBarId) {
		String oldLeftBarId = leftBarId;
		leftBarId = newLeftBarId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__LEFT_BAR_ID, oldLeftBarId, leftBarId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineLogo() {
		return lineLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineLogo(String newLineLogo) {
		String oldLineLogo = lineLogo;
		lineLogo = newLineLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__LINE_LOGO, oldLineLogo, lineLogo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogo() {
		return logo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogo(String newLogo) {
		String oldLogo = logo;
		logo = newLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__LOGO, oldLogo, logo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMedallionLogo() {
		return medallionLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedallionLogo(String newMedallionLogo) {
		String oldMedallionLogo = medallionLogo;
		medallionLogo = newMedallionLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__MEDALLION_LOGO, oldMedallionLogo, medallionLogo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRightBarId() {
		return rightBarId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightBarId(String newRightBarId) {
		String oldRightBarId = rightBarId;
		rightBarId = newRightBarId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__RIGHT_BAR_ID, oldRightBarId, rightBarId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleSheetFile() {
		return styleSheetFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleSheetFile(String newStyleSheetFile) {
		String oldStyleSheetFile = styleSheetFile;
		styleSheetFile = newStyleSheetFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__STYLE_SHEET_FILE, oldStyleSheetFile, styleSheetFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateTitle() {
		return templateTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateTitle(String newTemplateTitle) {
		String oldTemplateTitle = templateTitle;
		templateTitle = newTemplateTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PUBLISH_POINT__TEMPLATE_TITLE, oldTemplateTitle, templateTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_ID:
				return getContentId();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__ABOUT_CONTENT_ID:
				return getAboutContentId();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_DEPT:
				return getContentDept();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LEFT_BAR_ID:
				return getLeftBarId();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LINE_LOGO:
				return getLineLogo();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LOGO:
				return getLogo();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__MEDALLION_LOGO:
				return getMedallionLogo();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__RIGHT_BAR_ID:
				return getRightBarId();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__STYLE_SHEET_FILE:
				return getStyleSheetFile();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__TEMPLATE_TITLE:
				return getTemplateTitle();
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
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__ABOUT_CONTENT_ID:
				setAboutContentId((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_DEPT:
				setContentDept((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LEFT_BAR_ID:
				setLeftBarId((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LINE_LOGO:
				setLineLogo((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LOGO:
				setLogo((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__MEDALLION_LOGO:
				setMedallionLogo((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__RIGHT_BAR_ID:
				setRightBarId((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__STYLE_SHEET_FILE:
				setStyleSheetFile((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__TEMPLATE_TITLE:
				setTemplateTitle((String)newValue);
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
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__ABOUT_CONTENT_ID:
				setAboutContentId(ABOUT_CONTENT_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_DEPT:
				setContentDept(CONTENT_DEPT_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LEFT_BAR_ID:
				setLeftBarId(LEFT_BAR_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LINE_LOGO:
				setLineLogo(LINE_LOGO_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LOGO:
				setLogo(LOGO_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__MEDALLION_LOGO:
				setMedallionLogo(MEDALLION_LOGO_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__RIGHT_BAR_ID:
				setRightBarId(RIGHT_BAR_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__STYLE_SHEET_FILE:
				setStyleSheetFile(STYLE_SHEET_FILE_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__TEMPLATE_TITLE:
				setTemplateTitle(TEMPLATE_TITLE_EDEFAULT);
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
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__ABOUT_CONTENT_ID:
				return ABOUT_CONTENT_ID_EDEFAULT == null ? aboutContentId != null : !ABOUT_CONTENT_ID_EDEFAULT.equals(aboutContentId);
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__CONTENT_DEPT:
				return CONTENT_DEPT_EDEFAULT == null ? contentDept != null : !CONTENT_DEPT_EDEFAULT.equals(contentDept);
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LEFT_BAR_ID:
				return LEFT_BAR_ID_EDEFAULT == null ? leftBarId != null : !LEFT_BAR_ID_EDEFAULT.equals(leftBarId);
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LINE_LOGO:
				return LINE_LOGO_EDEFAULT == null ? lineLogo != null : !LINE_LOGO_EDEFAULT.equals(lineLogo);
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__LOGO:
				return LOGO_EDEFAULT == null ? logo != null : !LOGO_EDEFAULT.equals(logo);
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__MEDALLION_LOGO:
				return MEDALLION_LOGO_EDEFAULT == null ? medallionLogo != null : !MEDALLION_LOGO_EDEFAULT.equals(medallionLogo);
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__RIGHT_BAR_ID:
				return RIGHT_BAR_ID_EDEFAULT == null ? rightBarId != null : !RIGHT_BAR_ID_EDEFAULT.equals(rightBarId);
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__STYLE_SHEET_FILE:
				return STYLE_SHEET_FILE_EDEFAULT == null ? styleSheetFile != null : !STYLE_SHEET_FILE_EDEFAULT.equals(styleSheetFile);
			case WebsitePackage.WEB_SITE_PUBLISH_POINT__TEMPLATE_TITLE:
				return TEMPLATE_TITLE_EDEFAULT == null ? templateTitle != null : !TEMPLATE_TITLE_EDEFAULT.equals(templateTitle);
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
		result.append(" (contentId: ");
		result.append(contentId);
		result.append(", aboutContentId: ");
		result.append(aboutContentId);
		result.append(", contentDept: ");
		result.append(contentDept);
		result.append(", leftBarId: ");
		result.append(leftBarId);
		result.append(", lineLogo: ");
		result.append(lineLogo);
		result.append(", logo: ");
		result.append(logo);
		result.append(", medallionLogo: ");
		result.append(medallionLogo);
		result.append(", rightBarId: ");
		result.append(rightBarId);
		result.append(", styleSheetFile: ");
		result.append(styleSheetFile);
		result.append(", templateTitle: ");
		result.append(templateTitle);
		result.append(')');
		return result.toString();
	}

} //WebSitePublishPointImpl