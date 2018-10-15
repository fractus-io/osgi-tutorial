/**
 * 
 * Copyright (c) 2018 Fractus IT d.o.o. <http://fractus.io>
 * 
 */
package io.fractus.osgi.tutorial.helloworld.ds.consumer;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import io.fractus.osgi.tutorial.helloworld.ds.api.IHelloWorld;

@Component()
public class Consumer {

	@Reference
	private IHelloWorld helloWorld;
	
	@Activate
	public void start() {
		System.out.println("Consumer DS Activate");
		
		helloWorld.sayHello();
	}
	
	@Deactivate
	public void stop() {		
		System.out.println("Consumer DS Deactivate");
	}
}
