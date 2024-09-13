FROM eclipse-temurin:17
COPY target/automation.jar automation.jar
CMD ["target","-jar","automation.jar"]