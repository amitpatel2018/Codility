
Feature: Order Tshirt Functionality
Scenario: Order Tshirt
Given User navigated to "http://automationpractice.com/"
When User clicks on T-SHIRTS
And User selects Faded Short Sleeve T-shirts
And User clicks on Continue Shopping
And User clicks on Cart
Then User can see Faded Short Sleeve T-shirts added into cart
