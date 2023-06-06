import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_an-tho-danh-cho-lua-tuoi-nao'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/2021/10/an-tho-danh-cho-lua-tuoi-nao')

'step 2: Add visual checkpoint at Page_an-tho-danh-cho-lua-tuoi-nao'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00006_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
