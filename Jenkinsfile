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
            withMaven (maven: 'maven3', mavenSettingsConfig: 'd8f5fdae-7501-44a1-a3de-6285d0fff477'){
                sh script: 'mvn clean deploy'
           }
        }
      }
    }
}
