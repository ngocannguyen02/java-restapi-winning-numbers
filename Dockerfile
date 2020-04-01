FROM openjdk:8

ENV JAVA_OPTS=""

ADD target/*.jar app.jar

RUN sh -c 'touch /app.jar'

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar "]

HEALTHCHECK --start-period=90s --interval=20s --timeout=10s --retries=3 \
    CMD wget -q -s http://localhost:8080/actuator/health || exit 1
