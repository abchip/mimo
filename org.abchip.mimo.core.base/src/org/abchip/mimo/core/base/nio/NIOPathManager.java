/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 *
 */
package org.abchip.mimo.core.base.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.HashMap;
import java.util.Map;

import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.Resource;

public class NIOPathManager {

	private Path path;	
	
	private Resource resourceRoot;
	protected Map<String, Resource> resources;
	
	public NIOPathManager(String path) {
		this.path = Paths.get("/", "home", "mattia", path);
		
		this.resources = new HashMap<String, Resource>();
		try {
			this.resourceRoot = buildResource(getPath());
//			this.resources.put(this.resourceRoot.getName(), this.resourceRoot);
			
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(getPath());
			for (Path resourcePath : dirStream) {
				if (Files.isDirectory(resourcePath)) {
					Resource resource = buildResource(resourcePath);
					resources.put(resource.getName(), resource);
				}
			}
			dirStream.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public Resource getResourceRoot() {
		return this.resourceRoot;
	}

	public Map<String, Resource> getResources() {
		return this.resources;
	}
	
	public Path getPath() {
		return path;
	}
	
	protected boolean exists(String file) {
		Path filePath = path.resolve(file);
		return Files.exists(filePath);
	}
	
	protected void deletePath(Path path) throws IOException {
		Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				Files.delete(file);
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				Files.delete(dir);
				return FileVisitResult.CONTINUE;
			}

		});
	}
		
	protected Resource buildResource(Path path) {

		Resource resource = EntityFactory.eINSTANCE.createResource();
		resource.setName(path.getFileName().toString());
		try {
			UserDefinedFileAttributeView view = Files.getFileAttributeView(path, UserDefinedFileAttributeView.class);
			String name = "text";
			ByteBuffer buf = ByteBuffer.allocate(view.size(name));
			view.read(name, buf);
			buf.flip();
			String value = Charset.defaultCharset().decode(buf).toString();
			resource.setText(value);
		} catch (IOException e) {
			System.err.println(e.getMessage());
//			throw new RuntimeException(e);
		}
		return resource;
	}
}