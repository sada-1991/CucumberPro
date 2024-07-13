Feature: Registration functionality

Scenario: User Creates an account only with mandatory fields
Given User  navigates to Register Account page
When User enters below fields
|firstName   |Sadashiva               |
|lastName    |K                       |    
|email       |sadashivaphd19@gmail.com|
|telephone   |1234567890              |
|password    |12345                   |  
And User selects privacy policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User Creates an account only with all fields
Given User  navigates to Register Account page
When User enters below fields
|firstName   |Sadashiva               |
|lastName    |K                       |    
|email       |sadashivaphd19@gmail.com|
|telephone   |1234567890              |
|password    |12345                   | 
And User selects Yes for Newsletter 
And User selects Privacy policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User Creates a duplicate account 
Given User  navigates to Register Account page
When User enters below fields
|firstName   |Sadashiva               |
|lastName    |K                       |    
|email       |sadashivaphd19@gmail.com|
|telephone   |1234567890              |
|password    |12345                   | 
And User selects Yes for Newsletter 
And User selects Privacy policy
And User clicks on Continue button
Then User should get a proper warning about duplicate email

Scenario: User creates an account without filling any details
Given User  navigates to Register Account page
When User dont enter any details inti fields
And User clicks on Continue button
Then User should get a proper warning messages for every mandatory fields
