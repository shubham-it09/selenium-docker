package com.newtours.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Basetests {
    protected WebDriver driver;


    @BeforeTest
    public void setUpDriver() throws MalformedURLException {
//        String Driver_Path = "Driver\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",Driver_Path);
//
//        this .driver = new ChromeDriver();

        String host = "localhost";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        options.addArguments("--proxy-pac-url= http://ProxyPacURL.com");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        DesiredCapabilities dc = DesiredCapabilities.chrome();
        dc.setCapability(ChromeOptions.CAPABILITY, options);
        if(System.getProperty("BROWSER") !=null
        && System.getProperty("BROWSER").equalsIgnoreCase("firefox"))
        {
            dc =DesiredCapabilities.firefox();
        }

        if(System.getProperty("HUB_HOST") != null)
        {
            host=System.getProperty("HUB_HOST");
        }

        String completeURL="http://"+host+":4444/wd/hub";
        this.driver = new RemoteWebDriver(new URL(completeURL),dc);

    }
@AfterTest
    public void quirDriver()
{
    this.driver.quit();
}
}
