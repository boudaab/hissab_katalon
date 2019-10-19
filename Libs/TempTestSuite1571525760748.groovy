import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Reservations/NouvelleReservation')

suiteProperties.put('name', 'NouvelleReservation')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\bouda\\Katalon Studio\\Hissab\\Reports\\Reservations\\NouvelleReservation\\20191020_005556\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Reservations/NouvelleReservation', suiteProperties, [new TestCaseBinding('Test Cases/OpenTheBrowser', 'Test Cases/OpenTheBrowser',  null), new TestCaseBinding('Test Cases/NewReservation - Iteration 1', 'Test Cases/NewReservation',  [ 'Phone' : '+33699089737' , 'nbr_adulte' : '2' , 'Devise' : 'Dirhams' , 'nbr_enfant' : '3' , 'jour_depart' : '25102019' , 'Prix' : ' 1200' , 'Comments' : ' Voici mon commentaire' , 'Mode_paiement' : 'A pay\u00E9 en ligne' , 'Appartement' : 'Appartement 2' , 'jour_arrive' : '20102019' , 'Nom_Client' : ' Nicolas Sarkozy' ,  ]), new TestCaseBinding('Test Cases/NewReservation - Iteration 2', 'Test Cases/NewReservation',  [ 'Phone' : '+2123004903403' , 'nbr_adulte' : '2' , 'Devise' : 'Euros' , 'nbr_enfant' : '0' , 'jour_depart' : '21102019' , 'Prix' : ' 400' , 'Comments' : ' Riji m3a 2h diel sba7' , 'Mode_paiement' : 'Va payer sur place' , 'Appartement' : 'Appartement 5' , 'jour_arrive' : '10102019' , 'Nom_Client' : ' Jacques Chirac' ,  ]), new TestCaseBinding('Test Cases/CloseTheBrowser', 'Test Cases/CloseTheBrowser',  null)])
