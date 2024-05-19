package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345689");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
	}
}
