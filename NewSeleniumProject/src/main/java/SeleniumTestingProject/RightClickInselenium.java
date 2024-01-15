package SeleniumTestingProject;



	
	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	public class RightClickInselenium {
		
		public static void main(String[] args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Launching Sample site
			driver.get("https://google.com");
			
			WebElement userName = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
			userName.sendKeys("selenium");
			userName.sendKeys(Keys.RETURN);
			
			//Right click in the TextBox
			Actions action = new Actions(driver);
			WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
			action.contextClick(searchBox).perform();
			
			//Thread.sleep just for user to notice the event
			Thread.sleep(20000);
			//Closing the driver instance
			driver.quit();
		}
	}

