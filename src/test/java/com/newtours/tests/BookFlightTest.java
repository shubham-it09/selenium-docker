package com.newtours.tests;

import com.newtours.pages.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BookFlightTest extends Basetests {

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
