# Preparation

Clone this repository

# Setup dependencies

see [pom.xml](./pom.xml)

# Review the code


# How to run the code
**Note**: `test.serverType` and `test.endpoint` default values are `onprem` and `http://localhost:8080`. These can be modified in AppConfigBase.java lines 43 and 44.

### Using maven
Running the App code:
```shell
mvn compile exec:java -Dexec.mainClass="com.example.App" -Dtest.serverType=onprem -Dtest.endpoint=http://localhost:8080 
```

Running the test code:
```shell
mvn test -Dtest.serverType=onprem -Dtest.endpoint=http://localhost:8080
```

### Directly using java
Running the App code directly using java command.
```shell
mvn clean package -Dmaven.test.skip
CP=`mvn dependency:build-classpath -Dmdep.outputFile=/dev/stdout -q`
java -cp $CP:./target/spring-data-test-1.0-SNAPSHOT.jar -Dtest.serverType=onprem -Dtest.endpoint=http://localhost:8080  com.example.App 
```


### Building the spring-data-oracle-nosql from GitHub

git clone https://github.com/oracle/nosql-spring-sdk.git  --branch "feature/composite-key"
cd nosql-spring-sdk/
mvn package -DskipTests=true



mvn install:install-file \
-DpomFile=pom.xml \
-Dfile=target/spring-data-oracle-nosql-1.5.0.jar \
-Dsources=target/spring-data-oracle-nosql-1.5.0-sources.jar \
-Djavadoc=target/spring-data-oracle-nosql-1.5.0-javadoc.jar

