package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DEF_cucumberJava {
    WebDriver driver = null;

    @Given("^I have open the browser$")
    public void i_have_open_the_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new SafariDriver();
    }

    @When("I open Facebook website")
    public void i_open_Facebook_website() {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to("https://www.facebook.com/");
    }

    @Then("Login button should exits")
    public void login_button_should_exits() {
        if(driver.findElement(By.id("u_0_v")).isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
        driver.close();
    }
}
