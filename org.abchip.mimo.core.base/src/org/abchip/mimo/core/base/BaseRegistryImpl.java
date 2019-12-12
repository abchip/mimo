/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.nio.CharBuffer;
import java.util.List;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.Registry;

public class BaseRegistryImpl<K> implements Registry<K> {

	private ContextRoot contextRoot;
	private Class<K> klass;

	public BaseRegistryImpl(ContextRoot contextRoot, Class<K> klass) {
		this.contextRoot = contextRoot;
		this.klass = klass;
	}

	@Override
	public K lookup(String name) {
		name = escapeFilterCharacters(name);
		String filter = "(" + MimoConstants.REGISTRY_NAME + "=" + name + ")";
		return contextRoot.get(klass, filter);
	}

	@Override
	public K lookupByPort(int port) {

		String filter = "(" + MimoConstants.APPLICATION_PORT + "=" + port + ")";
		return contextRoot.get(klass, filter);
	}

	@Override
	public List<K> list() {

		List<K> plugins = contextRoot.getAll(klass);
		return plugins;
	}

	@Override
	public K lookupByVendorVersion(String vendor, String version) {
		
		vendor = escapeFilterCharacters(vendor);
		
		String filter = "(&(" + MimoConstants.REGISTRY_VENDOR + "=" + vendor + ")" + "(" + MimoConstants.REGISTRY_VERSION + "=" + version + "))";
		return contextRoot.get(klass, filter);
	}
	
	private String escapeFilterCharacters(String value) {
		
		CharBuffer buffer = CharBuffer.allocate(value.length() * 2);
		for ( char c : value.toCharArray()) {
			switch (c) {
				case '*'  : buffer.append('\\'); break;
				case '\\' : buffer.append('\\'); break;
				case '('  : buffer.append('\\'); break;
				case ')'  : buffer.append('\\'); break;
			}
			buffer.append(c);
		}
		return buffer.flip().toString();
	}
}