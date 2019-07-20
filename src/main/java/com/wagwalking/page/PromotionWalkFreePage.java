package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PromotionWalkFreePage extends BasePage{

    public PromotionWalkFreePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=\"email\"]")
    WebElement emailField;

    @FindBy(css = "input[type = \"password")
    WebElement passwordField;

    @FindBy(css = "input[name=\"firstName")
     WebElement firstNameField;

    @FindBy(css = "input[name = \"lastName")
     WebElement lastNameField;

    @FindBy(css = "input[type = \"tel")
    WebElement cellPhoneField;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement existEmailNote;

    @FindBy(css = ".sc-htoDjs.hdXrdX")
    private WebElement nextButtonField;

    @FindBy(css = "sc-bdVaJa sc-iwsKbI kOShw")
    private WebElement emailNoteField;



    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement>requiredFields;

    /*
    [0] - email required
    [1] - firs
    [2] - last
    [3] - phone
     */


    @FindBy(css = ".sc-gzVnrw.fzplxK")
    private List<WebElement>verifyPassward;

    /*
    [0] - 8 characters
    [1] - 1 Letter
    [2] - 1 Number

  */


    public void inputNextButton(String nextButton) {

        nextButtonField.sendKeys(nextButton);
    }

    public void inputExistEmail(String existEmail) {

        existEmailNote.sendKeys(existEmail);
    }

    public void inputEmail(String email) {

        emailField.sendKeys(email);
    }

    public  void inputPassword(String password) {

        passwordField.sendKeys(password);
    }

    public  void inputFirstName(String firstName) {

        firstNameField.sendKeys(firstName);
    }

    public  void inputLastName(String lastName) {

        lastNameField.sendKeys(lastName);
    }
    public  void inputCellPhone(String cellPhone) {

        cellPhoneField.sendKeys(cellPhone);
    }
    public void inputEmailNote(String emailNote) {

        emailNoteField.sendKeys(emailNote);
    }



    public void clickNextButtonField() {
        nextButtonField.click();
    }

    public String clickExistMailField() {
        existEmailNote.click();
        return existEmailNote.getText();

    }

    public void clickEmailField() {
        emailField.click();
    }

    public void clickPasswordField() {
        passwordField.click();

    }
    public void clickLastName() {
        lastNameField.click();
    }
    public void clickFirstName() {
        firstNameField.click();
    }

    public void clickCellPhone() {
        cellPhoneField.click();

    }

    public String getExistEmailNote()
    {return existEmailNote.getText(); }

    public String getExistEmailField()
    {return getExistEmailField(); }


    public String getRequiredEmail() {

        return requiredFields.get(0).getText();
    }
    public String getRequiredFirstName() {

        return requiredFields.get(1).getText();
    }
    public String getRequiredLastName() {
        return requiredFields.get(2).getText();
    }
    public String getRequiredCellPhone() {
        return requiredFields.get(3).getText();
    }


    public String getPasswordField8Characters() {
        return verifyPassward.get(0).getText();
    }
    public String getPasswordField1Letter() {
        return verifyPassward.get(1).getText();
    }
    public String getPasswordField1Number() {
        return verifyPassward.get(2).getText();
    }




















}










