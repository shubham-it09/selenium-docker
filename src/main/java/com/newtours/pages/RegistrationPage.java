package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RegistrationPage(WebDriver driver)
    {
    this.driver = driver;
    this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);


    }
    public void goTo()
    {
        this.driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
    }

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement FirstnameTxt;


    @FindBy(how = How.NAME, using = "lastName")
    private WebElement LastNameText;

    @FindBy(how = How.NAME, using = "email")
    private WebElement UserNameText;


    @FindBy(how = How.NAME, using = "password")
    private WebElement PasswordText;

    @FindBy(how = How.NAME, using = "confirmPassword")
    private WebElement ConfirmPasswordText;



    @FindBy(how = How.NAME, using = "register")
    private WebElement SubmitButton;


    public void EnterUserDetails(String FirstName,String LastName) throws InterruptedException {
        Thread.sleep(1000);
        this.FirstnameTxt.sendKeys(FirstName);
        Thread.sleep(1000);
        this.LastNameText.sendKeys(LastName);
    }

    public void EnterUserCredentials(String Email,String Password) throws InterruptedException {
        Thread.sleep(1000);
        this.UserNameText.sendKeys(Email);
        Thread.sleep(1000);
        this.PasswordText.sendKeys(Password);

    }

    public void Submit() throws InterruptedException {
        Thread.sleep(1000);
        this.SubmitButton.click();
    }
}

