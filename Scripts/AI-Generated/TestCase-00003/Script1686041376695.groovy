import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page_home click on hyperlink_positive_growth_ --> navigate to Page_positive-growth_'

testObj = findTestObject('Object Repository/Page_home/hyperlink_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_positive-growth_ click on hyperlink_category_khoa_hoc_suc_khoe_ --> navigate to Page_category_khoa-hoc-suc-khoe_'

testObj = findTestObject('Object Repository/Page__positive-growth/hyperlink_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/.*/.*/positive-growth(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_category_khoa-hoc-suc-khoe_ click on hyperlink_gioi_thieu_ve_an_tho_raw_foods_diet_va_p --> navigate to Page_gioi-thieu-ve-an-tho-raw-foods-diet-va-phan-biet-raw-vegan-voi-fruitarian_'

testObj = findTestObject('Object Repository/Page_category_khoa-hoc-suc-khoe/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/category/khoa-hoc-suc-khoe(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_gioi-thieu-ve-an-tho-raw-foods-diet-va-phan-biet-raw-vegan-voi-fruitarian_'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00003_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
