This is a gradle spring boot web application that follows rest standards that follows the requirements of the given
 code challenge specifications.

Tests cases can be found in the test folder in the TestCases class.  The tests are done in groovy and spock framework.

In order to run this locally using an IDE, import the project as a gradle project, right click the Application class and
 select the run option.  Spring boot should fire up a tomcat instance and run the application on localhost:8080.

If you would like to run the application via 'fat jar', do a 'gradle clean build' command at the project level on the command line, then
 execute the command 'java -jar build/libs/codeChallenge-1.0.0.jar'

NOTE: Valid answers will be returned in JSON as well as logged to the console as per specified in the description of the challenges

Below are some valid curls and responses for a local deployment of this application

*** BUZZ ***
cURL:
curl -X GET 'http://localhost:8080/buzz'
Expected Response:
{"buzz":["1","2","3","4","5","6","buzz","8","9","10","buzz","12","13","buzz","15","16","17","18","19","20","buzz","buzz",
"23","24","25","26","27","buzz","29","30","31","32","buzz","34","buzz","36","37","38","39","40","41","buzz","43","buzz","45",
"46","47","48","buzz","50","51","52","53","54","buzz","buzz","57","58","59","60","61","62","buzz","64","65","buzz","67","68",
"69","buzz","71","72","73","74","75","76","buzz","78","79","80","81","82","83","buzz","85","86","87","buzz","89","90","buzz",
"92","93","94","95","96","97","buzz","buzz","100"]}

*** Reversal ***
cURL:
curl -X GET 'http://localhost:8080/reverse/hello'
Expected Response:
{"reversedWord":"olleh"}

*** Intersection ***
cURL:
curl -X POST -H "Content-Type: application/json" -d '{"arr1":[[1,2,3],[1,2,3,4]]}' 'http://localhost:8080/intersection'
Expected Response:
{"intersectionData":[1,2,3]}

*** Factorial ***
cURL:
curl -X GET 'http://localhost:8080/factorial/10'
Expected Response:
{"factorial":3628800}