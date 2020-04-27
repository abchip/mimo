/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.core.base;

import java.util.List;
import java.util.Map;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;

public class BaseValidator implements EValidator {

	private Context context = null;

	public BaseValidator(Context context) {
		this.context = context;
	}

	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean result = false;
		if (context.containsKey(MimoConstants.VALIDATOR_WRITE)) {
			EntityIdentifiable entityIdentifiable = (EntityIdentifiable) eObject;
			
			try {
				ResourceReader<?> resourceReader = this.context.getResourceManager().getResourceReader(this.context, eClass.getName());
				result = resourceReader.lookup(entityIdentifiable.getID(), true) == null;

				if(!result) {
					Diagnostic diagnostic = new Diagnostic() {
						
						@Override
						public String getSource() {
							return entityIdentifiable.getURI().toString();
						}
						
						@Override
						public int getSeverity() {
							return 30;
						}
						
						@Override
						public String getMessage() {
							return "Entity already exists";
						}
						
						@Override
						public Throwable getException() {
							return null;
						}
						
						@Override
						public List<?> getData() {
							return null;
						}
						
						@Override
						public int getCode() {
							// TODO Auto-generated method stub
							return 0;
						}
						
						@Override
						public List<Diagnostic> getChildren() {
							// TODO Auto-generated method stub
							return null;
						}
					};
					diagnostics.add(diagnostic);					
				}
			} catch (ResourceException e) {
				Diagnostic diagnostic = new Diagnostic() {
					
					@Override
					public String getSource() {
						return entityIdentifiable.getURI().toString();
					}
					
					@Override
					public int getSeverity() {
						return 30;
					}
					
					@Override
					public String getMessage() {
						return e.getMessage();
					}
					
					@Override
					public Throwable getException() {
						return e;
					}
					
					@Override
					public List<?> getData() {
						return null;
					}
					
					@Override
					public int getCode() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public List<Diagnostic> getChildren() {
						// TODO Auto-generated method stub
						return null;
					}
				};
				diagnostics.add(diagnostic);
			}
		}

		return result;
	}

	@Override
	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Diagnostician.INSTANCE.validate(eDataType, value, diagnostics, context);
	}
}
