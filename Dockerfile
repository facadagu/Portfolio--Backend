FROM amazoncorretto:17
MAINTAINER David
COPY target/david-0.0.1-SNAPSHOT.jar david-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/david-0.0.1-SNAPSHOT.jar"]
