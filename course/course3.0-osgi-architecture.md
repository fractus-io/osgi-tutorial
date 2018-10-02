
## OSGi Architcture
 
 OSGi Architecture

---

### Topics

* Java Modularity
* Modularity
* JAR Hell
* OSGi to Rescue

---

### OSGi Architecture

* OSGi technology is a set of specifications that define a dynamic component system for Java
* Application is composed of several components which are packaged in <b>bundles</b>
* Components communicate locally and across the network through services

---

### OSGi Architecture

* Components are the reusable building blocks
* Components provides the implementation code
* Since components should be reusable, they should watch their dependencies 

---

### OSGi Architecture

* The OSGi specifications enables components:
   * to hide their implementations from other components 
   * to comunicate among each others through services
   * services are objects that are explicitly shared between components

---

### OSGi Service

* Services are the links between components
* Services have an API that is defined in a Java package
* The API consists of 
   * classes and/or interfaces 
   * needed for the collaboration between the provider of the service and the consumer of the service
   
---

### OSGi Service

* You can register and consume existing services via the OSGi runtime
* OSGi provides a central <b>Service Registry</b> for this purpose
* Service can be dynamically started and stopped
* During the declaration of a service it is possible to specify key / values which can be used to configure the service
   
---


### OSGi Service

---?image=course/assets/image/service-registry.png&size=auto 50%
@title[Layers]
   
---

### Layers 

* OSGi has a layered model that is depicted in the following figure.

---?image=course/assets/image/osgi-layers.png&size=auto 50%
@title[Layers]

---

### Layers 

* Bundles 
  * Bundles are the OSGi components made by the developers
* Services 
  * The services layer connects bundles in a dynamic way by offering a publish-find-bind model for plain old Java objects
* Life-Cycle
  * The API to install, start, stop, update, and uninstall bundles
---

### Layers

* Modules 
  * The layer that defines how a bundle can import and export code
* Security 
  * The layer that handles the security aspects
* Execution Environment 
 * Defines what methods and classes are available in a specific platform
 
---

### Bundles

What is a Bundle ?

* Jar files with a manifest header
* Can contain resources, java packages and class files


---

### Bundles

* A bundle further contains a manifest file (MANIFEST.MF) that describes:
  * what is „on board“ of a bundle
  * its dependencies (Import and export packages)
  * the bundle-version
  * the bundle-name (symbolic as java package and logical name)
  * a short description
  * its Activator (a java class that implements the lifecycle behavior of this bundle)
  
---

### Bundles

MANIFEST.MF:
Manifest-Version: 1.0
Bundle-ManifestVersion: 2
Bundle-Name: helloworld-consumer
Bundle-SymbolicName: helloworld-consumer
Bundle-Version: 1.0.0.qualifier
Bundle-Activator: io.fractus.osgi.tutorial.helloworld.consumer.Activator
Eclipse-LazyStart: true
Bundle-RequiredExecutionEnvironment: JavaSE-1.6
Import-Package: org.osgi.framework;version="1.3.0",io.fractus.osgi.tutorial.helloworld.producer
Export-Package: io.fractus.osgi.tutorial.helloworld.consumer

---

### Bundles

* Bundle has lifecycle

---?image=course/assets/image/bundle-lifecycle.png&size=auto 50%
@title[Bundle Lifecycle]

---

### Bundles


State       Description
Installed   Bundle successfuly installed
Resolved    Bundle dependencies resolved
Uninstalled Bundle successfuly uninstalled
Starting    Bundle can be started 
Active      Bundle is active  
Stopping    Bundle is being stopped 
