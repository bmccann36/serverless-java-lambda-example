# serverless-java-lambda-example
This is a simple example project that demonstrates how to use Java with AWS lambda. The corresponding medium article describes how this was built step by step. The branches in this repo build on each other sequentially in this order

1) starting-point
1) run-local-and-remote
1) add-rest-path

## getting started

 1) build the artifact `./gradlew build`
 1) invoke a Lambda Handler locally as it would run in cloud Lambda environment  
 `sls invoke --local -f createUser -p mocks/createUserInput.json`
 1) make some changes, rebuild and deploy everything to the cloud with   
 `npm run build:deploy`
 
 
 ## more resources
 https://www.serverless.com/