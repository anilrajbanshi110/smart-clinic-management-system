FROM openjdk:17
COPY target/smartclinic.jar smartclinic.jar
ENTRYPOINT ["java","-jar","/smartclinic.jar"]