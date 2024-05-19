package DAY2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
WebElement movetoelement=driver.findElement(By.xpath("//div[@role='button']"));
Actions actions = new Actions(driver);
actions.moveToElement(movetoelement).perform();
WebElement location = driver.findElement(By.xpath("//input[@type='text']"));
location.sendKeys("omr,chennai");
	}
}
