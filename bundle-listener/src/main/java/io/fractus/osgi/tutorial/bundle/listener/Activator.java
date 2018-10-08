/**
 * 
 * Copyright (c) 2018 Fractus IT d.o.o. <http://fractus.io>
 * 
 */
package io.fractus.osgi.tutorial.bundle.listener;

import java.util.Dictionary;
import java.util.Enumeration;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.framework.ServiceReference;

/**
 * This class implements a simple bundle that utilizes the OSGi
 * framework's event mechanism to listen for bundle events. 
**/
public class Activator implements BundleActivator, BundleListener {

	/**
     * Implements BundleActivator.start(). 
     * @param context the framework context for the bundle.
    **/
	public void start(BundleContext bundleContex) throws Exception {
							
		System.out.println("Activator " + Activator.class.getName() + " started");
		bundleContex.addBundleListener(this);
	}

	/**
     * Implements BundleActivator.stop(). 
     * @param context the framework context for the bundle.
    **/	
	public void stop(BundleContext bundleContext) throws Exception {
				
		System.out.println("Activator " + Activator.class.getName() + " stoped");

		bundleContext.removeBundleListener(this);
	}


	/**
     * Implements BundleListener.bundleChanged().
     * Prints the details of any service event from the framework.
     * @param bundleEvent the fired bundle event.
    **/
	public void bundleChanged(BundleEvent bundleEvent) {
				
		String symbolicName = bundleEvent.getBundle().getSymbolicName();
		String type = Util.typeAsString(bundleEvent);
		
		System.out.println("BundleChanged: " + symbolicName + ", event.type: " + type);
		
		Bundle bundle = bundleEvent.getBundle();
		System.out.println("BundleId: " + bundle.getBundleId());
		System.out.println("BundleLocation: " + bundle.getLocation());
		System.out.println("BundleVersion: " + bundle.getVersion());

		Dictionary headers = bundle.getHeaders();
		System.out.println();
		System.out.println("MANIFEST.MF");
		
        for (Enumeration keys = headers.keys(); keys.hasMoreElements();) { 
        	Object key = keys.nextElement();
            System.out.println(key + ": " + headers.get(key)); 
        } 
  
		System.out.println();
		System.out.println("Registered Services:");
		
        ServiceReference[] registeredServices = bundle.getRegisteredServices();
        for (int i = 0; i < registeredServices.length; i++) {
			ServiceReference serviceReference = registeredServices[i];
			Object actualService = bundle.getBundleContext().getService(serviceReference);
			System.out.println("service: " + actualService);
		}
	}	

}
