package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class VTigerCalander extends TestBase{

	//TestBase tb = new TestBase();
	//WebDriver driver;
	
	public VTigerCalander(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
  
  @FindBy(xpath="//td[@class='moduleTitle']")
  WebElement Calander_text;
  
  public String xpath="//td[@class='moduleTitle']";
  
  @FindBy(xpath="//a[@href='index.php?module=Calendar&action=index']")
  WebElement Calendar_link;
  
  @FindBy(xpath="//input[@src='themes/blue/images/week.gif']")
  WebElement week_view;  
  
  @FindBy(xpath="//input[@value='  Day  ']")
  WebElement day_view;
  
  @FindBy(xpath="//input[@src='themes/blue/images/month.gif']")
  WebElement month_view; 
  
  @FindBy(xpath="//td[@class='calhead']")
  WebElement week_text;
  
  @FindBy(xpath="//td[@class='calhead']")
  WebElement day_text;
  
  @FindBy(xpath="//td[@class='calhead']")
  WebElement month_text;
  
  @FindBy(xpath="//a[text()='05:00']")
  WebElement time_slot;
  
  @FindBy(xpath="//input[@name='activitytype']")
  WebElement call_button;
  
  @FindBy(xpath="//span[contains(text(),'Subject:')]")
  WebElement popup_text; 

  @FindBy(xpath="//input[@name='subject']")
  WebElement subject_textbox;
  
  @FindBy(xpath="//input[@value=' Save ']")
  WebElement save_button;
  
  public String Get_Calendar_text()
  {
  	return Calander_text.getText();
  }

  public void Calander_click()
  {
	  Calendar_link.click();
  }

  public void Week_click()
  {
	  week_view.click();
  }

  public void day_click()
  {
	  day_view.click();
  }
  
  public void month_click()
  {
	  month_view.click();
  }
  
  public String Week_text()
  {
	  return week_text.getText();
  }
  
  public String day_text()
  {
	  return day_text.getText();
  }
  
  public String month_text()
  {
	  return month_text.getText();
  }
  
  public void time_slot_click()
  {
	  time_slot.click();
  }

  public void call_button_click()
  {
	  call_button.click();
  }

  public String popup_text()
  {
	  return popup_text.getText();
  }
  
  public WebElement subject_textbox()
  {
	  return subject_textbox;
  } 
  
  public void save_click()
  {
	  save_button.click();
  }  
}