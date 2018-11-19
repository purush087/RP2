package com.regression.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StartingSteps extends BaseSteps{

    @Before
    public void setupDriver(){
        driver = new DriverFactory().getDriver();
    }

    @After
    public void destroyDriver(){
        driver.quit();
    }


    @Given("User is on Landing Page")
    public void navigateToUrl(){
        driver.get("http://www.cleartrip.com");
//        driver.manage().window().maximize();
    }
}