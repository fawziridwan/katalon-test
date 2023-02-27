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

WebUI.click(findTestObject('Object Repository/Page_PaDi UMKM Seller/close_popup'))

WebUI.click(findTestObject('Page_PaDi UMKM Seller/menu_add_product'))

WebUI.setText(findTestObject('Object Repository/Product/add/input_nama_product'), 'Bahan Test')

WebUI.setText(findTestObject('Product/add/text_area_deskripsi'), 'ajsdahdadhakhdjahsdjkahsdkahdjashkdjahkdhaskhajdhaasa')

WebUI.click(findTestObject('Object Repository/Product/add/dropdown_pilih_kategori_produk'))

WebUI.setText(findTestObject('Object Repository/Product/add/input_pilih_kategori'), 'Bahan Kimia')

WebUI.click(findTestObject('Object Repository/Product/add/div_Bahan Kimia'))

WebUI.click(findTestObject('Object Repository/Product/add/div_Pilih_css-ackcql'))

WebUI.setText(findTestObject('Object Repository/Product/add/input_Bahan Kimia_react-select-7-input'), 'Asbes')

WebUI.click(findTestObject('Object Repository/Product/add/div_Asbes'))

