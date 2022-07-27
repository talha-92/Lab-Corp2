package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class StepDefinition extends BaseClass{
    @Given("I open the browser")
    public void i_open_the_browser() throws InterruptedException {
        driver.get("https://www.labcorp.com/");
        System.out.println("I open Browser ");
        Thread.sleep(2000);
    }
    @When("I navigate to career page")
    public void i_navigate_to_career_page() throws InterruptedException {
        System.out.println("I click on career");
        driver.findElement(By.xpath("//div[@id='login-container']//a[@class='no-ext ext']")).click();
        Thread.sleep(2000);

    }
    @When("I search for a job")
    public void i_search_for_a_job() throws InterruptedException {
        System.out.println("I search for a job");
        driver.get("https://careers.labcorp.com/global/en");
        driver.findElement(By.xpath("(//input[@id='typehead'])[1]")).sendKeys("QA");
        Thread.sleep(2000);

    }
    @When("I select a job")
    public void i_select_a_job() {

    }
    @Then("I apply")
    public void i_apply() {

    }
}
