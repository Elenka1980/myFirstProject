package com.wagwalking;
import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class VerificationTextFieldTest extends BaseTest {

    private static Logger log = Logger.getLogger(VerificationTextFieldTest.class.getName());

    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;

    @Test
    public void TestVerificationTextField(){

        homePage = new HomePage(driver);
        promotionPage = homePage.clickWalkFreeButton();

        promotionPage.inputEmail("lenusykk16@gmail.com");
        promotionPage.inputPassword("qazwsx123");
        promotionPage.inputFirstName("Ivan");
        promotionPage.inputLastName("Budco");
        promotionPage.inputCellPhone("9164909515");


        String emailField = promotionPage.getEmailField();
        log.info(emailField);
        Assert.assertEquals("lenusykk16@gmail.com", emailField);

        String passWordField = promotionPage.getPassWordField();
        System.out.println(passWordField);
        Assert.assertEquals("qazwsx123", passWordField);

        String firstNameField = promotionPage.getFirstNameField();
        System.out.println(firstNameField);
        Assert.assertEquals("Ivan", firstNameField);

        String lastNameField = promotionPage.getLastNameField();
        System.out.println(lastNameField);
        Assert.assertEquals("Budco", lastNameField);

        String cellPhoneField = promotionPage.getCellPhoneField();
        System.out.println(cellPhoneField);
        Assert.assertEquals("(916) 490-9515", cellPhoneField);
    }


}
