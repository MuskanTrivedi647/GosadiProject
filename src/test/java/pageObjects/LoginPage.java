package pageObjects;

import constants.FileConstant;
import logger.LOG;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static utilities.CommonUtils.holdForElement;

public class LoginPage extends BasePage {

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[text()='LOG IN']")
    private WebElement logInButton;

    @FindBy(xpath = "//div[contains(text(),'You have logged-in')]")
    private WebElement loginSuccessVerify;

    @FindBy(xpath = "//div[contains(text(),'Invalid credentials')]")
    private WebElement invalidLoginVerify;

    @FindBy(xpath = "//h1[text()='Log in to gosadi']")
    private WebElement loginPageTitle;

    @FindBy(xpath = "//button[contains(text() ,\"CREATE\" )]")
    private WebElement signupButton;

    @FindBy(xpath = "//p[text()='Please enter Email']")
    private WebElement emailErrorM;

    @FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root')]")
    private WebElement eyeIcon;

    @FindBy(xpath = "//p[contains(text(),'Remember me')]")
    private WebElement rememberMe;

    @FindBy(xpath = "//div[@role='button']/p[text()='Log out']")
    private WebElement logOutBtn;

    @FindBy(xpath = "//button[text()='Yes']")
    private WebElement logOutConfirmation_Yes;

    @FindBy(xpath = "//button[text()='No']")
    private WebElement logOutConfirmation_No;

    @FindBy(xpath = "//p[text()='Forgot Password?']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//h1[text()='Forgot Password']")
    private WebElement forgotPasswordTitle;

    @FindBy(name = "email")
    private WebElement fpEmail;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    private WebElement emailLinkConfirmationMessage;

    @FindBy(xpath = "//p[contains(text(),'email must be ')]")
    private WebElement invalidEmailMessage;

    @FindBy(xpath = "//button[text()='Send']")
    private WebElement fpSendBtn;

    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement fpCancelBtn;

    @FindBy(xpath = "//p[text()='Please enter Email']")
    private WebElement blankEmailError;

    @FindBy(xpath = "//button[contains(text(),'CREATE YOUR')]")
    private WebElement createAccountBtn;

    @FindBy(xpath = "//button[contains(@class,'Mui-selected') and contains(text(),'Step 1')]")
    private WebElement step1;

    @FindBy(xpath = "//button[contains(@class,'Mui-selected') and contains(text(),'Step 2')]")
    private WebElement step2;

    @FindBy(xpath = "//button[contains(@class,'Mui-selected') and contains(text(),'Step 3')]")
    private WebElement step3;

    @FindBy(xpath = "//button[contains(@class,'Mui-selected') and @value='2']")
    private WebElement monthly;

    @FindBy(xpath = "//button[contains(text(),'Yearly')]")
    private WebElement yearly;

    @FindBy(xpath = "//div[@class=' space-between']")
    private List<WebElement> planList;

    @FindBy(xpath = "//div[@class=' space-between']/p")
    private List<WebElement> priceM_Y;

    @FindBy(xpath = "(//button[contains(text(),'Start Your Free Trial')])[1]")
    private WebElement discoCP;

    @FindBy(xpath = "//h2[text()='Disco']")
    private WebElement discoTitle;

    @FindBy(xpath = "(//button[contains(text(),'Start Your Free Trial')])[4]")
    private WebElement discoPlusDLP;

    @FindBy(xpath = "(//h2[contains(text(),'DLP Add On')])[1]")
    private WebElement discoPlusDLPTitle;

    @FindBy(xpath = "(//button[contains(text(),'Start Your Free Trial')])[2]")
    private WebElement hustleCP;

    @FindBy(xpath = "//h2[text()='Hustle']")
    private WebElement hustleTitle;

    @FindBy(xpath = "(//button[contains(text(),'Start Your Free Trial')])[5]")
    private WebElement hustlePlusDLP;

    @FindBy(xpath = "(//h2[contains(text(),'DLP Add On')])[2]")
    private WebElement hustlePlusDLPTitle;

    @FindBy(xpath = "(//button[contains(text(),'Start Your Free Trial')])[3]")
    private WebElement groovyCP;

    @FindBy(xpath = "//h2[text()='Groovy']")
    private WebElement groovyTitle;

    @FindBy(id = "simple-tab-0")
    private WebElement step_1;

    @FindBy(xpath = "//button[text()='Step 1']")
    private WebElement step_01;

    @FindBy(id = "simple-tab-2")
    private WebElement step_3;

    @FindBy(xpath = "//h2[text()='Disco']")
    private WebElement innerPlanName;

    @FindBy(xpath = "//form[@action='#']/h1")
    private WebElement createAccountForm;

    @FindBy(xpath = "//p[contains(text(),'Special characters and ')]")
    private WebElement nameTFError;

    @FindBy(xpath = "//p[contains(text(),'Email')]")
    private WebElement emailTFError;

    @FindBy(xpath = "//p[contains(text(),'Special characters and ')]")
    private WebElement preferredNameTFError;


    @FindBy(xpath = "//p[contains(text(),'Full Name')]")
    private WebElement nameTFErrorWithBlank;

    @FindBy(xpath = "//p[contains(text(),'Preferred Name')]")
    private WebElement preferredNameTFErrorWithBlank;

    @FindBy(xpath = "//p[contains(text(),'valid email')]")
    private WebElement invalidEmailTFError;

