# MavenProfiling
Loading respective environment specific properties file using Maven Profiling 


- To Build and Run application:

C:\MavenProfiling> mvn clean install -Pe3 -DskipTests=true

C:\MavenProfiling> java -jar .\target\MavenProfiling-0.0.1-SNAPSHOT.jar

(or)

C:\MavenProfiling> mvn clean install -Pe3 -DskipTests=true spring-boot:run

```
PS C:\MavenProfiling> java -jar .\target\MavenProfiling-0.0.1-SNAPSHOT.jar
01:28:28.023 [main] INFO  c.s.M.MavenProfilingApplication - MavenProfilingApplication - Spring Boot started!

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.3.RELEASE)

01:28:28.898 [main] INFO  c.s.M.MavenProfilingApplication - Starting MavenProfilingApplication v0.0.1-SNAPSHOT on thanooj with PID 9504 (C:\MavenProfiling\target\MavenProfiling-0.0.1-SNAPSHOT.jar started by thanooj in C:\MavenProfiling)
01:28:28.898 [main] INFO  c.s.M.MavenProfilingApplication - No active profile set, falling back to default profiles: default
01:28:30.023 [main] INFO  c.s.M.MavenProfilingApplication - Started MavenProfilingApplication in 1.734 seconds (JVM running for 2.92)
01:28:30.023 [main] INFO  c.s.M.MavenProfilingApplication - info me e3
01:28:30.023 [main] WARN  c.s.M.MavenProfilingApplication - warn me e3
01:28:30.023 [main] ERROR c.s.M.MavenProfilingApplication - error me e3
PS C:\MavenProfiling>
```
