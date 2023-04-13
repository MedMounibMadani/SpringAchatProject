FROM alpine:latest
RUN apk add --no-cache openjdk11
WORKDIR /app
COPY target/tpAchatProject*.jar /app/myapp.jar
EXPOSE 8089
CMD ["java", "-jar", "/app/myapp.jar"]
