import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {

	@Given("User navigate to main Homepage")
	def navigateToLoginPage()	{
		println("\n navigate to homepage")
		WebUI.openBrowser(GlobalVariable.host)
		WebUI.maximizeWindow()
	}

	@When("User click menu Login")
	def clickMenuLogin()	{
		println("\n login menu clicked")
		WebUI.click(findTestObject('Login/or_login_buyer/menu_masuk'))
	}

	@And("User enter the (.*) and (.*)")
	def input_credential(String email, String password)	{
		println("\n email & password entered")
		WebUI.setText(findTestObject('Login/or_login_buyer/input_buyer_email'), email)
		WebUI.setText(findTestObject('Login/or_login_buyer/input_buyer_password'), password)
	}
	@And("User enter incorrect the (.*) and (.*)")
	def input_incorrect_credential(String email, String password)	{
		println("\n email & password entered")
		WebUI.setText(findTestObject('Login/or_login_buyer/input_buyer_email'), email)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Login/or_login_buyer/input_buyer_password'), password)
	}
	@And("Click the button Login")
	def submit_login()	{
		println("\n button login submitted")
		WebUI.click(findTestObject('Login/or_login_buyer/btn_login'))
	}
	@Then("User is navigate to Homepage")
	def navigateToDashboard()	{
		println("\n navigate to dashboard")
		WebUI.closeBrowser()
	}

	@Then("User see the error message 'Silahkan periksa kembali email dan kata sandi anda'")
	def i_should_see_the_error_message()	{
		println("\n should not see the error")
		WebUI.getText(findTestObject('Login/or_login_buyer/message_buyer_invalid_credential'))
		WebUI.delay(5)
		WebUI.verifyTextPresent('Silahkan periksa kembali email dan kata sandi anda', false)
		WebUI.closeBrowser()
	}
}