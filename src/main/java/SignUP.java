import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.c;
import static org.bouncycastle.cms.RecipientId.password;

public class SignUP extends basePage{


    public SignUP (WebDriver driver){
        super(driver);
    }

    //Locators
By FirstNameFieldLocator = By.cssSelector("input[data-testid='first-name']");
By LastNameFieldLocator =  By.cssSelector("input[data-testid='last-name']");
By EmailFieldLocator = By.cssSelector("input[data-testid='email']");
By PasswordFieldLocator = By.cssSelector("input[data-testid='password']");
By ConfirmPassWordFieldLocator = By.cssSelector("input[data-testid='confirm-password']");
By SignUpBottonLocator = By.cssSelector("button[data-testid='submit']");


//Methods

    public SignUP enterFirstName(String FirstName){
        driver.findElement(FirstNameFieldLocator).sendKeys(FirstName);
        return this;
    }

    public SignUP enterLastName(String LastName){
        driver.findElement(LastNameFieldLocator).sendKeys(LastName);
        return this;
    }

    public SignUP enterEmail(String Email) {
        driver.findElement(EmailFieldLocator).sendKeys(Email);
        return this;
    }
        public SignUP enterPassword (String password){
            driver.findElement(PasswordFieldLocator).sendKeys(password);
            return this;
        }

        public SignUP enterConfirmPassword (String confirmpassword){
            driver.findElement(ConfirmPassWordFieldLocator).sendKeys(ConfirmPassword);
            return this;
        }
        public void clickSignupButton(){
            driver.findElement(SignUpBottonLocator).click();
        }

    public void signUp(String firstName, String lastName, String email, String password, String confirmPassword){
        this.enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .enterPassword(password)
                .enterConfirmPassword(confirmPassword)
                .clickSignupButton();
    }

    }

