FROM openjdk:11-slim as build

MAINTAINER dzmann

COPY target/agencia-config-server-0.0.1-SNAPSHOT.jar agencia-config-server-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/agencia-config-server-0.0.1-SNAPSHOT.jar"]
