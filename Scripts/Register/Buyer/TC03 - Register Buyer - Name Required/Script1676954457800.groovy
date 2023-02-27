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

WebUI.navigateToUrl(GlobalVariable.host)

WebUI.click(findTestObject('Register/Register - New/Test/Page_PaDi UMKM/button_Daftar'))

WebUI.click(findTestObject('Register/Register - New/Test/Page_Register  PaDi UMKM/div_Pembeli Retail'))

WebUI.setText(findTestObject('Register/Register - New/Test/Page_Register  PaDi UMKM/input_Nama_name'), 'fawzi')

WebUI.sendKeys(findTestObject('Register/Register - New/Test/Page_Register  PaDi UMKM/input_Nama_name'), Keys.chord(Keys.BACK_SPACE, 
        Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.getText(findTestObject('Register/Register - New/Test/Page_Register  PaDi UMKM/object_repository_validasi_register_buyer/message_name_required'))

WebUI.verifyTextPresent('Nama wajib diisi', false)

not_run: WebUI.setText(findTestObject('Register/Register - New/Test/Page_Register  PaDi UMKM/input_Alamat Email_email'), 
    'fawziridwan@mailinator.com')

not_run: WebUI.setText(findTestObject('Register/Register - New/Test/Page_Register  PaDi UMKM/input_Telepon_phonenumber'), 
    '82216550540')

not_run: WebUI.closeBrowser()

