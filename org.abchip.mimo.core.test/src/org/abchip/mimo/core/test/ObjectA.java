/**
 */
package org.abchip.mimo.core.test;

import java.math.BigDecimal;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.core.test.ObjectA#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.ObjectA#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.ObjectA#getObjectB <em>Object B</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.ObjectA#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.ObjectA#getDynamic2 <em>Dynamic2</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.core.test.TestPackage#getObjectA()
 * @model extendedMetaData="name='pippo'"
 * @generated
 */
public interface ObjectA extends EObject, EntityIdentifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.core.test.TestPackage#getObjectA_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.core.test.ObjectA#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.abchip.mimo.core.test.TestPackage#getObjectA_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.core.test.ObjectA#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Object B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object B</em>' containment reference.
	 * @see #setObjectB(ObjectB)
	 * @see org.abchip.mimo.core.test.TestPackage#getObjectA_ObjectB()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectB getObjectB();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.core.test.ObjectA#getObjectB <em>Object B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object B</em>' containment reference.
	 * @see #getObjectB()
	 * @generated
	 */
	void setObjectB(ObjectB value);

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(String)
	 * @see org.abchip.mimo.core.test.TestPackage#getObjectA_Dynamic()
	 * @model required="true"
	 *        annotation="org.abchip.mimo.core.base.setting"
	 * @generated
	 */
	String getDynamic();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.core.test.ObjectA#getDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #getDynamic()
	 * @generated
	 */
	void setDynamic(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic2</em>' attribute.
	 * @see #setDynamic2(String)
	 * @see org.abchip.mimo.core.test.TestPackage#getObjectA_Dynamic2()
	 * @model required="true"
	 *        annotation="org.abchip.mimo.core.base.setting"
	 * @generated
	 */
	String getDynamic2();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.core.test.ObjectA#getDynamic2 <em>Dynamic2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic2</em>' attribute.
	 * @see #getDynamic2()
	 * @generated
	 */
	void setDynamic2(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="org.abchip.mimo.core.base.invocation"
	 * @generated
	 */
	BigDecimal getTotal();

} // QObjectA
