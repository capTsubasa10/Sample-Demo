
@Set1
Feature: Google search 


@Regression
Scenario: google Search using Laptop as search text 

Given Open the browser 
And Load the google.in url 
When Pass the input as laptop inside the search text box and press enter
And take the screenshot 
Then display the results and verify 


