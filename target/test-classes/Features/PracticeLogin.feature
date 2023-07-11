Feature: Verify the login functionality

Scenario: Verify with valid credentials

Given user is on homepage of Practice Test Automation
And user clicks on the Practice link
And click on Test login Page link
When user enter the credentials
Then Logged in Successfully should be displayed.

Scenario: Verify with the invalid username and valid password

Given user is on homepage of Practice Test Automation
And user clicks on the Practice link
And click on Test login Page link
When user enter the incorrect username and correct Password
Then error message text should be displayed.

Scenario: Verify with the valid username and invalid password

Given user is on homepage of Practice Test Automation
And user clicks on the Practice link
And click on Test login Page link
When user enter the correct username and incorrect Password
Then error message text should be displayed.