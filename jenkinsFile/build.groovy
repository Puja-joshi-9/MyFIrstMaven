pipeline {
    agent any
    stages{
        stage("checkout"){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: 'main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Puja-joshi-9/MyFirstMaven.git']]])

            }
        }
         stage("build"){
            steps{
                sh """
                ls
                """
                
            }
        }
    }
    
}