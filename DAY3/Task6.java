package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//i[@class='icon icon-down icon_secondary_item_more']"));
		element.click();
		driver.findElement(By.xpath("//span[text()='Login/ Sign Up']")).click();		
		WebElement element2 = driver.findElement(By.xpath("//iframe[@src='/login?offerType=PaymentOffers&defaultSlide=home&isOnlyMobile=false']"));
		driver.switchTo().frame(element2);
		driver.findElement(By.id("mobileNoInp")).sendKeys("9876543210");
	}
}
