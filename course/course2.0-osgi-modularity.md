## Modularity

 
* Broadly speaking, modularity is the degree to which a system's components may be separated and recombined, often with the benefit of flexibility and variety in use

---

Topics

* Java Modularity
* What is OSGi
* Why OSGi
* OSGi Specificatiosn
* OSGi Implementations

---

### Java Modularity:

* Provides encapsulation through access modifiers:
  * public, protected, private
  * Java also provides the package

* Classes or methods from one package to be available to another they
must be declared as <b>public</b>

*  Problematic when package A needs code from
package C, now packages B, D, E and F can see
that code.
* OSGi provides package level encapsulation

---

Modularity

Modularity forces:
* Separation of concerns
* Design simplicity
* Code reuse
* Easy maintenanace and repair


What is a Module ?

* Self-contained
 * from outside module must appear as logical whole
* Highly cohesive
  *  A module should have just one, well-defined purpose 
* Loosly coupled
  * module should know nothing about implementation of the modules its depends on
  * it must rely on their public interface

What is a Module ?

* have private space 
* share public space
* limits their visibilty and exposure
* from geometric to linear complexity


JAR hell

* JAR files are not modules
* JAR does not exists at runtime
  * when searching for class, JVM perfoms linear scan 
  * very inefficients and unreliable process
* JAR contain no explicit declaration about dependencies
* JAR is not versioned
* No information hiding between JARs 

So JAR files are not the modules


OSGi to rescue

• OSGi offers an elegant solution to handling
dependencies by requiring dependency
declarations within units of modularity. 

• OSGi provides an isolated module cycling/
updating capability in order to increase availability. 

