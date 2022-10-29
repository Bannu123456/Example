package ashbankingv1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobject 
{
	public WebDriver driver;
	@FindBy(name="uid")WebElement username;
    @FindBy(name="password")WebElement password;
    @FindBy(name="btnLogin")WebElement login;
    @FindBy(name="btnReset")WebElement reset;
    @FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")WebElement lnkLogout;
  

	

public pageobject(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void getusername(String uname)
{
username.sendKeys(uname);	
}
public void getpassword(String pwd)
{
	password.sendKeys(pwd);
	
}
public void clicklogin()
{
login.click();	
}
public void resetclick()
{
reset.clear();	
}
public void clickLogout()
{
	lnkLogout.click();
}

}
