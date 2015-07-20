package com.test.hello.world;

import info.magnolia.module.ModuleLifecycle;
import info.magnolia.module.ModuleLifecycleContext;
import info.magnolia.module.blossom.module.BlossomModuleSupport;

/**
 * This class is optional and represents the configuration for the heoolo-world
 * module. By exposing simple getter/setter/adder methods, this bean can be
 * configured via content2bean using the properties and node from
 * <tt>config:/modules/heoolo-world</tt>. If you don't need this, simply remove
 * the reference to this class in the module descriptor xml.
 */
public class HellloWorldModuleClass extends BlossomModuleSupport implements ModuleLifecycle {

	public void start(ModuleLifecycleContext moduleLifecycleContext) {
		if (moduleLifecycleContext.getPhase() == ModuleLifecycleContext.PHASE_SYSTEM_STARTUP) {
			super.initRootWebApplicationContext("classpath:/applicationContext.xml");
			super.initBlossomDispatcherServlet("blossom", "classpath:/blossom-servlet.xml");
		}
	}

	public void stop(ModuleLifecycleContext moduleLifecycleContext) {
		if (moduleLifecycleContext.getPhase() == ModuleLifecycleContext.PHASE_SYSTEM_SHUTDOWN) {
			super.destroyDispatcherServlets();
			super.closeRootWebApplicationContext();
		}
	}
}
