Feature: Verify the login functionality

Scenario Outline: login with valid credentials

Given open browser
And user on login page
When user enter <username> and <password>
And user click on login button
Then user is navigated to the form

Examples: 

|username|password|
|Vipul|12345|
|Vishal|12345|