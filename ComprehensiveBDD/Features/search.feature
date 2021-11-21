Feature: Search Action

Scenario: BigSmall search tab Validation

Given User lands on Home Page
When user enter a product name "cricket" and click on search 
Then user selects Sachin tendulkar label pin product
Then The searched product should be displayed on the result page
