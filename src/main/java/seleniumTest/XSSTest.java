package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XSSTest extends BaseTest{
	@Test
    public void testXSSInjection() {
        WebElement inputField = driver.findElement(By.id("search"));
        WebElement submitButton = driver.findElement(By.id("searchButton"));

        // Injecting XSS payload
        inputField.sendKeys("<script>alert('XSS')</script>");
        submitButton.click();
    }

}
