//import org.openqa.selenium.By.ById;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeboardAndMouseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/keypress");
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		name.sendKeys("Akanksha Deshpande");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement button = driver.findElement(By.id("button"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		button.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();
	}

}