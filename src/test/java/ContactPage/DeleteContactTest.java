package ContactPage;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.synth.SynthStyleFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.Delete_Contact;
import pageobject.VTigerLogin;
//import pageobject.Delete_Contact;
import pageobject.VTiger_Edit_Contact;
import testBase.TestBase;

public class DeleteContactTest extends TestBase{
	public static Logger log = LogManager.getLogger(EditContactTest.class.getName());

	SoftAssert assert1 = new SoftAssert();
	
	@Test
	public void CheckContact_10()
	{
		Delete_Contact dc = new Delete_Contact(driver);
		dc.table().findElements(By.tagName("input")).get(1).click();
		VTigerLogin vt = new VTigerLogin();
		// this instance/object of class is created to access static variable of vtiger login
		System.out.println("Validation Text of Login  = "+vt.Validation_text.substring(0, vt.Validation_text.indexOf(".")));
	}
	
	@Test
	public void Delete_Single_Contact_11()
	{
		Delete_Contact dc = new Delete_Contact(driver);
		dc.deletebutton().click();
		
	}
	@Test
	public void CheckAllContact_12()
	{
		Delete_Contact dc = new Delete_Contact(driver);
		dc.table().findElements(By.tagName("input")).get(0).click();
		log.info("CheckAllContact_12-PASS");
	
	}
	
	@Test
	public void Delete_Allpage_Contact_13()
	{
		Delete_Contact dc = new Delete_Contact(driver);
		dc.deletebutton().click();
		
	}
	@Test
	public void Click_Edit_Contact_Link_14()
	{
		Delete_Contact dc = new Delete_Contact(driver);
		//dc.table().findElements(By.tagName("editlink")).get(0).click();
		
		dc.editlink().click();
		driver.navigate().back();//code to navigate back to previous page
	}		

//	@Test
//	public void Click_Delete_Contact_Link_15()
//	{
//		Delete_Contact dc = new Delete_Contact(driver);
//		String recordcount1=dc.pagecount().getText();
//		String Str1=recordcount1.substring(recordcount1.indexOf("f")+2, recordcount1.length());
//		dc.deletelink().click();
//		driver.switchTo().alert().accept();//to accept alertbox
//		System.out.println("Page Count "+dc.pagecount().getText());
//		String recordcount2=dc.pagecount().getText();
//		String Str2=recordcount2.substring(recordcount2.indexOf("f")+2, recordcount2.length());
//		int i=Integer.parseInt(Str1);  
//		int j=Integer.parseInt(Str2);
//		System.out.println("i = "+i);
//		System.out.println("j = "+j);
//		if(i>j) {
//			System.out.println("Diff = "+(i-j));
//		}
//	}
	
		//@Test
		public void Check_Text_16()
		{
			//try {
			Delete_Contact dc = new Delete_Contact(driver);
			String recordcount1=dc.pagecount().getText();
			String Str1=recordcount1.substring(recordcount1.indexOf("f")+2, recordcount1.length());
			
			
			
//			assert1.assertEquals(recordcount1, "showings");
//			assert1.assertAll();
//			}
//			catch(Exception e){
//				System.out.println(e.getMessage());
//				log.error("Error = "+e.getMessage());
//			}
	}		
//		@Test
//		public void Check_Text2_17()
//		{
//			try {
//			Delete_Contact dc = new Delete_Contact(driver);
//			//String recordcount1=dc.pagecount().getText();
//			String Str1=recordcount1.substring(recordcount1.indexOf("f")+2, recordcount1.length());
//			
//			assert1.assertEquals(recordcount1, "showings");
//			assert1.assertAll();
//			}
//			catch(Exception e){
//				System.out.println(e.getMessage());
//				log.error("Error = "+e.getMessage());
//			}
//	}		
		@Test
		public void Click_contact_link_18() {
			Delete_Contact dc = new Delete_Contact(driver);
			dc.contactLink();
		}
		
		
}
