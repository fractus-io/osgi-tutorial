/**
 * 
 * Copyright (c) 2018 Fractus IT d.o.o. <http://fractus.io>
 * 
 */
package io.fractus.osgi.tutorial.helloworld.consumer;

import io.fractus.osgi.tutorial.helloworld.producer.IHelloWorld;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {


	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Activator " + Activator.class.getName() + " starting");
		
		ServiceReference reference = bundleContext.getServiceReference(IHelloWorld.class.getName());
        
		IHelloWorld helloWorld = (IHelloWorld)bundleContext.getService(reference);
		helloWorld.sayHello();
		
		System.out.println("Activator " + Activator.class.getName() + " started");
	}


	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Activator " + Activator.class.getName() + " stoped");
		
	}

}
