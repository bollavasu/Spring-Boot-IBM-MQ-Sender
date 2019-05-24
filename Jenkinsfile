node {   
        stage('SCM Checkout') {
           git 'https://github.com/bollavasu/Spring-Boot-Rest-Template'
        }
        
        stage('Compile-Package') {
           bat 'mvn package'
        }
}
