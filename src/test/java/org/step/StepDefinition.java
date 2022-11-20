package org.step;

import org.locators.FacebookForgetPassword;
import org.locators.FacebookLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends FacebookLogin {
	
	
	@Given("user have to launch the facebook url by using chrome browser")
	public void user_have_to_launch_the_facebook_url_by_using_chrome_browser() {
		
		chromeBrowser();
		urlLaunch("https://www.facebook.com/");
		toMaximize();
		
	}

	@When("user enter valid username and Invalid password")
	public void user_enter_valid_username_and_Invalid_password() throws InterruptedException {
		
		FacebookLogin f = new FacebookLogin();
		sendKeys(f.getId(), "rammech97@gmail.com");
		sendKeys(f.getPass(), "Asdfg123h@");
		click(f.getClick());
		unconditionalWaits(5000);
		
	}

	@Then("user hava to receive the message as invalid password")
	public void user_hava_to_receive_the_message_as_invalid_password() {
		
	   if (getUrl().contains("privacy_mutation_token")) {
		   System.out.println("User entered invalid page");
		
	}
	}
	
	@When("user enter valid username and empty password")
	public void user_enter_valid_username_and_empty_password() throws InterruptedException {
		FacebookLogin f = new FacebookLogin();
		sendKeys(f.getId(), "rammech97@gmail.com");
		sendKeys(f.getPass(), "");
		click(f.getClick());
		unconditionalWaits(5000);
	}
	
	@Given("User have to enter facebook url using chrome Browser")
	public void user_have_to_enter_facebook_url_using_chrome_Browser() {
		chromeBrowser();
		urlLaunch("https://www.facebook.com/");
		toMaximize();
	}

	@When("User enters the incorrect email id {string}and forgot the password")
	public void user_enters_the_incorrect_email_id_and_forgot_the_password(String em) throws InterruptedException {
		FacebookForgetPassword f = new FacebookForgetPassword();
		
		click(f.getClickForgot());
		sendKeys(f.getForgotEmail(),em);
		click(f.getSearch());
		unconditionalWaits(5000);
	}

	@Then("user will be receive invalid email id")
	public void user_will_be_receive_invalid_email_id() {
		if (d.getCurrentUrl().contains("ctx=recover&ars")) {
			System.out.println("invalid page");
		}
	}



	@Then("user to close the Browser")
	public void user_to_close_the_Browser() {
		d.close();
	}
	
	


}
