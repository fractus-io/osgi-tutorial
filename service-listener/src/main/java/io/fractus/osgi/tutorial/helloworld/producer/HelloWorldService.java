/**
 * 
 * Copyright (c) 2018 Fractus IT d.o.o. <http://fractus.io>
 * 
 */
package io.fractus.osgi.tutorial.helloworld.producer;

public class HelloWorldService implements IHelloWorld {

	public void sayHello() {
		System.out.println("Hello World");
	}

}
