$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/sample3.feature");
formatter.feature({
  "name": "signup",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "test signup function with different set of input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open signup page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters fn as \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters ln as \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters dob as \"\u003cdob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters psd as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters cpsd as \"\u003cconfirmpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify signup success message",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "dob",
        "password",
        "confirmpassword"
      ]
    },
    {
      "cells": [
        "Bruce",
        "Wayne",
        "10/07/1972",
        "batman",
        "batman"
      ]
    },
    {
      "cells": [
        "Alfred",
        "Westin",
        "12/05/1950",
        "celvic",
        "celvic"
      ]
    }
  ]
});
formatter.scenario({
  "name": "test signup function with different set of input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "Sample3.user_open_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters fn as \"Bruce\"",
  "keyword": "When "
});
formatter.match({
  "location": "Sample3.user_enters_fn_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ln as \"Wayne\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.user_enters_ln_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters dob as \"10/07/1972\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.user_enters_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters psd as \"batman\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.user_enters_psd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters cpsd as \"batman\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.user_enters_cpsd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample3.click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify signup success message",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.verify_signup_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "test signup function with different set of input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "Sample3.user_open_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters fn as \"Alfred\"",
  "keyword": "When "
});
formatter.match({
  "location": "Sample3.user_enters_fn_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ln as \"Westin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.user_enters_ln_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters dob as \"12/05/1950\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.user_enters_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters psd as \"celvic\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.user_enters_psd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters cpsd as \"celvic\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.user_enters_cpsd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample3.click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify signup success message",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3.verify_signup_success_message()"
});
formatter.result({
  "status": "passed"
});
});