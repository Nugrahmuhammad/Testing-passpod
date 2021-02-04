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

WebUI.navigateToUrl('https://passpod.com/')

WebUI.click(findTestObject('Object Repository/Page_Pesan Modem Wifi 4G dan Tiket Atraksi _3c6b1e/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_Register - Passpod/input_Destinasi Utama_form-control'), 'nugrah')

WebUI.setText(findTestObject('Object Repository/Page_Register - Passpod/input_Destinasi Utama_form-control_1'), 'pratama')

WebUI.setText(findTestObject('Object Repository/Page_Register - Passpod/input_Destinasi Utama_form-control_1_2'), '12345678@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - Passpod/input_Destinasi Utama_form-control input-pwd'), 
    'XH4CfIuXAnY=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - Passpod/input_Destinasi Utama_form-control input-pwd_1'), 
    'XH4CfIuXAnY=')

WebUI.click(findTestObject('Object Repository/Page_Register - Passpod/input_Destinasi Utama_form-check-input'))

WebUI.click(findTestObject('Object Repository/Page_Register - Passpod/button_Register'))

WebUI.verifyTextPresent('Regiter Error', true)

WebUI.closeBrowser()

