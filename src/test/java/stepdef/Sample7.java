package stepdef;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample7 {
	
	@When("user searches for products")
	public void user_searches_for_products(io.cucumber.datatable.DataTable productstable) {
	   List<String> productsname = productstable.asList(); 
		for(String a: productsname)
		{
			System.out.println(a);
		}
		
	}

	@When("verify products displayed")
	public void verify_products_displayed() {
	   
	}

	@Then("close application")
	public void close_application() {
	   
	}
	
}
