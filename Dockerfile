FROM alpine:latest
RUN apk add --no-cache openjdk11
WORKDIR /app
COPY target/*.jar /app/myapp.jar
CMD ["java", "-jar", "/app/my-app.jar"]