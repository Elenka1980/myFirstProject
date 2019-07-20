package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".form-control")
    public List<WebElement> emailField;

    @FindBy(css = ".form-control")
    public List<WebElement> passwordField;

    @FindBy(css = ".btn")
    public WebElement loginButton;


    public void inputEmail(String email) {
        emailField.get(0).sendKeys(email);
    }
    public void inputPassword(String password) {
        passwordField.get(1).sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }












}
