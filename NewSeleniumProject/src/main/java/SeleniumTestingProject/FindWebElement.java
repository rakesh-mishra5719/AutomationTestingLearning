package SeleniumTestingProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FindWebElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leetcode.com/");
		
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"landing-page-app\"]/div/div[1]/div[3]/div[2]/div/div/div[2]/div/a"));
//		element.click();
//		WebElement userName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div/form/span[1]/input"));
//		userName.sendKeys("deepak_kumar");
//		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div/form/span[2]/input"));
//		password.sendKeys("deepak1234@");
//		WebElement cnfPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div/form/span[3]/input"));
//		cnfPassword.sendKeys("deepak1234@");
//		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div/form/span[4]/input"));
//		email.sendKeys("dk982500@gmail.com");
//		
//		WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div/button"));
//		submit.click();

		WebElement element = driver.findElement(By.xpath("//*[@id=\"landing-page-app\"]/div/div[1]/div[3]/div[1]/div/div/div[2]/div/a[5]/span"));
		element.click();
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"id_login\"]"));
		userName.sendKeys("rakeshmishra5719@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
		password.sendKeys("ttsttss");
		
//		WebElement submit = driver.findElement(By.xpath("//*[@id=\"signin_btn\"]/div"));
//		submit.click();
		
		driver.findElement(By.cssSelector("#signin_btn")).click();
	}

}
