package ContactPage;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobject.VTiger_Edit_Contact;
import testBase.TestBase;
public class EditContactTest extends TestBase{
	//public static Logger log = LogManager.getLogger(EditContactTest.class.getName());
	
	@Test
	public void ClickEdit_07()
	{
		System.out.println("driver == "+ driver.getCurrentUrl());
		VTiger_Edit_Contact ec = new VTiger_Edit_Contact(driver);
		ec.Editbutton().click();
		//System.out.println("Test_06");
		//log.info("Success");
		
	}
	
	@Test
	public void EditContact_08()
	{
		VTiger_Edit_Contact ec = new VTiger_Edit_Contact(driver);
		ec.lastname().clear();
		ec.lastname().sendKeys("Jatin Bakshi ji");
		//ec.Changebutton().click();
		ec.title().sendKeys("Mr");
		ec.department().sendKeys("IT");
		ec.email().sendKeys("jatinbakshi21@gmail.com");
		ec.calander().click();
		ec.maymonth().click();//may
		ec.mayday().click();//19may
		ec.Savebutton().click();
		
	}
	//@Test (priority=8)
	public void Click_on_Alphabet_08()
	{
		Set<String> ids = driver.getWindowHandles();   //return windows count & store it in Set data structure of java.
		Iterator<String> it = ids.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());//For switching to new child window
	        try {
				if(driver.switchTo().window(it.next()).findElement(By.xpath("//a[text()='Account1']")).isDisplayed()==true) {
					driver.switchTo().window(it.next()).findElement(By.xpath("//a[text()='Account1']")).click();
				}
				else {
					
//					log.error("Element[Link Account1] on new window Not Found");
//					softassert.assertEquals(false, false);
				}
				
	        }catch (Exception e){
	        	//log.error("Element:-Link Account1 on new window Not Found");
	        	driver.switchTo().defaultContent();
	        	driver.close();
	        }}
	
		//softassert.assertAll();
	}
		//@Test
		public void EditAccount09()
		{
			//log.debug(driver.getTitle());
			driver.switchTo().defaultContent();
			VTiger_Edit_Contact ec = new VTiger_Edit_Contact(driver);
			//ec.title().sendKeys("Mr");
			Actions ar = new Actions(driver);
			ar.moveToElement(ec.title()).sendKeys("Mr");
		}
		
		@Test
		public void Delete_Contact_09()
		{
			VTiger_Edit_Contact ec = new VTiger_Edit_Contact(driver);
			ec.deletebutton().click();
			driver.switchTo().alert().accept();
			//System.out.println("rama rama ");
			//log.debug(driver.getTitle());
		}
		
}
