FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/uberjar/app.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENV PORT 3311
ENTRYPOINT ["java","-server", "-Xmx300M", "-XX:+UseG1GC", "-jar", "app.jar"]