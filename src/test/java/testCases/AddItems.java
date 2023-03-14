/*
 * Author: Enoch Mahesh Silva
 * Date: March 14, 2023
 * Description: This code is created to learn Selenium Automation Tests with Java
 */

package testCases;

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
        InventoryPage ele=new InventoryPage(driver);
        ele.addButtonList().get(0).click();
        ele.addButtonList().get(3).click();
        Assert.assertEquals(ele.removeButtonList().get(0).getText(),"Remove");
        Assert.assertEquals(ele.removeButtonList().get(1).getText(),"Remove");
        }

    @AfterTest
        public void closeDriver() {
            tearDown();

        }
    }
