package technicalchannellTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	
	@BeforeSuite
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELKRNK2020\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     driver =new ChromeDriver();
	     driver.manage().window().maximize();
	    driver.navigate().to("https://www.saucedemo.com");
	}
	
public void logoutsystem() {
	driver.quit();
}

}
