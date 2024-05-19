package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("aadhithan");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("venkatesh@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
