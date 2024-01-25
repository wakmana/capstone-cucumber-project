package sauce.scenarios.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import sauce.scenarios.pages.CheckOutOverViewScen4;
import sauce.scenarios.pages.CheckOutOverViewScen5;
import sauce.scenarios.pages.CustomerInfoScen5;
import sauce.scenarios.pages.ErrorMessageScen3;
import sauce.scenarios.pages.LoginPageScen1;
import sauce.scenarios.pages.LoginPageScen2;
import sauce.scenarios.pages.LoginPageScen3;
import sauce.scenarios.pages.LoginPageScen4;
import sauce.scenarios.pages.LoginPageScen5;
import sauce.scenarios.pages.OverViewScen1;
import sauce.scenarios.pages.PersonalInfoScen1;
import sauce.scenarios.pages.PersonalInfoScen3;
import sauce.scenarios.pages.PersonalInfoScen4;
import sauce.scenarios.pages.ProductsScen1;
import sauce.scenarios.pages.ProductsScen3;
import sauce.scenarios.pages.ProductsScen4;
import sauce.scenarios.pages.ProductsScen5;
import sauce.scenarios.pages.ShoppingCartScen5;
import sauce.scenarios.pages.SuccessMessageScen4;
import sauce.scenarios.pages.SuccessMessageScen5;
import sauce.scenarios.pages.VerifySuccessMessageScen1;
import sauce.scenarios.pages.YourCartScen1;
import sauce.scenarios.pages.YourCartScen3;
import sauce.scenarios.pages.YourCartScen4;
import sauce.scenarios.pages.YourCartScen5;


public class Driver extends Tools{
	
	protected static LoginPageScen1 loginPage1;
	protected static ProductsScen1 product1;
	protected static YourCartScen1 yourCart1;
	protected static PersonalInfoScen1 personalInfo1;
	protected static OverViewScen1 overView1;
	protected static VerifySuccessMessageScen1 verifySuccessMessage1;
	protected static LoginPageScen2 loginPage2;
	protected static LoginPageScen3 loginPage3;
	protected static ProductsScen3 product3;
	protected static YourCartScen3 yourCart3;
	protected static PersonalInfoScen3 personalInfo3;
	protected static ErrorMessageScen3 errorMessage3;
	protected static LoginPageScen4 loginPage4;
	protected static ProductsScen4 product4;
	protected static YourCartScen4 yourCart4;
	protected static PersonalInfoScen4 personalInfo4;
	protected static CheckOutOverViewScen4 checkOutOverView4;
	protected static SuccessMessageScen4 successMessage4;
	protected static LoginPageScen5 loginPage5;
	protected static ProductsScen5 product5;
	protected static YourCartScen5 yourCart5;
	protected static ShoppingCartScen5 shopping5;
	protected static CustomerInfoScen5 customerInfo5;
	protected static CheckOutOverViewScen5 checkOutOverView5;
	protected static SuccessMessageScen5 successMessage5;
	
	public static void init() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		loginPage1=new LoginPageScen1(driver);
		product1=new ProductsScen1(driver);
		yourCart1=new YourCartScen1(driver);
		personalInfo1=new PersonalInfoScen1(driver);
		overView1=new OverViewScen1(driver);
		verifySuccessMessage1=new VerifySuccessMessageScen1(driver);
		
		loginPage2=new LoginPageScen2(driver);
		
		loginPage3=new LoginPageScen3(driver);
		product3=new ProductsScen3(driver);
		yourCart3=new YourCartScen3(driver);
		personalInfo3=new PersonalInfoScen3(driver);
		errorMessage3=new ErrorMessageScen3(driver);
		
		loginPage4=new LoginPageScen4(driver);
		product4=new ProductsScen4(driver);
		yourCart4=new YourCartScen4(driver);
		personalInfo4=new PersonalInfoScen4(driver);
		checkOutOverView4=new CheckOutOverViewScen4(driver);
		successMessage4=new SuccessMessageScen4(driver);
		
		loginPage5=new LoginPageScen5(driver);
		product5=new ProductsScen5(driver);
		yourCart5=new YourCartScen5(driver);
		shopping5=new ShoppingCartScen5(driver);
		customerInfo5=new CustomerInfoScen5(driver);
		checkOutOverView5=new  CheckOutOverViewScen5(driver);
		successMessage5=new SuccessMessageScen5(driver);
		
		
	}
	

}
