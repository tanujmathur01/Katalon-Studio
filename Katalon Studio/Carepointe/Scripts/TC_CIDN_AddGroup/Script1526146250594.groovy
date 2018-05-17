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

CustomKeywords.'carepointe.verifyMenuItems.clickMenu'(findTestObject('Carepointe Objects/Dashboard/div_CarePointe           Dashb'), 
    'CIDN REGISTRY')

WebUI.delay(10)

CustomKeywords.'carepointe.verifyListItemSelected.verifyItemSelected'(findTestObject('Carepointe Objects/CIDN Registry/ul_Entities'), 
    'Entities')

WebUI.click(findTestObject('Carepointe Objects/CIDN Registry/a_Groups'))

WebUI.delay(10)

WebUI.click(findTestObject('Carepointe Objects/CIDN Registry/button_Add Group'))

WebUI.verifyElementText(findTestObject('Carepointe Objects/CIDN Registry/Groups/h3_Add Group'), 'Add Group')

name = CustomKeywords.'carepointe.randomDataGenerator.getGetRandomName'(3, 7)

WebUI.setText(findTestObject('Carepointe Objects/CIDN Registry/Groups/input_groupName'), name)

WebUI.setText(findTestObject('Carepointe Objects/CIDN Registry/Groups/textarea_form-control input-md'), 'for group testing')

WebUI.delay(10)

WebUI.click(findTestObject('Carepointe Objects/CIDN Registry/Groups/button_Add'))

WebUI.delay(10)

if (WebUI.verifyElementVisible(findTestObject('Carepointe Objects/CIDN Registry/Groups/p_Group name already exists.'), FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('Carepointe Objects/CIDN Registry/Groups/button_OK'))

    WebUI.setText(findTestObject('Carepointe Objects/CIDN Registry/Groups/input_groupName'), 'testmygroupone')

    WebUI.delay(10)

    WebUI.click(findTestObject('Carepointe Objects/CIDN Registry/button_Add Group'))
}

