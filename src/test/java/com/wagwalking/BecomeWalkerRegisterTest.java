package com.wagwalking;

import com.wagwalking.page.BasePage;
import com.wagwalking.page.BecomeWalkerPage;
import com.wagwalking.page.HomePage;
import org.junit.Test;

import java.util.Random;

public class BecomeWalkerRegisterTest extends BaseTest {

     private  HomePage homePage;
     private BecomeWalkerPage becomeWalkerPage;

    @Test
    public void testBecomeWalkerRegister() throws InterruptedException {

        homePage = new HomePage(driver);
        becomeWalkerPage = homePage.clickBecomeWalkerButton();
        becomeWalkerPage.inputFirstName("Alex");
        becomeWalkerPage.inputLastName("Alex");
        becomeWalkerPage.inputEmail("alex@gmail.com");
        becomeWalkerPage.inputPhone("9999999999");
        becomeWalkerPage.inputStreet("123");
        Thread.sleep(3000);

        Random random = new Random();
        int randomNumber = random.nextInt(4);
        becomeWalkerPage.selectAddress(randomNumber);
        becomeWalkerPage.inputApt("777");
        becomeWalkerPage.clickApplyNowButton();








    }
}
