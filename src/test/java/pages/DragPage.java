package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;

public class DragPage extends DriverManager {
    public AppiumBy dragMenu = (AppiumBy) AppiumBy.accessibilityId("Drag");
    public By successMessage = By.xpath("//*[@text='Congratulations']");
    public AppiumBy retryButton = (AppiumBy) AppiumBy.accessibilityId("button-Retry");
    public DragPage() {
        PageFactory.initElements(getAppiumDriver(), this);
    }
}
