package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class EmailLoginTest extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void testEmailLogin() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        homePage.clickLoginButton();
        loginPage.inputEmail("lenusykk16@gmail.com");
        loginPage.inputPassword("qaz12345");
        loginPage.clickLoginButton();










    }
}
