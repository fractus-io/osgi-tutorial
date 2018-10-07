/**
 * 
 * Copyright (c) 2018 Fractus IT d.o.o. <http://fractus.io>
 * 
 */
package io.fractus.osgi.tutorial.service.listener;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;

/**
 * This class implements a simple bundle that utilizes the OSGi
 * framework's event mechanism to listen for service events. Upon
 * receiving a service event, it prints out the event's details.
**/
public class Activator implements BundleActivator, ServiceListener {

	/**
     * Implements BundleActivator.start(). 
     * @param context the framework context for the bundle.
    **/
	public void start(BundleContext bundleContex) throws Exception {
		
		bundleContex.addServiceListener(this);
						
		System.out.println("Activator " + Activator.class.getName() + " started");
		
	}

	/**
     * Implements BundleActivator.stop(). 
     * @param context the framework context for the bundle.
    **/	
	public void stop(BundleContext bundleContext) throws Exception {
		
		bundleContext.removeServiceListener(this);
		System.out.println("Activator " + Activator.class.getName() + " stoped");
		
	}


	/**
     * Implements ServiceListener.serviceChanged().
     * Prints the details of any service event from the framework.
     * @param serviceEvent the fired service event.
    **/
	public void serviceChanged(ServiceEvent serviceEvent) {
		
	
		System.out.println(Activator.class.getName() + ": serviceEvent: " + serviceEvent);
		
        String[] objectClass = (String[])serviceEvent.getServiceReference().getProperty("objectClass");

        if (serviceEvent.getType() == ServiceEvent.REGISTERED){
        	
            System.out.println("ServiceListener: Service of type " + objectClass[0] + " registered.");
            
        }else if (serviceEvent.getType() == ServiceEvent.UNREGISTERING){
        	
            System.out.println("ServiceListener: Service of type " + objectClass[0] + " unregistered.");
            
        }else if (serviceEvent.getType() == ServiceEvent.MODIFIED){
        	
            System.out.println("ServiceListener: Service of type " + objectClass[0] + " modified.");
            
        }		
	}	

}
