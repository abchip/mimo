package org.abchip.mimo.core.http;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItemHeaders;
import org.apache.commons.fileupload.disk.DiskFileItem;

public class MultipartSupportPart implements Part {

	public MultipartSupportPart(DiskFileItem item) {
		this.item = item;
		this.headers = item.getHeaders();
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return item.getInputStream();
	}

	@Override
	public String getContentType() {
		return item.getContentType();
	}

	@Override
	public String getName() {
		return item.getFieldName();
	}

	@Override
	public String getSubmittedFileName() {
		return item.getName();
	}

	@Override
	public long getSize() {
		return item.getSize();
	}

	@Override
	public void write(String fileName) throws IOException {
		try {
			item.write(new File(item.getStoreLocation(), fileName));
		}
		catch (Exception e) {
			throw new IOException(e);
		}
	}

	@Override
	public void delete() {
		item.delete();
	}

	@Override
	public String getHeader(String name) {
		if (headers == null) {
			return null;
		}
		return headers.getHeader(name);
	}

	@Override
	public Collection<String> getHeaders(String name) {
		if (headers == null) {
			return Collections.emptyList();
		}
		return new IteratorCollection(headers.getHeaders(name));
	}

	@Override
	public Collection<String> getHeaderNames() {
		if (headers == null) {
			return Collections.emptyList();
		}
		return new IteratorCollection(headers.getHeaderNames());
	}

	private final DiskFileItem item;
	private final FileItemHeaders headers;

	private class IteratorCollection extends AbstractList<String> {

		public IteratorCollection(Iterator<String> iterator) {
			this.collection = new ArrayList<String>();
		    while (iterator.hasNext()) {
		        collection.add(iterator.next());
		    }
		}

		@Override
		public String get(int index) {
			return collection.get(index);
		}

		@Override
		public int size() {
			return collection.size();
		}

		private List<String> collection;

	}
}
