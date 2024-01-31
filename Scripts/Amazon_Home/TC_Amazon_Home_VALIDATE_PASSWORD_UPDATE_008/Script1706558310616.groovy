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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com. Spend less. Smile more/a_Hello, sign in  Account  Lists'))

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    '7387131032')

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon Sign-In/input_Enter your email or mobile phone number_continue'))

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Amazon Sign-In/input_Forgot your password_password'), 'Pass@1234')

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, Rushikesh'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Your Account/h2_Login  security'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Login  Security/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Amazon Change Name, E-mail, Password/input_Current password_password'), 
    'Pass@1234')

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Amazon Change Name, E-mail, Password/input_New password_passwordNew'), 
    'Pass@123')

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Amazon Change Name, E-mail, Password/input_Reenter new password_passwordNewCheck'), 
    'Pass@123')

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon Change Name, E-mail, Password/input_Reenter new password_cnep_1D_submit_button'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Login  Security/div_Password updated'))

WebUI.closeBrowser()

