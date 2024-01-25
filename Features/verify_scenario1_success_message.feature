Feature: Login fanctionality

Scenario: A user with valid credentials shuold see a success message while adding two products and logging in

Given user is on the login Page
When he enters username "‘standard_user", password and click login button
And he see a list of products adds the first 2 products to the cart
And he clicks on Cart icon at the Top right Corner
And he clicks on chekout button
And he enters firstname in the firstname textbox
And he enters lastname in the lastname textbox
And he enters postal code in postal code textbox
And he clicks on continue button
And he clicks on finish button
Then he must see success message "‘Your order has been dispatched, and will arrive just as fast as the pony can get there!"

