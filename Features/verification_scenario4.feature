Feature: Login functionality and add to cart items

Scenario: A user with valid credentials verifies cart items and should see success message while logging in

Given user is on the login page of sauce demo
When he enters username "standard_user" ,password "secret_sauce" and then clicks on login button
And he sorts the items based on price from low to high
And he adds the first item to cart
And he verifies the same item which is selected on previous page has been added to cart
And he clicks the checkout button
And he enters firstName in firstName textbox
And he enters lastName in lastName textbox
And he enters Postal Code in Postal Code TextBox
And he clicks continue button
And he clicks finish button on the next page
Then he must see a success mmessage "Thank you for your order!" is dis played
