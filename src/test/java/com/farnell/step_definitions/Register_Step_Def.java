package com.farnell.step_definitions;

import com.farnell.pages.DashboardPage;
import com.farnell.pages.RegisterPage;
import com.farnell.utilities.ConfigurationReader;
import com.farnell.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class Register_Step_Def {
    @Given("As a user land on the homepage")

    public void as_a_user_land_on_the_homepage() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Then("Navigate to registration")
        public void navigate_to_registration() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.register.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
    }


    @When("user enters below information")
    public void user_enters_below_information(Map<String,String> info) {

        RegisterPage registerPage = new RegisterPage();
        registerPage.userName.sendKeys(info.get("username"));
        registerPage.passWord.sendKeys(info.get("password"));
        registerPage.fullName.sendKeys(info.get("fullName"));
        registerPage.email.sendKeys(info.get("email"));
        registerPage.rememberMe.click();
        registerPage.regiterButton.click();
    }

    @Then("the user should able to see title")
    public void the_user_should_able_to_see_name() {

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("My Account ",actualTitle);
    }



}
