/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.abchip.mimo.util.Files;
import org.apache.commons.io.IOUtils;

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

	@SuppressWarnings("resource")
	@Override
	public String getSeparator() {
		return java.nio.file.FileSystems.getDefault().getSeparator();
	}

	@Override
	public File copyToFile(InputStream stream) throws IOException {
		File tempFile = File.createTempFile("mimo-file", "tmp");
		tempFile.deleteOnExit();
		try (FileOutputStream out = new FileOutputStream(tempFile)) {
			IOUtils.copy(stream, out);
		}
		return tempFile;
	}
}
