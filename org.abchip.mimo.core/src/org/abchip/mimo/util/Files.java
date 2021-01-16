/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class Files {

	public static String getBaseName(String name) {
		return org.apache.commons.io.FilenameUtils.getBaseName(name);
	}

	public static void cleanDirectory(String path) throws IOException {
		org.apache.commons.io.FileUtils.cleanDirectory(new File(path));
	}

	public static void deleteDirectory(String path) throws IOException {
		org.apache.commons.io.FileUtils.forceDelete(new File(path));
	}

	@SuppressWarnings("resource")
	public static String getSeparator() {
		return java.nio.file.FileSystems.getDefault().getSeparator();
	}

	public static File copyToFile(InputStream stream) throws IOException {
		File tempFile = File.createTempFile("mimo-file", "tmp");
		tempFile.deleteOnExit();
		try (FileOutputStream out = new FileOutputStream(tempFile)) {
			IOUtils.copy(stream, out);
		}
		return tempFile;
	}
}
