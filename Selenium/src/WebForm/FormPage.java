package WebForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

public static void SubmitForm(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("first-name")).sendKeys("John");
		
		driver.findElement(By.id("last-name")).sendKeys("Doe");
		
		driver.findElement(By.id("job-title")).sendKeys("QA Manager");
		
		driver.findElement(By.id("radio-button-3")).click();
		
		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.id("select-menu")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("11/06/2020");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		
	}
}
