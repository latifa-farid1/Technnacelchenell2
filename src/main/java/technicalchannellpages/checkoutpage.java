package technicalchannellpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutpage extends loginpage
{

	public checkoutpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="checkout") 
	WebElement checkoutbuton;
	@FindBy(id="first-name") 
	WebElement firstnamefield;
	@FindBy(id="last-name") 
	WebElement lastnamefeild;
	@FindBy(id="postal-code") 
	WebElement ZipCode;
	@FindBy(id="continue")
	WebElement continuebutton;
	@FindBy(id="finish")
	WebElement finshbutton;
	@FindBy(id="back-to-products")
	WebElement BackHomebutton;
	
	public void checkoutprocess(String fristNM,String lastNM,String Zipcode) throws InterruptedException {
		clickbutton(checkoutbuton);
		clickbutton(firstnamefield);
		SetTextvalue(firstnamefield,fristNM);
		clickbutton(lastnamefeild);
		SetTextvalue(lastnamefeild, lastNM);
		clickbutton(ZipCode);
		SetTextvalue(ZipCode, Zipcode);
		Thread.sleep(1000);
		clickbutton(continuebutton);
		Thread.sleep(1000);
		clickbutton(finshbutton);
		Thread.sleep(1000);
		clickbutton(BackHomebutton);
		
	}
}


