import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement uploadButton = driver.findElement(By.id("file-upload-field"));
		uploadButton.sendKeys("file-to-upload.png");
		
		Thread.sleep(1000);
		WebElement resetButton = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
		resetButton.click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
