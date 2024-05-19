package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("chennai");
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("theni");
	}
}
