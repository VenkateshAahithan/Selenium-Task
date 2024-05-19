package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[@id='heading20']"));
		element.click();
		driver.findElement(By.xpath("//li[@class='pointer'][6]")).click();

}
}
