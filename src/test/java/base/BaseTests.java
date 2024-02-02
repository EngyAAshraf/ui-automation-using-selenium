package base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.RegisterationPage;
import util.GenericMethods;

public class BaseTests extends AbstractTestNGCucumberTests
{
    public static WebDriver driver;
    protected LoginPage loginPage;
    protected RegisterationPage registerationPage;

    @BeforeSuite
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browsername)
    {

        if (browsername.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
        }
        else if (browsername.equals("firefox"))
        {
            driver = new FirefoxDriver();

        }

        driver.manage().window().maximize();

        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    //selenium manager
////        ChromeOptions co = new ChromeOptions(); // selenium manager
////        co.addArguments("--remote-allow-origins=*");
////        driver = new ChromeDriver(co);
//    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
    @AfterMethod
    public void takescreenshot(ITestResult result)
    {

        if (result.getStatus() == ITestResult.FAILURE)
        {

            System.out.println("Failed!");
            System.out.println("TAKING Screenshot .....");
            GenericMethods.capturescreenshot(driver, result.getName());
        }

    }
    public static void main(String args[])
    {
        BaseTests test = new BaseTests();
        test.setUp("chrome");
    }
}

////    @AfterSuite
////    public void endSuite() throws Exception {
////        MyScreenRecorder.stopRecording();
////        extent.flush();
////    }
//}
