
@Set2
Feature: Validating Google search feature 

@Unit
Scenario: Validating the search option using summer update

Given Launch the google chrome browser
And load the google url
When provide summer update in google search text box and press ENTER
And take screenshot of the result page
Then verify the results 
 

