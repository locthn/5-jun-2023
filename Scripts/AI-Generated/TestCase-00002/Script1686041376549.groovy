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

'step 2: At Page_home click on hyperlink_trien_khai_du_an_dai_hoc_khong_rac_thai_ --> navigate to Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien_'

testObj = findTestObject('Object Repository/Page_home/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien_ input on textarea_comment'

testObj = findTestObject('Object Repository/Page__trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien/textarea_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/.*/.*/trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_textarea_object)

'step 4: At Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien_ input on textarea_comment'

testObj = findTestObject('Object Repository/Page__trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien/textarea_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/.*/.*/trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_textarea_object)

'step 5: At Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien_ click on input_submit --> navigate to Page_wp-comments-post_php'

testObj = findTestObject('Object Repository/Page__trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/.*/.*/trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: Add visual checkpoint at Page_wp-comments-post_php'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00002_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
