package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		
WebElement username=driver.findElement(By.xpath("//input[@name='DUMMY1']"));
username.sendKeys("venkky@124");
{WebElement Password=driver.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']"));
Password.sendKeys("venkay123");
}
	}
}
