package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookFLight {

    private WebDriver driver;
    private WebDriverWait wait;

    public BookFLight(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);


    }

    @FindBy(how = How.XPATH, using = "//input[@value='First Class']")
    private WebElement selectFlight;




    @FindBy(how = How.NAME, using = "reserveFlights")
    private WebElement ReserveFlight;

    public void SelectFlight() throws InterruptedException {

        Thread.sleep(2000);
        selectFlight.click();

    }

    public void reserveFlight() throws InterruptedException {

        Thread.sleep(2000);
        ReserveFlight.click();

    }


}
