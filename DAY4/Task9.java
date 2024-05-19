package DAY4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("shoe",Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Trendy Sports Running Shoes For Men']")).click();
	}
}
