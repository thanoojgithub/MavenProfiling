# MavenProfiling
Loading respective environment specific properties file using Maven Profiling 


- To Build and Run application:

C:\MavenProfiling> mvn clean install -Pe3 -DskipTests=true

C:\MavenProfiling> java -jar .\target\MavenProfiling-0.0.1-SNAPSHOT.jar

(or)

C:\MavenProfiling> mvn clean install -Pe3 -DskipTests=true spring-boot:run
