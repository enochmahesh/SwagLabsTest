/*
 * Author: Enoch Mahesh Silva
 * Date: March 14, 2023
 * Description: This code is created to learn Selenium Automation Tests with Java
 */

package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

    public WebDriver driver;
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }
    public void userLogin(){
        LoginPage login=new LoginPage(driver);
        login.setUsername("standard_user");
        login.setPassword("secret_sauce");
        login.clickLoginButton();
    }

    public void tearDown() {
        driver.quit();
    }
}
