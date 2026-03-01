import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class basePage {


    WebDriver driver;
    WebDriverWait wait;

    public basePage (WebDriver driver){

        this.driver= driver;

        this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public String URL(){
        return driver.getCurrentUrl();
    }

    public String Title(){
        return driver.getTitle();
    }

}
