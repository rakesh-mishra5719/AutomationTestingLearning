package SeleniumTestingProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mousetester.com/");
		
		WebElement doubleClickTest = driver.findElement(By.xpath("//*[@id=\"clickMe\"]/p"));
		
		Actions action  = new Actions(driver);
		
		action.doubleClick(doubleClickTest).build().perform();
		
		
	}

}
