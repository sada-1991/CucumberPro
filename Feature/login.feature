Feature: Login functionality

Scenario: Login with valid crenditials
Given User  navigates to login page
When User has enterd Valid email address "sadashivaphd19@gmail.com" into the email field
And User has enter valid passworg "12345" into password field
And User clicks on Login button 
Then User should get successfully logged in

Scenario: Login with invalid credentials
Given User  navigates to login page
When User enters invalid email address "sadashiva123@gmail.com"into email field
And User enters invalid password "1234567890" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with valid email and invalid password
Given User  navigates to login page
When User has enterd Valid email address "sadashivaphd19@gmail.com" into the email field
And User enters invalid password "1234567890" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with invalid email and valid password
Given User  navigates to login page
When User enters invalid email address "sadashiva123@gmail.com"into email field
And User has enter valid passworg "12345" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login without providing any credentials
Given User  navigates to login page
When User dont enter any email address  into the email field
And User dont enter password into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch
