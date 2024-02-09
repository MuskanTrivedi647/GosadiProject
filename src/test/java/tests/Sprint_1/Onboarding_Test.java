package tests.Sprint_1;


import io.qameta.allure.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import tests.SuiteSetup;
import utilities.JiraPolicy;

import static io.qameta.allure.SeverityLevel.*;

@Epic("Onboarding")
public class Onboarding_Test extends SuiteSetup {

    public LoginPage page;

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 1, description = "GP_Web_001")
    @Feature("Login")
    @Severity(CRITICAL)
    @Description("Verify URL https://app.gosadi.com/login redirects to the the source page or not ")
    @Story("As a user I should be able to open the URL")
    public void testToVerifyURL() {
        page = new LoginPage(getDriver());
        page.verifyURL();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 2, description = "GP_Web_002")
    @Feature("SignUP")
    @Severity(BLOCKER)
    @Description("Verify that all the labels and controls including text-boxes, buttons, and links are present on the Login page.")
    @Story("As a user I should be able to verify all the labels,text-boxes and buttons")
    public void testToVerifyAllTextLabelsAndTF() {
        page = new LoginPage(getDriver());
        page.verifyAllTextLabelsAndTF();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 3, description = "GP_Web_003")
    @Feature("SignUP")
    @Severity(MINOR)
    @Description("Verify if a user will be able to login with a valid username and valid password.")
    @Story("As a user I should be able to Login to the application")
    public void testToVerifySellerLogin() {
        page = new LoginPage(getDriver());
        page.verifyUserLogin();
    }
    @JiraPolicy(logTicketReady = false)
    @Test(priority = 4, description = "GP_Web_004")
    @Feature("Login")
    @Severity(MINOR)
    @Description("Verify if a user cannot login with a valid username and an invalid password.")
    @Story("As a user I should not be able to Login to the application")
    public void testToVerifyInvalidSellerLogin() {
        page = new LoginPage(getDriver());
        page.verifyWithInvalidPassword();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 5, description = "GP_Web_005")
    @Feature("Login")
    @Severity(MINOR)
    @Description("Verify if a user cannot login with a invalid email and an valid password.")
    @Story("As a user I should not be able to Login with invalid email an valid password")
    public void testToVerifyInvalidEmail() {
        page = new LoginPage(getDriver());
        page.verifyWithInvalidEmail();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 6, description = "GP_Web_006")
    @Feature("Login")
    @Severity(MINOR)
    @Description("Verify the login page for both, when the field is blank and Login button is clicked.")
    @Story("As a user I should not be able to Login with invalid email an valid password")
    public void testToVerifyUserField() {
        page = new LoginPage(getDriver());
        page.verifyWithInvalidEmail();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 7, description = "GP_Web_007")
    @Feature("Login")
    @Severity(MINOR)
    @Description("Verify password is masked or not by default")
    @Story("As a user I should able to masked Password Eye Icon On Login")
    public void testToVerifyPasswordEyeIconOnLogin() {
        page = new LoginPage(getDriver());
        page.verifyEyeIcon();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 8, description = "GP_Web_008")
    @Feature("Login")
    @Severity(NORMAL)
    @Description("Verify eye icon is accessible or not ")
    @Story("As a user I should able to verify eye icon is accessible or not")
    public void testToVerifyPasswordEyeIconAccessible() {
        page = new LoginPage(getDriver());
        page.verifyEyeIconAccessible();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 9, description = "GP_Web_009")
    @Feature("Remember Me")
    @Severity(NORMAL)
    @Description("Verify Remember me checkbox is accessible or not ")
    @Story("As a user I should able to verify Remember me checkbox is accessible or not")
    public void testToVerifyRememberMe() {
        page = new LoginPage(getDriver());
        page.verifyRememberMe();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 10, description = "GP_Web_0010")
    @Feature("Remember Me")
    @Severity(NORMAL)
    @Description("Verify when user checked remember me checkbox then login credentials saved or not automatically")
    @Story("As a user I should able to verify user checked remember me checkbox then login credentials saved")
    public void testToVerifyRememberMeWhenChecked() {
        page = new LoginPage(getDriver());
        page.verifyRememberMeWhenIsChecked();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 11, description = "GP_Web_011")
    @Feature("Remember Me")
    @Severity(NORMAL)
    @Description("Verify when checkbox is not checked then login credentials saved or not automatically")
    @Story("As a user I should able to verify checkbox is not checked then login credentials saved or not automatically")
    public void testToVerifyRememberMeWhenUnChecked() {
        page = new LoginPage(getDriver());
        page.verifyRememberMeWhenIsUnChecked();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 12, description = "GP_Web_012")
    @Feature("Forgot Password")
    @Severity(NORMAL)
    @Description("Verify Forgot password link is accessible or not ")
    @Story("As a user I should able to verify Forgot password link is accessible or not ")
    public void testToVerifyForgotPasswordLink() {
        page = new LoginPage(getDriver());
        page.verifyForgotPasswordLink();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 13, description = "GP_Web_013")
    @Feature("Forgot Password")
    @Severity(NORMAL)
    @Description("Verify when user enter registered and valid format of an email")
    @Story("As a user I should able to verify user enter registered and valid format of an email")
    public void testToVerifyForgotPasswordWithValidEmail() {
        page = new LoginPage(getDriver());
        page.verifyForgotPasswordValidEmail();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 14, description = "GP_Web_014")
    @Feature("Forgot Password")
    @Severity(NORMAL)
    @Description("Verify when user enter unregistered and invalid email address ")
    @Story("As a user I should able to user enter unregistered and invalid email address")
    public void testToVerifyForgotPasswordWithInValidEmail() {
        page = new LoginPage(getDriver());
        page.verifyForgotPasswordInValidEmail();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 15, description = "GP_Web_015")
    @Feature("Forgot Password")
    @Severity(NORMAL)
    @Description("Verify when email address field is blank and hit send button ")
    @Story("As a user I should able to verify when email address field is blank and hit send button ")
    public void testToVerifyForgotPasswordWithInBlankEmailField() {
        page = new LoginPage(getDriver());
        page.verifyForgotPasswordInBlankEmailField();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 16, description = "GP_Web_016")
    @Feature("Forgot Password")
    @Severity(NORMAL)
    @Description("Verify Cancel button is accessible or not ")
    @Story("As a user I should able to verify Cancel button is accessible or not ")
    public void testToVerifyForgotPassword() {
        page = new LoginPage(getDriver());
        page.verifyForgotPasswordCancelBtn();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 17, description = "GP_Web_027")
    @Feature("Login > Create your account")
    @Severity(NORMAL)
    @Description("Verify Create your account button is accessible or not")
    @Story("As a user I should able to verify Create your account button is accessible or not")
    public void testToVerifyCreateAccountButton() {
        page = new LoginPage(getDriver());
        page.verifyCreateAccountBtn();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 18, description = "GP_Web_029")
    @Feature("Plan selection ")
    @Severity(NORMAL)
    @Description("Verify by default step 1 tab selected or not and populated all plans")
    @Story("As a user I should able to verify by default step 1 tab selected or not and populated all plans")
    public void testToVerifyPlansDefaultTab() {
        page = new LoginPage(getDriver());
        page.verifyCreateAccountDefaultTab();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 19, description = "GP_Web_030")
    @Feature("Plan selection ")
    @Severity(NORMAL)
    @Description("Verify by default Monthly toggle selected or not and on plans prices appears monthly or not")
    @Story("As a user I should able to see Monthly toggle selected ")
    public void testToVerifyMonthlyTabAtDefault() {
        page = new LoginPage(getDriver());
        page.verifyMonthlyTabAtDefault();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 20, description = "GP_Web_031")
    @Feature("Plan selection ")
    @Severity(NORMAL)
    @Description("Verify if user selects Yearly tenure ")
    @Story("As a user I should able to Verify if user selects Yearly tenure ")
    public void testToVerifyMonthlyTabPrice() {
        page = new LoginPage(getDriver());
        page.verifyMonthlyTabAtDefaultPrice();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 21, description = "GP_Web_032")
    @Feature("Plan selection ")
    @Severity(NORMAL)
    @Description("Verify user is able to switch tabs without completed previous step")
    @Story("As a user I should able to verify user is able to switch tabs without completed previous step")
    public void testToVerifyYearlyTabPrice() {
        page = new LoginPage(getDriver());
        page.verifyYearlyTabPrice();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 22, description = "GP_Web_034")
    @Feature("Plan selection ")
    @Severity(NORMAL)
    @Description("Verify user is able to view 5 different plans")
    @Story("As a user I should able to verify user is able to view 5 different plans")
    public void testToVerifyFiveDifferentPlans() {
        page = new LoginPage(getDriver());
        page.verifyFiveDifferentPlans();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 23, description = "GP_Web_035")
    @Feature("Plan selection ")
    @Severity(NORMAL)
    @Description("Verify user can choose plan on click on Choose plan button or not")
    @Story("As a user I should able to click on Choose plan button or not")
    public void testToVerifyChoosePlanButton() {
        page = new LoginPage(getDriver());
        page.verifyChoosePlanButton();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 24, description = "GP_Web_036")
    @Feature("Plan selection ")
    @Severity(TRIVIAL)
    @Description("Verify user try to select multiple plans at a time")
    @Story("As a user I should able to Verify user try to select multiple plans at a time")
    public void testToVerifyMultiSelectPlans() {
        page = new LoginPage(getDriver());
        page.verifyUserNotSelectMultiplePlans();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 25, description = "GP_Web_038")
    @Feature("Plan selection ")
    @Severity(NORMAL)
    @Description("Verify when user choose any plan then redirects to Step 2 or not")
    @Story("As a user I should able to Verify when user choose any plan then redirects to Step 2 or not")
    public void testToVerifyStep2Redirection() {
        page = new LoginPage(getDriver());
        page.verifyStep2Redirection();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 26, description = "GP_Web_041")
    @Feature("Plan selection ")
    @Severity(NORMAL)
    @Description("Verify when user is in step 2 then Create account form appears or not")
    @Story("As a user I should able to verify when user is in step 2 then Create account form appears or not")
    public void testToVerifyCreateAccountFormOnStep2() {
        page = new LoginPage(getDriver());
        page.verifyThatCreateAccountFormIsDisplayed();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 27, description = "GP_Web_042")
    @Feature("Plan selection ")
    @Severity(TRIVIAL)
    @Description("Verify if user try to go to the step 3 without completing step 2")
    @Story("As a user I should able to verify by default step 1 tab selected or not and populated all plans")
    public void testToVerifyUserCompletedStep2() {
        page = new LoginPage(getDriver());
        page.verifyThatStep2IsCompleted();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 28, description = "GP_Web_043")
    @Feature("Create Account")
    @Severity(NORMAL)
    @Description("Verify if user enter character value to the Full name field ")
    @Story("As a user I should able to verify if user enter character value to the Full name field")
    public void testToVerifyFullNameField() {
        page = new LoginPage(getDriver());
        page.verifyThatFullNameFieldTakesCharacter();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 29, description = "GP_Web_044")
    @Feature("Full Name")
    @Severity(TRIVIAL)
    @Description("Verify if user enter invalid data Numeric, alphanumeric and Special character to the Full name")
    @Story("As a user I should able to verify if user enter invalid data Numeric, alphanumeric and Special character to the Full name field")
    public void testToVerifyFullNameFieldValidation() {
        page = new LoginPage(getDriver());
        page.verifyThatFullNameAllValidation();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 30, description = "GP_Web_045")
    @Feature("Full Name")
    @Severity(TRIVIAL)
    @Description("Verify if user enters only blank spaces to the Full name field ")
    @Story("As a user I should able to verify if user enters only blank spaces to the Full name field ")
    public void testToVerifyFullNameWithBlank() {
        page = new LoginPage(getDriver());
        page.verifyThatFullNameWithBlank();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 31, description = "GP_Web_046")
    @Feature("Full Name")
    @Severity(NORMAL)
    @Description("Verify Full name field is mandatory or not ")
    @Story("As a user I should able to verify Full name field is mandatory or not")
    public void testToVerifyFullNameMandatory() {
        page = new LoginPage(getDriver());
        page.verifyThatFullNameRequiredField();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 32, description = "GP_Web_047")
    @Feature("Preferred name ")
    @Severity(NORMAL)
    @Description("Verify if user enter character value to the Preferred name field  ")
    @Story("As a user I should able to verify Preferred name field")
    public void testToVerifyPreferredNameTF() {
        page = new LoginPage(getDriver());
        page.verifyThatPreferredNameTF();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 33, description = "GP_Web_048")
    @Feature("Preferred name ")
    @Severity(TRIVIAL)
    @Description("Verify if user enter invalid data Numeric, alphanumeric and Special character to the Preferred name")
    @Story("As a user I should able to verify if user enter invalid data Numeric, alphanumeric and Special character to the Preferred name ")
    public void testToVerifyPreferredNameWithInvalidData() {
        page = new LoginPage(getDriver());
        page.verifyThatPreferredNameWithInvalidData();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 34, description = "GP_Web_049")
    @Feature("Preferred name ")
    @Severity(TRIVIAL)
    @Description("Verify if user enters only blank spaces to the Preferred name field ")
    @Story("As a user I should able to verify if user enters only blank spaces to the Preferred name field  ")
    public void testToVerifyPreferredNameWithBlankData() {
        page = new LoginPage(getDriver());
        page.verifyThatPreferredNameWithBlank();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 35, description = "GP_Web_050")
    @Feature("Preferred name ")
    @Severity(NORMAL)
    @Description("Verify Preferred name field is mandatory or not ")
    @Story("As a user I should able to verify Preferred name field is mandatory or not")
    public void testToVerifyPreferredNameMandatoryField() {
        page = new LoginPage(getDriver());
        page.verifyThatPreferredNameRequiredField();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 36, description = "GP_Web_051")
    @Feature("Email ")
    @Severity(NORMAL)
    @Description("Verify if user enter valid email format ")
    @Story("As a user I should able to verify if user enter valid email format ")
    public void testToVerifyEmailTextField() {
        page = new LoginPage(getDriver());
        page.verifyThatValidEmailField();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 37, description = "GP_Web_052")
    @Feature("Email ")
    @Severity(TRIVIAL)
    @Description("Verify if user enter invalid email format")
    @Story("As a user I should able to verify if user enter invalid email format ")
    public void testToVerifyEmailTextFieldWithInvalidEmail() {
        page = new LoginPage(getDriver());
        page.verifyThatInValidDataInEmailField();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 38, description = "GP_Web_53")
    @Feature("Email ")
    @Severity(TRIVIAL)
    @Description("Verify if user enter already registered email ")
    @Story("As a user I should able to verify if user enter already registered email")
    public void testToVerifyAlreadyRegisteredEmail() {
        page = new LoginPage(getDriver());
        page.verifyThatAlreadyRegisteredEmail();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 39, description = "GP_Web_54")
    @Feature("Email ")
    @Severity(NORMAL)
    @Description("Verify email field is mandatory or not  ")
    @Story("As a user I should able to verify email field is mandatory or not ")
    public void testToVerifyEmailMandatoryFiled() {
        page = new LoginPage(getDriver());
        page.verifyThatEmailIsMandatoryFiled();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 40, description = "GP_Web_055")
    @Feature("Mobile number ")
    @Severity(NORMAL)
    @Description("Verify if user enter valid phone number of 10 digits according to the selection of country flag")
    @Story("As a user I should able to verify email field is mandatory or not ")
    public void testToVerifyValidPhoneNumber() {
        page = new LoginPage(getDriver());
        page.verifyThatValidPhoneNumber();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 41, description = "GP_Web_056")
    @Feature("Mobile number ")
    @Severity(TRIVIAL)
    @Description("Verify if user enter invalid phone no. less than 10 digits OR more than or according to the selection of the country flag ")
    @Story("As a user I should able to verify if user enter invalid phone no. less than 10 digits OR more than or according to the selection of the country flag ")
    public void testToVerifyInValidPhoneNumber() {
        page = new LoginPage(getDriver());
        page.verifyThatInValidPhoneNumber();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 42, description = "GP_Web_057")
    @Feature("Mobile number ")
    @Severity(NORMAL)
    @Description("Verify user is able to change country flag by clicking on flag dropdown or not ")
    @Story("As a user I should able to verify user is able to change country flag by clicking on flag dropdown or not ")
    public void testToVerifyCountryFlagChangeable() {
        page = new LoginPage(getDriver());
        page.verifyThatCountryFlagChangeableOrNot();

    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 43, description = "GP_Web_058")
    @Feature("Mobile number ")
    @Severity(NORMAL)
    @Description("Verify phone number field accepts only numeric value or not ")
    @Story("As a user I should able to verify phone number field accepts only numeric value or not ")
    public void testToVerifyMobileNumberTFAcceptsNumericData() {
        page = new LoginPage(getDriver());
        page.verifyThatMobileNumberTFAcceptsNumericData();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 44, description = "GP_Web_059")
    @Feature("Mobile number ")
    @Severity(TRIVIAL)
    @Description("Verify when user try to enter alphanumeric and characters to the Phone no. ")
    @Story("As a user I should able to verify when user try to enter alphanumeric and characters to the Phone no.")
    public void testToVerifyMobileNumberWithInvalidData() {
        page = new LoginPage(getDriver());
        page.verifyThatMobileNumberTFWithInvalidData();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 45, description = "GP_Web_060")
    @Feature("Mobile number ")
    @Severity(NORMAL)
    @Description("Verify Phone number field is mandatory or not ")
    @Story("As a user I should able to verify Phone number field is mandatory or not")
    public void testToVerifyMobileNumberMandatoryField() {
        page = new LoginPage(getDriver());
        page.verifyThatMobileNumberTFIsMandatoryField();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 46, description = "GP_Web_61")
    @Feature("Mobile number ")
    @Severity(TRIVIAL)
    @Description("Verify phone number field accepts blank spaces or not ")
    @Story("As a user I should able to verify phone number field accepts blank spaces or not")
    public void testToVerifyMobileNumberWithBlank() {
        page = new LoginPage(getDriver());
        page.verifyThatMobileNumberTFWithBlank();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 47, description = "GP_Web_062")
    @Feature("Country flag")
    @Severity(NORMAL)
    @Description("Verify by default USA Country flag and Country pre selected or not ")
    @Story("As a user I should able to verify by default USA Country flag and Country pre selected or not")
    public void testToVerifyCountryFlagDefault() {
        page = new LoginPage(getDriver());
        page.verifyThatCountryFlagDefault();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 48, description = "GP_Web_63")
    @Feature("Country")
    @Severity(NORMAL)
    @Description("Verify Country is updated accordingly or not as per the selection of country flag")
    @Story("As a user I should able to verify Country is updated accordingly or not as per the selection of country flag")
    public void testToVerifySelectedCountryFlag() {
        page = new LoginPage(getDriver());
        page.verifySelectedCountryFlag();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 49, description = "GP_Web_064")
    @Feature("Country")
    @Severity(NORMAL)
    @Description("Verify Country field is mandatory or not ")
    @Story("As a user I should able to verify Country field is mandatory or not")
    public void testToVerifyCountryMandatoryField() {
        page = new LoginPage(getDriver());
        page.verifyThatCountryMandatoryField();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 50, description = "GP_Web_065")
    @Feature("Country")
    @Severity(NORMAL)
    @Description("Verify user can change country by choosing option from the country dropdown or not ")
    @Story("As a user I should able to verify user can change country by choosing option from the country dropdown or not")
    public void testToVerifyChoosingCountry() {
        page = new LoginPage(getDriver());
        page.verifyThatChoosingCountryFromDD();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 51, description = "GP_Web_066")
    @Feature("Country")
    @Severity(TRIVIAL)
    @Description("Verify if user try to select multiple options from the country drop down ")
    @Story("As a user I should able to verify if user try to select multiple options from the country drop down")
    public void testToVerifyMultipleChoosingCountry() {
        page = new LoginPage(getDriver());
        page.verifyThatMultipleChoosingCountry();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 52, description = "GP_Web_067")
    @Feature("Country")
    @Severity(NORMAL)
    @Description("Verify selected option is appears inside the country field or not ")
    @Story("As a user I should able to verify selected option is appears inside the country field or not ")
    public void testToVerifyCountryAllSelectedOption() {
        page = new LoginPage(getDriver());
        page.verifyThatCountryAllSelectedOption();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 53, description = "GP_Web_068")
    @Feature("Country")
    @Severity(NORMAL)
    @Description("Verify Country field is mandatory or not ")
    @Story("As a user I should able to verify Country field is mandatory or not")
    public void testToVerifyCountryFieldIsMandatory() {
        page = new LoginPage(getDriver());
        page.verifyThatCountryFieldIsMandatory();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 54, description = "GP_Web_069")
    @Feature("Postal code ")
    @Severity(NORMAL)
    @Description("Verify Postal code is fetches as per the selection of Country or not ")
    @Story("As a user I should able to verify Postal code is fetches as per the selection of Country or not")
    public void testToVerifyVerifyPostalCode() {
        page = new LoginPage(getDriver());
        page.verifyThatVerifyPostalCode();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 55, description = "GP_Web_070")
    @Feature("Postal code ")
    @Severity(TRIVIAL)
    @Description("Verify if user try to enter invalid data to the postal code ")
    @Story("As a user I should able to verify if user try to enter invalid data to the postal code")
    public void testToVerifyPostalCodeWithInvalidData() {
        page = new LoginPage(getDriver());
        page.verifyThatPostalCodeWithInvalidData();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 56, description = "GP_Web_071")
    @Feature("Postal code ")
    @Severity(NORMAL)
    @Description("Verify Postal code field is mandatory or not ")
    @Story("As a user I should able to verify Postal code field is mandatory or not")
    public void testToVerifyPostalCodeMandatory() {
        page = new LoginPage(getDriver());
        page.verifyThatPostalMandatory();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 57, description = "GP_Web_073")
    @Feature("Postal code ")
    @Severity(NORMAL)
    @Description("Verify postal code field only accepts numeric value or not ")
    @Story("As a user I should able to verify postal code field only accepts numeric value or not ")
    public void testToVerifyPostalCodeTakeNumeric() {
        page = new LoginPage(getDriver());
        page.verifyThatPostalTakesTakeNumeric();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 58, description = "GP_Web_074", dataProvider = "passwords")
    @Feature("Password")
    @Severity(NORMAL)
    @Description("Verify when user enter valid data to the password field \"Min 6 chars, include 1 cap letter, 1 lowercase, 1special character, 1 numeric value")
    @Story("As a user I should able to verify password with validation ")
    public void testToVerifyPasswordValidation(String password) {
        page = new LoginPage(getDriver());
        page.verifyThatPasswordValidation(password);
    }
    @DataProvider(name = "passwords")
    public Object[][] passwordData() {
        return new Object[][]{
                {"!@#$%^&*()-_=+{};:,<.>`~?/\\|[]A1a"},
                {"SecuR3!"},
                {"Ex@mpl5"}
        };
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 59, description = "GP_Web_075")
    @Feature("Password")
    @Severity(TRIVIAL)
    @Description("Verify when user enter invalid data which is not full fill password validation")
    @Story("As a user I should able to verify when user enter invalid data which is not full fill password validation")
    public void testToVerifyPasswordWithInvalidData() {
        page = new LoginPage(getDriver());
        page.verifyThatPasswordWithInvalidData();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 60, description = "GP_Web_076")
    @Feature("Password")
    @Severity(TRIVIAL)
    @Description("Verify password field accepts blank spaces or not ")
    @Story("As a user I should able to verify password field accepts blank spaces or not")
    public void testToVerifyPasswordWithBlankSpaces() {
        page = new LoginPage(getDriver());
        page.verifyThatPasswordWithBlankSpaces();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 61, description = "GP_Web_077")
    @Feature("Password")
    @Severity(NORMAL)
    @Description("Verify Password field is mandatory or not ")
    @Story("As a user I should able to verify Password field is mandatory or not")
    public void testToVerifyPasswordMandatory() {
        page = new LoginPage(getDriver());
        page.verifyThatPasswordMandatoryField();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 62, description = "GP_Web_078")
    @Feature("Password")
    @Severity(NORMAL)
    @Description("Verify Password eye icon is accessible or not and by default password is masked or not")
    @Story("As a user I should able to verify Password eye icon is accessible or not and by default password is masked or not")
    public void testToVerifyPasswordEyeIcon() {
        page = new LoginPage(getDriver());
        page.verifyThatPasswordFieldEyeIcon();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 63, description = "GP_Web_079")
    @Feature("Password")
    @Severity(NORMAL)
    @Description("Verify when user click on show password eye icon")
    @Story("As a user I should able to verify when user click on show password eye icon")
    public void testToVerifyPasswordEyeIconClicked() {
        page = new LoginPage(getDriver());
        page.verifyThatWhenEyeIconClickedOnPasswordField();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 64, description = "GP_Web_80")
    @Feature("Gosadi marketing checkbox")
    @Severity(NORMAL)
    @Description("Verify by default gosadi marketing checkbox is checked or not ")
    @Story("As a user I should able to verify by default gosadi marketing checkbox is checked or not")
    public void testToVerifyGosadiMarketingCheckbox() {
        page = new LoginPage(getDriver());
        page.verifyThatGosadiMarketingCheckboxUnchecked();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 65, description = "GP_Web_081")
    @Feature("Gosadi marketing checkbox")
    @Severity(NORMAL)
    @Description("Verify user is able to checked gosadi checkbox or not ")
    @Story("As a user I should able to verify user is able to checked gosadi checkbox or not ")
    public void testToVerifyGosadiMarketingIsCheckbox() {
        page = new LoginPage(getDriver());
        page.verifyThatGosadiMarketingCheckboxIsChecked();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 66, description = "GP_Web_084")
    @Feature("Terms of use and Privacy policy ")
    @Severity(NORMAL)
    @Description("Verify terms of use and privacy policy links are accessible or not")
    @Story("As a user I should able to verify terms of use and privacy policy links are accessible or not")
    public void testToVerifyPrivacyPolicyLinksAreAccessible() {
        page = new LoginPage(getDriver());
        page.verifyThatPrivacyPolicyLinksAreAccessible();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 67, description = "GP_Web_085")
    @Feature("Sign up button ")
    @Severity(NORMAL)
    @Description("Verify when all details are filled correctly than Sign up button is enabled or not ")
    @Story("As a user I should able to verify when all details are filled correctly than Sign up button is enabled or not")
    public void testToVerifySignUpButtonIsEnable() {
        page = new LoginPage(getDriver());
        page.verifyThatGivingAllDetailsSignUpButtonIsEnable();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 68, description = "GP_Web_086")
    @Feature("Sign up button ")
    @Severity(NORMAL)
    @Description("Verify when user click on Sign up button ")
    @Story("As a user I should able to verify when user click on Sign up button")
    public void testToVerifyGivingAllDetailsSignUpButton() {
        page = new LoginPage(getDriver());
        page.verifyThatGivingAllDetailsSignUpButtonIsEnable();
    }

    @JiraPolicy(logTicketReady = false)
    @Test(priority = 69, description = "GP_Web_087")
    @Feature("Login link ")
    @Severity(NORMAL)
    @Description("Verify when user click on login link")
    @Story("As a user I should able to verify when user click on login link")
    public void testToVerifyLoginLink() {
        page = new LoginPage(getDriver());
        page.verifyThatLoginLink();
    }
}