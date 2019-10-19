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

WebUI.scrollToElement(findTestObject('NouvelleReservations/Page_Application Hissab/button_Nouvelle Reservation'), 0)

WebUI.click(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/button_Nouvelle Reservation'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/select_Appartement 0Appartemen'), 
    Appartement, true)

WebUI.setText(findTestObject('NouvelleReservations/Dates/Page_Application Hissab/input_Arriv_arrive'), jour_arrive)

WebUI.setText(findTestObject('NouvelleReservations/Dates/Page_Application Hissab/input_Dpart_depart'), jour_depart)

WebUI.setText(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/input_Nom complet_nomcomplet'), 
    Nom_Client)

WebUI.sendKeys(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/input_Tlphone_phone'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/input_Tlphone_phone'), Phone)

WebUI.setText(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/input_Prix_prix'), Prix)

WebUI.selectOptionByValue(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/select_EurosDirhams'), 
    Devise, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/select_A pay en ligneVa payer'), 
    Mode_paiement, true)

WebUI.selectOptionByValue(findTestObject('NouvelleReservations/Page_Application Hissab/select_nbr_adulte'), nbr_adulte, 
    true)

WebUI.selectOptionByValue(findTestObject('NouvelleReservations/Page_Application Hissab/select_nbr_enfant'), nbr_enfant, 
    true)

WebUI.setText(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/textarea_Commentaires (faculta'), 
    Comments)

WebUI.scrollToElement(findTestObject('NouvelleReservations/Page_Application Hissab/button_Enregistrer'), 0)

WebUI.click(findTestObject('Object Repository/NouvelleReservations/Page_Application Hissab/button_Enregistrer'))

