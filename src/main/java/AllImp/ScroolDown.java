package AllImp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolDown {

	 public static void main(String[] args) throws InterruptedException {
         // TODO Auto-generated method stub
       //  System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         JavascriptExecutor js = (JavascriptExecutor) driver;
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get("https://www.google.com");
         WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("SoftwareTestingHelp");
         element.sendKeys(Keys.ENTER);
         Thread.sleep(3000);
          js.executeScript("window.scrollBy(0,5000)");
          
          //report
         
          

}
}
