package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Test;

public class WalkFreeTest extends BaseTest{

    private HomePage homePage;
    private PromotionWalkFreePage promotionWalkFreePage;

    @Test
    public void testWalkFree() {

        homePage = new HomePage(driver);
        promotionWalkFreePage = homePage.clickWalkFreeButton();
        promotionWalkFreePage.inputEmail(user.getEmail());
        promotionWalkFreePage.inputPassword(user.getPassward());
        promotionWalkFreePage.inputFirstName(user.getFirstName());
        promotionWalkFreePage.inputTel(user.getCellPhone());

    }




}
