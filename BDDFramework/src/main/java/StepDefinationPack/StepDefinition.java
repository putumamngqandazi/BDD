package StepDefinationPack;

//import cucumber.api.java.en.*;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.google.common.base.Ascii.SI;

public class StepDefinition {
    public WebDriver driver;
    public SignIn si;
    @Given("user Launch chrome browser")
    public void user_Launch_chrome_browser(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user")+"//Drivers /chromedriver.exe");
        driver= new ChromeDriver();

        si= new SignIn(driver);
    }

    @When("user opens URL{string}")
    public void user_opens_URL(String url) {
        url ="https://magento.softwaretestingboard.com";
        driver.get(url);
    }

    @When("User enters email as (string) and password as{string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        si.setEmail(email);
        si.setPassword(password);
    }
    @When("Click on SignIn")
    public void click_on_Login() {si.clickSignIn();
    }
}

