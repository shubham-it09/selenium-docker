package com.newtours.tests;

import com.newtours.pages.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BookFlightTest1 extends Basetests {

    //private WebDriver driver;
//
//    @BeforeTest
//    public void setUpDriver()
//    {
//        String Driver_Path = "Driver\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",Driver_Path);
//
//        this .driver = new ChromeDriver();
//
//    }

    @Test(priority=1)
    public void RegistrationPageTest() throws InterruptedException {
        RegistrationPage registrationpage = new RegistrationPage(driver);
        registrationpage.goTo();
        registrationpage.EnterUserDetails("Test Name", "Name");
        registrationpage.EnterUserCredentials("test@gmail.com", "test123");
        registrationpage.Submit();

    }
    @Test(priority=2)
    public void RegistrationConfrimationTest() throws InterruptedException
    {
        RegistrationConfrimationPage RegistrationConfrimationPage = new RegistrationConfrimationPage(driver);
        RegistrationConfrimationPage.GoToFlightDetailsPage();

    }
    @Test(priority=3)
    @Parameters({"noOfPass"})
    public void FlightDetailsTest(String noOfParam) throws InterruptedException {
        FlightDetailsPage FlightDetailsPage = new FlightDetailsPage(driver);
        FlightDetailsPage.Selectpassengers(noOfParam);
        FlightDetailsPage.GoTOFindFLightsPage();

    }
    @Test(priority=4)
    public void BookFLighttest() throws InterruptedException {
        BookFLight BookFLight = new BookFLight(driver);
        BookFLight.SelectFlight();
        BookFLight.reserveFlight();


    }
    @Test(priority=5)
    public void AddressDetailsPage() throws InterruptedException {
        AddressDetailsPage AddressDetailsPage = new AddressDetailsPage(driver);
        AddressDetailsPage.EnterAddress();
        AddressDetailsPage.reserveFlight();


    }

    @Test(priority=6)
    public void FlightConfirmationtest() throws InterruptedException {
        FlightConfirmationPage FlightConfirmationPage = new FlightConfirmationPage(driver);
        FlightConfirmationPage.confirmtext();

    }


}
