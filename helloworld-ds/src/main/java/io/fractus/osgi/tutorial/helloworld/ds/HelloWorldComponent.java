/**
 * 
 * Copyright (c) 2018 Fractus IT d.o.o. <http://fractus.io>
 * 
 */
package io.fractus.osgi.tutorial.helloworld.ds;

public class HelloWorldComponent {

	public void activate() throws Exception {
		System.out.println("Hello World DS");
	}

	public void deactivate() throws Exception {
		System.out.println("Bye Hello World DS");
	}

}
