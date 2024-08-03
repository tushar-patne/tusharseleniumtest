package tusharseleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameElement = driver.findElement(By.xpath("//label[text()=\"Name\"]/following-sibling::input[@name=\"name\"]"));
		WebElement emailElement = driver.findElement(By.xpath("//label[text()=\"Email\"]/following-sibling::input[@name=\"email\"]"));
		WebElement passwordElement = driver.findElement(By.xpath("//label[text()=\"Password\"]/following-sibling::input[@type=\"password\"]"));
		WebElement icecreamCheckElement = driver.findElement(By.id("exampleCheck1"));
		WebElement selectGenderElement = driver.findElement(By.id("exampleFormControlSelect1"));
		WebElement studentRadioElement = driver.findElement(By.id("inlineRadio1"));
		WebElement dateElement = driver.findElement(By.cssSelector("input[type='date']"));
		WebElement submitBtnElement = driver.findElement(By.cssSelector("input[type='submit']"));
		Actions builder = new Actions(driver);
		
		nameElement.sendKeys("Tushar Patne");
		emailElement.sendKeys("tusharpatnetest@123.gmail.com");
		passwordElement.sendKeys("dummyPassword@123");
		icecreamCheckElement.click();
		Select genderSelect = new Select(selectGenderElement);
		genderSelect.selectByVisibleText("Female");
		studentRadioElement.click();
		dateElement.sendKeys("29-07-2024");
		submitBtnElement.click();
		
		driver.quit();
		

	}

}
