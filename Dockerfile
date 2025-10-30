# 베이스 이미지 (JDK 17)
FROM openjdk:17-oracle

# Gradle build 후 생성된 jar 파일 복사
COPY build/libs/calculator-0.0.1-SNAPSHOT.jar app.jar

# 컨테이너 실행 시 명령
ENTRYPOINT ["java", "-jar", "app.jar"]