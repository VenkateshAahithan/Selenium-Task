package DAY4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("greens velmurugan", Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Velmurugan Rengasamy - Assistant Manager - Greens india']")).click();
	}
}
