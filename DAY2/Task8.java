package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).sendKeys("venkatesh");
		driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("password");
	}
}
