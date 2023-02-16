package class23;
public class WebDriverTester {
    public static void main(String[] args) {
/*        WebDriver chrome = new Chrome();
        chrome.startBrowser();
        chrome.openURL();
        chrome.testLoginPage();
        chrome.closeBrowser();
        System.out.println();*/

        WebDriver [] browsers = {new Chrome(), new Safari(), new Mozilla()};

        for (WebDriver browser : browsers) {
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
            System.out.println();
        }
    }
}
/*    // --------------------------------//
        Safari safari = new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();
        System.out.println();
    // -------------------------------//
        Mozilla mozilla = new Mozilla();
        mozilla.startBrowser();
        mozilla.openURL();
        mozilla.testLoginPage();
        mozilla.closeBrowser();                 */