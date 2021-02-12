Feature: Update Personal Information
Scenario: Update FirstName in Account
Given User navigated "http://automationpractice.com/"
When User clicks on Signin
And User enters "amitbpatel1820@gmail.com" in username
And User enters "Test@1234" in password
And User clicks on Signin button
And User clicks on My Personal Information
And User changed first name as "Awesome QA"
And User enters Current password as "Test@1234"
And User enters new password as "Test@123"
And User confirms the new password as "Test@123"
And User clicks on Save
Then User personal information is updated successfully 

