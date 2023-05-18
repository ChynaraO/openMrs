package com.codefishQa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrPage {
    public RegistrPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='username']")
    WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkBox;
    @FindBy(xpath = "//button[.='Register']")
    WebElement registrBtn2;
    @FindBy(xpath = "//div[@class='errorMessage alert alert-danger']")
    WebElement errorMess;
    public void registr(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        checkBox.click();
        registrBtn2.click();
    }
    public String currentUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }
    public String errorMes(){
        return errorMess.getText();
    }

}
