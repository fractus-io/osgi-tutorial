/**
 * 
 * Copyright (c) 2018 Fractus IT d.o.o. <http://fractus.io>
 * 
 */
package io.fractus.osgi.tutorial.bundle.listener;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

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
		
		System.out.println("bundleEvent " + bundleEvent.getType());
		
	}	

}
