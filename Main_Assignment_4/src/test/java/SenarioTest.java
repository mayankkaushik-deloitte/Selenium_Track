import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import zmq.msg.MsgAllocatorHeap;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class SenarioTest {
    public static WebDriver driver;
    XSSFWorkbook wbook;
    XSSFSheet sheet;
    public static ExtentReports report;
    public static ExtentTest test;
    @BeforeTest
    public void DataSetUp() throws IOException {
        FileInputStream fis = new FileInputStream("excelData.xlsx");
        wbook = new XSSFWorkbook(fis);
        sheet = wbook.getSheet("Sheet1");

        report = new ExtentReports(ExtentReport.html);
    }
    @AfterTest
    public void DataTearDown() throws IOException {
        wbook.close();
        report.flush();
        report.close();
    }
    @BeforeMethod
    public void SetUp(Method method){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    }
    @AfterMethod
    public void TearDown(){
        report.endTest(test);
        driver.quit();
    }
}
