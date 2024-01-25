package sauce.scenarios.testscripts;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyScenario2ErrorMessageSteps extends Driver{
	
	
@Given("user is on the login page")
public void user_is_on_the_login_page(){
	
}

@When("he enters userName {string} in the username textbox")
public void he_enters_user_name_in_the_username_textbox(String string) {
	
	    loginPage2.enterUserName("locked_out_user");
}

@When("he enters password {string} in the password textbox")
public void he_enters_password_in_the_password_textbox(String string) {
	
	loginPage2.enterPassword("secret_sauce");
}

@When("he clicks login button")
public void he_clicks_login_button() {
	
   loginPage2.clickLoginBtn();
}

@Then("he must see an error Message {string}")
public void he_must_see_an_error_message(String string) {
	
	String expectedErrMsg="Epic sadface: Sorry, this user has been locked out.";
	String actualErrMsg=loginPage2.getErrorMessage();
	Assert.assertEquals(actualErrMsg,expectedErrMsg);
}


}
