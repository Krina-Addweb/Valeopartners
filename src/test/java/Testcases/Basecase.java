package Testcases;

import Constants.CommonVar;
import org.junit.Before;
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
        driver = new ChromeDriver();
        CommonVar constantVars = new CommonVar();
        final String ht_uname = "valeodev";
        final String ht_pass = "F0rD3v0nly!";
        final String url = "https://valeodev:F0rD3v0nly!@dev.reports.valeopartners.com/";
        driver.get(url);
        driver.manage().window().maximize();
    }
}