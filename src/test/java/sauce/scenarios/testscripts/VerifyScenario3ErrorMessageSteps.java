package sauce.scenarios.testscripts;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyScenario3ErrorMessageSteps extends Driver {
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		
	}
	@When("he enters username {string} ,password {string} and clicks on login button")
	public void he_enters_username_password_and_clicks_on_login_button(String string, String string2) {
	    loginPage3.enterUserName("problem_user");
	    loginPage3.enterPassword("secret_sauce");
	    loginPage3.clickLoginBtn();
	}
	@When("he will see a list of product.add the first product to the cart")
	public void he_will_see_a_list_of_product_add_the_first_product_to_the_cart() {
	   product3.clickAddToCart();
			   
	}
	@When("he clicks on cart icon at the top right corner")
	public void he_clicks_on_cart_icon_at_the_top_right_corner() {
		 product3.clickCartIconButn();
	    
	}
	@When("he clicks checkout button")
	public void he_clicks_checkout_button() {
		yourCart3.clickCheckOutBtn();
	}
	@When("he enters firstname in firstnameTextbox")
	public void he_enters_firstname_in_firstname_textbox() {
	   personalInfo3.enterFirstName("Salim");
	}
	@When("he enters lastname in the lastnametextbox")
	public void he_enters_lastname_in_the_lastnametextbox() {
		personalInfo3.enterLastname("Barak");
	   
	}
	@When("he enters postal code in postal Code Textbox")
	public void he_enters_postal_code_in_postal_code_textbox() {
		personalInfo3.enterZipCode("44111");
	  
	}
	@When("he clicks at the continue button")
	public void he_clicks_at_the_continue_button() {
		personalInfo3.clickContinueBtn();
	   
	}
	@Then("he must see an error message {string} is displyed")
	public void he_must_see_an_error_message_is_displyed(String string) {
	  String expectedErrorMsg="Error: Last Name is required";
	  String actualErrorMsg=errorMessage3.getErrMsg();
	  Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}

	

}