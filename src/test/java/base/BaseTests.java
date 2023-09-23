package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.RegisterationPage;

public class BaseTests
{
    public static WebDriver driver;
    protected LoginPage loginPage;
    protected RegisterationPage registerationPage;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
//        ChromeOptions co = new ChromeOptions(); // selenium manager
//        co.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(co);
//        driver.navigate().to("https://testing-v3.roboost.app/dispatch/dashboard");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        registerationPage = new RegisterationPage(driver);
    }

    //    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }

    public static void main(String args[])
    {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
