package com.codefishQa.stepdef;

import com.codefishQa.pages.LoginPage;
import com.codefishQa.pages.RegistrPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class CodefishStep {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    RegistrPage registrPage = new RegistrPage(driver);

    @When("user clicks register button")
    public void user_clicks_register_button() {
    loginPage.clickReg();
    }
    @When("user provides {string} and {string} and user clicks register button and clicks Give user ADMIN role")
    public void user_provides_and_and_user_clicks_register_button_and_clicks_give_user_admin_role(String username, String password) {
        registrPage.registr(username, password);
    }
    @Then("user is on the main page")
    public void user_is_on_the_main_page(WebDriver driver) {
        Assert.assertEquals(registrPage.currentUrl(driver), ConfigReader.readProperty("urlRegPage"));
    }
    @Then("user validates the {string}")
    public void user_validates_the(String message) {
Assert.assertEquals(registrPage.errorMes(), message);
    }


}
