package Ab;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Final {
	public static void main(String[] args) throws AWTException {
	

				System.setProperty(
						"webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Javaone\\driverch\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://redmart.lazada.sg/");
		        Robot r=new Robot();
				driver.manage().window().maximize();
				WebElement searchBox=driver.findElement(By.name("q"));
				searchBox.sendKeys("TV");
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
					
					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.HOME).perform();
	
					
					
				
			}

		


	}


