$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/features/search_product.feature");
formatter.feature({
  "name": "Search Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Smoke Testing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "Smoke Testing",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.SearchPage.smokeTest()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});