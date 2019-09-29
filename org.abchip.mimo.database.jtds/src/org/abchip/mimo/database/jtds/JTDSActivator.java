/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.jtds;

import org.eclipse.net4j.util.om.OMBundle;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.OMLogger;
import org.eclipse.net4j.util.om.trace.OMTracer;

public abstract class JTDSActivator {
	public static final String BUNDLE_ID = "org.abchip.mimo.database.jtds"; //$NON-NLS-1$

	public static final OMBundle BUNDLE = OMPlatform.INSTANCE.bundle(BUNDLE_ID, JTDSActivator.class);

	public static final OMTracer DEBUG = BUNDLE.tracer("debug"); //$NON-NLS-1$

	public static final OMTracer DEBUG_SQL = DEBUG.tracer("sql"); //$NON-NLS-1$

	public static final OMLogger LOG = BUNDLE.logger();
}
