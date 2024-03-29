package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("User is on LoginPage")
    public void loginPage() {
        loginPage.goToLoginPage();
    }

    @Given("User go on subscription page")
    public void subscriptionPage() {
        loginPage.goToSubscriptionPage();
    }

    @When("User look at the page")
    public void userLookAtThePage() {
        loginPage.lookPage();
    }

    @Then("User should see forbidden password correct spelling")
    public void forbiddenPasswordCorrectSpelling() {
        Assert.assertEquals(loginPage.verifyForbiddenPassword(),false);
    }

    @And("User should see submit button correct spelling")
    public void submitButtonCorrectSpelling() {
        Assert.assertEquals(loginPage.verifySubmitButton(),false);
    }

    @And("User is connected to his account")
    public void connectedOnHisAccount() {
        loginPage.connexion();
    }

    @When("User click on back button")
    public void userClickOnBackButton() {
        loginPage.goBack();
    }

    @Then("User should correct presentation spelling")
    public void userShouldCorrectPresentationSpelling() {
        Assert.assertEquals(loginPage.verifyPresentationText(),true);
    }

    @And("User try to connect to his account")
    public void userTryToConnectToHisAccount() {
        loginPage.goToLoginPage();
        loginPage.getLogged();
    }

    @Then("User access to his account")
    public void accessToHisAccount() {
        Assert.assertEquals(loginPage.verifyAccountAccess(),true);
    }

    @When("User look this page")
    public void userLookThisPage() {
        System.out.println("you are on initial page");
    }
}
