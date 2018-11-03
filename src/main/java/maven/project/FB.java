package maven.project;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FB extends MainClass {

	static WebDriver driver;
	LoginPage login;
	NextPage next;
	
	@Before
	public void setup() throws Exception {
	driver=getDriver("chrome");
	}
	
	@Test
	public void verifylogin() throws Exception {
	getUrl("https://www.facebook.com/");
		
		login= new LoginPage(driver);
		next= new NextPage(driver);
	}
	
}
