# inversion-of-control
Follow these steps to run this example locally.

#### Step 1

clone this repo

#### Step 2

cd into the *plugin* directory and run command `mvn clean package`

#### Step 3

now install the generated jar file into your local maven repository using the command

`mvn install:install-file -Dfile=target\plugin-0.0.1-SNAPSHOT.jar -DgroupId=com.plugin -DartifactId=plugin -Dpackaging=jar -Dversion=0.0.1-SNAPSHOT`

#### Step 4

open *application* directory in your favourite IDE (I prefer STS) and run it as Spring Boot App

#### Step 5

hit `localhost:8080`

#### Note

This repository is part of a blog post on inversion of control, hence, may not make much sense on its own. You can visit the blog post [here][https://pranjalgore.com/blog/].