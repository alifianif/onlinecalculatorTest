package calculator_xendit.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import calculator_xendit.utilities.BasePage;

public class onlinecalculator_percentage_alphabetical_negativetest extends BasePage {
	
	@Test (description="This TestCase will perform Addition Function with Normal Number (positive case)")
	public void addition() throws Exception {
		Actions builder = new Actions(drivers);
		builder.sendKeys("a").perform();
		builder.sendKeys("%").perform();
		Thread.sleep(5000);	
		WebElement can = drivers.findElements(By.id("fullframe")).get(0);
		String filepath = "C:\\Users\\alifi\\workspace\\calculatorxendit\\test-perc-alpha-negative.png";
		takeSnapShot(can, filepath);
		
	}

}
 