package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Task3 {
	 public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();

				
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("venki");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("selvaraj");
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("123,thoraipakkam,omr.chennai-600119.");
			driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("venkatesh@gmail.com");
			driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567890");
			driver.findElement(By.xpath("//input[@value='Male']")).click();
			driver.findElement(By.xpath("//input[@value='Cricket']")).click();
			WebElement language = driver.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']"));
			language.click();
			WebElement languages= driver.findElement(By.xpath("//a[text()='Danish']"));
			languages.click();
			WebElement skill=driver.findElement(By.xpath("//select[@ng-model='Skill']"));
	                Actions actions = new Actions(driver);
		        actions.moveToElement(skill);
		        WebElement skills=driver.findElement(By.id("Skills"));
		        Select skill1=new Select(skills);
		        skill1.selectByVisibleText("Analytics");
		        WebElement country = driver.findElement(By.id("country"));
		        Select select = new Select(country);
		        select.selectByVisibleText("Denmark");
		        WebElement abc=driver.findElement(By.xpath("//select[@id='yearbox']"));
			Actions actions1 = new Actions(driver);
			actions1.moveToElement(abc);
			driver.findElement(By.xpath("//option[@value='1920']")).click();
			driver.findElement(By.xpath("//option[@value='January']")).click();
			driver.findElement(By.xpath("//option[@value='3']")).click();
			driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("venki@123");
			driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("venki@123");
			driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	 }
}