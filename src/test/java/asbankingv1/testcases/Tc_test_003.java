package asbankingv1.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import ashbankingv1.pageobject.addcustomerpage;
import ashbankingv1.pageobject.pageobject;

public class Tc_test_003 extends baseclass
{
	@Test
	public void addcustomer() throws IOException, InterruptedException
	{
		 addcustomerpage add=new addcustomerpage(driver);
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
	 
	  add.addnewcustomer();
	  add.addname("ashwini");
	  add.custgender();
	  add.custdob("12", "5","2022" );
	  add.custaddress("asddgfhghjhjtyreewr");
	  add.custcity("hyderabad");
	  add.custstate("telangana");
	  add.custpinno("500090");
	  add.custtelephoneno("9876543210");
	  add.custemailid("ashwinimatety@gmail.com");
	  add.custpassword("Bose@8210");
	  add.custsubmit();
	  log.info("submit button");
	  Thread.sleep(5000);
	 boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
	 System.out.println(res);
		
		if(res==true)
		{
			Assert.assertTrue(true);
			log.info("test case passed....");
			System.out.println("testcase passed");
			
		}
		else
		{
			log.info("test case failed....");
			capturescreenshot(driver);
			Assert.assertTrue(false);
		}
			
	  
	}

}
