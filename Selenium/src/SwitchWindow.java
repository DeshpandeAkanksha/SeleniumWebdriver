import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.dynalink.support.ChainedCallSite;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement button = driver.findElement(By.id("new-tab-button"));
		button.click();
		
		String originalHandle= driver.getWindowHandle();
		Thread.sleep(3000);
		for(String handle: driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		Thread.sleep(3000);
		driver.switchTo().window(originalHandle);
		
		driver.quit();
		

	}

}
