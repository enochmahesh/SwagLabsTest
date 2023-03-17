package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteSetUp implements ITestListener,ISuiteListener {

    public static ExtentReports extent = new ExtentReports();
    public static ExtentSparkReporter reporter;
    public static ExtentTest test;

    @BeforeSuite
    public void suiteSetUp() {
        reporter=new ExtentSparkReporter("Reports/Test_results.html");
        extent.attachReporter(reporter);

           }
    @AfterSuite
    public void afterSuite(){
        extent.flush();
    }

}
