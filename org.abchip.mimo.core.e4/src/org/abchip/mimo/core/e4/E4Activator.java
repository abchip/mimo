/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import java.io.IOException;
import java.net.URL;
import java.util.Dictionary;
import java.util.Hashtable;

import org.abchip.mimo.E4ResourceSetFactoryImpl;
import org.abchip.mimo.E4ResourceProviderImpl;
import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationPaths;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.Factory;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.context.Thread;
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.core.base.BaseLockManagerImpl;
import org.abchip.mimo.core.base.BaseRegistryFactoryImpl;
import org.abchip.mimo.core.base.BaseResourceManagerFactoryImpl;
import org.abchip.mimo.core.base.BaseResourceProviderRegistryImpl;
import org.abchip.mimo.core.base.BaseServiceManagerFactoryImpl;
import org.abchip.mimo.core.base.BaseServiceProviderRegistryImpl;
import org.abchip.mimo.core.base.cmd.LogCommands;
import org.abchip.mimo.core.base.cmd.ResourceCommands;
import org.abchip.mimo.core.base.cmd.ServiceCommands;
import org.abchip.mimo.core.base.ctx.BaseThreadManagerImpl;
import org.abchip.mimo.core.base.nio.NIOResourceProviderImpl;
import org.abchip.mimo.core.http.HttpResourceProviderImpl;
import org.abchip.mimo.core.http.HttpServiceProviderImpl;
import org.abchip.mimo.core.log4j.LOG4JActivator;
import org.abchip.mimo.core.test.TestCoreSuiteLauncherImpl;
import org.abchip.mimo.language.LanguageLinearizerRegistry;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.language.LanguageParserRegistry;
import org.abchip.mimo.language.base.BaseLanguageLinearizerRegistryImpl;
import org.abchip.mimo.language.base.BaseLanguageManagerImpl;
import org.abchip.mimo.language.base.BaseLanguageParserRegistryImpl;
import org.abchip.mimo.language.base.LanguageCommands;
import org.abchip.mimo.language.test.TestLanguageSuiteLauncherImpl;
import org.abchip.mimo.mining.MiningManager;
import org.abchip.mimo.mining.base.BaseClassifierRegistryImpl;
import org.abchip.mimo.mining.base.BaseMiningManagerImpl;
import org.abchip.mimo.mining.classification.ClassifierRegistry;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServiceProvider;
import org.abchip.mimo.service.ServiceProviderRegistry;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestSuiteLauncher;
import org.abchip.mimo.tester.base.BaseTestManagerImpl;
import org.abchip.mimo.tester.base.TestCommands;
import org.abchip.mimo.tester.test.TestTesterSuiteLauncherImpl;
import org.abchip.mimo.util.Applications;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Systems;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.log.Logger;

public class E4Activator implements BundleActivator {

	public static final String APPLICATION_XMI = "/application/application.xmi";

	private static Application application;
	private Thread thread = null;

