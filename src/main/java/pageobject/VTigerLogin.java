package pageobject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.TestBase;

public class VTigerLogin extends TestBase{

	public static void main(String args) {
		List<String> Al= new ArrayList<String>();
		Al.add("Jatin");
		Al.add("batin");
		Al.add("catin");
		Al.add("datin");
		int i=0;
	for(i=0;i<=3;i++) 
	{
		System.out.println("Array List "+Al.get(i));
	}
	
	}
	
	
	WebDriver driver;
	
	public static String Validation_text;  
	public static String Validation_text2;  
	//Hided by me on 18-Apr-2020
	
	public VTigerLogin(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public VTigerLogin() 
	{// this consructor is used to access above public static 
	 //	variable from other class by making object of this class.	
	    this.Validation_text2 = this.Validation_text.substring(0, 48);
	}	

	@FindBy(xpath="//input[@name='user_name']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='submit'][@name='Login']")
	WebElement Loginbutton;
	
	@FindBy(xpath="//td[contains(text(),'You must specify')]")
	WebElement validationtext;
	
	@FindBy(xpath="//input[@name='user_password']")
	WebElement password;
 
	@FindBy(xpath="//select[@name='login_theme']")
	WebElement theme;
	
   public WebElement username()
   {
	   return username;	   
   }
        
   public WebElement password()
   {
	   return password;
   }
   
   public void Login_click()
   {
	   Loginbutton.click();
   } 

   public void compare_dropdown()
   {
	   
	   List expectedtheme = new ArrayList();
	   expectedtheme.add("Aqua");
	   expectedtheme.add("blue");
	   expectedtheme.add("nature");
	   expectedtheme.add("orange");
	   Select sl = new Select(theme);
	   System.out.println("GetOptions "+sl.getOptions());
	   
	   List actualtheme = new ArrayList();
	   
	   for(WebElement at: sl.getOptions()) {
		   actualtheme.add(at.getText());
	   }
	   int i;
	   for (i=0;i<=actualtheme.size();i++)
	   {
		   System.out.println("Boolean "+actualtheme.get(i).equals(expectedtheme.get(i)));
	   }
	   Map<Integer, String> hm= new HashMap<Integer, String>();
	   hm.put(1,"dog");
	   hm.put(2,"ant");
	   hm.put(3,"statuart");
	   hm.put(4,"elephent");
	   for(i=1;i<=hm.size();i++) {
		   System.out.println(hm.get(i));
	   }
   }
   
   public WebElement validationtext() 
   {
	   this.Validation_text=validationtext.getText();
	   return validationtext;
   } 
}