[![Build Status](https://travis-ci.org/fractus-io/osgi-tutorial.svg?branch=master)](https://travis-ci.org/fractus-io)
[![GitPitch](https://gitpitch.com/assets/badge.svg)](https://gitpitch.com/fractus-io/osgi-tutorial/master?grs=github&t=white)

# OSGI tutorial


Hello World shows how to produce/consume OSGi services.

#### Prerequisite

Installed:  Java 1.8, Maven 3.x

#### Steps

##### Clone source code from git
```
$  git clone https://github.com/fractus-io/osgi-tutorial .
```

##### Build project with Maven
```
$ mvn clean install
```

##### Run OSGi runtime(Equinox), in console mode
```
$ java -jar ./framework/org.eclipse.osgi_3.5.2.R35x_v20100126.jar -console
```

##### List bundles
```
$ osgi> ss
```

##### Install bundles

Install producer:
```
$ osgi> install file:///.../helloworld-producer/target/helloworld-producer-1.0.0-SNAPSHOT.jar
```

Equinox displays its bundle ID; for example:
```
$ osgi> Bundle id is 2
```

Install consumer:
```
$ osgi> install file:///.../helloworld-consumer/target/helloworld-consumer-1.0.0-SNAPSHOT.jar
```

Equinox displays its bundle ID; for example:
```
$ osgi> Bundle id is 3
```

##### Start bundles

Start producer
```
$ osgi> start 2
```

Start consumer:
```
$ osgi> start 3
```




