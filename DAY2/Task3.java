package DAY2;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
WebElement enter=driver.findElement(By.xpath("//textarea[@title='Search']"));
enter.sendKeys("Greentechnology",Keys.ENTER);
	}


}
