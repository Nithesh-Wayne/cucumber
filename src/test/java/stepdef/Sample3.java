package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample3 {

	@Given("user open signup page")
	public void user_open_signup_page() {
	    
	    System.out.println("Open signup");
	}

	@When("user enters fn as {string}")
	public void user_enters_fn_as(String fn) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Firstname:"+fn);
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String ln) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Lastname:"+ln);
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("DOB:"+dob);
	}

	@When("user enters psd as {string}")
	public void user_enters_psd_as(String psd) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Password:"+psd);
	}

	@When("user enters cpsd as {string}")
	public void user_enters_cpsd_as(String cpsd) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Confirm Password:"+cpsd);
	}

	@Then("click signup button")
	public void click_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Signup clicked");
	}

	@Then("Verify signup success message")
	public void verify_signup_success_message() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Signup message");
	}
	
}
