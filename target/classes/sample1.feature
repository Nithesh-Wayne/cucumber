Feature: Login Test
Description: Registered user can login into application using valid username and valid password


Scenario: Login with valid credentials
Given user opens login page in newtours application
When user enters the username as mercury and password as mercury
And Click Submit button
Then verify login success 