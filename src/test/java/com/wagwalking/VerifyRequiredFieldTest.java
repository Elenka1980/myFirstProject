package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

public class VerifyRequiredFieldTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;

    @Test
    public void testVerifyRequiredFilds() {

        homePage = new HomePage(driver);
        promotionPage = homePage.clickWalkFreeButton();
        promotionPage.clickEmailField();
        promotionPage.clickPasswordField();
        String emailNote = promotionPage.getReuiredEmailNote();
        System.out.println(emailNote);
        Assert.assertEquals("requred", emailNote);


    }

}
