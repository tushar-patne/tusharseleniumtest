package tusharseleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement selectDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(selectDropdown);
		
		List<WebElement> allOptionsElements = dropdown.getOptions();
		System.out.println("all available options under select: ");
		for (WebElement webElement : allOptionsElements) {
			System.out.print(webElement.getText());
			System.out.println(" " + webElement.getAttribute("value"));
		}
		System.out.println("is multiple select option enabled: " + dropdown.isMultiple());
		
		dropdown.selectByValue("INR");
		Thread.sleep(500);
		dropdown.selectByIndex(2);
		Thread.sleep(500);
		dropdown.selectByVisibleText("USD");
		Thread.sleep(500);
		
		System.out.println("selected options: " + dropdown.getAllSelectedOptions());
		System.out.println("selected options: " + dropdown.getFirstSelectedOption().getText());
		
		
		driver.quit();

	}

}
