FROM openjdk:21-slim as build
VOLUME /tmp
COPY target/systemy_gridowe-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
