package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
    private WebDriver driver;
    private Actions actions;

    public ActionsHelper(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void hoverOverElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void clickAndHold(WebElement element) {
        actions.clickAndHold(element).perform();
    }

}