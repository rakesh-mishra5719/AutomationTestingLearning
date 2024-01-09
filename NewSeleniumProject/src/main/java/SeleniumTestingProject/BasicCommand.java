package SeleniumTestingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommand {

	public static void main(String[] args) {
		// launching Web Driver
				WebDriver driver = new ChromeDriver();
				
				//opening a url
//				driver.get("https://leetcode.com/");
				
				
				// opening url using navigate()
				driver.navigate().to("url");
				
				// clicking on webelement
				
				WebElement element = driver.findElement(By.xpath(""));
				element.click();
				
				
				driver.findElement(By.xpath("")).click();
				
				// write text 
				driver.findElement(By.xpath("")).sendKeys("Rakesh");
				
				// clear the text...............
				driver.findElement(By.xpath("")).clear();
				
				// get text from field
				String getname = driver.findElement(By.xpath("")).getText();
				
				System.out.println(getname);
				
				// navigate backword...............
				
				driver.navigate().back();
				
				// naviagte forword................
				driver.navigate().forward();
				
				// Refresh the browser.............
				driver.navigate().refresh();
				
				// close the browser............
				driver.close();
//				driver.quit()
				
				
				
				
				
				
				
				

	}

}
