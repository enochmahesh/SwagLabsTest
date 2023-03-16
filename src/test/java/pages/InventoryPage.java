package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class InventoryPage {
    WebDriver driver;

    public InventoryPage(WebDriver driver) {

        this.driver = driver;
    }

    By isHeadertext = By.cssSelector("#header_container > div.primary_header > div.header_label > div");
    By isSubText = By.cssSelector("#header_container > div.header_secondary_container > span");

    public String isHeadertext() {

        String headTxt = driver.findElement(isHeadertext).getText();

        return headTxt;
    }

    public String isSubText() {

        String subTxt = driver.findElement(isSubText).getText();

        return subTxt;
    }

    public List<WebElement> itemNamesList() {

        List<WebElement> itemNamesList = driver.findElements(By.className("inventory_item_name"));
        return  itemNamesList;
    }
    public List<WebElement> addButtonList() {

        List<WebElement> addButtonList = driver.findElements(By.xpath("//button[text()='Add to cart']"));
        return  addButtonList;
    }
    public List<WebElement> removeButtonList() {

        List<WebElement> removeButtonList = driver.findElements(By.xpath("//button[text()='Remove']"));
        return  removeButtonList;
    }
}
