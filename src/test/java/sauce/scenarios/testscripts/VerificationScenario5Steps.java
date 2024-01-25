package sauce.scenarios.testscripts;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VerificationScenario5Steps extends Driver {
	
	
	@Given("user is on the login page of sauce demo website")
	public void user_is_on_the_login_page_of_sauce_demo_website() {
		
	}
	@When("he enters userName {string},password {string} and clicks on the login button")
	public void he_enters_user_name_password_and_clicks_on_the_login_button(String string, String string2) {
		loginPage5.enterUserName("standard_user");
		loginPage5.enterPassword("secret_sauce");
		loginPage5.clickLoginBtn();
	}
	@When("he will see list of products add the first and third products to the cart")
	public void he_will_see_list_of_products_add_the_first_and_third_products_to_the_cart() {
		product5.addToCartFirstItem();
		product5.addToCartThirdItem();
	}
	@When("he removes the first product from the cart")
	public void he_removes_the_first_product_from_the_cart() {
	    product5.removeFirstItemFromCart();
	}
	@When("he clicks on the cart icon at the top right corner")
	public void he_clicks_on_the_cart_icon_at_the_top_right_corner() {
		product5.clickCartIcon();
	    
	}
	@When("he verifies the text Your Cart which is diplayed at the top left corner of the page")
	public void he_verifies_the_text_your_cart_which_is_diplayed_at_the_top_left_corner_of_the_page() {
		String expectedText="Your Cart";
		String actualText=yourCart5.getTextYourCart();
		Assert.assertEquals(actualText, expectedText);
	}
	@When("he clicks on the continue shopping button")
	public void he_clicks_on_the_continue_shopping_button() {
		yourCart5.clickContinueShoppingBtn();
	   
	}
	@When("he sorts the prices from high to low")
	public void he_sorts_the_prices_from_high_to_low() {
		product5.clickSortBtn();
	}
	@When("he adds the most expensive item to the cart")
	public void he_adds_the_most_expensive_item_to_the_cart() {
		product5.addToCartExpensiveItem();
	}
	@When("he clicks on cart icon")
	public void he_clicks_on_cart_icon() {
		product5.clickCartIcon();
	}
	@When("he verifies that there are two items in the cart")
	public void he_verifies_that_there_are_two_items_in_the_cart() {
		int expectedItemCount=2;
		int actualItemCount=shopping5.getCartItemCount();
		Assert.assertEquals(actualItemCount, expectedItemCount);
	}
	@When("he clicks on the checkout button")
	public void he_clicks_on_the_checkout_button() {
		yourCart5.clickCheckOutbtn();
	   
	}
	@When("he enters firtName in firstname TextBox")
	public void he_enters_firt_name_in_firstname_text_box() {
		customerInfo5.enterFirstName("obaid");
	}
	@When("he enters lastName in lastName TextBox")
	public void he_enters_last_name_in_last_name_text_box() {
		customerInfo5.enterLastName("naimi");
	    
	}
	@When("he enters Postal Code in the Postal Code TextBox")
	public void he_enters_postal_code_in_the_postal_code_text_box() {
		customerInfo5.enterZipCode("44111");
	}
	@When("he clicks on the continue button")
	public void he_clicks_on_the_continue_button() {
		customerInfo5.clickContinueBtn();
	}
	@When("he clicks on the finish button on the next page")
	public void he_clicks_on_the_finish_button_on_the_next_page() {
		checkOutOverView5.clickFinishBtn();
	}
	@Then("he must see the success Message {string} is dis played to the user")
	public void he_must_see_the_success_message_is_dis_played_to_the_user(String string) {
		
	    String expectedSuccessMsg="Thank you for your order!";
	    String actualSuccessMsg=successMessage5.getSuccessMsg();
	    Assert.assertEquals(actualSuccessMsg, expectedSuccessMsg);
	}

}
