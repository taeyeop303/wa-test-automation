// Jenkins pipeline for Calculator project

pipeline {
    agent any

    stages {

        // 1️⃣ Compile Java source
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }

        /* 
         * 2️⃣ Build JAR file
         * build/libs/calculator-0.0.1-SNAPSHOT.jar 생성됨
         */
        stage("Build") {
            steps {
                sh "./gradlew build"
            }
        }

        // 3️⃣ Run unit tests
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
    }
}