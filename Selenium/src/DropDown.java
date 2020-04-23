import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropDownButton = driver.findElement(By.id("dropdownMenuButton"));
		dropDownButton.click();
		
		Thread.sleep(1000);
		WebElement option = driver.findElement(By.id("autocomplete"));
		option.click();
		
		Thread.sleep(1000);
		WebElement option2 = driver.findElement(By.xpath("/html/body/div/div/div/a[4]"));
		option2.click();
		
		Thread.sleep(1000);
		driver.quit();
	}

}
