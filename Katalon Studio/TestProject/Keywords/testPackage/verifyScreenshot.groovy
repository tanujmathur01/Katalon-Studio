package testPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI



import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;


public class verifyScreenshot {
	
	@Keyword
	public verifyScreenshotAndText(TestObject object) {
		
		//WebElement element = WebUiCommonHelper.findWebElement(object,20)
		WebDriver driver = DriverFactory.getWebDriver()
		
			//WebUiCommonHelper.findWebElement(object,20)
			//File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
		
			WebElement we = WebUiCommonHelper.findWebElement(object,20)
			 File v = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 //File v=fd.getScreenshotAs(OutputType.FILE); (Use this line For selenium instead above)
			 BufferedImage bi=ImageIO.read(v);
			 org.openqa.selenium.Point p=we.getLocation();
			 int n=we.getSize().getWidth();
			 int m=we.getSize().getHeight();
			 BufferedImage d = bi.getSubimage(p.getX(), p.getY(), n, m);
			 ImageIO.write(d,"png", v);
			 
			 FileUtils.copyFile(v, new File("D:\\yahooError.jpg"))
	}
	
}
