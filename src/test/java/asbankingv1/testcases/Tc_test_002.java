package asbankingv1.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ashbankingv1.pageobject.pageobject;
import ashbankingv1.utilities.xutils;

public class Tc_test_002 extends baseclass
{
  @Test(dataProvider="logindata")
  public void loginDDt(String uname,String pwd) throws InterruptedException 
  {
	  driver.get(url);
	  pageobject obj =new pageobject(driver);
	  log.info("set username");
	  obj.getusername(uname);
	  log.info("set password");
	  obj.getpassword(pwd);
	  log.info("click the button");
	  obj.clicklogin();
	  if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			log.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			log.info("Login passed");
			obj.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}
		
  }
  private boolean isAlertPresent()
  {
	  try
	  {
		  driver.switchTo().alert();
		  return true;
	  }
	  catch(Exception e)
	  {
		  
	    return false;
     }
	  
  }
@DataProvider(name="logindata")
  String[][] getdata() throws IOException
  {
	String path ="C:\\Users\\Rajesh\\Desktop\\eclipse -wrokspace\\ashbankingv1\\src\\test\\java\\ashbankingv1\\testdata\\LoginData.xlsx" ;
	xutils xu =new xutils();
	int rows =xu.getRowCount(path,"sheet1");
	int cols= xu.getCellCount(path,"sheet1",1);
	String [][]a =new String[rows][cols];
	for(int i=1;i<=rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			a[i-1][j]=xu.getCellData(path,"sheet1", i, j);//0 1
		}
	}return a;
	

	}
	
  }

