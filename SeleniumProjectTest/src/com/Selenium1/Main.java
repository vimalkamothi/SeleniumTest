package com.Selenium1;

import com.sun.tools.jconsole.JConsoleContext;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormSubmit formsubmit = new FormSubmit();

        formsubmit.submitForm(driver);

       // The form was successfully submitted!

        // Complete the Form //

        //Synchronization//


        //Synchronization//


       // Thread.sleep(5000);
       // driver.quit();

        //Common Components//

        //File Upload//
        //WebElement fileupload = driver.findElement(By.id("file-upload-field"));
        //fileupload.sendKeys("Cake Order - 13102017.png");
        //File Upload//


        //Dropdown//
        /*
        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();
        WebElement dditem = driver.findElement(By.linkText("Datepicker"));
        dditem.click();
        */
        //Dropdown//

        //Datepicker//
        /*
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("11/25/2020");
        datepicker.sendKeys(Keys.RETURN);
        Thread.sleep(5000);
         */
        //Datepicker//

        //Radio Button//
        /*
        WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();
        Thread.sleep(5000);

        WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radiobutton2.click();
        Thread.sleep(5000);

        WebElement radiobutton3 = driver.findElement(By.cssSelector("input[value='option3']"));
        radiobutton3.click();
        Thread.sleep(5000);

         */
        //Radio Button//

        //Checkbox Button//
        /*
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        Thread.sleep(5000);

        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();
        Thread.sleep(5000);

        WebElement checkbox3 = driver.findElement(By.cssSelector("input[value='checkbox-3']"));
        checkbox3.click();
        Thread.sleep(5000);
        */
        //Checkbox Button//

        //Common Components//

        // CSS Selectors - Find by single CSS selector //

        // Find by ID//
            //WebElement name = driver.findElement(By.cssSelector("#name"));
            //name.sendKeys("This is test");
        // Find by ID//

        // Find by class//
            //WebElement name = driver.findElement(By.cssSelector(".form-control"));
            //name.sendKeys("This is test");
        // Find by class//

        // Find by tag name//
       // WebElement name = driver.findElement(By.cssSelector("input['name=webelementname']"));
       // name.sendKeys("This is test");
        // Find by tag name//

        // CSS Selectors - Find by single CSS selector //

        // CSS Selectors - Find by multiple CSS selector - to identify them uniquely //

        // Find by combinations - tag and class //
        //WebElement name = driver.findElement(By.cssSelector("input.form-control"));
        //name.sendKeys("This is test");
        // Find by combinations - tag and class //

        // Find by combinations - tag and id //
        //WebElement name = driver.findElement(By.cssSelector("input#name"));
        //name.sendKeys("This is test");
        // Find by combinations - tag and id //

        // Find by combinations - tag and attribute //
       // WebElement radio1 = driver.findElement(By.cssSelector("input[type='radio']"));
       // radio1.click();
        // Find by combinations - tag and attribute //

        // Find by combinations - tag and attribute //
        //WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
       // radio2.click();
        // Find by combinations - tag and attribute //

        // CSS Selectors - Find by multiple CSS selector - to identify them uniquely //

        // CSS Selectors - Find by Match Text //

        // Find by Match Text - Value - Exact match//
        //WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
        // radio2.click();
        // Find by Match Text - Value - Exact match//

        // Find by Match Text - Prefix //
        //WebElement autoComplete = driver.findElement(By.cssSelector("input[id^='auto']"));
        //autoComplete.sendKeys("Prefix Test");
        // Find by Match Text - Prefix //

        // Find by Match Text - Suffix //
        //WebElement autoComplete1 = driver.findElement(By.cssSelector("input[id^='auto']"));
        //autoComplete1.sendKeys("Suffix Test");
        // Find by Match Text - Suffix //

        // Find by Match Text - Substring //
        //WebElement autoComplete2 = driver.findElement(By.cssSelector("input[id*='com']"));
        //autoComplete2.sendKeys("Substring Test");
        // Find by Match Text - Substring //

        // Find Child Nodes//
        //WebElement firstname = driver.findElement(By.cssSelector("div.col-sm-4 input"));
        //firstname.sendKeys("Child found Test");
        // Find Child Nodes //

        // Find Child Nodes - List - using ID//
       // WebElement link = driver.findElement(By.cssSelector("#select-menu option:nth-child(4)"));
       // link.click();

        // Find Child Nodes - List - using Class//
        //WebElement link1 = driver.findElement(By.cssSelector(".form-control option:nth-child(4)"));
        //link1.click();
        // Find Child Nodes - List //


        // Drag and Drop operations //
        /*
        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();
        Thread.sleep(5000);
        driver.quit();
        */
        // Drag and Drop operations //

        // Executing JavaScript Commands//
        /*
        WebElement ModalButton = driver.findElement(By.id("modal-button"));
        ModalButton.click();
        Thread.sleep(5000);
        WebElement CloseButton = driver.findElement(By.id("close-button"));

       // CloseButton.click();

       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].click();", CloseButton);

       Thread.sleep(5000);

       driver.quit();
        */
        // Executing JavaScript Commands//



        // Open Alert//
        /*
        WebElement OpenAlertButton = driver.findElement(By.id("alert-button"));
        OpenAlertButton.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);
        driver.quit();
        */
        // Open Alert//

        // Switch to Window//
        /*
        WebElement NewTabButton = driver.findElement(By.id("new-tab-button"));
        NewTabButton.click();

        String OriginalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
            Thread.sleep(5000);
        }

        driver.switchTo().window(OriginalHandle);
        */
        // Switch to Window//


        // Keyboard and Mouse Input  //
        /*
        WebElement FullName = driver.findElement(By.id("name"));
        FullName.click();
        FullName.sendKeys("Selenium Test");

        WebElement Submit = driver.findElement(By.id("button"));
        Submit.click();
        */
        // Keyboard and Mouse Input  //



        // Auto-complete //
        /*
        WebElement AddressAutoComplete = driver.findElement(By.id("autocomplete"));
        AddressAutoComplete.sendKeys("155/B, Warje Malwadi Road, Kothrud, Pune, Maharashtra, India");
        Thread.sleep(1000);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement AddressAutoCompleteResult = driver.findElement(By.className("pac-item"));
        AddressAutoCompleteResult.click();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.quit();
        */
        // Auto-complete //

        // Scroll and Find Element//
        /*
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Name Test");

        WebElement date = driver.findElement((By.id("date")));
        date.sendKeys("09/01/2020");
        */
        // Scroll and Find Element//

        // driver.quit();

    }


}
