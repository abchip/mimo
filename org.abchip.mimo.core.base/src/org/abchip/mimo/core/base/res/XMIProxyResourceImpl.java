/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.res;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class XMIProxyResourceImpl extends XMIResourceImpl implements ReusableResource {

	public XMIProxyResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void clear() {
		EcoreUtil.removeAll(this.getContents());
		this.getContents().clear();
		this.setLoaded(false);
	}

	@Override
	public void load(InputStream content, boolean append) throws IOException {
		if (append)
			this.setLoaded(false);

		super.load(content, Collections.EMPTY_MAP);
	}

	@Override
	public void save(OutputStream outputStream) throws IOException {
		super.save(outputStream, Collections.EMPTY_MAP);
	}
}