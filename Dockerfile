FROM openjdk:8
ADD target/SpringBootRest.jar SpringBootRest.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","SpringBootRest.jar"]