package DAY4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("inputValEnter")).sendKeys("sunglass", Keys.ENTER);
		driver.findElement(By.xpath("//p[text()='Arizona Sunglasses - Black Rectangular Sunglasses ( Pack of 1 )']")).click();
	}
}
