package org.abchip.mimo.application.osgi;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;
import org.osgi.framework.launch.Framework;
import org.osgi.framework.launch.FrameworkFactory;

public class OSGIApplicationMain {

	private static OSGIApplicationMain instance = null;

	public static void main(String[] args) {

		OSGIApplicationMain activator = OSGIApplicationMain.getInstance();
		activator.start();
	}

	private OSGIApplicationMain() {
	}

	public static OSGIApplicationMain getInstance() {
		if (instance == null) {
			synchronized (OSGIApplicationMain.class) {
				if (instance == null)
					instance = new OSGIApplicationMain();
			}
		}
		return instance;
	}

	public synchronized void start() {
		FrameworkFactory frameworkFactory = ServiceLoader.load(FrameworkFactory.class).iterator().next();

		Map<String, String> config = new HashMap<String, String>();
		// config.put(Constants.FRAMEWORK_SYSTEMPACKAGES_EXTRA,
		// "orb.abchip.mimo.core.e4");
		config.put(Constants.FRAMEWORK_STORAGE, "/mimo/osgi-data");
		config.put(Constants.FRAMEWORK_STORAGE_CLEAN, "true");
		config.put("osgi.console", "1234");

		Framework framework = frameworkFactory.newFramework(config);
		try {
			framework.init();

			BundleContext bundleContext = framework.getBundleContext();
			framework.start();

			load(bundleContext);
		} catch (BundleException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			framework.waitForStop(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

	private void load(BundleContext bundleContext) throws IOException, BundleException {

		ArrayList<Bundle> availableBundles = new ArrayList<Bundle>();
		// get and open available bundles
		for (URI uri : getBundles()) {
			URL url = uri.toURL();
			Bundle bundle;
			try {
				bundle = bundleContext.installBundle(url.getFile(), url.openStream());
				availableBundles.add(bundle);
			} catch (BundleException e) {
				switch (e.getType()) {
				case BundleException.DUPLICATE_BUNDLE_ERROR:
					break;
				default:
					e.printStackTrace();
					throw e;
				}
			}
		}

		// start the bundles
		for (Bundle bundle : availableBundles) {
			try {
				// if (bundle.getHeaders().get(Constants.FRAGMENT_HOST) == null)
				bundle.start();
			} catch (BundleException ex) {
				System.out.println("Failed to start bundle " + bundle.getSymbolicName());
			}
		}
	}

	private List<URI> getBundles() {

		List<URI> bundles = new ArrayList<URI>();
		for (File file : new File("lib").listFiles()) {
			if (file.getName().endsWith("sources.jar"))
				continue;

			bundles.add(file.toURI());
		}

		return bundles;
	}
}