    @FindBy(xpath = "//div[contains(text(),'Email already exists')]")
    private WebElement alreadyRegisteredEmail;

    @FindBy(xpath = "//button[text()='Agree']")
    private WebElement betaTesterConfiAgree;


    @FindBy(xpath = "//p[contains(text(),'valid phone number')]")
    private WebElement phoneNumberError;

    @FindBy(xpath = "//p[contains(text(),'Phone Number')]")
    private WebElement phoneNumberMandatory;

    @FindBy(xpath = "//p[contains(text(),'Postal code')]")
    private WebElement postalCodeMandatory;

    @FindBy(xpath = "//p[contains(text(),'Password must be')]")
    private WebElement passwordErrorMessage;

    @FindBy(xpath = "//p[contains(text(),'Please enter Password')]")
    private WebElement mandatoryPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement caFormSubmit;

    @FindBy(name = "fullName")
    private WebElement fullNameTF;

    @FindBy(name = "email")
    private WebElement emailTF;

    @FindBy(name = "phone")
    private WebElement phoneNoTF;

    @FindBy(name = "preferredName")
    private WebElement preferredNameTF;

    @FindBy(name = "phoneCountry")
    private WebElement countryCodeDD;

    @FindBy(xpath = "//*[@id=\":r7:\"]")
    private WebElement country;

    @FindBy(name = "postalCode")
    private WebElement postalCode;

    @FindBy(name = "password")
    private WebElement caPassword;

    @FindBy(xpath = "//*[@id=\"simple-tabpanel-1\"]/div/div/div[2]/form/div[7]/div/div/button")
    private WebElement caPasswordEye;

    @FindBy(xpath = "//input[@type=\"password\" and @name='password']")
    private WebElement caPasswordEyeHidden;

    @FindBy(xpath = "//input[@type=\"text\" and @name='password']")
    private WebElement caPasswordEyeUnHidden;

    @FindBy(xpath = "//*[@id=\"simple-tabpanel-1\"]/div/div/div[2]/form/label/span/input")
    private WebElement newsLetterSubscribedCB;

    @FindBy(xpath = "//p[contains(text(),'Sign up for gosadi updates')]")
    private WebElement newsLetterSubscribedCBIsChecked;

    @FindBy(xpath = "//a[contains(text(),'terms of service')]")
    private WebElement termOfService;

    @FindBy(xpath = "//h2[text()='Terms & Conditions']")
    private WebElement termOfServiceTittle;

    @FindBy(xpath = "//a[contains(text(),'privacy policy')]")
    private WebElement privacyPolicy;

    @FindBy(xpath = "//h2[text()='Privacy Policy']")
    private WebElement privacyPolicyTittle;

    @FindBy(xpath = "//a[text()='Log In']")
    private WebElement loginLink;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage verifyURL() {
        String actual_Title = driver.getTitle();
        String expected_Title = "gosadi - web";
        LOG.Reporter("Title of the Page is : " + actual_Title);
        Assert.assertEquals(actual_Title, expected_Title);
        LOG.Reporter("URL of the application verified ");
        return this;
    }

    public void validateEmailAndPassword() {
        sendKeys(email, FileConstant.getEnvironmentKey(("user_1")));
        LOG.Reporter("Entered Email address");
        sendKeys(password, FileConstant.getEnvironmentKey(("testPass_2")));
        LOG.Reporter("Entered Password ");
    }
    public void validateNewUserEmailAndPassword() {
        sendKeys(email, FileConstant.getEnvironmentKey(("user_1")));
        LOG.Reporter("Entered Email address");
        sendKeys(password, FileConstant.getEnvironmentKey(("userPass_1")));
        LOG.Reporter("Entered Password ");
    }
    public void validateFreshUserEmailAndPassword() {
        sendKeys(email, FileConstant.getEnvironmentKey(("user_1")));
        LOG.Reporter("Entered Email address");
        sendKeys(password, FileConstant.getEnvironmentKey(("testPass_2")));
        LOG.Reporter("Entered Password ");
    }
    public void logOutSeller() {
        waitForVisibility(logOutBtn);
        Assert.assertTrue(iselementVisible(logOutBtn, second10TimeOut));
        clickOnWebElement(logOutBtn);
        LOG.Reporter("Clicked on Logout button");
        clickByAction(logOutConfirmation_Yes);
        LOG.Reporter("Clicked on Yes button");
    }

    public LoginPage verifyAllTextLabelsAndTF() {
        Assert.assertTrue(iselementVisible(loginPageTitle, second10TimeOut), "Labels not displayed");
        String h1_labels = loginPageTitle.getText();
        String h1_labelsExpected = "Log in to gosadi";
        Assert.assertEquals(h1_labels, h1_labelsExpected);
        LOG.Reporter("H1 label is Verified : " + h1_labels);
        Assert.assertTrue(iselementVisible(email, second10TimeOut), "Email Text filed not visible");
        LOG.Reporter("Email text filed is display");
        Assert.assertTrue(iselementVisible(password, second10TimeOut), "Password Text filed not visible");
        LOG.Reporter("Password text filed is display");
        Assert.assertTrue(iselementVisible(logInButton, second10TimeOut), "Login Button is not visible");
        LOG.Reporter("Login Button is display ");
        Assert.assertTrue(iselementVisible(signupButton, second10TimeOut), "Signup Button is not visible");
        LOG.Reporter("Create your account Button is display ");
        return this;
    }

