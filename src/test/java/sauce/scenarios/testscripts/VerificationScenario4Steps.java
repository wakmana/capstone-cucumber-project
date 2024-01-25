package sauce.scenarios.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerificationScenario4Steps extends Driver {
	
	@Given("user is on the login page of sauce demo")
	public void user_is_on_the_login_page_of_sauce_demo() {
	 
	}
	@When("he enters username {string} ,password {string} and then clicks on login button")
	public void he_enters_username_password_and_then_clicks_on_login_button(String string, String string2) {
	   loginPage4.enterUserName("standard_user");
	   loginPage4.enterPassword("secret_sauce");
	   loginPage4.clickLoginBtn();
	}
	@When("he sorts the items based on price from low to high")
	public void he_sorts_the_items_based_on_price_from_low_to_high() {
	   product4.clickSortBtn();
	}
	@When("he adds the first item to cart")
	public void he_adds_the_first_item_to_cart() {
		 product4.clickAddToCartBtn();
	   
	}
	@When("he verifies the same item which is selected on previous page has been added to cart")
	public void he_verifies_the_same_item_which_is_selected_on_previous_page_has_been_added_to_cart() {
		product4.clickCartIcon();
		WebElement selectedItem=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		Assert.assertTrue(selectedItem.isDisplayed());
	    
	}
	@When("he clicks the checkout button")
	public void he_clicks_the_checkout_button() {
		yourCart4.clickCheckOutBtn();
	}
	@When("he enters firstName in firstName textbox")
	public void he_enters_first_name_in_first_name_textbox() {
		personalInfo4.enterFirstNameTextBox("Barakat");
	}
	@When("he enters lastName in lastName textbox")
	public void he_enters_last_name_in_last_name_textbox() {
		personalInfo4.enterLastNameTextBox("Wakman");
		
	}
	@When("he enters Postal Code in Postal Code TextBox")
	public void he_enters_postal_code_in_postal_code_text_box() {
		personalInfo4.enterZipCode("44111");
	   
	}
	@When("he clicks continue button")
	public void he_clicks_continue_button() {
		personalInfo4.clickContinueBtn();
	}
	@When("he clicks finish button on the next page")
	public void he_clicks_finish_button_on_the_next_page() {
		checkOutOverView4.clickFinishBtn();
	}
	@Then("he must see a success mmessage {string} is dis played")
	public void he_must_see_a_success_mmessage_is_dis_played(String string) {
		
	   String expectedSuccessMsg="Thank you for your order!";
	   String actualSuccessMsg=successMessage4.getSuccessMsg();
	   Assert.assertEquals(actualSuccessMsg, expectedSuccessMsg);
	}

}
