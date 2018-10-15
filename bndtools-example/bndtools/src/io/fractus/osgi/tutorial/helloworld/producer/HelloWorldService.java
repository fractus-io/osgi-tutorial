package io.fractus.osgi.tutorial.helloworld.producer;

import io.fractus.osgi.tutorial.helloworld.api.IHelloWorld;

public class HelloWorldService implements IHelloWorld {

	public void sayHello() {
		
		System.out.println("say hello...");
		
	}

}
