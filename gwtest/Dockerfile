FROM openjdk
EXPOSE 8065
VOLUME /app
COPY /app/application.yml ./
# ENV JAVA_OPTS =''
ENTRYPOINT [ "java" , "-jar" ,"/app/gatewaytest.jar"]