    public LoginPage verifyUserLogin() {
        validateEmailAndPassword();
        iselementClickable(logInButton, second10TimeOut);
        clickOnWebElement(logInButton);
        LOG.Reporter("Click on Login button");
        waitForVisibility(loginSuccessVerify);
        Assert.assertTrue(iselementVisible(loginSuccessVerify, second10TimeOut), "Login Successful message not visible");
        LOG.Reporter("Seller Login Successfully");
        return this;
    }
    public LoginPage verifyUserLoginWithFreshUser() {
        validateNewUserEmailAndPassword();
        iselementClickable(logInButton, second10TimeOut);
        clickOnWebElement(logInButton);
        LOG.Reporter("Click on Login button");
        return this;
    }
    public LoginPage verifyUserLoginWithNewUser() {
        validateFreshUserEmailAndPassword();
        iselementClickable(logInButton, second10TimeOut);
        clickOnWebElement(logInButton);
        LOG.Reporter("Click on Login button");
        Assert.assertTrue(iselementVisible(loginSuccessVerify, second10TimeOut), "Login Successful message not visible");
        LOG.Reporter("Seller Login Successfully");
        return this;
    }
    public LoginPage verifyWithInvalidPassword() {
        sendKeys(email, FileConstant.getEnvironmentKey(("user_1")));
        LOG.Reporter("Entered Email address");
        sendKeys(password, FileConstant.getEnvironmentKey(("invalidPass")));
        LOG.Reporter("Entered Password ");
        iselementClickable(logInButton, second10TimeOut);
        clickOnWebElement(logInButton);
        LOG.Reporter("Click on Login button");
        holdForElement(1);
        Assert.assertTrue(iselementVisible(invalidLoginVerify, second10TimeOut), "Invalid credentials message not visible");
        LOG.Reporter("Invalid credentials message display");
        return this;
    }

    public LoginPage verifyWithInvalidEmail() {
        sendKeys(email, FileConstant.getEnvironmentKey("invalidEmail"));
        LOG.Reporter("Entered Email address");
        sendKeys(password, FileConstant.getEnvironmentKey("userPass_1"));
        LOG.Reporter("Entered Password ");
        iselementClickable(logInButton, second10TimeOut);
        clickOnWebElement(logInButton);
        LOG.Reporter("Click on Login button");
        holdForElement(1);
        Assert.assertTrue(iselementVisible(invalidLoginVerify, second10TimeOut), "Invalid credentials message not visible");
        LOG.Reporter("Invalid credentials message display");
        return this;
    }


    public LoginPage verifyEyeIcon() {
        validateEmailAndPassword();
        iselementClickable(logInButton, second10TimeOut);
        clickOnWebElement(eyeIcon);
        LOG.Reporter("Click on Login button");
        return this;
    }

    public LoginPage verifyEyeIconAccessible() {
        sendKeys(email, FileConstant.getEnvironmentKey(("user_1")));
        LOG.Reporter("Entered Email address");
        sendKeys(password, FileConstant.getEnvironmentKey(("passCombo")));
        LOG.Reporter("Entered Password ");
        iselementClickable(logInButton, second10TimeOut);
        clickOnWebElement(logInButton);
        LOG.Reporter("Click on Login button");
        Assert.assertTrue(iselementVisible(eyeIcon, second10TimeOut));
        clickOnWebElement(eyeIcon);
        holdForElement(1);
        LOG.Reporter("Click on eye icon button password is visible");
        return this;
    }

    public LoginPage verifyRememberMe() {
        validateEmailAndPassword();
        holdForElement(1);
        Assert.assertTrue(iselementVisible(rememberMe, second10TimeOut), "Remember me Button is not visible");
        iselementClickable(rememberMe, second10TimeOut);
        clickOnWebElement(rememberMe);
        LOG.Reporter("Click on Remember me button : " + rememberMe.getText());
        return this;
    }

    public LoginPage verifyRememberMeWhenIsChecked() {
        validateEmailAndPassword();
        clickOnWebElement(rememberMe);
        Assert.assertTrue(iselementVisible(rememberMe, second10TimeOut));
        if (rememberMe.isSelected()) {
            LOG.Reporter(" Remember me button selected ");
        } else {
            LOG.Reporter(" Remember me button not selected ");
        }
        iselementEnable(rememberMe, second10TimeOut);
        LOG.Reporter("Click on Remember me button : " + rememberMe.getText());
        iselementClickable(logInButton, second10TimeOut);
        clickOnWebElement(logInButton);
        LOG.Reporter("Click on Login button");
        return this;
    }

    public LoginPage verifyRememberMeWhenIsUnChecked() {
        validateEmailAndPassword();
        Assert.assertTrue(iselementVisible(rememberMe, second10TimeOut));
        if (rememberMe.isSelected()) {
            LOG.Reporter(" Remember me button selected ");
        } else {
            LOG.Reporter(" Remember me button not selected ");
        }
        clickOnWebElement(logInButton);
        LOG.Reporter("Click on Login button");
        holdForElement(1);
        logOutSeller();
        return this;
    }

    public LoginPage verifyForgotPasswordLink() {
        iselementClickable(forgotPasswordLink, second10TimeOut);
        clickOnWebElement(forgotPasswordLink);
        LOG.Reporter("Clicked on Forgot password link ");
        iselementVisible(forgotPasswordTitle);
        LOG.Reporter("Forgot password Screen will display ");
        return this;
    }

