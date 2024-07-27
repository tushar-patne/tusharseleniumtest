package tusharseleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		int adults = 4;
		int children = 3;
		int infact = 1;
		
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
		
		i = infact;
		while (i > 0) {
			incrementInfactBtnElement.click();
			i--;
		}
		
		System.out.println("selected adults: " + numberOfAdultElement.getText());
		System.out.println("selected children: " + numberOfChildElement.getText());
		System.out.println("selected infacts: " + numberOfInfactElement.getText());
		
		
		driver.quit();

	}

}
