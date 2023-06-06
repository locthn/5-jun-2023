import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_category_uncategorized_'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/uncategorized/')

'step 2: At Page_category_uncategorized_ click on hyperlink_top_5_thuong_hieu_my_pham_organic_tot_nh --> navigate to Page_top-5-thuong-hieu-my-pham-organic-tot-nhat-the-gioi_'

testObj = findTestObject('Object Repository/Page_category_uncategorized/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/category/uncategorized(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_top-5-thuong-hieu-my-pham-organic-tot-nhat-the-gioi_'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00005_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
