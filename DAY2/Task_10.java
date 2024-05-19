package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_10 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
		//input[@type='text']
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("venkatesh");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("venkay123");
		//input[@type='password']
	}
}
