package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Sign In']"));
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//a[text()='create an account']"));
		element2.click();
		WebElement element = driver.findElement(By.id("mobile"));
		element.sendKeys("7598348239");
		WebElement element4 = driver.findElement(By.id("name"));
		element4.sendKeys("venkatesh");
		WebElement element5 = driver.findElement(By.id("email"));
		element5.sendKeys("venkatesh@gmail.com");
		Thread.sleep(4000);
		WebElement element6 = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		element6.click();
	}
}
