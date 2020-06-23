package calculator_xendit.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import calculator_xendit.utilities.BasePage;

public class onlinecalculator_squareroot_negativenumber_negativetest extends BasePage {
	
	@Test (description="This TestCase will perform Addition Function with Normal Number (positive case)")
	public void addition() throws Exception {
		Actions builder = new Actions(drivers);
		builder.sendKeys("#").perform();
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys("@").perform();
		Thread.sleep(5000);	
		WebElement can = drivers.findElements(By.id("fullframe")).get(0);
		String filepath = "C:\\Users\\alifi\\workspace\\calculatorxendit\\test-sqr-negnum-negative.png";
		takeSnapShot(can, filepath);
		
	}

}
 