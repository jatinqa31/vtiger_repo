Feature: To check calendar Page
@004
Scenario: To check calander page opens successfully
Given User is on Home screen of application
When User clicks on Calendar button 
Then Calander page opens on screen

@005
Scenario: To check Week view on calander page
Given User is on calander screen of application
When User clicks on Week view button 
Then Week View opens on page

@006
Scenario: To check Day view on calander page
Given User is on calander screen of application
When User clicks on day view button 
Then Day View opens on page

@007
Scenario: To check Month view on calander page
Given User is on calander screen of application
When User clicks on Month view button 
Then Month View opens on page

@008
Scenario: To check popup to add call or meeting opens on Month view page
Given User is on day view of calander screen
When User clicks on time slot
Then popup to add call or meeting is open

@009
Scenario Outline: To check call is added on Month view page
Given User is on day view of calander screen
When User clicks on time slot
Then popup to add call or meeting is open
And user clicks on call option button
Then users enters <text>
And user clicks on save button
And Read Test data from "Test_002"


Examples:
| text    		 |
| call @ 5:00 am |
| call @ 6:00 am |
| call @ 7:00 am |


