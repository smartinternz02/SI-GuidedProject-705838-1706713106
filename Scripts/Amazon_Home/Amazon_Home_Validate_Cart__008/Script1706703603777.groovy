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

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    findTestData('TestData_Amazon/Amazon_AddtoCart_DDT').getValue(findTestData('TestData_Amazon/Amazon_AddtoCart_DDT'), ''))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.click(findTestObject('Amazon_OR/Page_Amazon.com  pens/span_Amazon Basics Retractable Ballpoint Pe_506f13', [('variable') : findTestData(
                null).getValue(1, 1)]))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com  Amazon Basics Retractable _37d1c0/span_Quantity'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com  Amazon Basics Retractable _37d1c0/a_4'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com  Amazon Basics Retractable _37d1c0/input_Shipping cost, delivery date, and ord_223673'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com Shopping Cart/span_Added to Cart'))

WebUI.click(findTestObject('Object Repository/Amazon_OR/Page_Amazon.com Shopping Cart/span_Added to Cart'))

WebUI.closeBrowser()

WebUI.setText(findTestObject('Amazon_OR/Page_Amazon Sign-In/a_Create your Amazon account'), findTestData(null).getValue(
        '', ''))

