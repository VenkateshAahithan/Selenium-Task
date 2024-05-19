package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement element2 = driver.findElement(By.xpath("//div[@class='accountInner']"));
		element2.click();
		//span[@class='newUserRegister']
		WebElement element3 = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		element3.click();
		Thread.sleep(4000);
		WebElement element4 = driver.findElement(By.xpath("//iframe[@src='https://www.snapdeal.com:443/iframeLogin#https://www.snapdeal.com/']"));
		driver.switchTo().frame(element4);
		WebElement element5 = driver.findElement(By.xpath("//input[@type='text']"));
		element5.sendKeys("7598348238");
		WebElement element6 = driver.findElement(By.id("checkUser"));
		element6.click();
		WebElement element7 = driver.findElement(By.xpath("//input[@type='text']"));
		element7.sendKeys("2479");
		//button[@id='loginUsingOtp']
		WebElement element8 = driver.findElement(By.id("loginUsingOtp"));
		element8.click();
	}
}
