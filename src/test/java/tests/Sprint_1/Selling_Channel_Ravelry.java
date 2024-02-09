package tests.Sprint_1;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pageObjects.Dashboard;
import pageObjects.LoginPage;
import tests.SuiteSetup;
import utilities.JiraPolicy;

import static io.qameta.allure.SeverityLevel.NORMAL;

@Epic("Selling Channel")
public class Selling_Channel_Ravelry extends SuiteSetup {

    public LoginPage page;
    public Dashboard dashboard;


    @JiraPolicy(logTicketReady = false)
    @Test(priority = 1, description = "GP_Web_114")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify Manage Connections side link is accessible or not ")
    @Story("As a user I should be able to verify Manage Connections side link is accessible or not")
    public void testToVerifySellingChannelSideLink() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLogin();
        dashboard.verifyThatManageConnectionsLink();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 2, description = "GP_Web_115")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify all controls, buttons, links, text appears on the selling channel screen or not ")
    @Story("As a user I should be able to verify all controls, buttons, links, text appears on the selling channel screen or not ")
    public void testToVerifyAllControls() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLogin();
        dashboard.verifyThatManageConnectionsLink();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 3, description = "GP_Web_116")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify Ravelry Connect button is accessible or not ")
    @Story("As a user I should be able to verify Ravelry Connect button is accessible or not ")
    public void testToVerifyRavelryConnect() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLogin();
        dashboard.verifyThatRavelryConnectButton();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 4, description = "GP_Web_117")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify when user click on Ravelry Connect to your Account button ")
    @Story("As a user I should be able to verify when user click on Ravelry Connect to your Account button ")
    public void testToVerifyConnectYourAccount() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.verfiyravelryConnectButton();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 5, description = "GP_Web_118")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify Back button is accessible or not")
    @Story("As a user I should be able to verify Back button is accessible or not")
    public void testToVerifyRavelryBackButton() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.verifyravelryBackButton();
    }
    @JiraPolicy(logTicketReady = false)
    @Test(priority = 6, description = "GP_Web_119")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify when user logged in successfully to the ravelry account then redirects back to the gosadi portal or not")
    @Story("As a user I should be able to verify Back button is accessible or not")
    public void testToVerifyRavelrySuccessfullyConnected() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.goToConnectYourAccount().verifyravelryConnectSuccessfully();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 7, description = "GP_Web_120")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify progress bar is working properly or not when user import the products ")
    @Story("As a user I should be able to verify progress bar is working properly or not when user import the products ")
    public void testToVerifyProgressBar() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.goToConnectYourAccount().verifyravelryProgressBar();
    }


    @JiraPolicy(logTicketReady = false)
    @Test(priority = 8, description = "GP_Web_122")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify that user can dismiss the progress bar")
    @Story("As a user I should be able to verify that user can dismiss the progress bar")
    public void testToVerifyDismissProgressBar() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.  goToConnectYourAccount().verifyravelryProgressBarCancled();
    }

    //It will work only once If user already connected it wont show connect again with same user id
   @JiraPolicy(logTicketReady = false)
    @Test(priority = 9, description = "GP_Web_123")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify once user successfully connected with the Ravelry then connect button changed to Connected or not in selling channel screen")
    @Story("As a user I should be able to verify once user successfully connected with the Ravelry then connect button changed to Connected or not in selling channel screen")
    public void testToVerifyConnectToConnectedButton() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.verifyRavelryConnectToConnected();
    }

   @JiraPolicy(logTicketReady = false)
    @Test(priority = 10, description = "124")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user is able to import the products from  or not after successfully connected ")
    @Story("As a user I should be able to verify user is able to import the products from  or not after successfully connected")
    public void testToVerifyRavelryImportTheProducts() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.goToConnectYourAccount().verifyRavelryImportSuccessfully();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 11, description = "126")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify import popup cross icon is accessible or not")
    @Story("As a user I should be able to verify import popup cross icon is accessible or not")
    public void testToVerifyImportPopupCrossIcon() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.goToConnectYourAccount().verifyRavelryImportSuccessfully().
                verifyRavelryImportCrossIcon();
    }


    @JiraPolicy(logTicketReady = false)
    @Test(priority = 12, description = "127")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify when popup is appears then parent window web elements are accessible or not")
    @Story("As a user I should be able to verify when popup is appears then parent window web elements are accessible or not")
    public void testToVerifyImportPopupElementsAccessible() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.goToConnectYourAccount().verifyRavelryImportSuccessfully().
                verifyRavelryImportCrossIcon().
                verifyElementsAccessible();
    }


    @JiraPolicy(logTicketReady = false)
    @Test(priority = 13, description = "129")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify text change after ravelry is successfully connected")
    @Story("As a user I should be able to verify text change after ravelry is successfully connected")
    public void testToVerifyRavelryConnected() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithNewUser();
        dashboard.goToConnectYourAccount().verifyRavelryTextConnectToConnected();
    }



    @JiraPolicy(logTicketReady = false)
    @Test(priority = 14, description = "130")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify that user can click on Connected button")
    @Story("As a user I should be able to verify that user can click on Connected button")
    public void testToVerifyRavelryClickOnConnected() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithNewUser();
        dashboard.verifyWhenConnectedUserCanSeeDisconnected();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 15, description = "131")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user can click on disconnect option")
    @Story("As a user I should be able to verify user can click on disconnect option")
    public void testToVerifyRavelryClickOnDisconnected() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithNewUser();
        dashboard.goToConnectYourAccount().verifyDisconnectToStayConnected();
    }


    @JiraPolicy(logTicketReady = false)
    @Test(priority = 16, description = "132")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user can click on stay connected button")
    @Story("As a user I should be able to verify user can click on stay connected button")
    public void testToVerifyRavelryClickOnStayConnected() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.verifyStayConnectedToSellingChannelsTitle();
    }


    @JiraPolicy(logTicketReady = false)
    @Test(priority = 17, description = "133")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user can click on disconnect button")
    @Story("As a user I should be able to verify user can click on disconnect button")
    public void testToVerifyRavelryDisconnectOptions() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.goToConnectYourAccount().verifyDisconnectedFlow();
    }

    //New :: as user clicks on disconnected button, user will see "Re-connect" option
    @JiraPolicy(logTicketReady = false)
    @Test(priority = 18, description = "134")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user can click on disconnected button")
    @Story("As a user I should be able to verify user can click on disconnect button")
    public void testToVerifyRavelryClickDisconnectedToRe_connect() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.verifyDisconnectedToRe_connect();
    }



    //"user will see a popup with header Reconnect and 2 CTA buttons i.e.
    //RECONNECT AND DO NOT IMPORT | RECONNECT AND IMPORT"
    @JiraPolicy(logTicketReady = false)
    @Test(priority = 19, description = "135")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify options when user click on re-connect options")
    @Story("As a user I should be able to verify options when user click on re-connect options")
    public void testToVerifyRavelryRe_connectHeader() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.goToConnectYourAccount().verifyDisconnectedToRe_connectOptions();
    }


    //user will be redirected to connect ravelry screen
    @JiraPolicy(logTicketReady = false)
    @Test(priority = 20, description = "136")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user can click on Reconnect and Do not import button")
    @Story("As a user I should be able to verify user can click on Reconnect and Do not import button")
    public void testToVerifyRavelryRe_connectHeaderDoNotImport() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.verifyRe_connectDoNotImportOptions();
    }

    //user should not able to see progress bar as user has selected donot import option while reconnecting
    @JiraPolicy(logTicketReady = false)
    @Test(priority = 21, description = "137")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user is able to view progress bar after Reconnect")
    @Story("As a user I should be able to verify user is able to view progress bar after Reconnect")
    public void testToVerifyRavelryDoNotImportNoProgressBar() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.verifyRe_connectDoNotImportOptionsNoProgressBar();
    }


    //"user will see a popup with header Reconnect and 2 CTA buttons i.e.
    //RECONNECT AND DO NOT IMPORT | CONFIRM RECONNECT AND IMPORT"
    @JiraPolicy(logTicketReady = false)
    @Test(priority = 22, description = "138")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user can click on Reconnect and import button")
    @Story("As a user I should be able to verify user can click on Reconnect and import button")
    public void testToVerifyRavelryHeaderReconnect() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.goToConnectYourAccount().verifyRe_connectPopupOptions();
    }
    @JiraPolicy(logTicketReady = false)
    @Test(priority = 23, description = "139")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user can click on Reconnect and Do not import button")
    @Story("As a user I should be able to verify user can click on Reconnect and Do not import button")
    public void testToVerifyRavelryHeaderReconnectDoNotImport() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard. goToConnectYourAccount().verifyRe_connectPopupOptionsDoNotImport();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 24, description = "140")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user can click on Confirm Reconnect and import button")
    @Story("As a user I should be able to verify user can click on Confirm Reconnect and import button")
    public void testToVerifyRavelryHeaderReconnectConfirmReconnectImport() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.verifyRe_connectPopupOptionsConfirmReconnectImport();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 25, description = "141")
    @Feature("Ravelry")
    @Severity(NORMAL)
    @Description("Verify user is able to progress bar after Reconnect")
    @Story("As a user I should be able to verify user is able to progress bar after Reconnect")
    public void testToVerifyRavelryReconnectProgressBar() {
        page = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        page.verifyUserLoginWithFreshUser();
        dashboard.verifyRavelryReconnectProgressBar();
    }

}
