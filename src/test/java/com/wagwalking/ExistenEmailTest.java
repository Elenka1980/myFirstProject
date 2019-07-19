package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

public class ExistenEmailTest extends BaseTest{

    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;

    @Test
    public void testExistenEmailTest() throws InterruptedException {
        homePage = new HomePage(driver);
        promotionPage = homePage.clickWalkFreeButton();



        promotionPage.inputEmail("alex@gmail.com");
        promotionPage.inputPassword("qazwsx123L");
        promotionPage.inputFirstName("Elena");
        promotionPage.inputLastName("Shpak");
        promotionPage.inputCellPhone("9164909501");
        promotionPage.clickNextButtonField();
        Thread.sleep(5000);
        String existEmailNote = promotionPage.clickExistMailField();
        Assert.assertEquals("Email address already registered", existEmailNote);


    }


}
