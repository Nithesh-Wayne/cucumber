Feature: Testbackground welcome
Background:  welcome
Given application displays welcome message

@smoke @regression
Scenario: signin
Given users un and psd
And click signin
@smoke
Scenario: search for product 
When user searches for Carpet
@smoke
Scenario: add to cart
When user adding the searched product to the cart
@smoke
Scenario: payment process
When user performing payment process using net banking
@smoke @regression
Scenario: signout
When user performing logout from online shopping cart

 