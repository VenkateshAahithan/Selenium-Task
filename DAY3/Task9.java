package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		element.click();
		WebElement WebElement = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement.sendKeys("9789729282");
		WebElement element3 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		element3.click();
	}
}
