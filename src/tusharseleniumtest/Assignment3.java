package tusharseleniumtest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		WebElement usernameElement = driver.findElement(By.id("username"));
		WebElement passwordElement = driver.findElement(By.id("password"));
		WebElement selectElement = driver.findElement(By.cssSelector("select.form-control"));
		WebElement signinBtnElement = driver.findElement(By.id("signInBtn"));
		
		List<WebElement> credentialsElement = driver.findElements(By.cssSelector("b > i"));
		String usernameString = credentialsElement.get(0).getText();
		String passwordString = credentialsElement.get(1).getText();
		
		// fill the login form and submit
		usernameElement.sendKeys(usernameString);
		passwordElement.sendKeys(passwordString);
		Select roledropdownSelect = new Select(selectElement);
		roledropdownSelect.selectByVisibleText("Teacher");
		signinBtnElement.click();
		
		// wait for shop page to load and then validate the url of shop page
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".card-footer > button")));
		Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/angularpractice/shop");
		
		// locate the require web elements
		List<WebElement> addBtnElements = driver.findElements(By.cssSelector(".card-footer > button"));
		WebElement checkoutBtnElement = driver.findElement(By.cssSelector(".nav-link.btn.btn-primary"));
		
		Assert.assertTrue(checkoutBtnElement.getText().contains("Checkout ( 0 )"));
		
		// select all products on shop page
		for (WebElement btn : addBtnElements) {
			btn.click();
		}
		
		Assert.assertTrue(checkoutBtnElement.getText().contains("Checkout ( " + addBtnElements.size() + " )"));
		checkoutBtnElement.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
//		wait.until(ExpectedConditions.)f

		driver.quit();

	}

}
