pipeline { 

    agent any 

    stages { 

         stage('Build') {  

            steps { 

               sh 'mvn clean install -DskipTests=true'  

            } 

            post { 

               success { 

                    echo 'Now Archiving...' 

                   } 

              }  

        }   
} 