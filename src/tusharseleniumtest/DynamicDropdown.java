package tusharseleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		// cities dropdowns
		WebElement departureDropdownInput = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		WebElement arrivalDropdownInput = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		// cities to select
		// today's date
		// radio button
		WebElement onewayRadioBtn = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		WebElement roundTripRadioBtn = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		// checkboxes
		WebElement familyAndFriendsCheck = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		WebElement seniorCitizenCheck = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		WebElement indianArmyCheck = driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
		WebElement studentDiscoutCheck = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		
		departureDropdownInput.click();
		WebElement departureCity = driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"]//a[@value=\"BOM\"]"));
		departureCity.click();
		WebElement arrivalCity = driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"DEL\"]"));
		arrivalCity.click();
		WebElement todaysDatElement = driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover"));
		
		todaysDatElement.click();
		onewayRadioBtn.click();

		familyAndFriendsCheck.click();
		Assert.assertTrue(familyAndFriendsCheck.isSelected());
		studentDiscoutCheck.click();
		Assert.assertTrue(studentDiscoutCheck.isSelected());
		
		Assert.assertFalse(seniorCitizenCheck.isSelected());
		Assert.assertFalse(indianArmyCheck.isSelected());

		driver.quit();
		

	}

}
