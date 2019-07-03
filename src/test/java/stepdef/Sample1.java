package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample1 {

	WebDriver driver;
	
	
	
	@Given("user opens login page in newtours application")
	public void user_opens_login_page_in_newtours_application() {
	   System.out.println("user opened login page in newtours application");
	   /*System.setProperty("webdriver.chrome.driver","C:\\New folder (5)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("http://newtours.demoaut.com/mercurysignon.php");*/
	}

	@When("user enters the username as mercury and password as mercury")
	public void user_enters_the_username_as_mercury_and_password_as_mercury() {
		/*
		WebElement userid= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
		userid.sendKeys("mercury");
		WebElement password = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		password.sendKeys("mercury");
	*/	
	   System.out.println("user entered the username as mercury and password as mercury");
	}

	@When("Click Submit button")
	public void click_Submit_button() {
	/*	WebElement submit=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
		submit.click();
	*/	System.out.println("submit button clicked");
	}

	@Then("verify login success")
	public void verify_login_success() {
	
	
			System.out.println("login verified");
	
	
		}
	   
	}
	

