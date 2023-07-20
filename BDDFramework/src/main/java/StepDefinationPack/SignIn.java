package StepDefinationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SignIn {

        public WebDriver Idriver;

        public SignIn(WebDriver rdriver){
            Idriver= rdriver;
            PageFactory.initElements(rdriver, this);
        }

        @FindBy(id="email")
                @CacheLookup
        WebElement txtEmail;

                @FindBy(id=" pass ")
                @CacheLookup
                WebElement txtPassword;

                @FindBy(xpath= "//*[@id=\"send2\"]/span")
        @CacheLookup
        WebElement btnSignIn;

        public void setEmail(String email){
            txtPassword.clear();
            txtPassword.sendKeys(email);
        }
        public void setPassword(String pass){
            txtPassword.clear();
            txtPassword.sendKeys(pass);
        }
        public void clickSignIn(){
            btnSignIn.click();
        }
}
