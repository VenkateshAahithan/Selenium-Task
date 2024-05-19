package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("firstName"));
		element.sendKeys("venkatesh");
		WebElement element1 = driver.findElement(By.id("lastName"));
		element1.sendKeys("venkatesh");
		//span[text()='Next']
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Next']"));
		element2.click();
		Thread.sleep(4000);
		WebElement element3 = driver.findElement(By.xpath("//select[@id='month']"));
		Select select = new Select(element3);
		select.selectByVisibleText("January");
		driver.findElement(By.id("day")).sendKeys("01");
		driver.findElement(By.id("year")).sendKeys("1999");
		WebElement element4 = driver.findElement(By.xpath("//select[@id='gender']"));
		Select selects = new Select(element4);
		selects.selectByVisibleText("Male");
		WebElement element5 = driver.findElement(By.xpath("//span[text()='Next']"));
		element5.click();
		Thread.sleep(4000);
		WebElement element6 = driver.findElement(By.xpath("//input[@type='text']"));
		element6.sendKeys("venkateshselva34");
		WebElement element7 = driver.findElement(By.xpath("//span[text()='Next']"));
		element7.click();
		Thread.sleep(4000);
		WebElement element8 = driver.findElement(By.xpath("//input[@type='password']"));
		element8.sendKeys("Venkatesh@Sel34");
		WebElement element9 = driver.findElement(By.xpath("//input[@aria-label='Confirm']"));
		element9.sendKeys("Venkatesh@Sel34");
		WebElement element10 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		element10.click();
		WebElement element11 = driver.findElement(By.xpath("//span[text()='Next']"));
		element11.click();
		WebElement element12 = driver.findElement(By.xpath("//input[@type='tel']"));
		element12.sendKeys("9833857922");
		WebElement element13 = driver.findElement(By.xpath("//span[text()='Next']"));
		element13.click();
	}
}
