Feature: TestLogin

Scenario: signin
Given users un and psd
And click signin

Scenario: search for product 
When user searches for Carpet

Scenario: add to cart
When user adding the searched product to the cart

Scenario: payment process
When user performing payment process using net banking

Scenario: signout
When user performing logout from online shopping cart