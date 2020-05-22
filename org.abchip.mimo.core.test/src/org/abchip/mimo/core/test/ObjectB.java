/**
 */
package org.abchip.mimo.core.test;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.core.test.ObjectB#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.ObjectB#getEnum1 <em>Enum1</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.ObjectB#getNationality <em>Nationality</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.core.test.TestPackage#getObjectB()
 * @model
 * @generated
 */
public interface ObjectB extends EObject, EntityIdentifiable {
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
	 * @see org.abchip.mimo.core.test.TestPackage#getObjectB_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.core.test.ObjectB#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enum1</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.core.test.Enum1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum1</em>' attribute.
	 * @see org.abchip.mimo.core.test.Enum1
	 * @see #setEnum1(Enum1)
	 * @see org.abchip.mimo.core.test.TestPackage#getObjectB_Enum1()
	 * @model required="true"
	 * @generated
	 */
	Enum1 getEnum1();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.core.test.ObjectB#getEnum1 <em>Enum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum1</em>' attribute.
	 * @see org.abchip.mimo.core.test.Enum1
	 * @see #getEnum1()
	 * @generated
	 */
	void setEnum1(Enum1 value);

	/**
	 * Returns the value of the '<em><b>Nationality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationality</em>' attribute.
	 * @see #setNationality(String)
	 * @see org.abchip.mimo.core.test.TestPackage#getObjectB_Nationality()
	 * @model dataType="org.abchip.mimo.core.test.String8Chars"
	 * @generated
	 */
	String getNationality();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.core.test.ObjectB#getNationality <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationality</em>' attribute.
	 * @see #getNationality()
	 * @generated
	 */
	void setNationality(String value);

} // QObjectB
