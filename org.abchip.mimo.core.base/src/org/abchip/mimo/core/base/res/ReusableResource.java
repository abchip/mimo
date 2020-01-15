/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface ReusableResource {

	public void clear();

	public List<EObject> getContents();

	public void load(InputStream content, boolean append) throws IOException;

	public void save(OutputStream outputStream) throws IOException;

	public void unload();
}
