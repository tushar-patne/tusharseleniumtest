package tusharseleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		WebElement passangerDropdownElement = driver.findElement(By.id("divpaxinfo"));
		WebElement incrementAdultBtnElement = driver.findElement(By.id("hrefIncAdt"));
		WebElement incrementChildBtnElement = driver.findElement(By.id("hrefIncChd"));
		WebElement incrementInfactBtnElement = driver.findElement(By.id("hrefIncInf"));
		WebElement numberOfAdultElement = driver.findElement(By.id("spanAudlt"));
		WebElement numberOfChildElement = driver.findElement(By.id("spanChild"));
		WebElement numberOfInfactElement = driver.findElement(By.id("spanInfant"));
		WebElement doneBtnElement = driver.findElement(By.id("btnclosepaxoption"));
		
		int adults = 4;
		int children = 3;
		int infant = 1;
		
		System.out.println(passangerDropdownElement.getText());
		passangerDropdownElement.click();
		
		int i = adults; 
		while (i > 0) {
			incrementAdultBtnElement.click();
			i--;
		};
		
		i = children;
		while (i > 0) {
			incrementChildBtnElement.click();
			i--;
		}
		
		i = infant;
		while (i > 0) {
			incrementInfactBtnElement.click();
			i--;
		}
		
		System.out.println("selected adults: " + numberOfAdultElement.getText());
		Assert.assertEquals(Integer.parseInt(numberOfAdultElement.getText()), adults + 1);
		System.out.println("selected children: " + numberOfChildElement.getText());
		Assert.assertEquals(Integer.parseInt(numberOfChildElement.getText()), children);
		System.out.println("selected infants: " + numberOfInfactElement.getText());
		Assert.assertEquals(Integer.parseInt(numberOfInfactElement.getText()), infant);
		
		doneBtnElement.click();
		String actualDropdownText = passangerDropdownElement.getText();
		String expectedDropdownText = adults+1 + " Adult, " + children + " Child, " + infant + " Infant";
		System.out.println(actualDropdownText);
		System.out.println(expectedDropdownText);
		Assert.assertEquals(actualDropdownText, expectedDropdownText);

		driver.quit();

	}

}
