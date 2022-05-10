pipeline{
    agent any
    stages{
        stage("continuous_integration"){
            steps {
                script { 
                    build()
                }
            }
        }
        stage("release"){
            steps {
                script{
                    release()
                }
            }
        }
    }
}
