package DriverFactoryDesign;

import org.bouncycastle.oer.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {


    public static WebDriver driver;

    //Method

    public static void initDriver(String browser) {

        if (driver == null) {

            switch (browser.toLowerCase()) {

                case "chrome":
                    driver = new ChromeDriver();

                    break;

                case "firefox":
                    driver = new FirefoxDriver();

                    break;

                default:
                    System.out.println("Choose Valid Browser chrome,fireFox");
            }

            //method
            driver.manage().window().maximize();


        }

        }
    public static WebDriver getdriver() {

        return driver;

    }

    }


