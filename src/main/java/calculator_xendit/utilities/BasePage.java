package calculator_xendit.utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage 
{
	public WebDriver drivers;
	
	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Libs/chromedriver.exe");
		drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("https://www.online-calculator.com/full-screen-calculator/");
		drivers.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		drivers.quit();
	}
	
	public static void takeSnapShot(WebElement webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
}
