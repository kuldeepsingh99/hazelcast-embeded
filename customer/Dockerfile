FROM java:8
COPY /target/customer-0.0.1-SNAPSHOT.jar customer.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/customer.jar"]