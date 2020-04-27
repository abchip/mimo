package org.abchip.mimo.core.base;

import java.lang.reflect.InvocationTargetException;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServiceMethodRequest;
import org.abchip.mimo.service.ServiceMethodResponse;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EOperation.Internal.InvocationDelegate;
import org.eclipse.emf.ecore.EOperation.Internal.InvocationDelegate.Factory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.osgi.service.log.Logger;

public class BaseInvokeFactoring implements Factory {

	private static final Logger LOGGER = Logs.getLogger(BaseInvokeFactoring.class);

	public BaseInvokeFactoring() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public InvocationDelegate createInvocationDelegate(EOperation operation) {
		return new MyInvocationDelegate(operation);
	}

	private class MyInvocationDelegate extends BasicInvocationDelegate {

		public MyInvocationDelegate(EOperation operation) {
			super(operation);
		}

		@Override
		public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {

			if (!(target instanceof EntityIdentifiable))
				return null;

			EntityIdentifiable entity = (EntityIdentifiable) target;

			Resource<?> resource = entity.getResource();
			if (resource == null) {
				LOGGER.warn("Unactive entity {}", entity.getURI());
				return null;
			}

			return _invoke(resource.getContext(), entity, arguments);
		}
		
		private <E extends EntityIdentifiable, T> T _invoke(Context context, E entity, EList<?> arguments) throws InvocationTargetException {

			ServiceManager serviceManager = context.getServiceManager();

			try {
				ServiceMethodRequest<E, T> request = serviceManager.prepare(context, entity.isa().getName() + "_" + Strings.firstToUpper(this.eOperation.getName()));
				request.setEntity(entity);
				
				ServiceMethodResponse<T> response = serviceManager.execute(request);
				if (response.isError()) {
					LOGGER.warn(response.getErrorMessage());
					return null;
				}

				return response.getResult();
			} catch (ServiceException e) {
				throw new InvocationTargetException(e);
			}
		}
	}
}
