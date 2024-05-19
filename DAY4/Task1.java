package DAY4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		String text=element1.getText();
		System.out.println(text);
	}
}
