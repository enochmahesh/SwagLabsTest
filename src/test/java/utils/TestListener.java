package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pages.BaseClass;

public class TestListener extends BaseClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
         System.out.println("Test case failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("All test cases finished!");
    }
}