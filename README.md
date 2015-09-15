### This is a gradle spring boot web application that follows REST standards given the code challenge specifications.

Test cases can be found in the test folder in the TestCases class.  The tests are done in groovy and spock framework.

In order to run this locally via the executable 'fat jar', execute the command 'gradle clean build' at the project level on the command line, then
 execute the command 'java -jar build/libs/codeChallenge-1.0.0.jar', this will automatically deploy a local tomcat instance of the application

### **Below are some valid curls and responses for a local and AWS deployments of this application**
NOTE: Valid answers will be returned in JSON as well as logged to the console(if ran locally) as per specified in the description of the challenges

## **BUZZ**

*HTTP Method:* GET

*URL Local:* http://localhost:8080/buzz

*URL AWS Deployed Instance:* http://default-environment-dpgy4gsvzc.elasticbeanstalk.com/buzz

*cURL Local:* curl -X GET 'http://localhost:8080/buzz'

*cURL AWS:* curl -X GET 'http://default-environment-dpgy4gsvzc.elasticbeanstalk.com/buzz'

*Expected Response:*
{"buzz":["1","2","3","4","5","6","buzz","8","9","10","buzz","12","13","buzz","15","16","17","18","19","20","buzz","buzz",
"23","24","25","26","27","buzz","29","30","31","32","buzz","34","buzz","36","37","38","39","40","41","buzz","43","buzz","45",
"46","47","48","buzz","50","51","52","53","54","buzz","buzz","57","58","59","60","61","62","buzz","64","65","buzz","67","68",
"69","buzz","71","72","73","74","75","76","buzz","78","79","80","81","82","83","buzz","85","86","87","buzz","89","90","buzz",
"92","93","94","95","96","97","buzz","buzz","100"]}

## **REVERSAL**

*HTTP Method:* GET

*URL Local:* http://localhost:8080/reverse/{word to reverse}

*URL AWS Deployed Instance:* http://default-environment-dpgy4gsvzc.elasticbeanstalk.com/reverse/{word to reverse}

*cURL Local:* curl -X GET 'http://localhost:8080/reverse/hello'

*cURL AWS:* curl -X GET 'http://default-environment-dpgy4gsvzc.elasticbeanstalk.com/reverse/hello'

*Expected Response:*
{"reversedWord":"olleh"}

## **INTERSECTION**

*HTTP Method:* POST

*URL Local:* http://localhost:8080/intersection NOTE: must attached JSON array of arrays entity.  This JSON array must contain the two lists to be compared

*URL AWS Deployed Instance:* http://default-environment-dpgy4gsvzc.elasticbeanstalk.com/intersection NOTE: must attached JSON array of arrays entity.  This JSON array must contain the two lists to be compared

*cURL Local:* curl -X POST -H "Content-Type: application/json" -d '{"arr1":[[1,2,3],[1,2,3,4]]}' 'http://localhost:8080/intersection'

*cURL AWS:* curl -X POST -H "Content-Type: application/json" -d '{"arr1":[[1,2,3],[1,2,3,4]]}' 'http://default-environment-dpgy4gsvzc.elasticbeanstalk.com/intersection'

*Expected Response:*
{"intersectionData":[1,2,3]}

## **FACTORIAL**

*HTTP Method:* GET

*URL Local:* http://localhost:8080/factorial/{number to be factorialed}

*URL AWS Deployed Instance:* http://localhost:8080/factorial/{number to be factorialed}

*cURL Local:* curl -X GET 'http://localhost:8080/factorial/10'

*cURL AWS:* curl -X GET 'http://default-environment-dpgy4gsvzc.elasticbeanstalk.com/factorial/10'

*Expected Response:*
{"factorial":3628800}