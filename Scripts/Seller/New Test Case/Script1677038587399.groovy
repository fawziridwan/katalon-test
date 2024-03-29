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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://seller-stg.berasumkm.id/login')

WebUI.setText(findTestObject('Seller Login/input_Alamat Email_username'), 'fawzi')

WebUI.getText(findTestObject('Seller Login/span_Email wajib diisi'))

WebUI.verifyTextPresent('Email wajib diisi', false)

not_run: WebUI.setText(findTestObject('Seller Login/input_Kata Sandi_password'), '123456221')

not_run: WebUI.click(findTestObject('Seller Login/button_Login_user_normal_flow'))

not_run: WebUI.getText(findTestObject('Seller Login/message_wrong_email_or_password'))

not_run: WebUI.verifyTextPresent('Tolong periksa kembali email dan kata sandi Anda.', false)

