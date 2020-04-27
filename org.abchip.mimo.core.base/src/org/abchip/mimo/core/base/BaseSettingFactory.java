package org.abchip.mimo.core.base;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.DynamicValueHolder;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate.Factory;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate;

public class BaseSettingFactory implements Factory {

	public BaseSettingFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SettingDelegate createSettingDelegate(EStructuralFeature eStructuralFeature) {

		return new MySettingDelegate(eStructuralFeature);
	}

	private class MySettingDelegate extends BasicSettingDelegate {

		public MySettingDelegate(EStructuralFeature eStructuralFeature) {
			super(eStructuralFeature);
		}

		@Override
		public Object dynamicGet(InternalEObject owner, DynamicValueHolder settings, int dynamicFeatureID, boolean resolve, boolean coreType) {
			return null;
		}

		@Override
		public boolean dynamicIsSet(InternalEObject owner, DynamicValueHolder settings, int dynamicFeatureID) {

			if(this.eStructuralFeature.getName().startsWith("dynamic"))
				return true;
			
			return false;
		}

		@Override
		public Setting dynamicSetting(InternalEObject owner, DynamicValueHolder settings, int dynamicFeatureID) {
			return super.dynamicSetting(owner, settings, dynamicFeatureID);
		}

		@Override
		public void dynamicSet(InternalEObject owner, DynamicValueHolder settings, int dynamicFeatureID, Object newValue) {

			if(this.eStructuralFeature.getName().startsWith("dynamic"))
				"".toString();
			else
				super.dynamicSet(owner, settings, dynamicFeatureID, newValue);
		}

		@Override
		public void dynamicUnset(InternalEObject owner, DynamicValueHolder settings, int dynamicFeatureID) {
			super.dynamicUnset(owner, settings, dynamicFeatureID);
		}

		@Override
		public NotificationChain dynamicInverseAdd(InternalEObject owner, DynamicValueHolder settings, int dynamicFeatureID, InternalEObject otherEnd, NotificationChain notifications) {
			return super.dynamicInverseAdd(owner, settings, dynamicFeatureID, otherEnd, notifications);
		}

		@Override
		public NotificationChain dynamicInverseRemove(InternalEObject owner, DynamicValueHolder settings, int dynamicFeatureID, InternalEObject otherEnd, NotificationChain notifications) {
			return super.dynamicInverseRemove(owner, settings, dynamicFeatureID, otherEnd, notifications);
		}

	}
}
