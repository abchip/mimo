/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.logic.impl;

import org.abchip.mimo.logic.LogicPackage;
import org.abchip.mimo.logic.Question;
import org.abchip.mimo.logic.Term;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.logic.impl.QuestionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.abchip.mimo.logic.impl.QuestionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.logic.impl.QuestionImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.abchip.mimo.logic.impl.QuestionImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected Term object;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Term subject;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected Term relation;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Term rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term getObject() {
		if (object != null && ((EObject)object).eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (Term)eResolveProxy(oldObject);
			if (object != oldObject) {
				InternalEObject newObject = (InternalEObject)object;
				NotificationChain msgs = oldObject.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__OBJECT, null, null);
				if (newObject.eInternalContainer() == null) {
					msgs = newObject.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__OBJECT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.QUESTION__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(Term newObject, NotificationChain msgs) {
		Term oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.QUESTION__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObject(Term newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.QUESTION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term getSubject() {
		if (subject != null && ((EObject)subject).eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Term)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				InternalEObject newSubject = (InternalEObject)subject;
				NotificationChain msgs = oldSubject.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__SUBJECT, null, null);
				if (newSubject.eInternalContainer() == null) {
					msgs = newSubject.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__SUBJECT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.QUESTION__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Term newSubject, NotificationChain msgs) {
		Term oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.QUESTION__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(Term newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.QUESTION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term getRelation() {
		if (relation != null && ((EObject)relation).eIsProxy()) {
			InternalEObject oldRelation = (InternalEObject)relation;
			relation = (Term)eResolveProxy(oldRelation);
			if (relation != oldRelation) {
				InternalEObject newRelation = (InternalEObject)relation;
				NotificationChain msgs = oldRelation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__RELATION, null, null);
				if (newRelation.eInternalContainer() == null) {
					msgs = newRelation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__RELATION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.QUESTION__RELATION, oldRelation, relation));
			}
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term basicGetRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelation(Term newRelation, NotificationChain msgs) {
		Term oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.QUESTION__RELATION, oldRelation, newRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelation(Term newRelation) {
		if (newRelation != relation) {
			NotificationChain msgs = null;
			if (relation != null)
				msgs = ((InternalEObject)relation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__RELATION, null, msgs);
			if (newRelation != null)
				msgs = ((InternalEObject)newRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__RELATION, null, msgs);
			msgs = basicSetRelation(newRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.QUESTION__RELATION, newRelation, newRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term getRule() {
		if (rule != null && ((EObject)rule).eIsProxy()) {
			InternalEObject oldRule = (InternalEObject)rule;
			rule = (Term)eResolveProxy(oldRule);
			if (rule != oldRule) {
				InternalEObject newRule = (InternalEObject)rule;
				NotificationChain msgs = oldRule.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__RULE, null, null);
				if (newRule.eInternalContainer() == null) {
					msgs = newRule.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__RULE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.QUESTION__RULE, oldRule, rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Term newRule, NotificationChain msgs) {
		Term oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.QUESTION__RULE, oldRule, newRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRule(Term newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.QUESTION__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.QUESTION__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.QUESTION__OBJECT:
				return basicSetObject(null, msgs);
			case LogicPackage.QUESTION__SUBJECT:
				return basicSetSubject(null, msgs);
			case LogicPackage.QUESTION__RELATION:
				return basicSetRelation(null, msgs);
			case LogicPackage.QUESTION__RULE:
				return basicSetRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.QUESTION__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case LogicPackage.QUESTION__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case LogicPackage.QUESTION__RELATION:
				if (resolve) return getRelation();
				return basicGetRelation();
			case LogicPackage.QUESTION__RULE:
				if (resolve) return getRule();
				return basicGetRule();
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
			case LogicPackage.QUESTION__OBJECT:
				setObject((Term)newValue);
				return;
			case LogicPackage.QUESTION__SUBJECT:
				setSubject((Term)newValue);
				return;
			case LogicPackage.QUESTION__RELATION:
				setRelation((Term)newValue);
				return;
			case LogicPackage.QUESTION__RULE:
				setRule((Term)newValue);
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
			case LogicPackage.QUESTION__OBJECT:
				setObject((Term)null);
				return;
			case LogicPackage.QUESTION__SUBJECT:
				setSubject((Term)null);
				return;
			case LogicPackage.QUESTION__RELATION:
				setRelation((Term)null);
				return;
			case LogicPackage.QUESTION__RULE:
				setRule((Term)null);
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
			case LogicPackage.QUESTION__OBJECT:
				return object != null;
			case LogicPackage.QUESTION__SUBJECT:
				return subject != null;
			case LogicPackage.QUESTION__RELATION:
				return relation != null;
			case LogicPackage.QUESTION__RULE:
				return rule != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionImpl
