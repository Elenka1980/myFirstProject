package com.wagwalking;

import com.wagwalking.page.BasePage;
import com.wagwalking.page.BecomeWalkerPage;
import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BecomeWalkerRequiredFieldTest extends BaseTest {

    private HomePage  homePage;
    private BecomeWalkerPage becomeWalkerPage;

    @Test
    public void testBecomeWalkerRequiredFields() throws InterruptedException {

        homePage =  new HomePage(driver);
        becomeWalkerPage = homePage.ClickBecomeWalkerButton();
        becomeWalkerPage.clickApplyNowButton();



        String firstName = becomeWalkerPage.getRequiredFirstName();
        System.out.println(firstName);
        Assert.assertEquals("First name cannot be blank", firstName);

        String lastName = becomeWalkerPage.getRequiredLaststName();
        System.out.println(lastName);
        Assert.assertEquals("Last name cannot be blank", lastName);

        String email = becomeWalkerPage.getRequiredEmail();
        System.out.println(email);
        Assert.assertEquals("Enter a valid email address", email);

        String phoneNumber = becomeWalkerPage.getRequiredPhoneNumber();
        System.out.println(phoneNumber);
        Assert.assertEquals("Enter a valid phone number", phoneNumber);



    }

}
