package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Sample6 {
	
	WebDriver driver;

	@Given("user enter username and password")
	public void user_enter_username_and_password() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder (5)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/mercurysignon.php");
	    /*driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mercury");
	    driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("mercury");
	   */ 
	    PageObject loginpage=PageFactory.initElements(driver, PageObject.class);
	    /*loginpage.un.sendKeys("mercury");
	    loginpage.psd.sendKeys("mercury");*/
	    loginpage.login();
	    
	    System.out.println("1");
	}

	@Given("click Signin")
	public void click_Signin() {
	    //driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")).click();
	    PageObject loginpage=PageFactory.initElements(driver, PageObject.class);

	   // loginpage.ok.click();
	    loginpage.login();
		System.out.println("2");
	}

	

	@When("click Signoff")
	public void click_Signoff() {
		
	    driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
	    System.out.println("4");
	}
	
}
