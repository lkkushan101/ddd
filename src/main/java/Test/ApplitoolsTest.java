package Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.speech.AudioException;
import javax.speech.EngineException;
import javax.speech.EngineStateError;
import javax.speech.synthesis.Synthesizer;
import io.github.bonigarcia.wdm.WebDriverManager;
import ExtentReport.ExtentReport;
import PageFactory.*;
import ReadExcel.ExcelRead;
import Utility.BrowserStart;
import Utility.SpeachReporting;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import AppliTools.AppliToolsEyes;
public class ApplitoolsTest {
	
	

	  
	  @Test
	   public void testLogin() 
	   {
		  WebDriver driver;
		 
		   
		 

		  //  applEye.setAPIKey("Pv2XD8U104105r0o7ei925xRXZa8t8m109E8PzaIn3yKv23RA110");
		   
			System.setProperty("webdriver.chrome.driver","C:\\chromedrv\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("http://www.google.lk");
		    driver.close();
	   }
}
