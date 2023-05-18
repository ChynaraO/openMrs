package com.codefishQa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public void HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='searchfield']")
    WebElement searchButton;
    @FindBy(xpath = "//div[@class='btn-group']//button[@type='button']")
    List<WebElement>categories;
    @FindBy(xpath = "//a[.='Cart']")
    WebElement cartButton;
}
