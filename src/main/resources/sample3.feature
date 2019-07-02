Feature: signup

Scenario Outline: test signup function with different set of input

Given user open signup page
When user enters fn as "<firstname>"
And user enters ln as "<lastname>"
And user enters dob as "<dob>"
And user enters psd as "<password>"
And user enters cpsd as "<confirmpassword>"
Then click signup button
And Verify signup success message

Examples:
|firstname|lastname|dob|password|confirmpassword|
|Bruce|Wayne|10/07/1972|batman|batman|
|Alfred|Westin|12/05/1950|celvic|celvic|
