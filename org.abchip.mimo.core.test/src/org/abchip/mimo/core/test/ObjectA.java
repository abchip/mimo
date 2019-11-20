/**
 */
package org.abchip.mimo.core.test;

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
 * </ul>
 *
 * @see org.abchip.mimo.core.test.TestPackage#getObjectA()
 * @model
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

} // QObjectA
