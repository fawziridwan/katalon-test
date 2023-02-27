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

WebUI.navigateToUrl('https://stg.berasumkm.id/')

WebUI.click(findTestObject('Object Repository/Register/Register - New/or_homepage/menu_register'))

WebUI.click(findTestObject('Object Repository/Register/Register - New/page_register_buyer/section_buyer_retail'))

WebUI.setText(findTestObject('Object Repository/Register/Register - New/page_register_buyer/input_Nama_name'), 'Fawzi')

WebUI.setText(findTestObject('Object Repository/Register/Register - New/page_register_buyer/input_Alamat Email_email'), 
    'fawziridwan1@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Register/Register - New/page_register_buyer/input_Telepon_phonenumber'), 
    '82216550542')

WebUI.click(findTestObject('Object Repository/Register/Register - New/page_register_buyer/button_Daftar'))

WebUI.getText(findTestObject('Register/Register - New/page_register_buyer/popup_confirmation_register'))

WebUI.verifyTextPresent('Terima kasih telah melakukan registrasi, cek email Anda untuk melakukan aktivasi akun PaDi UMKM', 
    false)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Register/Register - New/page_register_buyer/button_Kembali ke beranda'))

WebUI.closeBrowser()

