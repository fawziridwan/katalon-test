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

WebUI.callTestCase(findTestCase('Login/Login - Seller/TC01 - Login Seller'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PaDi UMKM Seller/menu_add_product'))

WebUI.scrollToElement(findTestObject('label'), 2)

'Passing the path of the file'
WebUI.uploadFile(findTestObject('upload_photo'), upload_photo)

FilePath = WebUI.getAttribute(findTestObject('upload_photo'), upload_photo)

WebUI.verifyMatch(upload_photo, '/Users/fawzi/Downloads/image_2023-02-20_15-32-46.png', false)

'Passing the path of the file'
WebUI.uploadFile(findTestObject('upload_video'), upload_video)

FilePath2 = WebUI.getAttribute(findTestObject('upload_video'), upload_video)

//FilePath = WebUI.getAttribute(findTestObject('upload_video'), upload_video)
WebUI.verifyMatch(upload_video, '/Users/fawzi/Downloads/sampling.mp4', false)

