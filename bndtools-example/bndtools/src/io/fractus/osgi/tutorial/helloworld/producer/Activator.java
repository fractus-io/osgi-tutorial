/**
 * 
 * Copyright (c) 2018 Fractus IT d.o.o. <http://fractus.io>
 * 
 */
package io.fractus.osgi.tutorial.helloworld.producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import io.fractus.osgi.tutorial.helloworld.api.IHelloWorld;

public class Activator implements BundleActivator {

	public void start(BundleContext bundleContex) throws Exception {
				
		System.out.println("Activator " + Activator.class.getName() + " starting");
		
		IHelloWorld helloWorld = new HelloWorldService();
		
		bundleContex.registerService(IHelloWorld.class.getName(), helloWorld, null);
		
		System.out.println("Service " + IHelloWorld.class.getName() + " registred");
		
		System.out.println("Activator " + Activator.class.getName() + " started");
		
	}

	
	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Activator " + Activator.class.getName() + " stoped");

	}


}