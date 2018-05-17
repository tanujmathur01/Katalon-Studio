package carepointe

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.*
import org.openqa.selenium.By.ByTagName
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.logging.KeywordLogger
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
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class verifyMenuItems {

	WebDriver driver = DriverFactory.getWebDriver();
	KeywordLogger log = new KeywordLogger()

	@Keyword
	public void verifyMenu(TestObject object, String menu) {

		WebElement ele = WebUiCommonHelper.findWebElement(object, 20)
		List<WebElement> menu_list = ele.findElements(By.tagName("li"))
		for(WebElement i: menu_list) {
			if(i.getText()== menu) {
				System.out.println("Menu is exist !");
			}
		}
	}

	@Keyword
	public void clickMenu(TestObject object, String menu) {
		WebElement ele = WebUiCommonHelper.findWebElement(object, 20)
		List<WebElement> menu_list = ele.findElements(By.tagName("li"))
		for(WebElement i: menu_list) {
			if(i.getText()== menu) {
				i.click()
				System.out.println(menu + "clicked.")
				break
			}
		}
	}
}
