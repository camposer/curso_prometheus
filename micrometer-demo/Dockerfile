FROM maven:3.6.3-jdk-11 AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn -DskipTests package

FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /opt/app
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/micrometer*.jar /opt/app/micrometer.jar
CMD ["java", "-jar", "/opt/app/micrometer.jar"]
