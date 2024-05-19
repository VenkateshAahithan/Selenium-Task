package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		element.sendKeys("7598348239");
		WebElement element1 = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		element1.click();
	}
}
