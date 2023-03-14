/*
 * Author: Enoch Mahesh Silva
 * Date: March 14, 2023
 * Description: This code is created to learn Selenium Automation Tests with Java
 */

package testCases;

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

