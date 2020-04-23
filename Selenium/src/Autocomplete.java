import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("175 Rock street, Fall River, Massachusetts");
		
		Thread.sleep(1000);
		WebElement autocompeteresult= driver.findElement(By.className("pac-item"));
		autocompeteresult.click();
		driver.quit();

	}

}
