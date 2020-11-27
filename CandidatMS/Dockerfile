FROM openjdk:15
EXPOSE 8089
ADD /target/Candidate-0.0.1-SNAPSHOT.war docker-service-candidate.jar
ENTRYPOINT ["java", "-jar", "docker-service-candidate.jar"]