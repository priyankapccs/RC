$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/psrivastava/Documents/Selenium/RC/src/test/resources/Features/Search1.feature");
formatter.feature({
  "line": 1,
  "name": "SearchPage of Battery.",
  "description": "",
  "id": "searchpage-of-battery.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "RS Battery search page.",
  "description": "",
  "id": "searchpage-of-battery.;rs-battery-search-page.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter user name and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User search battery",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User put the filter",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User Logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Battery.User_open_browser()"
});
formatter.result({
  "duration": 15140507200,
  "status": "passed"
});
formatter.match({
  "location": "Battery.User_enter_user_name_and_password()"
});
formatter.result({
  "duration": 4038012800,
  "status": "passed"
});
formatter.match({
  "location": "Battery.User_search_battery()"
});
formatter.result({
  "duration": 243544540900,
  "status": "passed"
});
formatter.match({
  "location": "Battery.User_put_the_filter()"
});
