package asbankingv1.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import ashbankingv1.pageobject.pageobject;


public class Tc_test_001 extends baseclass
{


  @Test
  public void login() throws IOException
  {
	  
	  log.info("browser opened");
	  driver.get(url);
	  log.info("object created");
	  pageobject obj =new pageobject(driver);
	  log.info("username is enetered");
	  obj.getusername(uname);
	  log.info("password is enetered");
	  obj.getpassword(pwd);
	  log.info("login button is clicked");
	  obj.clicklogin();
	  System.out.println(driver.getTitle());
	  if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	  {
		  log.info("test passed");
		  Assert.assertTrue(true);
		  
	  }
	  else
	  {
		  log.info("test failed");
		  Assert.assertTrue(false);
		  capturescreenshot(driver);
	  }
	  
  }
}
