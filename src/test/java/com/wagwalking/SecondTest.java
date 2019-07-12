package com.wagwalking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SecondTest extends BaseTest {

    @Test
    public void testSecond() {
        WebElement walkFreeButon = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));
        walkFreeButon.click();

        List<WebElement> fieldsCollection = driver.findElements(By.cssSelector("input"));



        /*
        [0] = email
        [1] = password
        [2] = firstName
        [3] = lastName
        [4] = phoneNumber

       */
         fieldsCollection.get(0).sendKeys(user.getEmail());
         fieldsCollection.get(1).sendKeys(user.getPassward());
         fieldsCollection.get(2).sendKeys(user.getFirstName());
         fieldsCollection.get(3).sendKeys(user.getLastName());
         fieldsCollection.get(4).sendKeys(user.getCellPhone());



    }






}
