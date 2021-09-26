FROM openjdk:11
EXPOSE 8080
ADD target/*.jar milestone.jar
ENTRYPOINT ["java","-jar","/milestone.jar"]
