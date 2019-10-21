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



RunConfiguration.setExecutionSettingFile("D:\\data\\ws-hissab-katalon\\hissab_katalon\\Reports\\Reservations\\NouvelleReservation\\20191021_222750\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Reservations/NouvelleReservation', suiteProperties, [new TestCaseBinding('Test Cases/OpenTheBrowser', 'Test Cases/OpenTheBrowser',  null), new TestCaseBinding('Test Cases/NewReservation - Iteration 1', 'Test Cases/NewReservation',  [ 'Phone' : '+33699089737' , 'nbr_adulte' : '2' , 'Devise' : 'Dirhams' , 'nbr_enfant' : '3' , 'jour_depart' : '25102019' , 'Prix' : ' 200' , 'Comments' : ' Voici mon 1er commentaire' , 'Mode_paiement' : 'A pay\u00E9 en ligne' , 'Appartement' : 'Appartement 0' , 'jour_arrive' : '20' , 'Nom_Client' : 'Haron BOUDALH' ,  ]), new TestCaseBinding('Test Cases/NewReservation - Iteration 2', 'Test Cases/NewReservation',  [ 'Phone' : '+33699089737' , 'nbr_adulte' : '2' , 'Devise' : 'Dirhams' , 'nbr_enfant' : '3' , 'jour_depart' : '25102019' , 'Prix' : ' 300' , 'Comments' : ' Voici mon 2em commentaire' , 'Mode_paiement' : 'A pay\u00E9 en ligne' , 'Appartement' : 'Appartement 1' , 'jour_arrive' : '20' , 'Nom_Client' : 'Lina BOUDALH' ,  ]), new TestCaseBinding('Test Cases/NewReservation - Iteration 3', 'Test Cases/NewReservation',  [ 'Phone' : '+33699089737' , 'nbr_adulte' : '2' , 'Devise' : 'Dirhams' , 'nbr_enfant' : '3' , 'jour_depart' : '25102019' , 'Prix' : ' 400' , 'Comments' : ' Voici mon 3em commentaire' , 'Mode_paiement' : 'A pay\u00E9 en ligne' , 'Appartement' : 'Appartement 2' , 'jour_arrive' : '20' , 'Nom_Client' : 'Adam BOUDALH' ,  ]), new TestCaseBinding('Test Cases/NewReservation - Iteration 4', 'Test Cases/NewReservation',  [ 'Phone' : '+33699089737' , 'nbr_adulte' : '2' , 'Devise' : 'Dirhams' , 'nbr_enfant' : '3' , 'jour_depart' : '25102019' , 'Prix' : ' 500' , 'Comments' : ' Voici mon 4em commentaire' , 'Mode_paiement' : 'A pay\u00E9 en ligne' , 'Appartement' : 'Appartement 3' , 'jour_arrive' : '20' , 'Nom_Client' : 'Kais BOUDALH' ,  ]), new TestCaseBinding('Test Cases/NewReservation - Iteration 5', 'Test Cases/NewReservation',  [ 'Phone' : '+2123004903403' , 'nbr_adulte' : '2' , 'Devise' : 'Euros' , 'nbr_enfant' : '0' , 'jour_depart' : '21102019' , 'Prix' : ' 600' , 'Comments' : ' Voici mon 5em commentaire' , 'Mode_paiement' : 'Va payer sur place' , 'Appartement' : 'Appartement 4' , 'jour_arrive' : '10' , 'Nom_Client' : 'Youssef BOUDALH' ,  ]), new TestCaseBinding('Test Cases/NewReservation - Iteration 6', 'Test Cases/NewReservation',  [ 'Phone' : '+33699089737' , 'nbr_adulte' : '2' , 'Devise' : 'Dirhams' , 'nbr_enfant' : '3' , 'jour_depart' : '25102019' , 'Prix' : ' 700' , 'Comments' : ' Voici mon 6em commentaire' , 'Mode_paiement' : 'A pay\u00E9 en ligne' , 'Appartement' : 'Appartement 5' , 'jour_arrive' : '20' , 'Nom_Client' : 'Yasmine BOUDALH' ,  ]), new TestCaseBinding('Test Cases/CheckReservation - Iteration 1', 'Test Cases/CheckReservation',  [ 'id' : 'Appartement 0_Haron BOUDALH_2019-10-20_2019-10-25' , 'nom' : 'Haron BOUDALH' , 'logement' : 'Appartement 0' ,  ]), new TestCaseBinding('Test Cases/CheckReservation - Iteration 2', 'Test Cases/CheckReservation',  [ 'id' : 'Appartement 1_Lina BOUDALH_2019-10-20_2019-10-25' , 'nom' : 'Lina BOUDALH' , 'logement' : 'Appartement 1' ,  ]), new TestCaseBinding('Test Cases/CheckReservation - Iteration 3', 'Test Cases/CheckReservation',  [ 'id' : 'Appartement 2_Adam BOUDALH_2019-10-20_2019-10-25' , 'nom' : 'Adam BOUDALH' , 'logement' : 'Appartement 2' ,  ]), new TestCaseBinding('Test Cases/CheckReservation - Iteration 4', 'Test Cases/CheckReservation',  [ 'id' : 'Appartement 3_Kais BOUDALH_2019-10-20_2019-10-25' , 'nom' : 'Kais BOUDALH' , 'logement' : 'Appartement 3' ,  ]), new TestCaseBinding('Test Cases/CheckReservation - Iteration 5', 'Test Cases/CheckReservation',  [ 'id' : 'Appartement 4_Youssef BOUDALH_2019-10-10_2019-10-21' , 'nom' : 'Youssef BOUDALH' , 'logement' : 'Appartement 4' ,  ]), new TestCaseBinding('Test Cases/CheckReservation - Iteration 6', 'Test Cases/CheckReservation',  [ 'id' : 'Appartement 5_Yasmine BOUDALH_2019-10-20_2019-10-25' , 'nom' : 'Yasmine BOUDALH' , 'logement' : 'Appartement 5' ,  ]), new TestCaseBinding('Test Cases/CloseTheBrowser', 'Test Cases/CloseTheBrowser',  null)])
