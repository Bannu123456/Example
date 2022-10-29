
package asbankingv1.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import ashbankingv1.utilities.readconfig;


public class baseclass
{
WebDriver driver;
readconfig rc =new readconfig();
	public String url =rc.getApplicationURL();
	public String uname =rc.getUsername();
	public String pwd =rc.getPassword();
	Logger log;
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String br)
	{
		  log =  Logger.getLogger("Tc_test_001");
		  PropertyConfigurator.configure("log4j.properties");
		  if(br.equals("chrome"))
		  {
		System.setProperty("webdriver.chrome.driver",rc.getChromePath());
	 driver =new ChromeDriver();
		  }
		  else if(br.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver",rc.getFirefoxPath());
				 driver =new FirefoxDriver(); 
		  }
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	void capturescreenshot(WebDriver driver) throws IOException
	{
		File fsrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fdes=new File("./screenshot/myscreenshot.jpg");
		FileUtils.copyFile(fsrc,fdes);
		System.out.println("captured the picture");
	}

}
