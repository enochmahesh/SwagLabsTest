package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BaseClass;
import pages.InventoryPage;

public class UserLogin extends BaseClass {


    @BeforeTest
    public void setDriver() {
    setUpDriver();
    }

    @Test
    public void login(){
    userLogin();
    }

    @Test
    public void verifyLogin() {
        InventoryPage ele = new InventoryPage(driver);
        Assert.assertEquals(ele.isHeadertext(), "Swag Labs");
        Assert.assertEquals(ele.isSubText(), "Products");
    }
   @AfterSuite
    public void closeDriver() {
    tearDown();
    }
}

