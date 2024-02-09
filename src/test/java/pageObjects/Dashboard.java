package pageObjects;

import constants.FileConstant;
import logger.LOG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static utilities.CommonUtils.holdForElement;


public class Dashboard extends BasePage {

    @FindBy(xpath = "//*[contains(text(),'Manage Connections')]")
    private WebElement manageConnectionsLink;

    @FindBy(xpath = "//h1[text()='product library']")
    private WebElement productLibrary;

    @FindBy(xpath = "(//button[text()='Disconnected' or text()='Connect' or text()='Connected'])[1]")
    private WebElement ravelryConnectButton;

    @FindBy(xpath = "(//button[text()='Disconnected' or text()='Connect' or text()='Connected'])[2]")
    private WebElement etsyConnectButton;

    @FindBy(xpath = "//h3[text()='connect etsy']")
    private WebElement connectEtsyTitle;

    @FindBy(xpath = "//h1[text()='selling channels']")
    private WebElement sellingChannelsTitle;


    @FindBy(xpath = "//button[@class='close-icon-btn']")
    private WebElement popup_1Close;

    @FindBy(xpath = "//h1[contains(text(),'Ravelry is a free website for knitters')]")
    private WebElement ravelryLoginTitle;

    @FindBy(xpath = "//h1[contains(text(),'Sign in ')]")
    private WebElement etsyLoginText;

    @FindBy(id = "user_login")
    private WebElement ravelryLoginID;

    @FindBy(id = "user_password")
    private WebElement ravelryLoginPass;

    @FindBy(xpath = "//button[text()='Log In']")
    private WebElement ravelryLoginButton;

    @FindBy(name = "email")
    private WebElement etsyLoginID;

    @FindBy(name = "password")
    private WebElement etsyLoginPass;

    @FindBy(name = "submit_attempt")
    private WebElement etsyLoginButton;

    @FindBy(xpath = "//button[contains(text(),'Connect your Account')]")
    private WebElement connectYourAccount;

    @FindBy(xpath = "//button[text()='Back']")
    private WebElement connectBackButton;

    @FindBy(xpath = "(//ul[@role='menu']/li[text()='Re-connect'])[1]")
    private WebElement re_ConnectButton;

    @FindBy(xpath = "(//li[text()='Disconnect'])[1]")
    private WebElement disconnect;

    @FindBy(xpath = "//button[text()='Disconnect']")
    private WebElement disconnectConfirmation;

    @FindBy(xpath = "//button[text()='Stay Connected']")
    private WebElement disconnectConfirmation_StayConnected;


    @FindBy(xpath = "//button[text()='Reconnect and Import']")
    private WebElement re_ConnectImport;

    @FindBy(xpath = "//button[text()='Reconnect and Do not Import']")
    private WebElement reconnectNotImport;

    @FindBy(xpath = "//button[text()='Confirm Reconnect and Import']")
    private WebElement confirmReconnectAndImport;

    @FindBy(xpath = "//button[text()='Reconnect and Do not Import']")
    private WebElement confirmReconnectAndDoNotImport;

    @FindBy(xpath = "//h2[contains(text(),'gosadi Dev + UAT')]")
    private WebElement ravelryTitle;

    @FindBy(xpath = "//span[contains(text(),'update my pattern')]")
    private WebElement ravelryCB_One;

    @FindBy(xpath = "//span[contains(text(),'access and download the PDFs')]")
    private WebElement ravelryCB_two;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement ravelry_Authorize_Button;

    @FindBy(xpath = "//h6[contains(text(),'Ravelry Import Progress')]")
    private WebElement ravelry_ProgressBar;

    @FindBy(xpath = "//h6[contains(text(),'Etsy Progress')]")
    private WebElement etsy_ProgressBar;

    @FindBy(xpath = "//p[text()='Manage Products']")
    private WebElement manageProductSideTab;

    @FindBy(xpath = "//p[text()='Product Library']")
    private WebElement mpProductLib;

    @FindBy(xpath = "//td[contains(text(),'No Record Found')]")
    private WebElement noRecordText;

    @FindBy(xpath = "(//div[@class='attention-cover']/p)[1]")
    private WebElement importedRecordText;

    @FindBy(xpath = "//h3[contains(text(),'gosadi has started ')]")
    private WebElement importedPopup;

    public Dashboard(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public Dashboard verifyThatManageConnectionsLink() {
        waitForVisibility(manageConnectionsLink);
        Assert.assertTrue(iselementVisible(manageConnectionsLink, second10TimeOut));
        LOG.Reporter("Manage Connections side link is accessible and verified");
        return this;
    }

    public Dashboard verifyThatRavelryConnectButton() {
        clickOnWebElement(manageConnectionsLink);
        LOG.Reporter("Manage Connections side link is clicked");
        waitForVisibility(ravelryConnectButton);
        Assert.assertTrue(iselementVisible(ravelryConnectButton, second10TimeOut));
        iselementClickable(ravelryConnectButton, second10TimeOut);
        LOG.Reporter("ravelry button is visible and clickable");

        return this;
    }

    public Dashboard verifyravelryBackButton() {
        waitForVisibility(manageConnectionsLink);
        clickOnWebElement(manageConnectionsLink);
        LOG.Reporter("Manage Connections side link is clicked");
        waitForVisibility(ravelryConnectButton);
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connect")) {
            verifyBackButton();
        } else if (text.equalsIgnoreCase("Connected")) {
            connectedToDisconnectFlow();
            LOG.Reporter("Connect to disconnect flow worked");
            holdForElement(4);
            disconnectedToReConnectFlow();
            verifyBackButton();
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectFlow();
            verifyBackButton();
        }
        return this;
    }

