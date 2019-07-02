package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Sample4 {

WebDriver driver;
	
@Given("application displays welcome message")
public void application_displays_welcome_message() {
    
System.out.println("Welcome");


}

@Given("users un and psd")
public void users_un_and_psd() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\New folder (5)\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
    System.out.println("Username and password");
    WebElement userid= driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	userid.sendKeys("Lalitha");
	WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	password.sendKeys("password123");
}

@Given("click signin")
public void click_signin() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Signin");
    WebElement submit=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
	submit.click();
}

@When("user searches for Carpet")
public void user_searches_for_Carpet() {
    // Write code here that turns the phrase above into concrete actions
	WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
	search.click();
	search.sendKeys("Carpet");
	WebElement finddetails=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
	finddetails.click();
    System.out.println("Search Carpet");
}

@When("user adding the searched product to the cart")
public void user_adding_the_searched_product_to_the_cart() {
    // Write code here that turns the phrase above into concrete actions
	WebElement addtocart = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
    addtocart.click();
    WebElement cart=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
    cart.click();
	System.out.println("Add to cart");
}

@When("user performing payment process using net banking")
public void user_performing_payment_process_using_net_banking() {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement check=driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a"));
	check.click();
	WebElement newadd=driver.findElement(By.xpath("//*[@id='choice-dollar']"));
	newadd.click();
	WebElement add=driver.findElement(By.xpath("//*[@id='add2']"));
	add.sendKeys("Kanyakumari");
	WebElement pay=driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input"));
	pay.click();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	WebElement bank=driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label/i"));
	bank.click();
	WebElement cont=driver.findElement(By.xpath("//*[@id='btn']"));
	cont.click();
	WebElement tname=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input[1]"));
	tname.sendKeys("123456");
	WebElement tpass=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input[2]"));
	tpass.sendKeys("Pass@456");
	WebElement next=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input"));
	next.click();
	WebElement trans=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input"));
	trans.sendKeys("Trans@456");
	WebElement button1=driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input"));
	button1.click();
	//WebElement finall=driver.findElement(By.xpath("/html/body/b/section/div/div/div/div[2]/p"));		 
	//String confirm=finall.getText();
    System.out.println("Net Banking");
}

@When("user performing logout from online shopping cart")
public void user_performing_logout_from_online_shopping_cart() {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement logout=driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]"));
	logout.click();
    System.out.println("Logout");
}

	
}
