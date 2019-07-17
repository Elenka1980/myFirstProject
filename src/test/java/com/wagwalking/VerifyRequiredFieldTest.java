package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

public class VerifyRequiredFieldTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;

    @Test
    public void testVerifyRequiredFields() {

        homePage = new HomePage(driver);
        promotionPage = homePage.clickWalkFreeButton();

        promotionPage.clickEmailField();
        promotionPage.clickPasswordField();
        promotionPage.clickFirstName();
        promotionPage.clickLastName();
        promotionPage.clickCellPhone();
        promotionPage.clickPasswordField();
        promotionPage.getPasswordField8Characters();
        promotionPage.getPasswordField1Letter();
        promotionPage.getPasswordField1Number();


        String emailNote = promotionPage.getRequiredEmail();
        System.out.println(emailNote);
        Assert.assertEquals("required", emailNote);

        String firstNameNote = promotionPage.getRequiredFirstName();
        System.out.println(firstNameNote);
        Assert.assertEquals("required", firstNameNote);

        String lastNameNote = promotionPage.getRequiredLastName();
        System.out.println(lastNameNote);
        Assert.assertEquals("required", lastNameNote);

        String cellPhoneNote = promotionPage.getRequiredCellPhone();
        System.out.println(cellPhoneNote);
        Assert.assertEquals("required", cellPhoneNote);

        String characters = promotionPage.getPasswordField8Characters();
        System.out.println(characters);
        Assert.assertEquals("(8 Characters,", characters);

        String letters = promotionPage.getPasswordField1Letter();
        System.out.println(letters);
        Assert.assertEquals("1 Letter,", letters);

        String numbers = promotionPage.getPasswordField1Number();
        System.out.println(numbers);
        Assert.assertEquals("1 Number)", numbers);
    }

}
