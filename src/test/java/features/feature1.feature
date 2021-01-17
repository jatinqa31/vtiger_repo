Feature: Login into Application
@001
Scenario: Validate Login with null credentials
Given User is on login screen of application
When User clicks on Login button 
Then validation message shown to the user

@002
Scenario: Validate Login with Invalid credentials
Given User is on login screen of application
When User enters username "admin1" & password "admin2" 
Then validation message shown to the user

@003
Scenario: Validate Login with valid credentials 
Given User is a non registered customer and navigate to application
When User enter username "admin" and password "admin"
Then User redirects to home page
And validate title of home page
