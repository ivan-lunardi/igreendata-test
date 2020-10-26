FROM openjdk:8-jdk-alpine
ARG DEPENDENCY=build/docker/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /var/app/lib
COPY ${DEPENDENCY}/META-INF /var/app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /var/app
RUN apk update && apk add \
    tzdata --no-cache
ENV TZ Australia/Melbourne
ENTRYPOINT ["sh","-c", "java ${JAVA_OPTS} -cp var/app:var/app/lib/* com.igreendata.test.IgreendataTestApplication"]
