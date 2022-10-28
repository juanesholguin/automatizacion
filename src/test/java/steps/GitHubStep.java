package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemaBlazePage;


public class GitHubStep {

    DemaBlazePage git = new DemaBlazePage();

    @Given("^the user navigates to www.github.com/login$")
    public void navigateToGitHub(){

        git.navigateToGithub();
    }

    @When("^the user enter your (.+) and (.+)$")
    public void enterCredentials(String user, String pass){
        git.clickSigInButton();
        git.enterUser(user);
        git.enterPassword(pass);
    }

    @And("click in the Sig in button and see de home page")
    public void enterToGitHub(){

        git.clickLogInButton();
    }

    @Then("the user close session correctly")
    public void closeSessionGitHub(){

        git.closeSession();
    }
}
