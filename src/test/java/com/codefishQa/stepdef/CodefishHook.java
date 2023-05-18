package com.codefishQa.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class CodefishHook {
    WebDriver driver = DriverHelper.getDriver();

    //    @BeforeAll public void clearCashes(){
//        driver.manage().deleteAllCookies();
//    }
    @Before
    public void setup(){
        driver.get(ConfigReader.readProperty("urlEC"));
    }
    @After
    public void tearDown(Scenario scenario) {
        BrowserUtils.getScreenShotForCucumber(driver, scenario);
        driver.quit();
    }
}
