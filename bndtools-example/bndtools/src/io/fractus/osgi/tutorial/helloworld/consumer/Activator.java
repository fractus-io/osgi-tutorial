package io.fractus.osgi.tutorial.helloworld.consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import io.fractus.osgi.tutorial.helloworld.api.IHelloWorld;

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