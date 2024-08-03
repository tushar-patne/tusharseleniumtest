package tusharseleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		WebElement topFramElement = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topFramElement);
		
		WebElement middleFramElement = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(middleFramElement);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.switchTo().defaultContent();
		driver.quit();

	}

}
