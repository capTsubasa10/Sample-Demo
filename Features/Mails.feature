@Set1
Feature: validating features of the ABC web application.


Background:

Given Load the application 



@Smoke
Scenario: Mail Inputs based on valid password and valid username


When provide the valid inputs in username and password
And Click the ok button
Then User is able to use the mail

@Unit
Scenario: Mail Inputs based on invalid password and valid username


When provide the inputs in username and in valid password
And Click the ok button
Then User is able to use the mail

@Smoke
Scenario: Mail Inputs based on valid password and invalid username


When provide the inputs in invalid username and password
And Click the ok button
Then User is able to use the mail
  