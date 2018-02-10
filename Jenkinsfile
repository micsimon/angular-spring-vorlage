node {
    stage 'checkout'
    checkout scm

    stage 'test'
    if (isUnix()) {
        sh './gradlew test'
    } else {
        bat './gradlew.bat test'
    }

}