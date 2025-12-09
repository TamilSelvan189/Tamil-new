package Ab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Javaone\\driverch\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com");
        Robot r=new Robot();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i < 50; i++) {
		    js.executeScript("window.scrollBy(0, 800)");
		    Thread.sleep(700);
		}

		JavascriptExecutor ss = (JavascriptExecutor) driver;
		ss.executeScript("window.scrollTo(0, 0)");

		
		WebElement searchBox=driver.findElement(By.name("keyword"));
		searchBox.sendKeys("tv");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
			Select s=new Select(searchBox);
			 
		
	}

}
