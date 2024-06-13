FROM openjdk:8
EXPOSE 1234:1235
ADD target/GithubActionsPrac.jar GithubActionsPrac.jar
ENTRYPOINT ["java","-jar","/GithubActionsPrac.jar"]