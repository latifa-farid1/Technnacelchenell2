package technicalchannellpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartAddRemoveItems extends loginpage{

	public cartAddRemoveItems(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="add-to-cart-sauce-labs-backpack") 
	WebElement itemOfBackpace;
	@FindBy(id="remove-sauce-labs-backpack") 
	WebElement removeFromProductscreen;
	@FindBy(css=".shopping_cart_link") 
	WebElement CartIcon;
	@FindBy(id="remove-sauce-labs-backpack") 
	WebElement removefromcart;
	@FindBy(id="react-burger-menu-btn")
	WebElement Sidemenu;
	@FindBy(id="inventory_sidebar_link")
	WebElement AllItems;
	
	
	public void addProduct() throws InterruptedException {
		clickbutton(itemOfBackpace);
		Thread.sleep(1000);


	}
	public void removeProductfromPRoductscreen() {

		clickbutton(removeFromProductscreen);
	}

	public void RemovefromCart() throws InterruptedException {
		clickbutton(CartIcon);
		Thread.sleep(1000);
		clickbutton(removefromcart);
		Thread.sleep(1000);
		clickbutton(Sidemenu);
		Thread.sleep(1000);
		clickbutton(AllItems);
		


	}
	public void opencart() {
		clickbutton(CartIcon);
		
	}
}
