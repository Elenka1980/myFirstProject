package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.bCMkWd")
    private WebElement walkFreeButton;

    @FindBy(css = ".sc-ifAKCX.jlgKgQ")
    private WebElement becomeWalkerButton;

    public BecomeWalkerPage clickBecomeWalkerButton() {
        becomeWalkerButton.click();
        return new BecomeWalkerPage(driver);
    }


    public PromotionWalkFreePage clickWalkFreeButton() {
        walkFreeButton.click();
        return new PromotionWalkFreePage(driver);
    }

    public BecomeWalkerPage ClickBecomeWalkerButton() {
        becomeWalkerButton.click();
        return new BecomeWalkerPage(driver);
    }









}
