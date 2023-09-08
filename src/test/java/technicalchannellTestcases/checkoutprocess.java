package technicalchannellTestcases;

import org.testng.annotations.Test;

import technicalchannellpages.cartAddRemoveItems;
import technicalchannellpages.checkoutpage;
import technicalchannellpages.loginpage;

public class checkoutprocess extends TestBase{
	loginpage loginobject ;
	cartAddRemoveItems addproductjobect;
	checkoutpage checkoutobject;
	String fristNM= "latifa" ;
	String lastNM= "farid";
	String Zipcode="03";
	
	@Test(priority = 1)
	public void loginintoSwag() throws InterruptedException {
		loginobject=new loginpage(driver);
		loginobject.login("standard_user","secret_sauce");
		Thread.sleep(1000);
		
	}
	@Test(priority = 2)

	public  void additemtocart() throws InterruptedException {
		addproductjobect =new cartAddRemoveItems(driver);
		addproductjobect.addProduct();
		addproductjobect.opencart();
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	public void checkout() throws InterruptedException {
		checkoutobject =new checkoutpage(driver);
		checkoutobject.checkoutprocess(fristNM, lastNM, Zipcode);
		Thread.sleep(1000);
	}
	

}
