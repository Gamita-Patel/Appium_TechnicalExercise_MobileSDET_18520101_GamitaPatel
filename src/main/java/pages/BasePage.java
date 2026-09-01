package pages;

import org.openqa.selenium.support.PageFactory;

import driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Util1;

public class BasePage {

    protected static AppiumDriver driver;
    protected Util1 util;
    
    public BasePage() {
        try {
            this.driver = (driver != null) ? driver:DriverFactory.initDriver("android");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.util = new Util1();
        PageFactory.initElements(new AppiumFieldDecorator(driver), util);
    }

    
}
