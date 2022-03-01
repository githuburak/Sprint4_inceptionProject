package com.seamlessly.pages;


import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);}


    @FindBy(xpath="//*[@id='user']")
    public WebElement userName;

    @FindBy(xpath="//*[@id='password']")
    public WebElement password;

    @FindBy(xpath="//*[@id='submit-form']")
    public WebElement loginButton;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginButton.click();
    }


}
