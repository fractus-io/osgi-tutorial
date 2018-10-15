package io.fractus.osgi.tutorial.helloworld.ds.producer;

import org.osgi.service.component.annotations.Component;

import io.fractus.osgi.tutorial.helloworld.ds.api.IHelloWorld;

 @Component
public class Producer implements IHelloWorld {

	
	public void sayHello() {
		System.out.println("say hello ds ...");
	}

}
