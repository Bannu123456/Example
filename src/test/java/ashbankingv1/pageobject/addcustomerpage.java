package ashbankingv1.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcustomerpage
{
	WebDriver driver;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")WebElement newcustomer;
	@FindBy(name="name")WebElement name;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")WebElement gender;
	@FindBy(name="dob")WebElement dob;
	@FindBy(name="addr")WebElement address;
	@FindBy(name="city")WebElement city;
	@FindBy(name="state")WebElement state;
	@FindBy(name="pinno")WebElement pinnumber;
	@FindBy(name="telephoneno")WebElement mobilenumber;
	@FindBy(name="emailid")WebElement emailid;
	@FindBy(name="password")WebElement password;
	@FindBy(name="btnSubmit")WebElement submit;
	
	public addcustomerpage(WebDriver driver) 
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	public void addnewcustomer()
	{
		newcustomer.click();
	}
	public void addname(String cname) 
	{
		name.sendKeys(cname);
	}
	public void custgender() {
		gender.click();
		}

	public void custdob(String mm,String dd,String yy) {
	dob.sendKeys(mm);
	dob.sendKeys(dd);
	dob.sendKeys(yy);
		
	}

	public void custaddress(String caddress) {
		address.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		city.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		state.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		pinnumber.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		mobilenumber.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		emailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		password.sendKeys(cpassword);
	}

	public void custsubmit() {
		submit.click();
	}

}
