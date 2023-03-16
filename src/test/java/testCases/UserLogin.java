/*
 * Author: Enoch Mahesh Silva
 * Date: March 14, 2023
 * Description: This code is created to learn Selenium Automation Tests with Java
 */

package testCases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BaseClass;
import pages.InventoryPage;

public class UserLogin extends BaseClass {

    ExtentTest test = extent.createTest("Login Test", "Testing the login of the user");

    @BeforeTest
    public void setDriver() {
    setUpDriver();
    }

    @Test
    public void login(){
        test.log(Status.INFO,"User Is Navigated to home screen");
        userLogin();
        test.log(Status.INFO,"User have entered the credentials and clicked the sign in button.");
        extent.flush();
    }

    @Test
    public void verifyLogin() {

        InventoryPage ele = new InventoryPage(driver);
        Assert.assertEquals(ele.isHeadertext(), "Swag Labs");
        Assert.assertEquals(ele.isSubText(), "Products");
        test.log(Status.PASS,"Test is PASS");
        extent.flush();
    }
   @AfterTest
    public void closeDriver() {
        tearDown();
            }
}

