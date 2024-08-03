package tusharseleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement firstCheckbElement = driver.findElement(By.id("checkBoxOption1"));
		firstCheckbElement.click();
		Assert.assertTrue(firstCheckbElement.isSelected());
		firstCheckbElement.click();
		Assert.assertFalse(firstCheckbElement.isSelected());
		
		List<WebElement> checkboxElements = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		System.out.println(checkboxElements.size());
		
		driver.quit();

	}

}
