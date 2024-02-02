package util;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Random;

public class GenericMethods
{
    WebDriver driver ;
//    Wait<WebDriver> wait= new WebDriverWait(driver, Duration.ofSeconds(2));
    public void clickElement(WebElement element)
    {
//        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void enterText(WebElement element, String text){
//        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public static int generateRandomInt(int max){
        Random random = new Random();
        return random.nextInt(max) + 1;
    }

    //create method to take screenshot while test case fail
    public static  void capturescreenshot(WebDriver driver, String screenshotname) {

        Path des = Paths.get("./Screenshots",screenshotname+".png");
        try {
            Files.createDirectories(des.getParent());
            FileOutputStream out = new FileOutputStream(des.toString());
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        } catch (Exception e) {
            System.out.println("Exception while take screenshot"+e.getMessage());
        }
    }

}
