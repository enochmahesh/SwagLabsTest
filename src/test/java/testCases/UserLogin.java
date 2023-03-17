/*
 * Author: Enoch Mahesh Silva
 * Date: March 14, 2023
 * Description: This code is created to learn Selenium Automation Tests with Java
 */

package testCases;

import com.aventstack.extentreports.Status;
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
        test=extent.createTest("Test user login","User inputs credentials to login");
        test.log(Status.INFO,"User Is Navigated to home screen");
        userLogin();
        test.log(Status.INFO,"User have entered the credentials and clicked the sign in button.");
    }

    @Test
    public void verifyLogin() {
        test=extent.createTest("Verify user login","Asserts the elements loaded after login success");
        InventoryPage ele = new InventoryPage(driver);
        test.log(Status.INFO,"Running asserts on inventory page");
        Assert.assertEquals(ele.isHeadertext(), "Swag Labs");
        Assert.assertEquals(ele.isSubText(), "Products");
        test.log(Status.PASS,"Test is PASS");
    }
   @AfterTest
    public void closeDriver() {
             tearDown();
            }

}

