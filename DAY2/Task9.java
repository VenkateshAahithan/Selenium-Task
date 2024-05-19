package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("venkatesh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("s");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("mgr Nagar,near chennai - 600119.");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("venkatesh@gmai.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("venkay@123");
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("venkay@123");
	}
}
