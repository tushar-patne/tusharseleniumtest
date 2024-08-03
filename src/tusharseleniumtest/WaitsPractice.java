package tusharseleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WaitsPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/?#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String[] products = {"Brocolli", "Cucumber", "Carrot", "Tomato", "Pumpkin"};
		String xpathString;
		
		for (String product : products) {
			xpathString = "//h4[@class=\"product-name\" and contains(text(), \"" + product + "\")]/following-sibling::div/button";
			driver.findElement(By.xpath(xpathString)).click();
		}
		
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoBtn")));
		driver.findElement(By.className("promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");
		
		driver.quit();

	}

}
