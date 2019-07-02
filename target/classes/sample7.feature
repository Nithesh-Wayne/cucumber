Feature: search multiple items

Scenario: Search for the products
When user searches for products
|iphone|
|travelkit|
|headphones|
And verify products displayed
Then close application