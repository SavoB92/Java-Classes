package class23;
public class WebDriver {
    public void startBrowser () {
        System.out.println("Starting the browser!");
    }
    public void openURL () {
        System.out.println("Opening an URL!");
    }
    public void testLoginPage () {
        System.out.println("Checking if login page works!");
    }
    public void closeBrowser () {
        System.out.println("Closing the browser!");
    }
}
// *********************************************************************************************************************
class Chrome extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome!");
    }
    @Override
    public void openURL() {
        System.out.println("Opening the URL in Google Chrome!");
    }
    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Google Chrome!");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome!");
    }
}
// *********************************************************************************************************************
class Safari extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting Safari!");
    }
    @Override
    public void openURL() {
        System.out.println("Opening the URL in Safari!");
    }
    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Safari!");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari!");
    }
}
// *********************************************************************************************************************
class Mozilla extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting Mozilla!");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL in Mozilla!");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Mozilla!");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Mozilla!");
    }
}
// *********************************************************************************************************************