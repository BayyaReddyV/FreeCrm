$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/91961/eclipse-workspace/FreeCRM/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM  Login feature",
  "description": "",
  "id": "freecrm--login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "FreeCRM login",
  "description": "",
  "id": "freecrm--login-feature;freecrm-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitin.user_is_already_on_the_login_page()"
});
formatter.result({
  "duration": 16489478200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitin.user_enters_username_and_password()"
});
formatter.result({
  "duration": 632425400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitin.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 167556100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitin.user_is_on_homepage()"
});
formatter.result({
  "duration": 24143700,
  "status": "passed"
});
});