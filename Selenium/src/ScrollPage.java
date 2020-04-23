import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/scroll");
		WebElement name= driver.findElement(By.id("name"));
		name.sendKeys("Akanksha");
		WebElement date= driver.findElement(By.id("date"));
		date.sendKeys("04/08/2019");
		driver.quit();
	}

}
