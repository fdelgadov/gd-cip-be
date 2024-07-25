FROM amazoncorretto:21-alphine-jdk

COPY target/gd_cip_be-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]