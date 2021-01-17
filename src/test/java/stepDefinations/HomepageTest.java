package stepDefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageobject.VTigerCalander;
import testBase.TestBase;
import java.util.Map;
import org.junit.runner.RunWith;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

@RunWith(Cucumber.class)
public class HomepageTest extends TestBase {
	SoftAssert sa = new SoftAssert();
	VTigerCalander Vtc; 
	public int count;
	
	maps map1 = new maps();
	
    @Given("^User is on Home screen of application$")
    public void user_is_on_home_screen_of_application() throws Throwable {
    	driver.getTitle();
    }

    @When("^User clicks on Calendar button$")
    public void user_clicks_on_calendar_button() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
        Vtc.Calander_click();
    }

    @Then("^Calander page opens on screen$")
    public void calander_page_opens_on_screen() throws Throwable {
        
    }
	
    @Given("^User is on calander screen of application$")
    public void user_is_on_calander_screen_of_application() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
        
    	sa.assertEquals(Vtc.Get_Calendar_text(), "Calendar: Appointment");
        System.out.println("textt " + Vtc.Get_Calendar_text());
    }

    @When("^User clicks on Week view button$")
    public void user_clicks_on_week_view_button() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	Vtc.Week_click();
    }

    @When("^User clicks on day view button$")
    public void user_clicks_on_day_view_button() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	Vtc.day_click();  	
    }

    @When("^User clicks on Month view button$")
    public void user_clicks_on_month_view_button() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	Vtc.month_click();          
    }

    @Then("^Week View opens on page$")
    public void week_view_opens_on_page() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	sa.assertEquals(Vtc.Week_text(), "Week of October 26 to November 01 2020 ");
    	
    }

    @Then("^Day View opens on page$")
    public void day_view_opens_on_page() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	sa.assertEquals(Vtc.day_text(), " Thursday, 29. October 2020  ");
    }

    @Then("^Month View opens on page$")
    public void month_view_opens_on_page() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	sa.assertEquals(Vtc.month_text(), "October 2020");        
    	//sa.assertAll();     
    }

    @Given("^User is on day view of calander screen$")
    public void user_is_on_month_view_of_calander_screen() throws Throwable {
    	System.out.println("Count = "+count);
    	if(count==0)
    	{
        	System.out.println("Count = "+count);
    		VTigerCalander Vtc = new VTigerCalander(driver);
        	Vtc.day_click(); 
        	count=count+1;
    	}
    }

    @When("^User clicks on time slot$")
    public void user_clicks_on_time_slot() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	waitImplicit(5000);
    	//System.out.println("wait for 5 secs");
    	Vtc.time_slot_click();
    }

    @Then("^popup to add call or meeting is open$")
    public void popup_to_add_call_or_meeting_is_open() throws Throwable {
        
    }

    @Then("^users enters (.+)$")
    public void users_enters(String text) throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	Vtc.subject_textbox().sendKeys(text);
    }


    @And("^user clicks on call option button$")
    public void user_clicks_on_call_option_button() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	Vtc.call_button_click();        
    }
    
    @And("^user clicks on save button$")
    public void user_clicks_on_save_button() throws Throwable {
    	VTigerCalander Vtc = new VTigerCalander(driver);
    	Vtc.save_click();
    	driver.navigate().back();
    }
    @And("^Read Test data from \"([^\"]*)\"$")
    public void read_test_data_from_something(String strArg1) throws Throwable {
    	System.out.println("Test DATA " + map1.getTestDataInMap(System.getProperty("user.dir") + "/Testdata/Login_credentials.xlsx", "Sheet1", strArg1));
    	Map<String,String> mapp = map1.getTestDataInMap(System.getProperty("user.dir") + "/Testdata/Login_credentials.xlsx", "Sheet1", strArg1);
    	System.out.println("valueeeee " + mapp.get("password"));
    }
    
}