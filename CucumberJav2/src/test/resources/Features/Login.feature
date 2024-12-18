Feature: Login to practice automation website

Scenario: Check login is successful

Given user is on login page
When user scroll down
And user enters username and password
And click on submit button
Then user is navigated to home page





