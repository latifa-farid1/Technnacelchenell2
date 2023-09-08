package technicalchannellTestcases;



	import org.testng.annotations.Test;

	import technicalchannellpages.loginpage;
	@Test
	public class logintestcase extends TestBase {
		loginpage loginobject;
		public void logintoSystem() {
			loginobject =new loginpage(driver);
			loginobject.login("standard_user","secret_sauce");
			
			
		}

	}


