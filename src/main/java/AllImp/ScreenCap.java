package AllImp;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ScreenCap {
	 public static void main(String[] args) throws AWTException, InterruptedException, IOException {
         // TODO Auto-generated method stub
		 
		 
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://www.google.com");
     
      
       
     TakesScreenshot ts=(TakesScreenshot)driver;
     File src=ts.getScreenshotAs(OutputType.FILE);
    File des= new File("E:\\Workspace_api\\AllImp\\src\\main\\java\\ScreenSho\\"+"scr.jpg");
    FileUtils.copyFile(src, des);
//     ExtentReports report = new ExtentReports();
//	// ExtentKlovReporter klovReport = new ExtentKlovReporter();
//	 ExtentTest test;
//	// WebDriverWait wait;
//	 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
//				"D:\\His_Automation\\B2B\\HtmlReport\\Report.html");
//    
    ExtentHtmlReporter HtmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\MyReport\\"+"ExtentReportResults.html");
  System.out.println("Path  : "+System.getProperty("user.dir"));
    ExtentReports extent=new ExtentReports();
    extent.attachReporter(HtmlReporter);
    ExtentTest test=extent.createTest("First_testcase");
    test.info("Test stared");
//    ExtentReports   report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html",true);
//    ExtentTest  test = report.startTest("ExtentDemo");
    
    System.out.println("Complete");
    
    test.addScreencastFromPath("ph.jpg");
    extent.flush();
	 }

}

