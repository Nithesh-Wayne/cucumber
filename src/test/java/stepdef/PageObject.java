package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

	static WebDriver driver;
	/*public PageObject(WebDriver driver) {
		PageFactory.initElements(driver,this.driver);
	}*/
	
	@FindBy(name="userName") 
	public static WebElement un;
	@FindBy(name="password") 
	public static WebElement psd;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input") 
	public static WebElement ok;
	
	public void login()
	{
		un.sendKeys("mercury");
		psd.sendKeys("mercury");
		ok.click();
	}
}