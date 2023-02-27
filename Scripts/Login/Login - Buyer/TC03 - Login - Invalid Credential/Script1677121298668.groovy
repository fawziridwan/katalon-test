import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.host)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/or_login_buyer/menu_masuk'))

WebUI.setText(findTestObject('Login/or_login_buyer/input_buyer_email'), 'fawziridwan@gmail.com')

WebUI.setText(findTestObject('Login/or_login_buyer/input_buyer_password'), '12345678')

WebUI.click(findTestObject('Login/or_login_buyer/btn_login'))

WebUI.getText(findTestObject('Login/or_login_buyer/message_buyer_invalid_credential'))

WebUI.verifyTextPresent('Silahkan periksa kembali email dan kata sandi anda', false)

WebUI.closeBrowser()

