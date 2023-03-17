/*
 * Author: Enoch Mahesh Silva
 * Date: March 14, 2023
 * Description: This code is created to learn Selenium Automation Tests with Java
 */

package testCases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.InventoryPage;

public class AddItems extends BaseClass {
        @BeforeTest
        public void openPage(){
            setUpDriver();
            userLogin();
             }
        @Test
        public void addItems() {
            test=extent.createTest("Adding items to cart","Verify that user can add item to cart successfully.");
            InventoryPage ele = new InventoryPage(driver);
            ele.addButtonList().get(0).click();
            ele.addButtonList().get(3).click();
            test.log(Status.INFO, "User has added two items to the cart.");
            Assert.assertEquals(ele.removeButtonList().get(0).getText(), "Remove");
            Assert.assertEquals(ele.removeButtonList().get(1).getText(), "Remove");
            test.log(Status.PASS,"Test PASS");
                                                                          }

    @AfterTest
        public void closeDriver() {
                  tearDown();

         }
    }
