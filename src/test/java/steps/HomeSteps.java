package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.HomePage;

public class HomeSteps {


    private HomePage homePage;

    public HomeSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @When("User select item")
    public void userSelectItem() {
        homePage.selectItem();
    }

    @And("User add it on cart")
    public void userAddItOnCart() {
        homePage.addItemToCart();
    }

    @Then("User should see notification correct spelling")
    public void userShouldSeeNotificationCorrectSpelling() {
        Assert.assertEquals(homePage.verifyNotification(),false);
    }

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        homePage.goToHomeboard();
    }

    @Given("User is on cartpage")
    public void userIsOnCartpage() {
        homePage.goToCartPage();
    }

    @Then("User should return on homepage view")
    public void returnOnHomepageView() {
        Assert.assertEquals(homePage.verifyHomeView(),true);
    }
}
