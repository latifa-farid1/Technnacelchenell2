package technicalchannellTestcases;
import org.testng.annotations.Test;
import technicalchannellpages.cartAddRemoveItems;
import technicalchannellpages.loginpage;

public class AddandRemoveTestcase extends TestBase{
	loginpage loginobject;
	cartAddRemoveItems cartobject;

	@Test(priority = 1)
	public void loginintoSwag() throws InterruptedException {
		loginobject=new loginpage(driver);
		loginobject.login("standard_user","secret_sauce");
		Thread.sleep(1000);
	}
	@Test(priority = 2)

	public  void additemtocart() throws InterruptedException {
		cartobject =new cartAddRemoveItems(driver);
		cartobject.addProduct();
		Thread.sleep(1000);
	}

	@Test(priority = 3)
	public void RemovefromCart() throws InterruptedException {
		cartobject =new cartAddRemoveItems(driver);
		cartobject.RemovefromCart();
	}
	@Test(priority = 4)
	public void additemtocart2() throws InterruptedException {
		cartobject =new cartAddRemoveItems(driver);
		cartobject.addProduct();
		Thread.sleep(1000);
		}
	
	@Test(priority = 5)
	public void RemoveFromProduct() throws InterruptedException {
		Thread.sleep(1000);
		cartobject =new cartAddRemoveItems(driver);
		cartobject.removeProductfromPRoductscreen();
	}

}
