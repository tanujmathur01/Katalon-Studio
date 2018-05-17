import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.comment('Navigating to url')

WebUI.navigateToUrl('https://uat.cms.carepointe.cloud/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Carepointe Objects/Login/button_Log in'))

WebUI.verifyElementText(findTestObject('Carepointe Objects/Login/em_Please enter your email add'), 'Please enter your email address')

WebUI.verifyElementText(findTestObject('Carepointe Objects/Login/em_Please enter your password'), 'Please enter your password')

WebUI.setText(findTestObject('Carepointe Objects/Login/input_email'), 'test')

WebUI.setText(findTestObject('Carepointe Objects/Login/input_password'), 'test')

WebUI.click(findTestObject('Carepointe Objects/Login/button_Log in'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Carepointe Objects/Dashboard/input_search_top'), 0)

WebUI.verifyElementText(findTestObject('Carepointe Objects/Dashboard/span_Dashboard'), 'DASHBOARD')

CustomKeywords.'carepointe.verifyMenuItems.verifyMenu'(findTestObject('Carepointe Objects/Dashboard/div_CarePointe           Dashb'), 
    'DASHBOARD')

