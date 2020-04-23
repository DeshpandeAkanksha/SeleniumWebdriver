import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement modalbutton = driver.findElement(By.id("modal-button"));
		modalbutton.click();
		
		Thread.sleep(3000);
		WebElement closebutton = driver.findElement(By.id("close-button"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", closebutton);
		
		driver.quit();

	}

}
