package SeleniumTestingProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();// or simpleAlert.dismiss();
        
        
       


	}

}
