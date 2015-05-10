package com.facebook;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Manzur on 5/10/2015.
 */
public class StepDefintions {
    WebDriver driver;
    @Given("^I am on facebook homepage$")
    public void i_am_on_facebook_homepage()  {
    driver = new FirefoxDriver();
        driver.get("http://facebook.com");
    }

    @When("^I enter my valid credentials$")
    public void i_enter_my_valid_credentials()  {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("qtppnt@gmail.com");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("may2015");
        driver.findElement(By.xpath("//*[@id='u_0_n']")).click();

    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully()  {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).isDisplayed());

    }

    @After()
    public void tearDown(){
        driver.quit();
    }

}
