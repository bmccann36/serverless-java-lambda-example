# serverless-java-lambda-example
This is a simple example project that demonstrates how to use Java with AWS lambda

## getting started

 1) build the artifact `./gradlew build`
 1) invoke a Lambda Handler locally as it would run in cloud Lambda environment  
 `sls invoke --local -f createUser -p mocks/createUserInput.json`
 1) make some changes, rebuild and deploy everything to the cloud with   
 `npm run build:deploy`
 
 
 ## more resources
 https://www.serverless.com/