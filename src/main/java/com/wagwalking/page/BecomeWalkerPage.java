package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BecomeWalkerPage extends BasePage{

    public BecomeWalkerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#first_name")
    private WebElement firstNameField;

    @FindBy(css = "#last_name")
    private WebElement lastNameField;

    @FindBy(css = "#email")
    private WebElement emailField;

    @FindBy(css = "#phone")
    private WebElement phoneField;

    @FindBy(css = "#address__line-one")
    private WebElement streetField;

    @FindBy(css = ".autocomplete-result")
    private List<WebElement>dropDownAddress;

    @FindBy(css = "#address_line_2")
    private WebElement aptField;

    @FindBy(css = ".form-utils-input")
    private List<WebElement>requiredFields;

   /*
    [0]-first
    [1]-last
    [2]-email
    [3]-phone
    [4]-address
    [5]-apt
    */

    @FindBy(css = ".button-text")
    private WebElement applyNowButton;

    @FindBy(css = ".error-message-container")
    private List<WebElement>errorFields;

    /*
    [0] - first
    [1] - last
    [2] - email
    [3] - phone number
     */

    public void clickApplyNowButton() {
        applyNowButton.click();
    }
    public String getRequiredFirstName () {
        return errorFields.get(0).getText();
    }
    public String getRequiredLaststName () {
        return errorFields.get(1).getText();
    }
    public String getRequiredEmail () {
        return errorFields.get(2).getText();
    }
    public String getRequiredPhoneNumber () {
        return errorFields.get(3).getText();
    }
    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }
    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }
    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }
    public void inputPhone(String phone) {
        phoneField.sendKeys(phone);
    }
    public void inputStreet(String street) {
         streetField.sendKeys(street);
    }
    public void selectAddress(int i) {
      dropDownAddress.get(i).click();
    }
    public void inputApt(String apt) {
        aptField.sendKeys(apt);

    }





}
