pipeline { 

    agent any 

    stages { 

         stage('Build and Test') {  

            steps { 

               sh 'mvn clean install'  

            } 

            post { 

               success { 

                    echo 'Now Archiving...' 

                   } 

              }  

        }
		
		stage('Deploy') { 

         steps { 

              withCredentials([sshUserPrivateKey(credentialsId: "ubuntu0412", keyFileVariable: 'keyfile')]) { 
              
			  /*
              sh 'kill $(cat /home/ubuntu/pid.file)'
              sh "ssh -o StrictHostKeyChecking=no -i ${keyfile} ubuntu@ec2-18-222-87-31.us-east-2.compute.amazonaws.com 'rm -rf /home/ubuntu/manish-weather-forecast-0.0.1-SNAPSHOT.jar'"
			  */
              
			  sh 'chmod -R 400 ${keyfile}' 

              sh 'ls -l ${keyfile}' 

              sh 'scp -v -o StrictHostKeyChecking=no  -i ${keyfile}  target/*.jar ubuntu@ec2-18-222-87-31.us-east-2.compute.amazonaws.com:/home/ubuntu/' 

              sh "ssh -o StrictHostKeyChecking=no -i ${keyfile} ubuntu@ec2-18-222-87-31.us-east-2.compute.amazonaws.com 'nohup java -jar /home/ubuntu/manish-weather-forecast-0.0.1-SNAPSHOT.jar'" 

             } 

    } 

}
		
    }
} 