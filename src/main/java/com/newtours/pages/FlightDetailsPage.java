package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightDetailsPage {


    private WebDriver driver;
    private WebDriverWait wait;

    public FlightDetailsPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);


    }

    @FindBy(how = How.NAME, using = "passCount")
    private WebElement PassengersText;

    @FindBy(how = How.NAME, using = "findFlights")
    private WebElement SubmitButton;

    public void Selectpassengers(String NumberOfPassangers) throws InterruptedException {
        Thread.sleep(2000);
        Select select = new Select(PassengersText);

        select.selectByValue(NumberOfPassangers);
        System.out.println("This is for one passenger");
        if(NumberOfPassangers=="1")
        {
            System.out.println("This is for one passenger");
        }

        if(NumberOfPassangers=="2")
        {
            System.out.println("This is for two passenger");
        }
        if(NumberOfPassangers=="3")
        {
            System.out.println("This is for three passenger");
        }
        if(NumberOfPassangers=="4")
        {
            System.out.println("This is for four passenger");
        }


    }
    public void GoTOFindFLightsPage() throws InterruptedException {
        Thread.sleep(2000);
        SubmitButton.click();

    }
}