    public void verifyBackButton() {
        iselementClickable(ravelryConnectButton, second10TimeOut);
        LOG.Reporter("ravelry button is visible and clickable");
        clickOnWebElement(ravelryConnectButton);
        LOG.Reporter("Clicked on ravelry  Connect button");
        waitForVisibility(connectBackButton);
        Assert.assertTrue(iselementVisible(connectBackButton, second10TimeOut));
        clickOnWebElement(connectBackButton);
        LOG.Reporter("ravelry Back button is visible and clickable");
    }

    public Dashboard verifyravelryConnectSuccessfully() {
        // goToConnectYourAccount();
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connect")) {
            ravelryConnectFlow();
        } else if (text.equalsIgnoreCase("connected")) {
            LOG.Reporter("ravelry already connected ");
            connectedToDisconnectFlow();
            LOG.Reporter("Connect to disconnect flow worked");
            holdForElement(4);
            disconnectedToReConnectFlow();
            ravelryConnectFlow();
        } else if (text.equalsIgnoreCase("Disconnected")) {
            {
                disconnectedToReConnectFlow();
                LOG.Reporter("Disconnected to reconnect flow ");
                ravelryConnectFlow();
            }
        }
        return this;
    }

    public void ravelryConnectFlow() {
        iselementClickable(ravelryConnectButton, second10TimeOut);
        LOG.Reporter("ravelry button is visible and clickable");
        clickOnWebElement(ravelryConnectButton);
        LOG.Reporter("Clicked on ravelry  Connect button");
        clickOnWebElement(connectYourAccount);
        LOG.Reporter("ravelry Connect your Account button is visible and clickable");
        verifyravelryAccountLoggedInOrNot();
        ravelrAuthorizing();
    }

    public Dashboard verifyravelryProgressBarCancled() {
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("connected")) {
            LOG.Reporter("ravelry already connected ");
            connectedToDisconnectFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            disconnectedToReConnectFlow();
            LOG.Reporter("Disconnected to reconnect flow ");
            clickOnWebElement(ravelryConnectButton);
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            clickOnWebElement(popup_1Close);
            LOG.Reporter("Ravelry progress bar cancel button clicked and verified ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            LOG.Reporter("ravelry Disconnected ");
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            clickOnWebElement(ravelryConnectButton);
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            clickOnWebElement(popup_1Close);
            LOG.Reporter("Ravelry progress bar cancel button clicked and verified ");
        }
        return this;
    }


    public Dashboard verifyRavelryConnectToConnected() {
        goToConnectYourAccount();
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connect")) {
            String expected = "Connected";
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry  Connect button");
            clickOnWebElement(connectYourAccount);
            LOG.Reporter("ravelry Connect your Account button is visible and clickable");
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            String actual = ravelryConnectButton.getText();
            Assert.assertEquals(actual, expected);
            LOG.Reporter("ravelry  connected verified ");
        } else if (text.equalsIgnoreCase("Connected")) {
            String expected = "Connected";
            connectedToDisconnectFlow();
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            waitForVisibility(ravelry_ProgressBar);
            LOG.Reporter("ravelry  Progress bar is visible and clickable");
            holdForElement(4);
            clickOnWebElement(manageConnectionsLink);
            waitForVisibility(ravelryConnectButton);
            String actual = ravelryConnectButton.getText();
            Assert.assertEquals(actual, expected);
            LOG.Reporter("ravelry  connected verified ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            String expected = "Connected";
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            waitForVisibility(ravelry_ProgressBar);
            LOG.Reporter("ravelry  Progress bar is visible and clickable");
            holdForElement(4);
            clickOnWebElement(manageConnectionsLink);
            waitForVisibility(ravelryConnectButton);
            String actual = ravelryConnectButton.getText();
            Assert.assertEquals(actual, expected);
            LOG.Reporter("ravelry  connected verified ");
        }
        return this;
    }

    public Dashboard verifyRavelryImportCrossIcon() {
        clickOnWebElement(manageConnectionsLink);
        LOG.Reporter("Clicked on manage connections link");
        Assert.assertTrue(iselementVisible(importedPopup));
        LOG.Reporter("Imported popup is visible");
        waitForVisibility(popup_1Close);
        waitForElementVisible(popup_1Close, second10TimeOut);
        clickOnWebElement(popup_1Close);
        LOG.Reporter("Imported popup cross icon is clicked ");
        return this;
    }

    public Dashboard verifyWhenConnectedUserCanSeeDisconnected() {
        goToConnectYourAccount();
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connect")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry  Connect button");
            clickOnWebElement(connectYourAccount);
            LOG.Reporter("ravelry Connect your Account button is visible and clickable");
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            waitForVisibility(ravelry_ProgressBar);
            verifyImportSuccessfully();
            verifyRavelryImportCrossIcon();
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry  Connect button");
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");

        } else if (text.equalsIgnoreCase("Connected")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry Connected button");
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            waitForVisibility(ravelry_ProgressBar);
            LOG.Reporter("ravelry  Progress bar is visible and clickable");
            holdForElement(4);
            clickOnWebElement(manageConnectionsLink);
            waitForVisibility(ravelryConnectButton);
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry Connect button");
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");
        }
        return this;
    }

    public Dashboard verifyDisconnectToStayConnected() {
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry Connected button");
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");
            clickByAction(disconnect);
            LOG.Reporter(" clicked on ravelry Disconnect button ");
            Assert.assertTrue(iselementVisible(disconnectConfirmation));
            LOG.Reporter("ravelry Disconnect button is visible And verified :: " + disconnectConfirmation.getText());
            Assert.assertTrue(iselementVisible(disconnectConfirmation_StayConnected));
            LOG.Reporter("ravelry Stay Connected button is visible And verified :: " + disconnectConfirmation_StayConnected.getText());
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectDoNotImportFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizingWithoutImport();
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry Connect button");
            clickByAction(disconnect);
            LOG.Reporter(" clicked on ravelry Disconnect button ");
            Assert.assertTrue(iselementVisible(disconnectConfirmation));
            LOG.Reporter("ravelry Disconnect button is visible And verified :: " + disconnectConfirmation.getText());
            Assert.assertTrue(iselementVisible(disconnectConfirmation_StayConnected));
            LOG.Reporter("ravelry Stay Connected button is visible And verified :: " + disconnectConfirmation_StayConnected.getText());
        }
        return this;
    }

    public Dashboard verifyStayConnectedToSellingChannelsTitle() {
        goToConnectYourAccount();
        waitForVisibility(ravelryConnectButton);
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry Connected button");
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");
            clickByAction(disconnect);
            LOG.Reporter(" clicked on ravelry Disconnect button ");
            Assert.assertTrue(iselementVisible(disconnectConfirmation_StayConnected));
            clickOnWebElement(disconnectConfirmation_StayConnected);
            LOG.Reporter("ravelry Disconnect confirmation Stay Connected button is visible And verified :: " + disconnectConfirmation_StayConnected.getText());
            Assert.assertTrue(iselementVisible(sellingChannelsTitle));
            LOG.Reporter("Selling Channels Title verified  ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            holdForElement(4);
            verifyImportSuccessfully();
            verifyRavelryImportCrossIcon();
            waitForVisibility(ravelryConnectButton);
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry Connect button");
            clickByAction(disconnect);
            LOG.Reporter(" clicked on ravelry Disconnect button ");
            Assert.assertTrue(iselementVisible(disconnectConfirmation_StayConnected));
            LOG.Reporter("ravelry Stay Connected button is visible And verified :: " + disconnectConfirmation_StayConnected.getText());
            clickOnWebElement(disconnectConfirmation_StayConnected);
            LOG.Reporter("Clicked on Stay connected button");
            Assert.assertTrue(iselementVisible(sellingChannelsTitle));
            LOG.Reporter("Selling Channels Title verified  ");
        }
        return this;
    }

    public Dashboard verifyDisconnectedFlow() {
        waitForVisibility(ravelryConnectButton);
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry Connected button");
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");
            clickByAction(disconnect);
            LOG.Reporter(" clicked on ravelry Disconnect button ");
            Assert.assertTrue(iselementVisible(disconnectConfirmation_StayConnected));
            clickOnWebElement(disconnectConfirmation);
            LOG.Reporter("ravelry Disconnect button is visible And verified :: " + disconnectConfirmation_StayConnected.getText());
            Assert.assertTrue(iselementVisible(sellingChannelsTitle));
            LOG.Reporter("Selling Channels Title verified  ");
            waitForVisibility(ravelryConnectButton);
            Assert.assertTrue(iselementVisible(ravelryConnectButton));
            holdForElement(2);
            String text1 = ravelryConnectButton.getText();
            Assert.assertEquals(text1, "Disconnected");
            LOG.Reporter("Disconnected flow verified");


        } else if (text.equalsIgnoreCase("Disconnected")) {
            String text1 = ravelryConnectButton.getText();
            Assert.assertEquals(text1, "Disconnected");
            LOG.Reporter("ravelry Disconnected button text is verified :: " + text);
            clickOnWebElement(ravelryConnectButton);
        }
        return this;
    }

    public Dashboard verifyDisconnectedToRe_connect() {
        goToConnectYourAccount();
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connect")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry  Connect button");
            clickOnWebElement(connectYourAccount);
            LOG.Reporter("ravelry Connect your Account button is visible and clickable");
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            waitForVisibility(ravelry_ProgressBar);
            verifyImportSuccessfully();
            verifyRavelryImportCrossIcon();
            clickOnWebElement(ravelryConnectButton);
            connectedToDisconnectFlow();
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");
            String text1 = ravelryConnectButton.getText();
            Assert.assertEquals(text1, "Disconnected");
            LOG.Reporter("ravelry Disconnected button text is verified :: " + text);
            clickOnWebElement(ravelryConnectButton);
            Assert.assertTrue(iselementVisible(re_ConnectButton));
            LOG.Reporter("ravelry ReConnect button is visible And verified ");
        } else if (text.equalsIgnoreCase("Connected")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry Connected button");
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");
            clickByAction(disconnect);
            LOG.Reporter(" clicked on ravelry Disconnect button ");
            Assert.assertTrue(iselementVisible(disconnectConfirmation_StayConnected));
            clickOnWebElement(disconnectConfirmation);
            LOG.Reporter("ravelry Disconnect button is visible And verified :: " + disconnectConfirmation_StayConnected.getText());
            Assert.assertTrue(iselementVisible(sellingChannelsTitle));
            LOG.Reporter("Selling Channels Title verified  ");
            waitForVisibility(ravelryConnectButton);
            Assert.assertTrue(iselementVisible(ravelryConnectButton));
            holdForElement(2);
            clickOnWebElement(ravelryConnectButton);
            Assert.assertTrue(iselementVisible(re_ConnectButton));
            LOG.Reporter("ravelry ReConnect button is visible And verified ");


        } else if (text.equalsIgnoreCase("Disconnected")) {
            String text1 = ravelryConnectButton.getText();
            Assert.assertEquals(text1, "Disconnected");
            LOG.Reporter("ravelry Disconnected button text is verified :: " + text);
            clickOnWebElement(ravelryConnectButton);
            Assert.assertTrue(iselementVisible(re_ConnectButton));
            clickByAction(re_ConnectButton);
            LOG.Reporter("ravelry ReConnect button is visible And verified ");

        }
        return this;
    }

    public Dashboard verifyDisconnectedToRe_connectOptions() {
        goToConnectYourAccount();
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connect")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry  Connect button");
            clickOnWebElement(connectYourAccount);
            LOG.Reporter("ravelry Connect your Account button is visible and clickable");
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            waitForVisibility(ravelry_ProgressBar);
            verifyImportSuccessfully();
            verifyRavelryImportCrossIcon();
            clickOnWebElement(ravelryConnectButton);
            connectedToDisconnectFlow();
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");
            String text1 = ravelryConnectButton.getText();
            Assert.assertEquals(text1, "Disconnected");
            LOG.Reporter("ravelry Disconnected button text is verified :: " + text);
            clickOnWebElement(ravelryConnectButton);
            clickByAction(re_ConnectButton);
            LOG.Reporter("ravelry ReConnect button is visible And verified ");
            Assert.assertTrue(iselementVisible(re_ConnectImport));
            LOG.Reporter("ravelry ReConnect Import button is visible And verified ");
            Assert.assertTrue((iselementVisible(reconnectNotImport)));
            LOG.Reporter("ravelry ReConnect Not Import button is visible And verified ");

        } else if (text.equalsIgnoreCase("Connected")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry Connected button");
            Assert.assertTrue(iselementVisible(disconnect));
            LOG.Reporter("ravelry Disconnect button is visible And verified ");
            clickByAction(disconnect);
            LOG.Reporter(" clicked on ravelry Disconnect button ");
            Assert.assertTrue(iselementVisible(disconnectConfirmation_StayConnected));
            clickOnWebElement(disconnectConfirmation);
            LOG.Reporter("ravelry Disconnect button is visible And verified :: " + disconnectConfirmation_StayConnected.getText());
            Assert.assertTrue(iselementVisible(sellingChannelsTitle));
            LOG.Reporter("Selling Channels Title verified  ");
            waitForVisibility(ravelryConnectButton);
            Assert.assertTrue(iselementVisible(ravelryConnectButton));
            holdForElement(2);
            clickOnWebElement(ravelryConnectButton);
            Assert.assertTrue(iselementVisible(re_ConnectButton));
            LOG.Reporter("ravelry ReConnect button is visible And verified ");
            clickByAction(re_ConnectButton);
            LOG.Reporter("ravelry ReConnect button is visible And verified ");
            Assert.assertTrue(iselementVisible(re_ConnectImport));
            LOG.Reporter("ravelry ReConnect Import button is visible And verified ");
            Assert.assertTrue((iselementVisible(reconnectNotImport)));
            LOG.Reporter("ravelry ReConnect Not Import button is visible And verified ");


        } else if (text.equalsIgnoreCase("Disconnected")) {
            String text1 = ravelryConnectButton.getText();
            Assert.assertEquals(text1, "Disconnected");
            LOG.Reporter("ravelry Disconnected button text is verified :: " + text);
            clickOnWebElement(ravelryConnectButton);
            Assert.assertTrue(iselementVisible(re_ConnectButton));
            clickByAction(re_ConnectButton);
            LOG.Reporter("ravelry ReConnect button is visible And verified ");
            Assert.assertTrue(iselementVisible(re_ConnectImport));
            LOG.Reporter("ravelry ReConnect Import button is visible And verified ");
            Assert.assertTrue((iselementVisible(reconnectNotImport)));
            LOG.Reporter("ravelry ReConnect Not Import button is visible And verified ");

        }
        return this;
    }

    public Dashboard verifyRe_connectDoNotImportOptionsNoProgressBar() {
        goToConnectYourAccount();
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            connectedToDisconnectFlow();
            LOG.Reporter("ravelry Connected Confirmation");
            disconnectedToReConnectDoNotImportFlow();
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            waitForVisibility(ravelryTitle);
            Assert.assertTrue(iselementVisible(ravelryTitle, second10TimeOut));
            LOG.Reporter("ravelry Title is visible and clickable :: " + ravelryTitle.getText());
            clickOnWebElement(ravelryCB_One);
            LOG.Reporter("ravelry checkbox One is visible and clickable");
            clickOnWebElement(ravelryCB_two);
            LOG.Reporter("ravelry checkbox two is visible and clickable");
            clickOnWebElement(ravelry_Authorize_Button);
            LOG.Reporter("ravelry Authorize button is visible and clickable");
            Assert.assertFalse(iselementVisible(ravelry_ProgressBar));
            Assert.assertTrue(iselementVisible(sellingChannelsTitle));
            LOG.Reporter("Selling Channels Title verified ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectDoNotImportFlow();
            LOG.Reporter("Reconnect and Do not import button");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            waitForVisibility(ravelryTitle);
            Assert.assertTrue(iselementVisible(ravelryTitle, second10TimeOut));
            LOG.Reporter("ravelry Title is visible and clickable :: " + ravelryTitle.getText());
            clickOnWebElement(ravelryCB_One);
            LOG.Reporter("ravelry checkbox One is visible and clickable");
            clickOnWebElement(ravelryCB_two);
            LOG.Reporter("ravelry checkbox two is visible and clickable");
            clickOnWebElement(ravelry_Authorize_Button);
            LOG.Reporter("ravelry Authorize button is visible and clickable");
            Assert.assertFalse(iselementVisible(ravelry_ProgressBar));
            Assert.assertTrue(iselementVisible(sellingChannelsTitle));
            LOG.Reporter("Selling Channels Title verified ");
        }
        return this;
    }

    public Dashboard verifyRe_connectDoNotImportOptions() {
        goToConnectYourAccount();
        waitForVisibility(ravelryConnectButton);
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            connectedToDisconnectFlow();
            waitForVisibility(ravelryConnectButton);
            clickOnWebElement(ravelryConnectButton);
            clickByAction(re_ConnectButton);
            clickOnWebElement(confirmReconnectAndDoNotImport);
            LOG.Reporter("Reconnect and Do not import button");
            Assert.assertTrue(iselementVisible(sellingChannelsTitle));
            LOG.Reporter("Selling Channels Title verified ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectDoNotImportFlow();
            LOG.Reporter("Reconnect and Do not import button");
            Assert.assertTrue(iselementVisible(sellingChannelsTitle));
            LOG.Reporter("Selling Channels Title verified ");
        }
        return this;
    }

    public Dashboard verifyRe_connectPopupOptions() {
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            connectedToDisconnectFlow();
            LOG.Reporter("ravelry Connected Confirmation");
            holdForElement(4);
            clickOnWebElement(ravelryConnectButton);
            clickByAction(re_ConnectButton);
            clickOnWebElement(re_ConnectImport);
            holdForElement(3);
            Assert.assertTrue(iselementVisible(confirmReconnectAndDoNotImport));
            Assert.assertTrue(iselementVisible(confirmReconnectAndImport));
            LOG.Reporter("confirm RECONNECT AND DO NOT IMPORT | CONFIRM RECONNECT AND IMPORT");

        } else if (text.equalsIgnoreCase("Disconnected")) {
            clickOnWebElement(ravelryConnectButton);
            clickByAction(re_ConnectButton);
            clickOnWebElement(re_ConnectImport);
            waitForVisibility(confirmReconnectAndDoNotImport);
            Assert.assertTrue(iselementVisible(confirmReconnectAndDoNotImport));
            Assert.assertTrue(iselementVisible(confirmReconnectAndImport));
            LOG.Reporter("confirm RECONNECT AND DO NOT IMPORT | CONFIRM RECONNECT AND IMPORT");
        }
        return this;
    }

    public Dashboard verifyRe_connectPopupOptionsDoNotImport() {
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            connectedToDisconnectFlow();
            LOG.Reporter("ravelry Connected Confirmation");
            holdForElement(3);
            clickOnWebElement(ravelryConnectButton);
            clickByAction(re_ConnectButton);
            clickOnWebElement(re_ConnectImport);
            holdForElement(3);
            Assert.assertTrue(iselementVisible(confirmReconnectAndDoNotImport));
            clickOnWebElement(confirmReconnectAndDoNotImport);
            LOG.Reporter("Clicked on RECONNECT AND DO NOT IMPORT");
            Assert.assertTrue(iselementVisible(sellingChannelsTitle, second10TimeOut));
            LOG.Reporter("Selling Channels Title verified ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            clickOnWebElement(ravelryConnectButton);
            clickByAction(re_ConnectButton);
            clickOnWebElement(re_ConnectImport);
            holdForElement(3);
            Assert.assertTrue(iselementVisible(confirmReconnectAndDoNotImport));
            clickOnWebElement(confirmReconnectAndDoNotImport);
            LOG.Reporter("Clicked on RECONNECT AND DO NOT IMPORT");
            Assert.assertTrue(iselementVisible(sellingChannelsTitle, second10TimeOut));
            LOG.Reporter("Selling Channels Title verified ");
        }

        return this;
    }

    public Dashboard verifyRe_connectPopupOptionsConfirmReconnectImport() {
        goToConnectYourAccount();
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            connectedToDisconnectFlow();
            LOG.Reporter("ravelry Connected Confirmation");
            clickOnWebElement(ravelryConnectButton);
            clickByAction(re_ConnectButton);
            clickOnWebElement(re_ConnectImport);
            waitForVisibility(confirmReconnectAndImport);
            Assert.assertTrue(iselementVisible(confirmReconnectAndImport));
            clickOnWebElement(confirmReconnectAndImport);
            LOG.Reporter("Clicked on CONFIRM RECONNECT AND IMPORT");
            Assert.assertTrue(iselementVisible(sellingChannelsTitle, second10TimeOut));
            LOG.Reporter("Selling Channels Title verified ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            clickOnWebElement(ravelryConnectButton);
            clickByAction(re_ConnectButton);
            clickOnWebElement(re_ConnectImport);
            waitForVisibility(confirmReconnectAndImport);
            Assert.assertTrue(iselementVisible(confirmReconnectAndImport));
            clickOnWebElement(confirmReconnectAndImport);
            LOG.Reporter("Clicked on CONFIRM RECONNECT AND IMPORT");
            Assert.assertTrue(iselementVisible(sellingChannelsTitle, second10TimeOut));
            LOG.Reporter("Selling Channels Title verified ");
        }

        return this;
    }

    public Dashboard verifyRavelryReconnectProgressBar() {
        goToConnectYourAccount();
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            connectedToDisconnectFlow();
            LOG.Reporter("ravelry Connected Confirmation");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            ravelryProgressBar();
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected Confirmation ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            ravelryProgressBar();
        }
        return this;
    }

    public Dashboard verifyElementsAccessible() {
        Assert.assertTrue(iselementEnable(ravelryConnectButton, second10TimeOut));
        LOG.Reporter("Parent window elements not accessible ");
        return this;
    }

    public Dashboard verifyRavelryTextConnectToConnected() {
        waitForVisibility(ravelryConnectButton);
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connect")) {
            String expected = "Connected";
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("Clicked on ravelry  Connect button");
            clickOnWebElement(connectYourAccount);
            LOG.Reporter("ravelry Connect your Account button is visible and clickable");
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            waitForVisibility(ravelry_ProgressBar);
            verifyImportSuccessfully();
            verifyRavelryImportCrossIcon();
            String actual = ravelryConnectButton.getText();
            Assert.assertEquals(actual, expected);
            LOG.Reporter("ravelry  connected verified ");
        } else if (text.equalsIgnoreCase("Connected")) {
            String expected = "Connected";
            String actual = ravelryConnectButton.getText();
            Assert.assertEquals(actual, expected);
            LOG.Reporter("ravelry  connected verified ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            String expected = "Connected";
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            waitForVisibility(ravelry_ProgressBar);
            verifyImportSuccessfully();
            verifyRavelryImportCrossIcon();
            String actual = ravelryConnectButton.getText();
            Assert.assertEquals(actual, expected);
            LOG.Reporter("ravelry connected verified ");
        }
        return this;
    }

    public Dashboard verifyRavelryImportSuccessfully() {
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            connectedToDisconnectFlow();
            holdForElement(2);
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            LOG.Reporter("ravelry connected verified ");
            verifyImportSuccessfully();
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected flow ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            waitForVisibility(ravelry_ProgressBar);
            LOG.Reporter("ravelry  Progress bar is visible and clickable");
            verifyImportSuccessfully();
        }
        return this;
    }

    public void verifyImportSuccessfully() {
        manageProductToProductLib();
        if (iselementVisible(noRecordText)) {
            LOG.Reporter("No Record Found nothing is imported");
        } else {
            Assert.assertTrue(iselementVisible(importedRecordText));
            String actual = importedRecordText.getText();
            LOG.Reporter("Imported Successfully :: " + actual);
        }
    }

    public void manageProductToProductLib() {
        try {
            waitForVisibility(mpProductLib);
            clickByAction(mpProductLib);
            LOG.Reporter("Clicked on manage product to Product Library ");
        } catch (Exception e) {
            LOG.Reporter("Manage Connections link is not visible " + e.getMessage());

        }

    }

    public Dashboard verifyravelryProgressBar() {
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            connectedToDisconnectFlow();
            LOG.Reporter("ravelry Connected Confirmation");
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected Confirmation ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            ravelryProgressBar();
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectFlow();
            LOG.Reporter("ravelry Disconnected Confirmation ");
            connectToRavelryAccount();
            verifyravelryAccountLoggedInOrNot();
            ravelrAuthorizing();
            ravelryProgressBar();
        }
        return this;
    }

    public void ravelryProgressBar() {
        LOG.Reporter("Ravelry progress bar is visible and Text :: " + ravelry_ProgressBar.getText());
    }

    public void connectToRavelryAccount() {
        clickOnWebElement(connectYourAccount);
        LOG.Reporter("ravelry Connect your Account button is visible and clickable");
    }

    public void disconnectedToReConnectFlow() {
        holdForElement(3);
        clickOnWebElement(ravelryConnectButton);
        clickByAction(re_ConnectButton);
        clickOnWebElement(re_ConnectImport);
        clickOnWebElement(confirmReconnectAndImport);
        LOG.Reporter("ravelry Reconnect Confirmation");
    }

    public void disconnectedToReConnectToEtsy() {
        waitForVisibility(etsyConnectButton);
        clickOnWebElement(etsyConnectButton);
        clickByAction(re_ConnectButton);
        clickOnWebElement(re_ConnectImport);
        clickOnWebElement(confirmReconnectAndImport);
        LOG.Reporter("Etsy Reconnect Confirmation");
    }

    public void disconnectedToReConnectDoNotImportFlow() {
        clickOnWebElement(ravelryConnectButton);
        clickByAction(re_ConnectButton);
        //clickOnWebElement(re_ConnectImport);
        clickOnWebElement(confirmReconnectAndDoNotImport);
        LOG.Reporter("ravelry Reconnect Confirmation with Do Not Import");
    }


    public void connectedToDisconnectFlow() {
        waitForVisibility(ravelryConnectButton);
       // holdForElement(3);
        clickOnWebElement(ravelryConnectButton);
        clickByJSE(disconnect);
        LOG.Reporter("clicked on disconnect button");
        clickOnWebElement(disconnectConfirmation);
        LOG.Reporter("ravelry Disconnect Confirmation");
    }

    public void connectedToDisconnectEtsy() {
        clickOnWebElement(etsyConnectButton);
        clickByAction(disconnect);
        clickOnWebElement(disconnectConfirmation);
        LOG.Reporter("Etsy Disconnect Confirmation");
    }

    public void verifyravelryAccountLoggedInOrNot() {
        waitForVisibility(ravelryLoginTitle);
        if ((iselementVisible(ravelryLoginTitle))) {
            ravelrAccountLogin();
        } else {
            ravelrAuthorizing();
            LOG.Reporter("Ravelry account is already logged in");
        }

    }

    public void verifyEtsyAccountLoggedInOrNot() {
        loginToEtsyAccount();
        if ((iselementVisible(etsyLoginText))) {
            etsyAccountLogin();
        } else {
            LOG.Reporter("Etsy account is already logged in");
        }

    }

    public void ravelrAuthorizing() {
        waitForVisibility(ravelryTitle);
        Assert.assertTrue(iselementVisible(ravelryTitle, second10TimeOut));
        LOG.Reporter("ravelry Title is visible and clickable :: " + ravelryTitle.getText());
        clickOnWebElement(ravelryCB_One);
        LOG.Reporter("ravelry checkbox One is visible and clickable");
        clickOnWebElement(ravelryCB_two);
        LOG.Reporter("ravelry checkbox two is visible and clickable");
        clickOnWebElement(ravelry_Authorize_Button);
        LOG.Reporter("ravelry Authorize button is visible and clickable");
        waitForVisibility(productLibrary);
        LOG.Reporter("Product Library is visible");
    }

    public void ravelrAuthorizingWithoutImport() {
        waitForVisibility(ravelryTitle);
        Assert.assertTrue(iselementVisible(ravelryTitle, second10TimeOut));
        LOG.Reporter("ravelry Title is visible and clickable :: " + ravelryTitle.getText());
        clickOnWebElement(ravelryCB_One);
        LOG.Reporter("ravelry checkbox One is visible and clickable");
        clickOnWebElement(ravelryCB_two);
        LOG.Reporter("ravelry checkbox two is visible and clickable");
        clickOnWebElement(ravelry_Authorize_Button);
        LOG.Reporter("ravelry Authorize button is visible and clickable");
    }

    public void ravelrAccountLogin() {
        waitForVisibility(ravelryLoginTitle);
        sendKeys(ravelryLoginID, FileConstant.getEnvironmentKey(("ravelryID")));
        LOG.Reporter("Entered ravelry ID ");
        sendKeys(ravelryLoginPass, FileConstant.getEnvironmentKey(("ravelryPass")));
        LOG.Reporter("Entered ravelry  Pass ");
        clickOnWebElement(ravelryLoginButton);
        LOG.Reporter("ravelry account login successfully ");

    }

    public void etsyAccountLogin() {
        waitForVisibility(etsyLoginText);
        sendKeys(etsyLoginID, FileConstant.getEnvironmentKey(("etsyID")));
        LOG.Reporter("Entered Etsy ID ");
        sendKeys(etsyLoginPass, FileConstant.getEnvironmentKey(("etsyPass")));
        LOG.Reporter("Entered Etsy  Pass ");
        clickOnWebElement(etsyLoginButton);
        LOG.Reporter("Etsy account login successfully ");
    }

    public Dashboard goToConnectYourAccount() {
        if (iselementVisible(manageConnectionsLink)) {
            clickByJSE(manageConnectionsLink);
            LOG.Reporter("Manage Connections side link is clicked");
        } else {
            clickByAction(manageConnectionsLink);
            LOG.Reporter("Manage Connections side link is clicked again");
        }
        return this;
    }

    public Dashboard verfiyravelryConnectButton() {
        clickOnWebElement(manageConnectionsLink);
        LOG.Reporter("Manage Connections side link is clicked");
        waitForVisibility(ravelryConnectButton);
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connect")) {
            iselementClickable(ravelryConnectButton, second10TimeOut);
            LOG.Reporter("ravelry button is visible and clickable");
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("ravelry Connect is verified ");

        } else if (text.equalsIgnoreCase("connected")) {
            LOG.Reporter("ravelry connected is verified ");
        } else if (text.equalsIgnoreCase("Disconnected")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("clicking on Disconnected button");
            clickByAction(re_ConnectButton);
            LOG.Reporter("Clicking on Re-Connect button ");
            clickOnWebElement(re_ConnectImport);
            LOG.Reporter("Clicking on Re-Connect and Import button ");
            clickOnWebElement(confirmReconnectAndImport);
            LOG.Reporter("Clicking on Confirm Re-Connect and Import button ");
        }
        return this;
    }

    //All type of connections
    public void isravelryConnected() {
        String text = ravelryConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            LOG.Reporter("ravelry is connected");
        } else if (text.equalsIgnoreCase("Connect")) {
            clickOnWebElement(ravelryConnectButton);

        } else if (text.equalsIgnoreCase("Disconnected")) {
            clickOnWebElement(ravelryConnectButton);
            LOG.Reporter("clicking on Disconnected button");
            clickByAction(re_ConnectButton);
            LOG.Reporter("Clicking on Re-Connect button ");
            clickOnWebElement(re_ConnectImport);
            LOG.Reporter("Clicking on Re-Connect and Import button ");
            clickOnWebElement(confirmReconnectAndImport);
            LOG.Reporter("Clicking on Confirm Re-Connect and Import button ");
        }

    }

    public void isEtsyConnected() {
        String text = etsyConnectButton.getText();
        if (text.equalsIgnoreCase("Connected")) {
            LOG.Reporter("ravelry is connected");
            connectedToDisconnectEtsy();
            disconnectedToReConnectToEtsy();
            goToEtsyLoginPage();
            verifyEtsyAccountLoggedInOrNot();
        } else if (text.equalsIgnoreCase("Disconnected")) {
            disconnectedToReConnectToEtsy();
            goToEtsyLoginPage();
            verifyEtsyAccountLoggedInOrNot();
        }

    }

    //Etsy Integration Test
    public Dashboard verifyThatEtsyConnectButton() {
        goToConnectYourAccount();
        iselementClickable(etsyConnectButton, second10TimeOut);
        Assert.assertTrue(iselementVisible(etsyConnectButton, second10TimeOut));
        LOG.Reporter("Etsy Connect button is visible and accessible");
        return this;
    }

    public Dashboard verifyThatEtsyLoginPageShouldDisplay() {
        goToConnectYourAccount();
        goToEtsyLoginPage();
        loginToEtsyAccount();
        return this;
    }

    public void goToEtsyLoginPage() {
        waitForVisibility(etsyConnectButton);
        clickOnWebElement(etsyConnectButton);
        LOG.Reporter("Etsy Connect button is clicked");
        Assert.assertTrue(iselementVisible(connectEtsyTitle, second10TimeOut));
        LOG.Reporter("Connect to Etsy Title is visible and text :: " + connectEtsyTitle.getText());
        clickOnWebElement(connectYourAccount);
        LOG.Reporter("Connect your account button is clicked");
    }

    public void goToEtsyConnectBackButton() {
        clickOnWebElement(etsyConnectButton);
        LOG.Reporter("Etsy Connect button is clicked");
        Assert.assertTrue(iselementVisible(connectEtsyTitle, second10TimeOut));
        LOG.Reporter("Connect to Etsy Title is visible and text :: " + connectEtsyTitle.getText());
        clickOnWebElement(connectBackButton);
        LOG.Reporter("Back button is clicked");
        Assert.assertTrue(iselementVisible(sellingChannelsTitle, second10TimeOut));
        LOG.Reporter("Selling channels Title is visible and text :: " + sellingChannelsTitle.getText());
    }

    public void loginToEtsyAccount() {
        holdForElement(2);
        String titleOfPage = driver.getTitle();
        String expectedTitle = "Sign in | Etsy";
        Assert.assertEquals(titleOfPage, expectedTitle);
        LOG.Reporter("Title of the page is :: " + titleOfPage);


    }

    public Dashboard verifyThatEtsyConnectBackButton() {
        goToConnectYourAccount();
        goToEtsyConnectBackButton();
        return this;
    }

    public Dashboard verifyThatEtsyConnectSuccessfully() {
        goToConnectYourAccount();
        verifyThatEtsyConnectedOrDisconnected();
        return this;
    }

    public void verifyThatEtsyConnectedOrDisconnected() {
        isEtsyConnected();
    }

    public Dashboard verifyThatEtsyImportProgressBar() {
        Assert.assertTrue(iselementVisible(etsy_ProgressBar));
        LOG.Reporter("Etsy import progress bar is visible and text :: " + etsy_ProgressBar.getText());
        return this;
    }

    public Dashboard verifyThatEtsyImportProgressBarDismiss() {
        clickOnWebElement(popup_1Close);
        LOG.Reporter("Etsy import progress bar dismiss button is clicked");
        return this;
    }
}

