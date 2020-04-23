package WebForm;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompleteWebForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/akankshadeshpande/Documents/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		FormPage formPage = new FormPage();
		formPage.SubmitForm(driver);
		
		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForAlertBanner(driver);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("option[value = '2']"))).click();
		
		assertEquals("The form was successfully submitted!", confirmationPage.alertBanner(driver));
		
		driver.quit();

	}
	
}
