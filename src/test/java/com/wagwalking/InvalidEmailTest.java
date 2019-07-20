package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;

public class InvalidEmailTest extends BaseTest{

    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;


    @Test
    public void testInvalidEmailField() throws InterruptedException {

        homePage = new HomePage(driver);
        promotionPage = homePage.clickWalkFreeButton();

        promotionPage.inputEmail("elenkagmail16.com");

        promotionPage.clickNextButtonField();

        Thread.sleep(3000);

        String emailNote = promotionPage.getExistEmailNote();
        System.out.println(emailNote);
        Assert.assertEquals("please provide a valid email", emailNote);





    }

}
