pipeline {
    agent {
        label 'linux-agent'
    }
    tools{
        maven 'maven3'
    }

    stages {
      stage('Clean & Deploy to Nexus') {
        steps {
            withMaven (maven: 'maven3'){
                sh 'mvn clean deploy'
           }
        }
      }
    }
}
