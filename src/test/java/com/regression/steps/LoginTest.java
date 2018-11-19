package com.regression.steps;

import com.regression.PageObjects.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginTest extends BaseSteps{

    @When("User Chooses to SignIn")
    public void userChoosesToSignIn(){
        new LoginPage(driver).clickOnSignInButton();
    }

    @Then("User should see an error")
    public void showError(){
        String error = new LoginPage(driver).loginFlow();
        Assert.assertTrue(error.contains("There were errors in your submission"));
    }
}
