package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample2 {

	@Given("open newtours app")
	public void open_newtours_app() {
	 System.out.println("Opened new tours");
	}

	@When("user enters un as {string} and password pwd as {string}")
	public void user_enters_un_as_and_password_pwd_as(String un, String psd) {
	 System.out.println("Username is"+un+"Password is"+psd);
	}

	@When("submit login form")
	public void submit_login_form() {
	 System.out.println("The submit button is clicked");
	}

	@Then("verify pass")
	public void verify_pass() {
		System.out.println("Verified pass");
	 
	}
	@Then("verify fail")
	public void verify_fail() {
	    System.out.println("Failed pass");
}
}