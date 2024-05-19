package DAY4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text'][2]"));
		String text=element.getText();
		System.out.println(text);
	}
}
