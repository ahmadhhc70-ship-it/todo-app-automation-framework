import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends basePage {



                  //constructor
    public  HomePage (WebDriver driver){
        super(driver);
    }


                   //Locators
    By LogoutButtonLocator = By.xpath("//span[text()='Logout']");
    By todoNameFieldLocator = By.cssSelector("input[data-testid='new-todo']");
    By createTodoButtonLocator = By.cssSelector("button[data-testid='submit-newTask']");
    By AddNewTodoButton = By.xpath("(//button[@aria-label='delete'])[1]");
    By firstDoneCheckBoxLocator =  By.xpath("(//input[@data-testid='complete-task'])[1]");
    By firstTodoLocator = By.xpath("(//h2[@data-testid='todo-text'])[1]");
    By DeleteButton  = By.xpath("(//button[@data-testid='delete'])[1]");



    //check logout button
    public boolean checkLogoutButtonDisplay(){
        WebElement LogoutButton = wait.until (ExpectedConditions.visibilityOfElementLocated(LogoutButtonLocator));
                if(LogoutButton==null){
                    return  false;}
                else { return checkLogoutButtonDisplay();}

    }
       //method to add new
       public void AddNewTodoButton(String todoTitle){
           WebElement todoTitleField = wait.until(ExpectedConditions.visibilityOfElementLocated(todoNameFieldLocator));
           if(todoTitleField == null){
               System.out.println("Todo Title Field is not displayed");
           }else {
               todoTitleField.sendKeys(todoTitle);
           }


           }



   }
}
