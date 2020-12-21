package Testcases;

import Constants.CommonVar;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import Reports.ReportClass;

public class Basecase extends ReportClass {

    public static WebDriver driver;

    @BeforeTest
    public void initialize() {
        System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("--disable-extensions"); // disdemoabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox");
        //driver =new ChromeDriver();
        CommonVar constantVars = new CommonVar();
        final String url = "https://valeodev:F0rD3v0nly!@dev.reports.valeopartners.com/";
        driver.get(url);
        System.out.println("Title of the page is -> " + driver.getTitle());
        // driver.manage().window().maximize();
    }
}