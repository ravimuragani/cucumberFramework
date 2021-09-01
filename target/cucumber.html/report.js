$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/org/automation/features/Home.feature");
formatter.feature({
  "name": "verify user landed on Home Page after Login and profile displayed after click on profile",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User landed on home page and click on profile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.user_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click profile tab",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.click_profile_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "profile tab is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.profile_tab_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});