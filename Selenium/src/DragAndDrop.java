import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement imagElement= driver.findElement(By.id("image"));
		WebElement boxElement= driver.findElement(By.id("box"));
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.dragAndDrop(imagElement, boxElement).build().perform();
		
		driver.quit();

	}

}
