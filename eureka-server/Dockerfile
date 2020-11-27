FROM openjdk:15
EXPOSE 8761
ADD /target/discovery-0.0.1-SNAPSHOT.war Discovery-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Discovery-server-0.0.1-SNAPSHOT.jar"]