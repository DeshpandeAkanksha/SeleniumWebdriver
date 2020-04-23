import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("11/06/2022");
		datePicker.sendKeys(Keys.RETURN);
		
		Thread.sleep(1000);
		driver.quit();

	}

}
