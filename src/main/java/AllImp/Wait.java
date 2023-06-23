package AllImp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(0, null)
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://support.google.com/");
		
		
//		WebDriverWait wait =new WebDriverWait(driver,5);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'How can we help you?')]")));
		
		
		
		//FluentWait wait =
		
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//*[contains(text(),'How can we help you?')]"));
		System.out.println(e.getText());
		
		  //h3[starts-with(@id,'1-basic')]
		
		//h3[@id='1-basic-xpath']
		
		//*[text()='Basic XPath']
		
	//	(//*[contains(text(),'Basic XPath')])[1]
		//*[contains(@type,"search")]
		
		
	}
}
