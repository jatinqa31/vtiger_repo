package ContactPage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import pageobject.Passwordpage;
import pageobject.VTiger_NewContact_click;
import testBase.TestBase;

public class NewContactTest extends TestBase{
	
	private static Logger log = LogManager.getLogger(NewContactTest.class.getName());
	
	@Test
	public void Submit_Contact_05()
	{	
		//System.out.println("Hello Test04");
		//System.out.println("driver "+ driver.getCurrentUrl());
		VTiger_NewContact_click nc = new VTiger_NewContact_click(driver);
		
		nc.linktext().click();
	    nc.lastname().sendKeys("Bakshi");
	    nc.Description().sendKeys("hello jatin");
	    nc.Submit().click();
//	    driver.navigate().back();
	    //System.out.println("Test_04");
	   log.debug("Test_04-PASS");
	   
	}
	
	@Test
	public void View_Submitted_Contact_06()
	{	
		VTiger_NewContact_click nc2 = new VTiger_NewContact_click(driver);
	    nc2.table_viewcontact().findElements(By.tagName("a")).get(0).click();
	    
	}
}
