$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/feature1.feature");
formatter.feature({
  "name": "Login into Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Login with null credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@001"
    }
  ]
});
formatter.step({
  "name": "User is on login screen of application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginapplicationTest.user_is_on_login_screen_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginapplicationTest.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validation message shown to the user",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginapplicationTest.validation_message_shown_to_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Login with Invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@002"
    }
  ]
});
formatter.step({
  "name": "User is on login screen of application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginapplicationTest.user_is_on_login_screen_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username \"admin1\" \u0026 password \"admin2\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginapplicationTest.user_enters_username_something_password_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validation message shown to the user",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginapplicationTest.validation_message_shown_to_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@003"
    }
  ]
});
formatter.step({
  "name": "User is a non registered customer and navigate to application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginapplicationTest.user_is_a_non_registered_customer_and_navigate_to_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username \"admin\" and password \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginapplicationTest.user_enter_username_something_and_password_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User redirects to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginapplicationTest.user_redirects_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate title of home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginapplicationTest.validate_title_of_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/java/features/feature2.feature");
formatter.feature({
  "name": "To check calendar Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check calander page opens successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@004"
    }
  ]
});
formatter.step({
  "name": "User is on Home screen of application",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageTest.user_is_on_home_screen_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Calendar button",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_calendar_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Calander page opens on screen",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.calander_page_opens_on_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check Week view on calander page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@005"
    }
  ]
});
formatter.step({
  "name": "User is on calander screen of application",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageTest.user_is_on_calander_screen_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Week view button",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_week_view_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Week View opens on page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.week_view_opens_on_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check Day view on calander page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@006"
    }
  ]
});
formatter.step({
  "name": "User is on calander screen of application",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageTest.user_is_on_calander_screen_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on day view button",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_day_view_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Day View opens on page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.day_view_opens_on_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check Month view on calander page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@007"
    }
  ]
});
formatter.step({
  "name": "User is on calander screen of application",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageTest.user_is_on_calander_screen_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Month view button",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_month_view_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Month View opens on page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.month_view_opens_on_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check popup to add call or meeting opens on Month view page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@008"
    }
  ]
});
formatter.step({
  "name": "User is on day view of calander screen",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageTest.user_is_on_month_view_of_calander_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on time slot",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_time_slot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "popup to add call or meeting is open",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.popup_to_add_call_or_meeting_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To check call is added on Month view page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@009"
    }
  ]
});
formatter.step({
  "name": "User is on day view of calander screen",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on time slot",
  "keyword": "When "
});
formatter.step({
  "name": "popup to add call or meeting is open",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on call option button",
  "keyword": "And "
});
formatter.step({
  "name": "users enters \u003ctext\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on save button",
  "keyword": "And "
});
formatter.step({
  "name": "Read Test data from \"Test_002\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "text"
      ]
    },
    {
      "cells": [
        "call @ 5:00 am"
      ]
    },
    {
      "cells": [
        "call @ 6:00 am"
      ]
    },
    {
      "cells": [
        "call @ 7:00 am"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check call is added on Month view page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@009"
    }
  ]
});
formatter.step({
  "name": "User is on day view of calander screen",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageTest.user_is_on_month_view_of_calander_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on time slot",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_time_slot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "popup to add call or meeting is open",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.popup_to_add_call_or_meeting_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on call option button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_call_option_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters call @ 5:00 am",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.users_enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on save button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Read Test data from \"Test_002\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageTest.read_test_data_from_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check call is added on Month view page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@009"
    }
  ]
});
formatter.step({
  "name": "User is on day view of calander screen",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageTest.user_is_on_month_view_of_calander_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on time slot",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_time_slot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "popup to add call or meeting is open",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.popup_to_add_call_or_meeting_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on call option button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_call_option_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters call @ 6:00 am",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.users_enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on save button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Read Test data from \"Test_002\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageTest.read_test_data_from_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check call is added on Month view page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@009"
    }
  ]
});
formatter.step({
  "name": "User is on day view of calander screen",
  "keyword": "Given "
});
formatter.match({
  "location": "HomepageTest.user_is_on_month_view_of_calander_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on time slot",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_time_slot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "popup to add call or meeting is open",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.popup_to_add_call_or_meeting_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on call option button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_call_option_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters call @ 7:00 am",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.users_enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on save button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageTest.user_clicks_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Read Test data from \"Test_002\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageTest.read_test_data_from_something(String)"
});
formatter.result({
  "status": "passed"
});
});