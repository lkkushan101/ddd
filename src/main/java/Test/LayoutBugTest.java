package Test;
import java.util.Collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.*;

public class LayoutBugTest {

	@Test 
	public void test()
	{
		    WebDriver driver;
			System.setProperty("webdriver.chrome.driver","C:\\chromedrv\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/insurance/v1/index.php");
			FindLayoutBugs flb = new FindLayoutBugs();
			flb.findLayoutIssues(driver);	        
		    driver.close();
	}

}
