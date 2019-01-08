package Test;
import java.nio.file.Paths;

import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.comparator.OcularResult;
import com.testautomationguru.ocular.snapshot.Snap;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;


public class VisualTestingOcular {
	
	@Snap("snapshot.PNG")
	public class SearchGoogle {
		
		WebDriver driver;
		OcularResult result;

	@Test

		public void testSearch()
		{
		    //Configuring ocular
		 //Configuring ocular
			Ocular.config()
		    .resultPath(Paths.get(".\\Result\\"))
		    .snapshotPath(Paths.get(".\\Snapshot\\"))
		    .globalSimilarity(95)
		    .saveSnapshot(false);
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedrv\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("http://www.google.lk");
			
			result = compare();
			
		
			System.out.println("Is Images Equal "+result.isEqualsImages());
			System.out.println("Image Similarity " +result.getSimilarity());
			System.out.println("Pixal Equality "+result.getEqualPixels());
			
		
			driver.close();
			driver.quit();
		}


		public OcularResult compare() {
		    return Ocular.snapshot().from(this)     
		                 .sample().using(driver)   
		                 .compare();     
		}
	}

}





