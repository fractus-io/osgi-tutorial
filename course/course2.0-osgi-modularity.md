## Modularity

 
* Broadly speaking, modularity is the degree to which a system's components may be separated and recombined, often with the benefit of flexibility and variety in use

---

### Topics

* Java Modularity
* Modularity
* JAR Hell
* OSGi to Rescue

---

### Java Modularity

* Provides encapsulation through access modifiers:
  * public, protected, private
  * Java also provides the package

* Classes or methods from one package to be available to another they
must be declared as <b>public</b>

---

### Java Modularity

*  Problematic when package A needs code from
package C, now packages B, D, E and F can see
that code.

* OSGi introduces package level encapsulation

---

### Modularity

Forces:

* Separation of concerns
* Design simplicity
* Code reuse
* Easy maintenanace and repair

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
* Limits their visibilty and exposure

---

### Modularity

![Image](asset/image/modularity.jpg)

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
  
