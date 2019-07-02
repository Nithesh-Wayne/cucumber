Feature: Login Test

Scenario: Login with valid
Given open newtours app
When user enters un as "mercury" and password pwd as "mercury"
And submit login form
Then verify pass


Scenario: Login with invalid
Given open newtours app
When user enters un as "wayne" and password pwd as "wayne"
And submit login form
Then verify fail