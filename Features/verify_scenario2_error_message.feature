Feature: Login functionality

Scenario: A user with invalid credentials should see an error Message while logging in
Given user is on the login page
When he enters userName "locked_out_user" in the username textbox
And he enters password "secret_sauce" in the password textbox
And he clicks login button
Then he must see an error Message "Epic sadface: Sorry, this user has been locked out."
