package com.seamlessly.step_definitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Map;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();



    @Given("the user login with valid credentials")
    public void theUserLoginWithValidCredentials() {
        String userName= ConfigurationReader.get("username");
        String passWord= ConfigurationReader.get("password");
        Driver.get().get(ConfigurationReader.get("url"));
       loginPage.login(userName,passWord);

    }
}