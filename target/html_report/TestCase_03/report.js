$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Test.feature");
formatter.feature({
  "name": "Trigger the API and validate response",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate API details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestCase_01"
    },
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "I trigger the get API",
  "keyword": "Given "
});
formatter.match({
  "location": "com.test.Steps.TestStep.i_trigger_the_get_api()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify API statuscode",
  "keyword": "Then "
});
formatter.match({
  "location": "com.test.Steps.TestStep.i_verify_api_statuscode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.test.Steps.TestStep.i_verify_title()"
});
formatter.result({
  "status": "passed"
});
});