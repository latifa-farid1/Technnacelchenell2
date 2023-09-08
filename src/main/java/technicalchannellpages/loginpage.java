package technicalchannellpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	protected WebDriver driver;
	//create constructor
		public loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public static void clickbutton(WebElement button) {
			
		   button.click();
		}
		public static void SetTextvalue(WebElement textelement , String value ) {
			textelement.sendKeys(value);
			
		}
		
		@FindBy(id="user-name") 
		WebElement username;
		@FindBy(id="password") 
		WebElement passwordID;
		@FindBy(id="login-button") 
		WebElement loginbutton;
		
		public void login(String Nametext, String passwordtxt) {
			SetTextvalue(username,Nametext);
			SetTextvalue(passwordID,passwordtxt);
			clickbutton(loginbutton);

			
			
		}

}
