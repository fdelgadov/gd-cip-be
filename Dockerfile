FROM amazoncorretto:21.0.4-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/gd_cip_be-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} gd_cip_be-0.0.1-SNAPSHOT.jar
COPY target/gd_cip_be-0.0.1-SNAPSHOT.jar gd_cip_be-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/gd_cip_be-0.0.1-SNAPSHOT.jar"]