import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends basePage {


//constructor
    public  LoginPage (WebDriver driver){
        super(driver);
    }

//locators
 By emailFieldLocator = By.id("email");
 By  PasswordFiledLocator = By.id("password");
 By LoginFieldLocator = By.id("submit");


//methods
    public LoginPage setEmail(String email) {
        driver.findElement(emailFieldLocator).sendKeys(email);
        return this;
    }

    public LoginPage EnterPassword(String password){
        driver.findElement(PasswordFiledLocator).sendKeys(password);
        return this;
    }

    public void ClickLogin(){
        driver.findElement(LoginFieldLocator).click();
    }

    //login Method
    public void Login(String Email ,  String Password){
         this.setEmail(Email)
             .EnterPassword(Password)
                 .ClickLogin();
    }




}