    public LoginPage verifyForgotPasswordValidEmail() {
        verifyForgotPasswordLink();
        sendKeys(fpEmail, FileConstant.getEnvironmentKey(("fpEmail")));
        LOG.Reporter("Entered valid email address");
        clickOnWebElement(fpSendBtn);
        LOG.Reporter("Clicked on send button");
        holdForElement(1);
        String message = emailLinkConfirmationMessage.getText();
        Assert.assertTrue(iselementVisible(emailLinkConfirmationMessage, second10TimeOut));
        LOG.Reporter("Email Confirmation Message : " + message);
        return this;
    }

    public LoginPage verifyForgotPasswordInValidEmail() {
        verifyForgotPasswordLink();
        sendKeys(fpEmail,  FileConstant.getEnvironmentKey(("fpEmailInvalid")));
        LOG.Reporter("Entered invalid email address");
        clickOnWebElement(fpSendBtn);
        LOG.Reporter("Clicked on send button");
        Assert.assertTrue(iselementVisible(invalidEmailMessage, second10TimeOut));
        LOG.Reporter("Error message when user give invalid email : " + invalidEmailMessage.getText());
        return this;
    }

    public LoginPage verifyForgotPasswordInBlankEmailField() {
        verifyForgotPasswordLink();
        clear(fpEmail);
        LOG.Reporter("Clear email address field");
        clickOnWebElement(fpSendBtn);
        LOG.Reporter("Clicked on send button");
        Assert.assertTrue(iselementVisible(blankEmailError, second10TimeOut));
        LOG.Reporter("Error message when user click on send button with blank email filed : " + blankEmailError.getText());
        return this;
    }

    public LoginPage verifyForgotPasswordCancelBtn() {
        verifyForgotPasswordLink();
        clickOnWebElement(fpCancelBtn);
        LOG.Reporter("Clicked on cancel button");
        Assert.assertTrue(iselementVisible(loginPageTitle, second10TimeOut));
        LOG.Reporter("Login page text should visible : " + loginPageTitle.getText());
        return this;
    }

