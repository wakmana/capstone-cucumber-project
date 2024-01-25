package sauce.scenarios.testscripts;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyScenario1SuccessMessageSteps extends Driver{
	
	
	@Given("user is on the login Page")
	public void user_is_on_the_login_page() {
		
	}
	@When("he enters username {string}, password and click login button")
	public void he_enters_username_password_and_click_login_button(String string) {
		loginPage1.enterUserName("standard_user");
		loginPage1.enterPassword("secret_sauce");
		loginPage1.clickLoginBtn();
	   
	}
	@When("he see a list of products adds the first {int} products to the cart")
	public void he_see_a_list_of_products_adds_the_first_products_to_the_cart(Integer int1) {
	   product1.clickAddToCartBtn1();
	   product1.clickAddToCart2();
	}
	@When("he clicks on Cart icon at the Top right Corner")
	public void he_clicks_on_cart_icon_at_the_top_right_corner() {
		product1.clickCartIcon();
	   
	}
	@When("he clicks on chekout button")
	public void he_clicks_on_chekout_button() {
		yourCart1.clickCheckOutBtn();
	}
	@When("he enters firstname in the firstname textbox")
	public void he_enters_firstname_in_the_firstname_textbox() {
		personalInfo1.enterFirstName("Helal");
	}
	@When("he enters lastname in the lastname textbox")
	public void he_enters_lastname_in_the_lastname_textbox() {
		personalInfo1.enterLastname("Mohmand");
	}
	@When("he enters postal code in postal code textbox")
	public void he_enters_postal_code_in_postal_code_textbox() {
		personalInfo1.enterZipCode("44111");
	}
	@When("he clicks on continue button")
	public void he_clicks_on_continue_button() {
		personalInfo1.clickContinueBtn();
	}
	@When("he clicks on finish button")
	public void he_clicks_on_finish_button() {
		overView1.clickFinishBtn();
	}
	@Then("he must see success message {string}")
	public void he_must_see_success_message(String string) {
		String expectedSuccessMsg="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualSuccessMsg=verifySuccessMessage1.getSuccessMsg();
		Assert.assertEquals(actualSuccessMsg, expectedSuccessMsg);
	}
	
}