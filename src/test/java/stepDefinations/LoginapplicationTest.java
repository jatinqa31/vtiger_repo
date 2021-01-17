package stepDefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobject.VTigerLogin;
import testBase.TestBase;
import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Connection.Base;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;


public class LoginapplicationTest extends TestBase{

	VTigerLogin vl;// = new VTigerLogin();
	VTigerLogin v2;
	public static int count=0;
	
	SoftAssert sa = new SoftAssert();
    public static Logger log =LogManager.getLogger(TestBase.class.getName());

    @Given("^User is on login screen of application$")
    public void user_is_on_login_screen_of_application() throws Throwable {
    	
    	if (count==0) {
        	launchBrowser();
        	log.info("I am logged in successfully");
        	count = count+1;    
        	}
    }

    @Given("^User is a non registered customer and navigate to application$")
    public void user_is_a_non_registered_customer_and_navigate_to_application() throws Throwable {
        VTigerLogin v2 = new VTigerLogin(driver);
        //v2.compare_dropdown();
    }

    @When("^User clicks on Login button$")
    public void user_clicks_on_login_button() throws Throwable {
        vl = new VTigerLogin(driver);
    	System.out.println("is null " +Objects.isNull(vl));
    	vl.Login_click();
    }
    
    @When("^User enters username \"([^\"]*)\" & password \"([^\"]*)\"$")
    public void user_enters_username_something_password_something(String strArg1, String strArg2) throws Throwable {
       vl = new VTigerLogin(driver);
       vl.username().sendKeys(strArg1);
       vl.password().sendKeys(strArg2);
       vl.Login_click();
    }
    
    @When("^User enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enter_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	vl = new VTigerLogin(driver);
    	vl.username().clear();
    	vl.password().clear();
    	vl.username().sendKeys(strArg1);
        vl.password().sendKeys(strArg2);        
        vl.Login_click();
    }

    @Then("^validation message shown to the user$")
    public void validation_message_shown_to_the_user() throws Throwable {
//    	VTigerLogin v2 = new VTigerLogin();
//    	v2.validationtext();
//    	//System.out.println("is null " +Objects.isNull(vl)); to check if object is refer to null causing nullpoint exception
//    	sa.assertEquals(v2.Validation_text2, "You must specify a valid username and password.");
//    	System.out.println("validation Text--- " + v2.Validation_text2);   
    }

    @Then("^User redirects to home page$")
    public void user_redirects_to_home_page() throws Throwable {
//    	sa.assertEquals(driver.getTitle(), "HOME");
//    	sa.assertAll();
//      System.out.println("Title " + driver.getTitle());
    }

    @And("^validate title of home page$")
    public void validate_title_of_home_page() throws Throwable {
//    	waitImplicit(5000000);
//    	//waitExplecit(driver,)
    	sa.assertEquals(driver.getTitle(), "vtiger CRM - Commercial Open Source CRMs");
    	
    	System.out.println("Title " + driver.getTitle());
    }

}