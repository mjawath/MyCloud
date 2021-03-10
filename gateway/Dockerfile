FROM openjdk
EXPOSE 8000
VOLUME /app
COPY /app/application.yml ./
ENTRYPOINT ["java","-jar", "/app/cloud-gateway-0.9.jar"]

