package com.lareau.step_definitions;

import com.lareau.pages.BasePage;
import com.lareau.utilities.BrowserUtils;
import com.lareau.utilities.ConfigurationReader;
import com.lareau.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class NavigationMenu {
    BasePage basePage = new BasePage() {

    };

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user clicks the PERSONAL tabs")
    public void the_user_clicks_the_personal_tabs() {
      BrowserUtils.waitForClickAbility(basePage.personal,5).click();
    }

    @Then("user should see the url contains personal")
    public void user_should_see_the_url_contains_personal() {
        String expectedUrl = "https://lareau.ca/en/personal/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println(actualUrl);

    }
    @When("the user clicks the COMMERCIAL tabs")
    public void the_user_clicks_the_commercial_tabs() {
     BrowserUtils.waitForClickAbility(basePage.commercial,5).click();
    }

    @Then("user should see the url contains commercial")
    public void user_should_see_the_url_contains_commercial() {

    }

    @When("the user clicks the CLAIMS tabs")
    public void the_user_clicks_the_claims_tabs() {
        BrowserUtils.waitForClickAbility(basePage.claims,5).click();
    }
    @Then("user should see the url contains claims")
    public void user_should_see_the_url_contains_claims() {

    }

    @When("the user clicks the WHY LAREAU tabs")
    public void the_user_clicks_the_why_lareau_tabs() {
        BrowserUtils.waitForClickAbility(basePage.whyLareau,5).click();
    }
    @Then("user should see the url contains why-lareau")
    public void user_should_see_the_url_contains_why_lareau() {

    }

    @When("the user clicks the BLOG tabs")
    public void the_user_clicks_the_blog_tabs() {
        BrowserUtils.waitForClickAbility(basePage.blogs,5).click();
    }
    @Then("user should see the url contains blog")
    public void user_should_see_the_url_contains_blog() {

    }


    @When("the user clicks the CONTACT US tabs")
    public void the_user_clicks_the_contact_us_tabs() {
        BrowserUtils.waitForClickAbility(basePage.contactUs,5).click();
    }
    @Then("user should see the url contains contact-us")
    public void user_should_see_the_url_contains_contact_us() {
        String expectedUrl = "https://lareau.ca/en/contact-us/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println(actualUrl);
    }
}
