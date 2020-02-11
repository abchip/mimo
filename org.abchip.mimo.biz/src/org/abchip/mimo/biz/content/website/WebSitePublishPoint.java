/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site Publish Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getAboutContentId <em>About Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getContentDept <em>Content Dept</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLeftBarId <em>Left Bar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLineLogo <em>Line Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLogo <em>Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getMedallionLogo <em>Medallion Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getRightBarId <em>Right Bar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getStyleSheetFile <em>Style Sheet File</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getTemplateTitle <em>Template Title</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint()
 * @model
 * @generated
 */
public interface WebSitePublishPoint extends BizEntity {
	/**
	 * Returns the value of the '<em><b>About Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>About Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About Content Id</em>' attribute.
	 * @see #setAboutContentId(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_AboutContentId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAboutContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getAboutContentId <em>About Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About Content Id</em>' attribute.
	 * @see #getAboutContentId()
	 * @generated
	 */
	void setAboutContentId(String value);

	/**
	 * Returns the value of the '<em><b>Content Dept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Dept</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Dept</em>' attribute.
	 * @see #setContentDept(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_ContentDept()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentDept();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getContentDept <em>Content Dept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Dept</em>' attribute.
	 * @see #getContentDept()
	 * @generated
	 */
	void setContentDept(String value);

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
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_ContentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

	/**
	 * Returns the value of the '<em><b>Left Bar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Bar Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Bar Id</em>' attribute.
	 * @see #setLeftBarId(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_LeftBarId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getLeftBarId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLeftBarId <em>Left Bar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Bar Id</em>' attribute.
	 * @see #getLeftBarId()
	 * @generated
	 */
	void setLeftBarId(String value);

	/**
	 * Returns the value of the '<em><b>Line Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Logo</em>' attribute.
	 * @see #setLineLogo(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_LineLogo()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLineLogo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLineLogo <em>Line Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Logo</em>' attribute.
	 * @see #getLineLogo()
	 * @generated
	 */
	void setLineLogo(String value);

	/**
	 * Returns the value of the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo</em>' attribute.
	 * @see #setLogo(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_Logo()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLogo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLogo <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo</em>' attribute.
	 * @see #getLogo()
	 * @generated
	 */
	void setLogo(String value);

	/**
	 * Returns the value of the '<em><b>Medallion Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medallion Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medallion Logo</em>' attribute.
	 * @see #setMedallionLogo(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_MedallionLogo()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMedallionLogo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getMedallionLogo <em>Medallion Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medallion Logo</em>' attribute.
	 * @see #getMedallionLogo()
	 * @generated
	 */
	void setMedallionLogo(String value);

	/**
	 * Returns the value of the '<em><b>Right Bar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Bar Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Bar Id</em>' attribute.
	 * @see #setRightBarId(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_RightBarId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRightBarId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getRightBarId <em>Right Bar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Bar Id</em>' attribute.
	 * @see #getRightBarId()
	 * @generated
	 */
	void setRightBarId(String value);

	/**
	 * Returns the value of the '<em><b>Style Sheet File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Sheet File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Sheet File</em>' attribute.
	 * @see #setStyleSheetFile(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_StyleSheetFile()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getStyleSheetFile();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getStyleSheetFile <em>Style Sheet File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Sheet File</em>' attribute.
	 * @see #getStyleSheetFile()
	 * @generated
	 */
	void setStyleSheetFile(String value);

	/**
	 * Returns the value of the '<em><b>Template Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Title</em>' attribute.
	 * @see #setTemplateTitle(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSitePublishPoint_TemplateTitle()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTemplateTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getTemplateTitle <em>Template Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Title</em>' attribute.
	 * @see #getTemplateTitle()
	 * @generated
	 */
	void setTemplateTitle(String value);

} // WebSitePublishPoint
