/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import org.abchip.mimo.biz.workeffort.workeffort.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkeffortFactoryImpl extends EFactoryImpl implements WorkeffortFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkeffortFactory init() {
		try {
			WorkeffortFactory theWorkeffortFactory = (WorkeffortFactory)EPackage.Registry.INSTANCE.getEFactory(WorkeffortPackage.eNS_URI);
			if (theWorkeffortFactory != null) {
				return theWorkeffortFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkeffortFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkeffortFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WorkeffortPackage.APPLICATION_SANDBOX: return (EObject)createApplicationSandbox();
			case WorkeffortPackage.COMMUNICATION_EVENT_WORK_EFF: return (EObject)createCommunicationEventWorkEff();
			case WorkeffortPackage.DELIVERABLE: return (EObject)createDeliverable();
			case WorkeffortPackage.DELIVERABLE_TYPE: return (EObject)createDeliverableType();
			case WorkeffortPackage.WORK_EFFORT: return (EObject)createWorkEffort();
			case WorkeffortPackage.WORK_EFFORT_ASSOC: return (EObject)createWorkEffortAssoc();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE: return (EObject)createWorkEffortAssocAttribute();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE: return (EObject)createWorkEffortAssocType();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE_ATTR: return (EObject)createWorkEffortAssocTypeAttr();
			case WorkeffortPackage.WORK_EFFORT_ATTRIBUTE: return (EObject)createWorkEffortAttribute();
			case WorkeffortPackage.WORK_EFFORT_BILLING: return (EObject)createWorkEffortBilling();
			case WorkeffortPackage.WORK_EFFORT_CONTACT_MECH: return (EObject)createWorkEffortContactMech();
			case WorkeffortPackage.WORK_EFFORT_CONTENT: return (EObject)createWorkEffortContent();
			case WorkeffortPackage.WORK_EFFORT_CONTENT_TYPE: return (EObject)createWorkEffortContentType();
			case WorkeffortPackage.WORK_EFFORT_COST_CALC: return (EObject)createWorkEffortCostCalc();
			case WorkeffortPackage.WORK_EFFORT_DELIVERABLE_PROD: return (EObject)createWorkEffortDeliverableProd();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER: return (EObject)createWorkEffortEventReminder();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN: return (EObject)createWorkEffortFixedAssetAssign();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_STD: return (EObject)createWorkEffortFixedAssetStd();
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD: return (EObject)createWorkEffortGoodStandard();
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD_TYPE: return (EObject)createWorkEffortGoodStandardType();
			case WorkeffortPackage.WORK_EFFORT_ICAL_DATA: return (EObject)createWorkEffortIcalData();
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_ASSIGN: return (EObject)createWorkEffortInventoryAssign();
			case WorkeffortPackage.WORK_EFFORT_INVENTORY_PRODUCED: return (EObject)createWorkEffortInventoryProduced();
			case WorkeffortPackage.WORK_EFFORT_KEYWORD: return (EObject)createWorkEffortKeyword();
			case WorkeffortPackage.WORK_EFFORT_NOTE: return (EObject)createWorkEffortNote();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT: return (EObject)createWorkEffortPartyAssignment();
			case WorkeffortPackage.WORK_EFFORT_PURPOSE_TYPE: return (EObject)createWorkEffortPurposeType();
			case WorkeffortPackage.WORK_EFFORT_REVIEW: return (EObject)createWorkEffortReview();
			case WorkeffortPackage.WORK_EFFORT_SEARCH_CONSTRAINT: return (EObject)createWorkEffortSearchConstraint();
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT: return (EObject)createWorkEffortSearchResult();
			case WorkeffortPackage.WORK_EFFORT_SKILL_STANDARD: return (EObject)createWorkEffortSkillStandard();
			case WorkeffortPackage.WORK_EFFORT_STATUS: return (EObject)createWorkEffortStatus();
			case WorkeffortPackage.WORK_EFFORT_SURVEY_APPL: return (EObject)createWorkEffortSurveyAppl();
			case WorkeffortPackage.WORK_EFFORT_TRANS_BOX: return (EObject)createWorkEffortTransBox();
			case WorkeffortPackage.WORK_EFFORT_TYPE: return (EObject)createWorkEffortType();
			case WorkeffortPackage.WORK_EFFORT_TYPE_ATTR: return (EObject)createWorkEffortTypeAttr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationSandbox createApplicationSandbox() {
		ApplicationSandboxImpl applicationSandbox = new ApplicationSandboxImpl();
		return applicationSandbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventWorkEff createCommunicationEventWorkEff() {
		CommunicationEventWorkEffImpl communicationEventWorkEff = new CommunicationEventWorkEffImpl();
		return communicationEventWorkEff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deliverable createDeliverable() {
		DeliverableImpl deliverable = new DeliverableImpl();
		return deliverable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliverableType createDeliverableType() {
		DeliverableTypeImpl deliverableType = new DeliverableTypeImpl();
		return deliverableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort createWorkEffort() {
		WorkEffortImpl workEffort = new WorkEffortImpl();
		return workEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortAssoc createWorkEffortAssoc() {
		WorkEffortAssocImpl workEffortAssoc = new WorkEffortAssocImpl();
		return workEffortAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortAssocAttribute createWorkEffortAssocAttribute() {
		WorkEffortAssocAttributeImpl workEffortAssocAttribute = new WorkEffortAssocAttributeImpl();
		return workEffortAssocAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortAssocType createWorkEffortAssocType() {
		WorkEffortAssocTypeImpl workEffortAssocType = new WorkEffortAssocTypeImpl();
		return workEffortAssocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortAssocTypeAttr createWorkEffortAssocTypeAttr() {
		WorkEffortAssocTypeAttrImpl workEffortAssocTypeAttr = new WorkEffortAssocTypeAttrImpl();
		return workEffortAssocTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortAttribute createWorkEffortAttribute() {
		WorkEffortAttributeImpl workEffortAttribute = new WorkEffortAttributeImpl();
		return workEffortAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortBilling createWorkEffortBilling() {
		WorkEffortBillingImpl workEffortBilling = new WorkEffortBillingImpl();
		return workEffortBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortContactMech createWorkEffortContactMech() {
		WorkEffortContactMechImpl workEffortContactMech = new WorkEffortContactMechImpl();
		return workEffortContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortContent createWorkEffortContent() {
		WorkEffortContentImpl workEffortContent = new WorkEffortContentImpl();
		return workEffortContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortContentType createWorkEffortContentType() {
		WorkEffortContentTypeImpl workEffortContentType = new WorkEffortContentTypeImpl();
		return workEffortContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortCostCalc createWorkEffortCostCalc() {
		WorkEffortCostCalcImpl workEffortCostCalc = new WorkEffortCostCalcImpl();
		return workEffortCostCalc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortDeliverableProd createWorkEffortDeliverableProd() {
		WorkEffortDeliverableProdImpl workEffortDeliverableProd = new WorkEffortDeliverableProdImpl();
		return workEffortDeliverableProd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortEventReminder createWorkEffortEventReminder() {
		WorkEffortEventReminderImpl workEffortEventReminder = new WorkEffortEventReminderImpl();
		return workEffortEventReminder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortFixedAssetAssign createWorkEffortFixedAssetAssign() {
		WorkEffortFixedAssetAssignImpl workEffortFixedAssetAssign = new WorkEffortFixedAssetAssignImpl();
		return workEffortFixedAssetAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortFixedAssetStd createWorkEffortFixedAssetStd() {
		WorkEffortFixedAssetStdImpl workEffortFixedAssetStd = new WorkEffortFixedAssetStdImpl();
		return workEffortFixedAssetStd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortGoodStandard createWorkEffortGoodStandard() {
		WorkEffortGoodStandardImpl workEffortGoodStandard = new WorkEffortGoodStandardImpl();
		return workEffortGoodStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortGoodStandardType createWorkEffortGoodStandardType() {
		WorkEffortGoodStandardTypeImpl workEffortGoodStandardType = new WorkEffortGoodStandardTypeImpl();
		return workEffortGoodStandardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortIcalData createWorkEffortIcalData() {
		WorkEffortIcalDataImpl workEffortIcalData = new WorkEffortIcalDataImpl();
		return workEffortIcalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortInventoryAssign createWorkEffortInventoryAssign() {
		WorkEffortInventoryAssignImpl workEffortInventoryAssign = new WorkEffortInventoryAssignImpl();
		return workEffortInventoryAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortInventoryProduced createWorkEffortInventoryProduced() {
		WorkEffortInventoryProducedImpl workEffortInventoryProduced = new WorkEffortInventoryProducedImpl();
		return workEffortInventoryProduced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortKeyword createWorkEffortKeyword() {
		WorkEffortKeywordImpl workEffortKeyword = new WorkEffortKeywordImpl();
		return workEffortKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortNote createWorkEffortNote() {
		WorkEffortNoteImpl workEffortNote = new WorkEffortNoteImpl();
		return workEffortNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortPartyAssignment createWorkEffortPartyAssignment() {
		WorkEffortPartyAssignmentImpl workEffortPartyAssignment = new WorkEffortPartyAssignmentImpl();
		return workEffortPartyAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortPurposeType createWorkEffortPurposeType() {
		WorkEffortPurposeTypeImpl workEffortPurposeType = new WorkEffortPurposeTypeImpl();
		return workEffortPurposeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortReview createWorkEffortReview() {
		WorkEffortReviewImpl workEffortReview = new WorkEffortReviewImpl();
		return workEffortReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortSearchConstraint createWorkEffortSearchConstraint() {
		WorkEffortSearchConstraintImpl workEffortSearchConstraint = new WorkEffortSearchConstraintImpl();
		return workEffortSearchConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortSearchResult createWorkEffortSearchResult() {
		WorkEffortSearchResultImpl workEffortSearchResult = new WorkEffortSearchResultImpl();
		return workEffortSearchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortSkillStandard createWorkEffortSkillStandard() {
		WorkEffortSkillStandardImpl workEffortSkillStandard = new WorkEffortSkillStandardImpl();
		return workEffortSkillStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortStatus createWorkEffortStatus() {
		WorkEffortStatusImpl workEffortStatus = new WorkEffortStatusImpl();
		return workEffortStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortSurveyAppl createWorkEffortSurveyAppl() {
		WorkEffortSurveyApplImpl workEffortSurveyAppl = new WorkEffortSurveyApplImpl();
		return workEffortSurveyAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortTransBox createWorkEffortTransBox() {
		WorkEffortTransBoxImpl workEffortTransBox = new WorkEffortTransBoxImpl();
		return workEffortTransBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortType createWorkEffortType() {
		WorkEffortTypeImpl workEffortType = new WorkEffortTypeImpl();
		return workEffortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortTypeAttr createWorkEffortTypeAttr() {
		WorkEffortTypeAttrImpl workEffortTypeAttr = new WorkEffortTypeAttrImpl();
		return workEffortTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkeffortPackage getWorkeffortPackage() {
		return (WorkeffortPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkeffortPackage getPackage() {
		return WorkeffortPackage.eINSTANCE;
	}

} //WorkeffortFactoryImpl
