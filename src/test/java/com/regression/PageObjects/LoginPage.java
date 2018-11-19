package com.regression.PageObjects;

import com.regression.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;
    private String error,
            frameId = "modal_window";

    @FindBy(id = "userAccountLink")
    private WebElement linkText;

    @FindBy(id = "SignIn")
    private WebElement signIn;

    @FindBy(id = "signInButton")
    private WebElement signInButton;

    @FindBy(id = "errors1")
    private WebElement errors1;

    @FindBy(id="close")
    private WebElement closeBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnSignInButton() {
        new WaitFor().waitForElementToBeClickable(linkText,driver);
        linkText.click();
        signIn.click();
    }

    public String loginFlow(){
        driver.switchTo().frame(frameId);
        new WaitFor().waitForElementToBeClickable(signInButton,driver);
        signInButton.click();
        error = errors1.getText();
        driver.switchTo().defaultContent();
        closeBtn.click();
        return error;
    }
}