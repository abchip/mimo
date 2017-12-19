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

import java.io.File;
import java.io.IOException;

import org.abchip.mimo.util.Files;

public class BaseFilesImpl implements Files {

	@Override
	public String getBaseName(String name) {
		return org.apache.commons.io.FilenameUtils.getBaseName(name);
	}

	@Override
	public void cleanDirectory(String path) throws IOException {
		org.apache.commons.io.FileUtils.cleanDirectory(new File(path));
	}

	@Override
	public void deleteDirectory(String path) throws IOException {
		org.apache.commons.io.FileUtils.forceDelete(new File(path));				
	}

	@Override
	public String getSeparator() {		
		return java.nio.file.FileSystems.getDefault().getSeparator();
	}
}
