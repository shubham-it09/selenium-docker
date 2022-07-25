package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightConfirmationPage {


    private WebDriver driver;
    private WebDriverWait wait;

    public FlightConfirmationPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);


    }

    @FindBy(how = How.XPATH, using = "//font[text()='Flight Itinerary Page']")
    private WebElement Cnfirmationtext;

    public void confirmtext() throws InterruptedException {
        Thread.sleep(4000);
      this.wait.until(ExpectedConditions.visibilityOf(Cnfirmationtext));
      System.out.println("Your Flight has been confirmed");
    }
}
