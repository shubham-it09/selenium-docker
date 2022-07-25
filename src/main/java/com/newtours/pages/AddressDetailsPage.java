package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressDetailsPage {


    private WebDriver driver;
    private WebDriverWait wait;

    public AddressDetailsPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);


    }

    @FindBy(how = How.XPATH, using = "//input[@name='q53_address[addr_line1]']")
    private WebElement Address;




    @FindBy(how = How.NAME, using = "buyFlights")
    private WebElement Continue;

    public void EnterAddress() throws InterruptedException {

        Thread.sleep(2000);
        Address.sendKeys("demo address");

    }

    public void reserveFlight() throws InterruptedException {

        Thread.sleep(2000);
        Continue.click();

    }

    }
