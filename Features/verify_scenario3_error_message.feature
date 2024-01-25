Feature: Login functionality

Scenario: A user with credentials should see an error message while logging in and adding product to the cart

Given the user is on the login page 
When he enters username "problem_user" ,password "secret_sauce" and clicks on login button
And he will see a list of product.add the first product to the cart
And he clicks on cart icon at the top right corner
And he clicks checkout button
And he enters firstname in firstnameTextbox
And he enters lastname in the lastnametextbox
And he enters postal code in postal Code Textbox
And he clicks at the continue button
Then he must see an error message "Error: Last Name is required" is displyed
