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

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    '7387131032')

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon Sign-In/input_Enter your email or mobile phone number_continue'))

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Amazon Sign-In/input_Forgot your password_password'), 'Pass@123')

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, Rushikesh'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Your Account/h2_Your Addresses'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/div_Your Addresses_ya-myab-plus-address-icon'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/span_United States'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/a_India'))

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/input_Full name (First and Last name)_addre_efd85e'), 
    'R I')

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/input_Street address_address-ui-widgets-ent_f39b00'), 
    'Pune')

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/input_Street address_address-ui-widgets-ent_e2a7ba'))

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/input_City_address-ui-widgets-enterAddressCity'), 
    'Lonavala')

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/input_State  Province  Region_address-ui-wi_508907'), 
    'Maharashtra')

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/input_Zip Code_address-ui-widgets-enterAddr_79805c'), 
    '410401')

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/input_Phone number_address-ui-widgets-enter_5bad04'), 
    '7387131032')

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/input_Please enter a valid mobile number_a-_1dfb4f'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_/i_Select ID document_a-icon a-icon-radio'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_/input_Why is an ID required_a-button-input'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Your Addresses/h4_Address saved'))

