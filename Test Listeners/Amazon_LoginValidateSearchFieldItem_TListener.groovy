import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class Amazon_LoginValidateSearchFieldItem_TListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase() {
		WebUI.click(findTestObject('Object Repository/AmazonPages_OR/TL_Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

		WebUI.setText(findTestObject('Object Repository/AmazonPages_OR/TL_Amazon_ValidateSearchFieldItem_OR/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    '8902526748')

		WebUI.click(findTestObject('Object Repository/AmazonPages_OR/TL_Amazon_ValidateSearchFieldItem_OR/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

		WebUI.setEncryptedText(findTestObject('Object Repository/AmazonPages_OR/TL_Amazon_ValidateSearchFieldItem_OR/Page_Amazon Sign-In/input_Forgot your password_password'), 
    'RfES2L809yyT69vCWLoDzQ==')

		WebUI.click(findTestObject('Object Repository/AmazonPages_OR/TL_Amazon_ValidateSearchFieldItem_OR/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase() {
		WebUI.mouseOver(findTestObject('Object Repository/AmazonPages_OR/TL_Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  da vinci code/span_Account  Lists_nav-icon nav-arrow'))

		WebUI.click(findTestObject('Object Repository/AmazonPages_OR/TL_Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  da vinci code/span_Sign Out'))


	}
}