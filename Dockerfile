FROM openjdk:8
EXPOSE 8080
ADD target/spring-cicd-dockerimg.jar spring-cicd-dockerimg.jar
ENTRYPOINT ["java","-jar","/springboot-images-new.jar"