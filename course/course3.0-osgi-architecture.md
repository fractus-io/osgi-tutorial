
## Architcture

 
* Broadly speaking, modularity is the degree to which a system's components may be separated and recombined, often with the benefit of flexibility and variety in use

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

### Layers 

* OSGi has a layered model that is depicted in the following figure.

---?image=course/assets/image/osgi-layers.jpg&size=auto 50%
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

### Modularity

What is a Module ?

* Self-contained
 * from outside module must appear as logical whole
* Highly cohesive
  *  A module should have just one, well-defined purpose 

---

### Modularity

* Loosly coupled
  * module should know nothing about implementation of the modules its depends on
  * it must rely on their public interface

---

### Modularity

What is a Module ?

* Have private space 
* Share public space
* Limits their visibility and exposure

---?image=course/assets/image/modularity.jpg&size=auto 50%
@title[Modularity]

---
### JAR Hell

* JAR files are not modules
* JAR does not exists at runtime
  * when searching for class, JVM perfoms linear scan 
  * very inefficients and unreliable process
  
---

### JAR Hell
  
* JAR contain no explicit declaration about dependencies
* JAR is not versioned
* No information hiding between JARs 
  
---

### JAR Hell

So JAR files are not the modules

---

### OSGi to Rescue

* OSGi offers an elegant solution to handling
dependencies by requiring dependency
declarations within units of modularity

* OSGi provides an isolated module cycling/
updating capability in order to increase availability

---

### OSGi to Rescue

* OSGi kind of Java Operating System
* Lego principle:
  * Reusabilty
  * Portability
  * Application isolation
  * Life-cycle management
  
