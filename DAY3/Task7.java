package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@type='text'][1]"));
		element.sendKeys("chennai");
		WebElement element1 = driver.findElement(By.xpath("//input[@title='To station']"));
		element1.sendKeys("madurai");
		//button[@type='submit']
		WebElement element2 = driver.findElement(By.xpath("//button[@type='submit']"));
		element2.click();
	}
}
