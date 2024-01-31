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

WebUI.click(findTestObject('Amazon_OR/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com. Spend less. Smile more/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Your Account/h2_Your Profiles'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Manage your Profiles/i_Manage your Profiles_home-profile-arrow-icon-0'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Manage your Profiles/div_Rushikesh Ingale'))

WebUI.click(findTestObject('Amazon_OR/Page_Rushikesh/img_Rushikesh_name-edit-pencil-image'))

WebUI.setText(findTestObject('Amazon_OR/Page_Rushikesh/input_Edit your name_profile-name-text-input'), 'Rishi')

WebUI.click(findTestObject('Amazon_OR/Page_Rushikesh/input_Please enter your name_a-button-input'))

WebUI.click(findTestObject('Amazon_OR/Page_Rushikesh/strong_Name is updated'))

WebUI.verifyElementPresent(findTestObject('Amazon_OR/Page_R/strong_Name is updated'), 0)

WebUI.closeBrowser()

