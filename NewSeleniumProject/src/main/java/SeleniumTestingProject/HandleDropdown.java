package SeleniumTestingProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement drpCountry = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		
		Select drp = new Select(drpCountry);
		// select by Visible text............
//		drp.selectByVisibleText("Aruba");

		// select by value...............
//		drp.selectByValue("ABW");
		
		// select by index
//		drp.selectByIndex(12);
		
		// selecting option without using above three method
//		List<WebElement> alloptions = drp.getOptions();
//		for(WebElement option : alloptions) {
//		if(	option.getText().equals("Aruba")){
//				option.click();
//				break;
//			}
//		}
		
		
		
		
	}

}
