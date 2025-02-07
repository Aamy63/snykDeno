package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SQLInjectionTest extends BaseTest {

	@Test
	public void loginWithSQLInjection() {
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login"));

		// Injecting SQL payload instead of a normal username
		username.sendKeys("admin' OR '1'='1");
		password.sendKeys("password");
		loginButton.click();
	}

}
