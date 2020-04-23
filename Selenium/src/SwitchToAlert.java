import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		Thread.sleep(3000);
		WebElement alertButton = driver.findElement(By.id("alert-button"));
		alertButton.click();
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		
		Thread.sleep(3000);
		driver.quit();

	}

}
