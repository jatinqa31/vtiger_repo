package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;
//import testcases.Webelement;

public class VTiger_NewContact_click extends TestBase{

WebDriver driver;
	
	//Hided by me on 18-Apr-2020
	
	public VTiger_NewContact_click(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}//*/

	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement linktext; 

	@FindBy(xpath="//input[@name='firstname')]")
	WebElement firstname;
	
	@FindBy(xpath="//input[@type='text'][@name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement description;
	
	@FindBy(xpath="//input[@name='salutationtype')]")
	WebElement salutation;
	
	@FindBy(xpath="//input[@type='submit'][@name='button']")
	WebElement submit;
	
	@FindBy(xpath="//table[@class='leftFormBorder2']")
	WebElement table;
	
   public WebElement linktext()
   {
	  return linktext;
   } 
   
   public WebElement Salutation_type()
   {
	  return salutation;
   } 
   
   public WebElement firstname()
   {
	  return firstname;
   }
   
   public WebElement lastname()
   {
	  return lastname;
   } 
   
   public WebElement Description()
   {
	  return description;
   } 
   
   public WebElement Submit()
   {
	  return submit;
   } 
      
   public WebElement table_viewcontact()
   {
	  return table;
   }  

}