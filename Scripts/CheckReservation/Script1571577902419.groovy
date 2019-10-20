import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String exampleId = 'Appartement 2_ Nicolas Sarkozy_2019-10-20_2019-10-25'

WebUI.verifyElementPresent(findTestObject('NouvelleReservations/Page_Application Hissab/h3_Reservations'), 0)

WebUI.scrollToElement(findTestObject('NouvelleReservations/Page_Application Hissab/h3_Reservations'), 0)

WebUI.click(findTestObject('NouvelleReservations/Boutons/Page_Application Hissab/button_ThisMonth'))

WebUI.verifyElementPresent(findTestObject('NouvelleReservations/ResaTag/Page_Application Hissab/div_reservation_tag', [('id') : exampleId]), 
    0)

WebUI.scrollToElement(findTestObject('NouvelleReservations/ResaTag/Page_Application Hissab/div_reservation_tag', [('id') : exampleId]), 
    0)

WebUI.verifyElementPresent(findTestObject('NouvelleReservations/ResaTag/Page_Application Hissab/div_reservation_view', [
            ('id') : exampleId]), 0)

WebUI.verifyElementText(findTestObject('NouvelleReservations/ResaTag/Page_Application Hissab/div_reservation_nom', [('id') : exampleId]), 
    nom)

