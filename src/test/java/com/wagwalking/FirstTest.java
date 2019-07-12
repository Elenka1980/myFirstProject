package com.wagwalking;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends BaseTest{

    @Test
    public void testFirst() {


        WebElement walkFreeButon = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));
        walkFreeButon.click();

        WebElement emailFild = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailFild.sendKeys(user.getEmail());

        WebElement passwardFild = driver.findElement(By.cssSelector("input[type = \"password"));
        passwardFild.sendKeys(user.getPassward());

        WebElement firstNameFild = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
        firstNameFild.sendKeys(user.getFirstName());

        WebElement lastNameFild = driver.findElement(By.cssSelector("input[name = \"lastName"));
        lastNameFild.sendKeys(user.getLastName());

        WebElement cellPhoneFild = driver.findElement(By.cssSelector("input[type = \"tel"));
        cellPhoneFild.sendKeys(user.getCellPhone());

    }

}
