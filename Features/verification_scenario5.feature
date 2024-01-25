Feature: Login functionality and adding items to the cart

Scenario: A user with valid credentils verifies Your Cart text,selected items in cart and should see Success message while logging in

Given user is on the login page of sauce demo website
When he enters userName "standard_user",password "secret_sauce" and clicks on the login button
And he will see list of products add the first and third products to the cart
And he removes the first product from the cart
And he clicks on the cart icon at the top right corner
And he verifies the text Your Cart which is diplayed at the top left corner of the page 
And he clicks on the continue shopping button
And he sorts the prices from high to low
And he adds the most expensive item to the cart
And he clicks on cart icon
And he verifies that there are two items in the cart
And he clicks on the checkout button
And he enters firtName in firstname TextBox
And he enters lastName in lastName TextBox
And he enters Postal Code in the Postal Code TextBox
And he clicks on the continue button
And he clicks on the finish button on the next page
Then he must see the success Message "Thank you for your order!" is dis played to the user