	public static Application getApplication() {
		return E4Activator.application;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {

		// touch LOG4J to force activation
		LOG4JActivator.class.toString();

		Logger logger = Logs.getLogger(E4Activator.class);

		if (E4Activator.application != null) {
			logger.warn("Application {} already started", E4Activator.application.getName());
			return;
		}

		// mimo.home
		if (bundleContext.getProperty("mimo.home") == null) {
			logger.warn("Property mimo.home not found");
			return;
		}

		// get application.xmi
		if (bundleContext.getProperty("mimo.config") != null) {
			E4Activator.application = Applications.load(bundleContext.getProperty("mimo.config"));
		} else {
			E4Activator.application = searchApplication(bundleContext);
		}

		if (E4Activator.application == null) {
			logger.warn("Application.xmi not found");
			return;
		}

		startApplication(bundleContext.getProperty("mimo.home"), bundleContext.getProperty("mimo.admin.key"));
	}

	private Application searchApplication(BundleContext bundleContext) throws IOException {
		for (Bundle bundle : bundleContext.getBundles()) {
			URL entry = bundle.getEntry(APPLICATION_XMI);
			if (entry == null)
				continue;

			return Applications.load(entry.toString());
		}

		return null;
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		if (thread != null) {
			ThreadManager threadManager = application.getContext().get(ThreadManager.class);
			threadManager.stop(thread);
		}

		application = null;
	}

	private void startApplication(String applicationHome, String adminKey) throws Exception {

		// bundle
		Bundle bundle = application.getBundle();

		// logs
		Logs.reset(application.getLogs());

		// keys
		setApplicationKeys(adminKey);

		// path
		setApplicationPaths(applicationHome);

		// context
		ContextRoot contextApplication = new E4ContextRootImpl(bundle.getBundleContext(), application.getContextDescription());
		E4Activator.application.setContext(contextApplication);

		// services
		registerServices();

		// start
		ThreadManager threadManager = application.getContext().get(ThreadManager.class);
		thread = threadManager.createThread(application.getName(), new E4ApplicationStarter(application), false);
		ClassLoader bundleLoader = bundle.adapt(BundleWiring.class).getClassLoader();
		thread.getJavaThread().setContextClassLoader(bundleLoader);
		threadManager.start(thread);
	}

	private void registerServices() {

		// logs
		application.getContext().set(CommandProvider.class.getName(), new LogCommands(application), false, null);

		// thread
		ThreadManager threadManager = new BaseThreadManagerImpl();
		application.getContext().set(ThreadManager.class, threadManager);

		// lock
		LockManager lockManager = new BaseLockManagerImpl();
		application.getContext().set(LockManager.class, lockManager);

		// registry
		registerRegistryServices();

		// resource
		registerResourceServices();

		// service
		registerServiceServices();

		// tester
		registerTestServices();

		// mining
		registerMiningServices();

		// language
		registerLanguageServices();
	}

	private void registerRegistryServices() {

		// factory
		RegistryFactory registryFactory = new BaseRegistryFactoryImpl(application);
		application.getContext().set(RegistryFactory.class, registryFactory);

		// resource
		{
			application.getContext().set(ResourceProviderRegistry.class, new BaseResourceProviderRegistryImpl(application, registryFactory));
		}
		// service
		{
			application.getContext().set(ServiceProviderRegistry.class, new BaseServiceProviderRegistryImpl(application, registryFactory));
		}
		// mining
		{
			application.getContext().set(ClassifierRegistry.class, new BaseClassifierRegistryImpl(registryFactory));
		}
		// language
		{
			application.getContext().set(LanguageParserRegistry.class, new BaseLanguageParserRegistryImpl(registryFactory));
			application.getContext().set(LanguageLinearizerRegistry.class, new BaseLanguageLinearizerRegistryImpl(registryFactory));
		}
	}

	private void registerResourceServices() {

		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		String VENDOR = bundle.getHeaders().get(Constants.BUNDLE_VENDOR);
		String VERSION = bundle.getHeaders().get(Constants.BUNDLE_VERSION);

		// resourceSet
		Factory<ResourceSet> resourceSetFactory = new E4ResourceSetFactoryImpl();
		application.getContext().set(Factory.class.getName(), resourceSetFactory, false, null);

		// resource
		Factory<ResourceManager> resourceManagerFactory = new BaseResourceManagerFactoryImpl();
		application.getContext().set(Factory.class.getName(), resourceManagerFactory, false, null);

		{
			// *EMF provider
			Dictionary<String, String> dictionary = new Hashtable<String, String>();
			dictionary.put(MimoConstants.REGISTRY_NAME, MimoConstants.REGISTRY_NAME_EMF);
			dictionary.put(MimoConstants.REGISTRY_VENDOR, VENDOR);
			dictionary.put(MimoConstants.REGISTRY_VERSION, VERSION);
			dictionary.put(MimoConstants.APPLICATION_NAME, application.getName());
			application.getContext().set(ResourceProvider.class.getName(), new E4ResourceProviderImpl(), false, dictionary);
		}
		{
			// *NIO provider
			Dictionary<String, String> dictionary = new Hashtable<String, String>();
			dictionary.put(MimoConstants.REGISTRY_NAME, MimoConstants.REGISTRY_NAME_NIO);
			dictionary.put(MimoConstants.REGISTRY_VENDOR, VENDOR);
			dictionary.put(MimoConstants.REGISTRY_VERSION, VERSION);
			dictionary.put(MimoConstants.APPLICATION_NAME, application.getName());
			application.getContext().set(ResourceProvider.class.getName(), new NIOResourceProviderImpl(application), false, dictionary);
		}
		{
			// *HTTP provider
			Dictionary<String, String> dictionary = new Hashtable<String, String>();
			dictionary.put(MimoConstants.REGISTRY_NAME, MimoConstants.REGISTRY_NAME_HTTP);
			dictionary.put(MimoConstants.REGISTRY_VENDOR, VENDOR);
			dictionary.put(MimoConstants.REGISTRY_VERSION, VERSION);
			dictionary.put(MimoConstants.APPLICATION_NAME, application.getName());
			application.getContext().set(ResourceProvider.class.getName(), new HttpResourceProviderImpl(), false, dictionary);
		}

		application.getContext().set(CommandProvider.class.getName(), new ResourceCommands(application), false, null);
	}

	private void registerServiceServices() {

		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		String VENDOR = bundle.getHeaders().get(Constants.BUNDLE_VENDOR);
		String VERSION = bundle.getHeaders().get(Constants.BUNDLE_VERSION);

		Factory<ServiceManager> serviceManagerFactory = new BaseServiceManagerFactoryImpl();
		application.getContext().set(Factory.class.getName(), serviceManagerFactory, false, null);
		{
			// *HTTP provider
			Dictionary<String, String> dictionary = new Hashtable<String, String>();
			dictionary.put(MimoConstants.REGISTRY_NAME, MimoConstants.REGISTRY_NAME_HTTP);
			dictionary.put(MimoConstants.REGISTRY_VENDOR, VENDOR);
			dictionary.put(MimoConstants.REGISTRY_VERSION, VERSION);
			dictionary.put(MimoConstants.APPLICATION_NAME, application.getName());
			application.getContext().set(ServiceProvider.class.getName(), new HttpServiceProviderImpl(), false, dictionary);
		}

		application.getContext().set(CommandProvider.class.getName(), new ServiceCommands(application), false, null);
	}

	private void registerTestServices() {
		application.getContext().set(TestManager.class, new BaseTestManagerImpl());
		application.getContext().set(TestSuiteLauncher.class.getName(), new TestTesterSuiteLauncherImpl(application), false, null);
		application.getContext().set(TestSuiteLauncher.class.getName(), new TestCoreSuiteLauncherImpl(application), false, null);
		application.getContext().set(CommandProvider.class.getName(), new TestCommands(application), false, null);
	}

	private void registerMiningServices() {
		application.getContext().set(MiningManager.class, new BaseMiningManagerImpl(application));
	}

	private void registerLanguageServices() {
		application.getContext().set(LanguageManager.class, new BaseLanguageManagerImpl(application));
		application.getContext().set(CommandProvider.class.getName(), new LanguageCommands(application), false, null);
		application.getContext().set(TestSuiteLauncher.class.getName(), new TestLanguageSuiteLauncherImpl(application), false, null);
	}

	private void setApplicationKeys(String adminKey) {

		// ${mimo.admin.key}
		if (adminKey == null)
			adminKey = "";
		if (application.getAdminKey() != null)
			application.setAdminKey(application.getAdminKey().replaceFirst("\\$\\{mimo.admin.key\\}", adminKey.toString()));
		if (application.getAdminKey().isEmpty())
			application.setAdminKey(null);

	}

	private void setApplicationPaths(String applicationHome) {

		ApplicationPaths applicationPaths = application.getPaths();

		// win path
		if (Systems.isWindows())
			applicationHome = applicationHome.replace("\\", "\\\\");

		// ${mimo.home}
		if (applicationHome != null) {
			applicationPaths.setData(applicationPaths.getData().replaceFirst("\\$\\{mimo.home\\}", applicationHome));
			applicationPaths.setLogs(applicationPaths.getLogs().replaceFirst("\\$\\{mimo.home\\}", applicationHome));
			applicationPaths.setWork(applicationPaths.getWork().replaceFirst("\\$\\{mimo.home\\}", applicationHome));
		}
	}
}