    public LoginPage verifyCreateAccountBtn() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("clicked on create account button");
        return this;
    }

    public LoginPage verifyCreateAccountDefaultTab() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("clicked on create account button");
        Assert.assertTrue(iselementVisible(step1, second10TimeOut), "Step 1 is not visible");
        LOG.Reporter("Step 1 is at default");
        Assert.assertFalse(iselementVisible(step2, second10TimeOut), "Step 2 is not visible");
        LOG.Reporter("Step 2 is not active");
        Assert.assertFalse(iselementVisible(step3, second10TimeOut), "Step 3 is not visible");
        LOG.Reporter("Step 3 is not active");
        return this;
    }

    public LoginPage verifyMonthlyTabAtDefault() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("clicked on create account button");
        Assert.assertTrue(iselementVisible(monthly, second10TimeOut), "Monthly is not at default");
        LOG.Reporter("Monthly option is at default");
        return this;
    }

    public LoginPage verifyMonthlyTabAtDefaultPrice() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("clicked on create account button");
        Assert.assertTrue(iselementVisible(monthly, second10TimeOut), "Monthly is not at default");
        LOG.Reporter("Monthly option is Active");
        getPlanAndPrice(planList);

        return this;
    }

    public LoginPage verifyYearlyTabPrice() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("clicked on create account button");
        clickOnWebElement(yearly);
        LOG.Reporter("select Yearly option");
        Assert.assertTrue(iselementVisible(yearly, second10TimeOut), "Monthly is not at default");
        LOG.Reporter("Yearly option is at default");
        getPlanAndPrice(planList);

        return this;
    }

    public LoginPage verifyFiveDifferentPlans() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("clicked on create account button");
        Assert.assertTrue(iselementVisible(discoTitle), "Disco plan is not visible");
        LOG.Reporter("Plan Name :: " + discoTitle.getText());
        Assert.assertTrue(iselementVisible(hustleTitle), "Disco plan is not visible");
        LOG.Reporter("Plan Name :: " + hustleTitle.getText());
        Assert.assertTrue(iselementVisible(discoPlusDLPTitle), "Disco plan is not visible");
        LOG.Reporter("Plan Name :: " + discoPlusDLPTitle.getText());
        Assert.assertTrue(iselementVisible(hustlePlusDLPTitle), "Disco plan is not visible");
        LOG.Reporter("Plan Name :: " + hustlePlusDLPTitle.getText());
        Assert.assertTrue(iselementVisible(groovyTitle), "Disco plan is not visible");
        LOG.Reporter("Plan Name :: " + groovyTitle.getText());
        LOG.Reporter("ALl plan is displayed and verified ");
        return this;
    }

    public LoginPage verifyChoosePlanButton() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("clicked on create account button");
        clickOnWebElement(hustleCP);
        LOG.Reporter("Clicked on Plan Hustle ");
        Assert.assertTrue(iselementVisible(hustleTitle, second10TimeOut));
        LOG.Reporter("Plan selected successfully and Plan name :: " + hustleTitle.getText());
        return this;
    }


    public void getPlanAndPrice(List<WebElement> elements) {
        for (WebElement element : elements) {
            String getTextValue = element.getText();
            LOG.Reporter("Plans and Price is : " + getTextValue);

        }
    }


    public LoginPage verifyUserNotSelectMultiplePlans() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("Clicked on Create account button");
        clickOnWebElement(discoCP);
        LOG.Reporter("Clicked on Disco plan");
        Assert.assertTrue(iselementVisible(innerPlanName, second10TimeOut));
        LOG.Reporter("Plan Selected : " + innerPlanName.getText());
        LOG.Reporter("Verified disco plane is selected and other plan is not selected ");
        return this;
    }

    public LoginPage verifyStep2Redirection() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("Clicked on Create account button");
        clickOnWebElement(hustleCP);
        LOG.Reporter("Clicked on Hustle plan");
        Assert.assertTrue(iselementVisible(step2, second10TimeOut), "Step 2 not display");
        LOG.Reporter("User is on : " + step2.getText());
        return this;
    }


    public LoginPage verifyThatCreateAccountFormIsDisplayed() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("Clicked on Create account button");
        clickOnWebElement(hustleCP);
        LOG.Reporter("Clicked on Hustle plan");
        Assert.assertTrue(iselementVisible(createAccountForm, second10TimeOut), "Create account form is not displayed");
        LOG.Reporter("Create account Form display and Title is :" + createAccountForm.getText());
        return this;
    }

    public LoginPage verifyThatStep2IsCompleted() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("Clicked on Create account button");
        clickOnWebElement(hustleCP);
        LOG.Reporter("Clicked on Hustle plan");
        Assert.assertTrue(iselementVisible(createAccountForm, second10TimeOut), "Create account form is not displayed");
        LOG.Reporter("user is at Step 2 and title is : " + createAccountForm.getText());
        Assert.assertTrue(iselementVisible(step_3), "Step3 is not display ");
        boolean value = step_3.isSelected();
        LOG.Reporter("Verify that step 3 is enable or clickable : " + value);
        return this;
    }

    public LoginPage verifyThatFullNameFieldTakesCharacter() {
        goToCreateAccountPage();
        sendKeys(fullNameTF,   FileConstant.getEnvironmentKey(("fullName")));
        LOG.Reporter("Entered full name on text field ");
        return this;
    }

    public LoginPage verifyThatFullNameAllValidation() {
        goToCreateAccountPage();
        sendKeys(fullNameTF,   FileConstant.getEnvironmentKey(("InvalidFullName")));
        LOG.Reporter("Entered Numeric, alphanumeric and Special character on full name text field ");
        scrollByVisibilityOfElement(driver, caFormSubmit);
        clickOnWebElement(caFormSubmit);
        scrollByVisibilityOfElement(driver, nameTFError);
        Assert.assertTrue(iselementVisible(nameTFError, second10TimeOut), "No validation error has come ");
        LOG.Reporter("Validation Error is display and Error is : " + nameTFError.getText());
        return this;
    }

    public LoginPage verifyThatPreferredNameWithInvalidData() {
        goToCreateAccountPage();
        sendKeys(preferredNameTF,   FileConstant.getEnvironmentKey(("InvalidFullName")));
        LOG.Reporter("Entered Numeric, alphanumeric and Special character on Preferred name text field ");
        scrollByVisibilityOfElement(driver, caFormSubmit);
        clickOnWebElement(caFormSubmit);
        scrollByVisibilityOfElement(driver, preferredNameTF);
        Assert.assertTrue(iselementVisible(preferredNameTFError, second10TimeOut), "No validation error has come ");
        LOG.Reporter("Validation Error is display and Error is : " + preferredNameTFError.getText());
        return this;
    }

    public LoginPage verifyThatFullNameWithBlank() {
        goToCreateAccountPage();
        sendKeys(fullNameTF, "  ");
        LOG.Reporter("Giving blank as text");
        clickOnWebElement(caFormSubmit);
        scrollByVisibilityOfElement(driver, nameTFErrorWithBlank);
        Assert.assertTrue(iselementVisible(nameTFErrorWithBlank, second10TimeOut), "No validation error has come ");
        LOG.Reporter("Validation Error is display and Error is : " + nameTFErrorWithBlank.getText());
        return this;
    }

    public LoginPage verifyThatPreferredNameWithBlank() {
        goToCreateAccountPage();
        sendKeys(preferredNameTF, "  ");
        LOG.Reporter("Giving blank as text");
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(preferredNameTFErrorWithBlank, second10TimeOut), "No validation error has come ");
        LOG.Reporter("Validation Error is display and Error is : " + preferredNameTFErrorWithBlank.getText());
        return this;
    }

    public LoginPage verifyThatPreferredNameRequiredField() {
        goToCreateAccountPage();
        sendKeys(preferredNameTF, "  ");
        LOG.Reporter("Giving blank as text");
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(preferredNameTFErrorWithBlank, second10TimeOut), "No validation error has come ");
        LOG.Reporter("Preferred Name field is mandatory field and error is :: " + preferredNameTFErrorWithBlank.getText());
        return this;
    }

    public LoginPage verifyThatFullNameRequiredField() {
        goToCreateAccountPage();
        sendKeys(fullNameTF, "  ");
        LOG.Reporter("Giving blank as text");
        clickOnWebElement(caFormSubmit);
        scrollByVisibilityOfElement(driver, nameTFErrorWithBlank);
        Assert.assertTrue(iselementVisible(nameTFErrorWithBlank, second10TimeOut), "No validation error has come ");
        LOG.Reporter("Full Name field is mandatory field and error is :: " + nameTFErrorWithBlank.getText());
        return this;
    }

    public void goToCreateAccountPage() {
        clickOnWebElement(createAccountBtn);
        LOG.Reporter("Clicked on Create account button");
        clickOnWebElement(hustleCP);
        LOG.Reporter("Clicked on Hustle plan");
        Assert.assertTrue(iselementVisible(createAccountForm, second10TimeOut), "Create account form is not displayed");
        LOG.Reporter("user is at Step 2 and title is : " + createAccountForm.getText());
    }

    public LoginPage verifyThatPreferredNameTF() {
        goToCreateAccountPage();
        sendKeys(preferredNameTF,   FileConstant.getEnvironmentKey(("preferredName")));
        Assert.assertFalse(iselementVisible(nameTFError), "No Error will display");
        LOG.Reporter("Giving Preferred name on Full name field");
        return this;
    }

    public LoginPage verifyThatValidEmailField() {
        goToCreateAccountPage();
        sendKeys(emailTF,  FileConstant.getEnvironmentKey(("user_1")));
        Assert.assertFalse(iselementVisible(emailTFError), "No Error will display");
        LOG.Reporter("Giving Valid email into text filed");
        return this;
    }

    public LoginPage verifyThatInValidDataInEmailField() {
        goToCreateAccountPage();
        sendKeys(emailTF,  FileConstant.getEnvironmentKey(("fpEmailInvalid")));
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(invalidEmailTFError), "No Error will display");
        LOG.Reporter("Giving Invalid email into text filed showing error :: " + invalidEmailTFError.getText());
        return this;
    }

    public LoginPage verifyThatAlreadyRegisteredEmail() {
        goToCreateAccountPage();
        commonTextFiled();
        sendKeys(postalCode, "452020");
        sendKeys(password, "As#12345");
        LOG.Reporter("Entering password data");
        sendKeys(confirmPassword, "As#12345");
        LOG.Reporter("Entering confirm password data");
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(betaTesterConfiAgree, second10TimeOut), "Beta Tester acknowledge popup not display");
        LOG.Reporter("Beta Tester acknowledge popup display");
        clickOnWebElement(betaTesterConfiAgree);
        LOG.Reporter("Clicked on agree");
        Assert.assertTrue(iselementVisible(alreadyRegisteredEmail), "No Error will display");
        LOG.Reporter("Already Registered Email error display :: " + alreadyRegisteredEmail.getText());
        return this;
    }


    public LoginPage verifyThatEmailIsMandatoryFiled() {
        goToCreateAccountPage();
        clear(emailTF);
        sendKeys(emailTF, " ");
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(invalidEmailTFError), "No Error will display");
        LOG.Reporter("Giving Blank so that its show mandatory filed and Error :: " + invalidEmailTFError.getText());
        return this;
    }

    public LoginPage verifyThatValidPhoneNumber() {
        goToCreateAccountPage();
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("phoneNoTF")));
        clickOnWebElement(caFormSubmit);
        LOG.Reporter("Giving valid phone number in Phone number text field ");
        return this;
    }

    public LoginPage verifyThatInValidPhoneNumber() {
        goToCreateAccountPage();
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("invalidPhoneNoTF")));
        clickOnWebElement(caFormSubmit);
        clear(phoneNoTF);
        sendKeys(phoneNoTF,"12345");
        Assert.assertTrue(iselementVisible(phoneNumberError, second10TimeOut), "No error display");
        LOG.Reporter("Giving Invalid phone number and error is :: " + phoneNumberError.getText());
        return this;
    }

    public LoginPage verifyThatCountryFlagChangeableOrNot() {
        goToCreateAccountPage();
        selectByVisibleText("Costa Rica", countryCodeDD);
        LOG.Reporter("Different country selected ");
        holdForElement(1);
        return this;
    }

    public LoginPage verifyThatMobileNumberTFAcceptsNumericData() {
        goToCreateAccountPage();
        sendKeys(phoneNoTF,   FileConstant.getEnvironmentKey(("phoneNoTF")));
        clickOnWebElement(caFormSubmit);
        LOG.Reporter("Valid Phone Number Verified ");
        return this;
    }

    public LoginPage verifyThatMobileNumberTFWithInvalidData() {
        goToCreateAccountPage();
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("invalidPhoneNoTF")));
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(phoneNumberError), "Error will display");
        LOG.Reporter("Invalid Phone Number Error Message Verified ");
        return this;
    }

    public LoginPage verifyThatMobileNumberTFIsMandatoryField() {
        goToCreateAccountPage();
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(phoneNumberMandatory), "Error will display");
        LOG.Reporter("Phone Number field Mandatory Message Verified ");
        return this;
    }
    public void textFiledWithNameAndEmail(){
        sendKeys(fullNameTF,   FileConstant.getEnvironmentKey(("fullName")));
        sendKeys(preferredNameTF,  FileConstant.getEnvironmentKey(("preferredName")));
        sendKeys(emailTF,  FileConstant.getEnvironmentKey(("validEmail")));
    }

    public LoginPage verifyThatMobileNumberTFWithBlank() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        sendKeys(phoneNoTF, "");
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(phoneNumberMandatory), "Error will display");
        LOG.Reporter("Phone Number not taking blank spaces");
        return this;
    }

    public LoginPage verifyThatCountryFlagDefault() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        selectByVisibleText("United States", countryCodeDD);
        LOG.Reporter("Country flag USA selected ");
        return this;
    }

    public LoginPage verifySelectedCountryFlag() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        LOG.Reporter("Giving all basic details ");
        selectByVisibleText("India", countryCodeDD);
        LOG.Reporter("Getting country from dropdown");
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("INDPhone")));
        sendKeys(country,"India" + Keys.ENTER);
        LOG.Reporter("Country India selected ");
        return this;
    }

    public LoginPage verifyThatCountryMandatoryField() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        LOG.Reporter("Giving all basic details ");
        selectByVisibleText("India", countryCodeDD);
        LOG.Reporter("Getting country from dropdown");
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("INDPhone")));
        sendKeys(country,"India" + Keys.ENTER);
        LOG.Reporter("Country India selected ");
        Assert.assertTrue(iselementVisible(country, second10TimeOut));
        LOG.Reporter("Country is mandatory field ");
        return this;
    }

    public LoginPage verifyThatChoosingCountryFromDD() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        LOG.Reporter("Giving all basic details ");
        selectByVisibleText("India", countryCodeDD);
        LOG.Reporter("Getting country from dropdown");
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("INDPhone")));
        sendKeys(country, "China" + Keys.ENTER);
        LOG.Reporter("Country China selected ");
        Assert.assertTrue(iselementVisible(country, second10TimeOut));
        LOG.Reporter("choosing option from the country dropdown ");
        return this;
    }

    public LoginPage verifyThatMultipleChoosingCountry() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        LOG.Reporter("Giving all basic details ");
        selectByVisibleText("India", countryCodeDD);
        LOG.Reporter("Getting country from dropdown");
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("INDPhone")));
        isMultiSelectByVisibleText("China", country);
        LOG.Reporter("Country China selected ");
        Assert.assertTrue(iselementVisible(country, second10TimeOut));
        LOG.Reporter("Country dropdown is not multi Select ");
        return this;
    }

    public LoginPage verifyThatCountryAllSelectedOption() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        LOG.Reporter("Giving all basic details ");
        printDropdownOptions(countryCodeDD);
        LOG.Reporter("All country options visible ");
        return this;
    }


    public LoginPage verifyThatCountryFieldIsMandatory() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        LOG.Reporter("Giving all basic details ");
        selectByVisibleText("United States", countryCodeDD);
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("INDPhone")));
        Assert.assertTrue(iselementVisible(country, second10TimeOut));
        LOG.Reporter("Country filed is mandatory field");

        return this;
    }

    public LoginPage verifyThatVerifyPostalCode() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        LOG.Reporter("Giving all basic details ");
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("INDPhone")));
        selectByVisibleText("India", countryCodeDD);
        sendKeys(postalCode,   FileConstant.getEnvironmentKey(("postalCode")));
        LOG.Reporter("Giving one postal code");
        return this;
    }

    public LoginPage verifyThatPostalCodeWithInvalidData() {
        goToCreateAccountPage();
        textFiledWithNameAndEmail();
        LOG.Reporter("Giving all basic details ");
        selectByVisibleText("India", countryCodeDD);
        LOG.Reporter("Getting country from dropdown");
        sendKeys(phoneNoTF,  FileConstant.getEnvironmentKey(("INDPhone")));
        return this;
    }

    public LoginPage verifyThatPostalMandatory() {
        goToCreateAccountPage();
        commonTextFiled();
        clickOnWebElement(caFormSubmit);
        Assert.assertFalse(iselementVisible(postalCodeMandatory));
        return this;
    }

    public LoginPage verifyThatPostalTakesTakeNumeric() {
        goToCreateAccountPage();
        commonTextFiled();
        Assert.assertTrue(iselementVisible(postalCode, second10TimeOut), "Postal code filed not visible");
        sendKeys(postalCode,  FileConstant.getEnvironmentKey(("postalCode")));
        clickOnWebElement(caFormSubmit);
        LOG.Reporter("Postal code giving numeric value ");
        return this;
    }


    public LoginPage verifyThatPasswordValidation(String passwords) {
        goToCreateAccountPage();
        commonTextFiled();
        sendKeys(postalCode,  FileConstant.getEnvironmentKey(("postalCode")));
        sendKeys(password, passwords );
        LOG.Reporter("Entering password with Min 6 chars, include 1 cap letter, 1 lowercase, 1special character, 1 numeric value ");
        clickOnWebElement(caPasswordEye);
        clickOnWebElement(caFormSubmit);
        return this;
    }

    public LoginPage verifyThatPasswordWithInvalidData() {
        goToCreateAccountPage();
        commonTextFiled();
        sendKeys(postalCode,  FileConstant.getEnvironmentKey(("postalCode")));
        sendKeys(password,   FileConstant.getEnvironmentKey(("invalidPass")));
        LOG.Reporter("Entering password without giving any valid validation data");
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(passwordErrorMessage, second10TimeOut), "Password error message not visible ");
        LOG.Reporter("Giving invalid data and getting error message is :: " + passwordErrorMessage.getText());
        return this;
    }


    public void commonTextFiled() {
        sendKeys(fullNameTF, "Rajveer Gupta");
        LOG.Reporter("Giving Full name in text filed");
        sendKeys(preferredNameTF, "Rajveer");
        LOG.Reporter("Giving Preferred name in text filed");
        sendKeys(emailTF, "rajveergupta@gmail.com");
        LOG.Reporter("Giving Email in text filed");
        sendKeys(phoneNoTF, "8955512364");
        LOG.Reporter("Giving Phone number in text filed");
        selectByVisibleText("India", countryCodeDD);
        LOG.Reporter("Getting country from dropdown");
    }

    public LoginPage verifyThatPasswordWithBlankSpaces() {
        goToCreateAccountPage();
        commonTextFiled();
        sendKeys(postalCode,   FileConstant.getEnvironmentKey(("postalCode")));
        sendKeys(password, "    " + Keys.SPACE);
        LOG.Reporter("Entering password with blank spaces data");
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(passwordErrorMessage, second10TimeOut), "Password error message not visible ");
        LOG.Reporter("Giving blank spaces data and getting error message is :: " + passwordErrorMessage.getText());
        return this;
    }

    public LoginPage verifyThatPasswordMandatoryField() {
        goToCreateAccountPage();
        clickOnWebElement(caFormSubmit);
        Assert.assertTrue(iselementVisible(mandatoryPassword, second10TimeOut), "Password error message not visible ");
        LOG.Reporter("Not giving any data and verifying mandatory field message is :: " + mandatoryPassword.getText());
        return this;
    }

    public LoginPage verifyThatPasswordFieldEyeIcon() {
        goToCreateAccountPage();
        commonTextFiled();
        sendKeys(postalCode,  FileConstant.getEnvironmentKey(("postalCode")));
        sendKeys(password,   FileConstant.getEnvironmentKey(("validPass")));
        LOG.Reporter("Entering password with valid data");
        Assert.assertTrue(iselementVisible(caPasswordEye, second10TimeOut), "Eye icon is not visible ");
        LOG.Reporter("Eye icon is visible");
        Assert.assertTrue(iselementVisible(caPasswordEyeHidden, second10TimeOut));
        LOG.Reporter("Password filed is hidden by default");
        return this;
    }

    public LoginPage verifyThatWhenEyeIconClickedOnPasswordField() {
        goToCreateAccountPage();
        commonTextFiled();
        sendKeys(postalCode,  FileConstant.getEnvironmentKey(("postalCode")));
        sendKeys(password,   FileConstant.getEnvironmentKey(("validPass")));
        LOG.Reporter("Entering password with valid data");
        Assert.assertTrue(iselementVisible(caPasswordEye, second10TimeOut), "Eye icon is not visible ");
        LOG.Reporter("Eye icon is visible");
        clickOnWebElement(caPasswordEye);
        LOG.Reporter("Clicked on eye icon to see the password in text filed");
        Assert.assertTrue(iselementVisible(caPasswordEyeUnHidden, second10TimeOut));
        LOG.Reporter("Password filed is Un-hidden Password is visible");
        return this;
    }

    public LoginPage verifyThatGosadiMarketingCheckboxUnchecked() {
        goToCreateAccountPage();
        if (newsLetterSubscribedCB.isSelected()) {
            LOG.Reporter("News Letter Subscribed checkbox By default is checked ");
        } else {
            LOG.Reporter("News Letter Subscribed checkbox By default is Unchecked ");
        }
        return this;
    }

    public LoginPage verifyThatGosadiMarketingCheckboxIsChecked() {
        goToCreateAccountPage();
        Assert.assertTrue(iselementVisible(newsLetterSubscribedCBIsChecked, second10TimeOut));
        LOG.Reporter("Checkbox is visible and text is :: " + newsLetterSubscribedCBIsChecked.getText());
        clickOnWebElement(newsLetterSubscribedCBIsChecked);
        LOG.Reporter("News Letter Subscribed checkbox can be checked and Un-checked");
        return this;
    }

    public LoginPage verifyThatPrivacyPolicyLinksAreAccessible() {
        goToCreateAccountPage();
        clickOnWebElement(termOfService);
        LOG.Reporter("Clicked on terms of services link");
        holdForElement(1);
        switchToTabByIndex(driver, 1);
        LOG.Reporter("Tab is Switched ");
        holdForElement(1);
        Assert.assertTrue(iselementVisible(termOfServiceTittle, second10TimeOut), "Title of the page is not visible ");
        LOG.Reporter("Title of the page is :: " + termOfServiceTittle.getText());
        switchToTabByIndex(driver, 0);
        clickOnWebElement(privacyPolicy);
        LOG.Reporter("Clicked on Privacy policy link");
        holdForElement(1);
        switchToTabByIndex(driver, 2);
        Assert.assertTrue(iselementVisible(privacyPolicyTittle, second10TimeOut), "Title of the page is not visible ");
        LOG.Reporter("Title of the page is :: " + privacyPolicyTittle.getText());
        return this;
    }

    public LoginPage verifyThatGivingAllDetailsSignUpButtonIsEnable() {
        goToCreateAccountPage();
        commonTextFiled();
        sendKeys(postalCode,   FileConstant.getEnvironmentKey(("postalCode")));
        LOG.Reporter("Giving Postal code in text filed");
        sendKeys(password,   FileConstant.getEnvironmentKey(("validPass")));
        LOG.Reporter("Giving Password in text filed");
        sendKeys(confirmPassword,  FileConstant.getEnvironmentKey(("ValidConfirmPassword")));
        LOG.Reporter("Giving Confirm Password in text filed");
        clickOnWebElement(caFormSubmit);
        LOG.Reporter("Click on Signup button");

        return this;
    }

    public LoginPage verifyThatLoginLink() {
        goToCreateAccountPage();
        Assert.assertTrue(iselementVisible(loginLink, second10TimeOut), "Login link was not available ");
        clickOnWebElement(loginLink);
        LOG.Reporter("Clicked on Login link");
        Assert.assertTrue(iselementVisible(loginPageTitle, second10TimeOut), "Login page not display");
        LOG.Reporter("Login page Title display and title is :: " + loginPageTitle.getText());
        return this;
    }
}
