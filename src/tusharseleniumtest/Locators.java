package tusharseleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(100, 50));
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().setSize(new Dimension(100, 720));
		Thread.sleep(3000);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.id("email")).sendKeys("Tushar Patne");
		driver.findElement(By.id("password")).sendKeys("Tushar@123");
		System.out.println(driver.findElement(By.cssSelector("#email+.inline-error")).getText());
		
		driver.findElement(By.id("remember_me")).click(); // uncheck remember me checkbox
		driver.findElement(By.className("obsidian")).click(); // check remember me checkbox by clikcing on label
		driver.findElement(By.id("remember_me")).click(); // uncheck remember me checkbox
		driver.findElement(By.linkText("Forgot Password")).click();
		
//		driver.findElement(By.name("commit")).click();
		
		Assert.assertEquals(driver.findElement(By.cssSelector("#email+.inline-error")).getText(), "Please provide a valid email address");
		
		driver.quit();

	}

}
