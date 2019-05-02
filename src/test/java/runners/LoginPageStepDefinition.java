package runners;

import Base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;


public class LoginPageStepDefinition extends TestBase {


    @Given("^the website page is open$")
    public void the_website_page_is_open() {
        TestBase.testSetup();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("^user provides Username as \"([^\"]*)\"$")
    public void user_provides_Username_as(String arg1) {
        driver.findElement(By.id("txtUsername")).sendKeys(arg1);
    }

    @When("^user provides Password as \"([^\"]*)\"$")
    public void user_provides_Password_as(String arg1) {

        driver.findElement(By.id("txtPassword")).sendKeys(arg1);
    }

    @When("^user click on submit button$")
    public void user_click_on_submit_button() {
        driver.findElement(By.id("btnLogin")).click();

    }

    @Then("^System should direct user to admin page$")
    public void system_should_direct_user_to_admin_page() {
        TestBase.cleanUp();
    }


}



