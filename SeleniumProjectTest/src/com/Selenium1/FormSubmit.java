package com.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormSubmit {

    public static void submitForm(WebDriver driver)
    {
        // Complete the Form //
        WebElement fname = driver.findElement(By.id("first-name"));
        fname.sendKeys("Test FirstName");

        WebElement lname = driver.findElement(By.id("last-name"));
        lname.sendKeys("Test LastName");

        WebElement jtitle = driver.findElement(By.id("job-title"));
        jtitle.sendKeys("Test JobTitle");

        WebElement edu = driver.findElement(By.id("radio-button-2"));
        edu.click();

        WebElement sex = driver.findElement(By.id("checkbox-1"));
        sex.click();

        WebElement link1 = driver.findElement(By.cssSelector("#select-menu option:nth-child(4)"));
        link1.click();

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("11/25/2020");
        datepicker.sendKeys(Keys.RETURN);
        //Thread.sleep(5000);

        WebElement submit = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submit.click();

    }

}
