package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

/* 1. Locate and find the below elements from LoginPage:
    accessibility ID "username"  ---> Input Box
    accessibility ID "password" -----> Input Box
    accessibility ID "loginButton" ---> Command button*/
  
    @AndroidFindBy(accessibility = "username")
    @iOSXCUITFindBy(accessibility = "username")
    private WebElement userName;


 @AndroidFindBy(accessibility = "password")
    @iOSXCUITFindBy(accessibility = "password")
    private WebElement password;


     @AndroidFindBy(accessibility = "loginButton")
    @iOSXCUITFindBy(accessibility = "loginButton")
    private WebElement loginButton;

   public LoginPage(AppiumDriver driver){
    super(driver);
   }

    // 2.Create a method "enterUsername" to enter username value to the username field


   public void enterUsername(String username){
      userName.sendKeys(username);
   }
    // 3.Create a method "enterPassword" to enter password value to the password field
public void enterPassword(String password){
      userName.sendKeys(password);
    
   }
    //4. Create a method "clickLogin" to click on loginButton
public void clickLogin(){
    loginButton.click();
   }
}