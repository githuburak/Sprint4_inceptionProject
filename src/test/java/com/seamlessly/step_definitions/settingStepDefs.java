package com.seamlessly.step_definitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;

public class settingStepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("the user logged in")
    public void theUserLoggedIn() {
        String userName= ConfigurationReader.get("username");
        String passWord= ConfigurationReader.get("password");
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.login(userName,passWord);
    }
    
}
