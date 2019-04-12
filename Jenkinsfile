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

     
     /*stage('Deploy'){
        steps{
           withCredentials([sshUserPrivateKey(credentialsId:"ubuntu0412", keyFileVariable:'keyfile')]){
             sh 'kill $(cat /home/ubuntu/pid.file)'
             sh "ssh -o StrictHostKeyChecking=no -i ${keyfile} ubuntu@ec2-18-222-87-31.us-east-2.compute.amazonaws.com 'rm -rf /home/ubuntu/manish-weather-forecast-0.0.1-SNAPSHOT.jar'"
             sh 'chmod 400 ${keyfile}'
             sh 'scp -v -o StrictHostKeyChecking=no -i ${keyfile} target/*.jar ubuntu@ec2-18-222-87-31.us-east-2.compute.amazonaws.com:/home/ubuntu'   
             sh "ssh -o StrictHostKeyChecking=no -i ${keyfile} ubuntu@ec2-18-222-87-31.us-east-2.compute.amazonaws.com 'nohup java -jar /home/ubuntu/manish-weather-forecast-0.0.1-SNAPSHOT.jar'"   
             sh "ssh -o StrictHostKeyChecking=no -i ${keyfile} ubuntu@ec2-18-222-87-31.us-east-2.compute.amazonaws.com '\$! > /home/ubuntu/pid.file'"
           }
        }
        post{
           echo 'finished deployment.'
        }
     }*/
  }
  
  
  
  
 

    /*stage('Sonar') {  

            steps { 

               sh 'mvn clean verify -P sonar -Dsonar.projectKey=test_project -Dsonar.host.url=http://192.168.99.100:32784 -Dsonar.login=21b6e7a1a2ddf7a7bc114c5e8429eb7aadbbf209'  

            } 

            post { 

               success { 

                    echo 'Now Archiving...' 

                   } 

              }  

        }*/ 

   

 

stage('Deploy') { 

steps { 

withCredentials([sshUserPrivateKey(credentialsId: "ec2-first", keyFileVariable: 'keyfile')]) { 

                    sh 'chmod -R 400 ${keyfile}' 

sh 'ls -l ${keyfile}' 

sh 'scp -v -o StrictHostKeyChecking=no  -i ${keyfile}  target/*.jar ubuntu@35.173.235.73:/home/ubuntu/' 

sh "ssh -o StrictHostKeyChecking=no -i ${keyfile} ubuntu@54.162.233.91 'nohup java -jar /home/ubuntu/alltools-0.0.1-SNAPSHOT.jar'" 

               } 

    } 

} 

    } 

 

} 