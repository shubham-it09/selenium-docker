package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationConfrimationPage {


    private WebDriver driver;
    private WebDriverWait wait;

    public RegistrationConfrimationPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);


    }
    @FindBy(partialLinkText = "sign-in")
    private WebElement signin;

    @FindBy(partialLinkText = "Flights")
    private WebElement FlightsLink;

    public void GoToFlightDetailsPage() throws InterruptedException {
        Thread.sleep(2000);
        FlightsLink.click();
    }


}
