pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/Melke-At/Melke_Tempreture_V1', branch: 'main')
      }
    }

    stage('') {
      steps {
        build(job: 'mvn clean install', quietPeriod: 1)
      }
    }

  }
}