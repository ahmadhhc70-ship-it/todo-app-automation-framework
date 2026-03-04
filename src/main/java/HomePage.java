import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    By markCheckBoxLocator =  By.cssSelector("input[data-testid='complete-task");
    By todoNameLocator = By.cssSelector("[data-testid='todo-text']");
    By deleteNameLocator = By.cssSelector( "[data-testid='delete']");



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

          public void addNewTodoName(String TodoName ){
        driver.findElement(createTodoButtonLocator).click();


           }
           public void markCheckBoxLocator(){
             driver.findElement(markCheckBoxLocator).click();

           }

           public boolean CheckAddTodoName(String x) {
            WebElement NewTodoTittle= wait.until(ExpectedConditions.visibilityOfElementLocated(todoNameLocator));
               if (NewTodoTittle==null){
                   return false;}
               else{
                   return x.equals(NewTodoTittle.getText());
               }

               }



    public boolean checkTaskIsDeleted(String todoTitle){


        String staticPart1= "//h2[text()='";
        String staticPart2= "']";

        String xpathLocator = staticPart1 + todoTitle + staticPart2;

try {
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathLocator)));
    return true;

}catch (NoSuchElementException X ) {

    return false;
}
}

   }
