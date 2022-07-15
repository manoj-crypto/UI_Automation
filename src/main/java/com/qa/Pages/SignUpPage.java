package com.qa.Pages;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends baseTest {

        @FindBy(xpath = "//a[text()='Sign up']")
        WebElement signUpButton;
        @FindBy(xpath = "//input[@id='sign-username']")
        WebElement UserNameDetails;
        @FindBy(xpath = "//input[@id='sign-password']")
        WebElement PasswordDetails;

/**
 * Initialising the page objects
  */
public void  pageObjects(){
    PageFactory.initElements(driver,this);
}
/**
 * Actions
 */
public String validatePageTitle(){
    String title=driver.getTitle();
    System.out.println(title);
    return title;
}


}
