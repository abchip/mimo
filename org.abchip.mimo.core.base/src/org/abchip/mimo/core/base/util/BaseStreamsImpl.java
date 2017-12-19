/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.base.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.abchip.mimo.util.Streams;

public class BaseStreamsImpl implements Streams {

	@Override
	public void copy(InputStream input, OutputStream output) {
		try {
			org.apache.commons.io.IOUtils.copy(input, output);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
