package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookForgetPassword extends BaseClass{
      public FacebookForgetPassword() {
    	  PageFactory.initElements(d, this);
	}
      
      @FindAll({
    	  @FindBy(xpath="//a[text()='Forgotten password?']"),
    	  @FindBy(partialLinkText=" password?")
      })
      private WebElement clickForgot;
      
      @FindAll({
    	  @FindBy(xpath="(//input[@name='email'])[2]"),
    	  @FindBy(xpath="//input[@class='inputtext _9o1w']")
      })
      private WebElement forgotEmail;
      
      @FindAll({
    	  @FindBy(xpath="//div[@class='pam uiBoxRed']"),
    	  @FindBy(xpath="//div[text()='No search results']")
      })
      private WebElement getText;
      
      @FindAll({
    	  @FindBy(xpath="//button[text()='Search']"),
    	  @FindBy(xpath="//button[@type='submit']")
      })
      private WebElement search;

	public WebElement getClickForgot() {
		return clickForgot;
	}

	public WebElement getForgotEmail() {
		return forgotEmail;
	}

	public WebElement getGetText() {
		return getText;
	}

	public WebElement getSearch() {
		return search;
	}
      
      
}
