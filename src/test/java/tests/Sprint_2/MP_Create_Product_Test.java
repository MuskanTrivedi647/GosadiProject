package tests.Sprint_2;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.Manage_Products;
import tests.SuiteSetup;
import utilities.JiraPolicy;

import static io.qameta.allure.SeverityLevel.CRITICAL;

@Epic("Manage Products")
public class MP_Create_Product_Test extends SuiteSetup {


    public LoginPage page;
    public Manage_Products manage_products;


   /* @JiraPolicy(logTicketReady = false)
    @Test(priority = 1, description = "GP_S2_Web_001")
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user navigate to Create New Product Page.")
    @Story("As a user I should able to verify user navigate to Create New Product Page")
    public void testToVerifyNavigateToCreateNewProductPage() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLogin();
        manage_products.gotoCreateProduct().
                verifyTitleOfManageProductsPage();

    }

    @Test(priority = 2, description = "GP_S2_Web_002")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to see all section and option on Create New Product page")
    @Story("As a user I should able to see all section and option on Create New Product page")
    public void testToVerifyCreateNewProductAllOptions() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().
                verifyCreateNewProductAllOptions();

    }


    @Test(priority = 3, description = "GP_S2_Web_003")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select option on the create new product page")
    @Story("As a user I should able to verify user is able to select option on the create new product page")
    public void testToVerifySelectAnyOptionOnCreateNewProduct() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLogin();
        manage_products.gotoCreateProduct().
                clickOnKnitting().clickOnLoom_Knitting().clickOnMachine_Knitting().
                verifyBuildPatternTitle();

    }

    @Test(priority = 4, description = "GP_S2_Web_004")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to see all section and option on Create New Product page")
    @Story("As a user I should able to verify user able to see all section and option on Create New Product page")
    public void testToVerifyCreateNew() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLogin();
        manage_products.gotoCreateProduct().
                verifyCreateNewProductAllOptions();

    }

    @Test(priority = 5, description = "GP_S2_Web_005")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to enter data in section after select craft type on the create new product page.")
    @Story("As a user I should able to verify user able to enter data in section after select craft type on the create new product page")
    public void testToVerifyCreateNewProduct() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLogin();
        manage_products.gotoCreateProduct().
                verifyKnittingTextOptions();

    }

    @Test(priority = 6, description = "GP_S2_Web_006")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user receive an error without filling mandatory data in Pattern section and click on Save & Continue button ")
    @Story("As a user I should able to verify user receive an error without filling mandatory data in Pattern section and click on Save & Continue button")
    public void testToVerifyMandatoryPatternName() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().
                verifyPatternNameMandatory();

    }

    @Test(priority = 7, description = "GP_S2_Web_007")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to enter all data in Product detail section")
    @Story("As a user I should able to enter all data in Product detail section")
    public void testToVerifyEnterAllDataInProductDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnLoom_Knitting().
                enteringAllDataInPatternDetails();

    }

    @Test(priority = 8, description = "GP_S2_Web_008")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to enter Pattern Name. (Mandatory Field)")
    @Story("As a user I should able to enter Pattern Name. (Mandatory Field)")
    public void testToVerifyPatternNameMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyPatternNameMandatory();
    }

    @Test(priority = 9, description = "GP_S2_Web_009")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to Select Pattern Level by Dropdown options.(Mandatory Field)")
    @Story("As a user I should able to Select Pattern Level by Dropdown options.(Mandatory Field)")
    public void testToVerifyPatternLevelMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyPatternLevelMandatory();
    }

    @Test(priority = 10, description = "GP_S2_Web_010")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to Select by Dropdown Published Month options. (Mandatory Field)")
    @Story("As a user I should able to Select by Dropdown Published Month options. (Mandatory Field)")
    public void testToVerifyPublishedMonthMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyPublishedMonthMandatory();
    }


    @Test(priority = 11, description = "GP_S2_Web_011")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to Select by Dropdown Published Year options. (Mandatory Field)")
    @Story("As a user I should able to Select by Dropdown Published Year options. (Mandatory Field)")
    public void testToVerifySelectPublishedMonth() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifySelectPublishedYear();
    }

    //Enhancement
    @Test(priority = 12, description = "GP_S2_Web_012", enabled = false)
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to Select by Dropdown option of \"Where was it published?\". (Mandatory Field)")
    @Story("As a user I should able to Select by Dropdown option of \"Where was it published?\". (Mandatory Field)")
    public void testToVerifyDropdownWhereWasItPublished() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifySelectPublishedMonth();
    }

    @Test(priority = 13, description = "GP_S2_Web_013")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to Select by Dropdown option of Where was it published?")
    @Story("As a user I should able to Select option Self Published on Selling Channels")
    public void testToVerifySelectPublished() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyMoreInfoURLbox();
    }

    @Test(priority = 14, description = "GP_S2_Web_014")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to Enter More Info URL Text box.(Optional Field).")
    @Story("As a user I should able to Enter More Info URL Text box.(Optional Field)")
    public void testToVerifyEnterMoreInfoURLOptional() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyMoreInfoURLboxOptional();
    }


    @Test(priority = 15, description = "GP_S2_Web_015")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to Select by Dropdown option of Where was it published? (Mandatory Field) Select option IN PRINT or ON a Blog or Website")
    @Story("As a user I should able to Select by Dropdown option of Where was it published? (Mandatory Field) Select option IN PRINT or ON a Blog or Website")
    public void testToVerifySelectINPRINT_CB() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyINPRINT_CB();
    }


    @Test(priority = 16, description = "GP_S2_Web_016")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to Enter Publication Name input search and suggestion filed.(Mandatory Field)||Select option IN PRINT or ON a Blog or Website")
    @Story("As a user I should able to Enter Publication Name input search and suggestion filed.(Mandatory Field)||Select option IN PRINT or ON a Blog or Website")
    public void testToVerifySelectINPRINT_PublicationNameMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                publicationNameMandatory();
    }

    @Test(priority = 19, description = "GP_S2_Web_019")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user clicks on Save & Continue button")
    @Story("As a user I should able to user clicks on Save & Continue button")
    public void testToVerifyFillAllDetailsAndSave() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton();
    }

    @Test(priority = 20, description = "GP_S2_Web_020")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is navigated on categories section of the create product page after Save & continue button of Patter Detail section")
    @Story("As a user I should able to user is navigated on categories section of the create product page after Save & continue button of Patter Detail section")
    public void testToVerifyNavigateToCategoriesSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection();
    }

    @Test(priority = 21, description = "GP_S2_Web_021")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see and select the sub Category after selecting Main Category section Shows cross icon on the Category section.")
    @Story("As a user I should able to selecting Main Category section Shows cross icon on the Category section")
    public void testToVerifyCrossIconOnCategoriesSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyCategoriesSectionCrossIcon();
    }

    @Test(priority = 22, description = "GP_S2_Web_022")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify when user adds the category using Add category button")
    @Story("As a user I should able to Add Category using Add category button")
    public void testToVerifyListOFOptionsInCategoryDropdown() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnCrochet().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyListOfCategoryOptions();
    }

    @Test(priority = 23, description = "GP_S2_Web_023")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify when user adds the category using Add category button")
    @Story("As a user I should able to Add Category using Add category button")
    public void testToVerifyCategoryAndSubCategory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnCrochet().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected();
    }

    @Test(priority = 24, description = "GP_S2_Web_024")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify when user add the category using search input field")
    @Story("As a user should able to Add Category using search input field")
    public void testToVerifySearchInputFieldOnCategorySection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnCrochet().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifySearchInputCategoryField();
    }


    @Test(priority = 26, description = "GP_S2_Web_026")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify when user add the category using search input field > when user selects category option from search results")
    @Story("As a user should able to Add Category using search input field")
    public void testToVerifySubCategoryOption() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnCrochet().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifySubCategoryOfCategory();
    }


    @Test(priority = 27, description = "GP_S2_Web_027")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify when user add the category using search input field > when user selects sub category option from search results")
    @Story("As a user should able to select sub Category using search input field")
    public void testToVerifySelectSubCategoryOption() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnCrochet().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected();
    }


    @Test(priority = 28, description = "GP_S2_Web_028")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify when user add the category using search input field > when user selects sub category option from search results")
    @Story("As a user should able to select sub Category using search input field")
    public void testToVerifyListOfCategoryOption() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnCrochet().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyListOfCategoryOptions();
    }

    @Test(priority = 29, description = "GP_S2_Web_029")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("when user add the category using dropdown button > add a category/ subcategoryy")
    @Story("As a user should able to add Category using dropdown")
    public void testToVerifyFollowedByCategoryName() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnCrochet().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected();
    }

    @Test(priority = 38, description = "GP_S2_Web_038")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that if user select the CROCHET/ TUNISIAN CROCHET Craft then in Pattern Nitty Gritty section there is a Primary Hook Size section with Add Hook option shows for add multiple Hook size.")
    @Story("As a user I should able to select the CROCHET/ TUNISIAN CROCHET Craft then in Pattern Nitty Gritty section there is a Primary Hook Size section with Add Hook option shows for add multiple Hook size")
    public void testToVerifyNittyGrittyHookSizeSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnCrochet().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().
                verifyNittyGritty_PrimeryHookSizeDropDownOptions().verifyAddHookButton();
    }

    @Test(priority = 39, description = "GP_S2_Web_039")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that if user select the CROCHET/ TUNISIAN CROCHET Craft then in Pattern Nitty Gritty section there is a Primary Hook Size section with Add Hook option shows for add multiple Hook size.")
    @Story("As a user I should able to select the CROCHET/ TUNISIAN CROCHET Craft then in Pattern Nitty Gritty section there is a Primary Hook Size section with Add Hook option shows for add multiple Hook size")
    public void testToVerifyNittyGrittyAddMultipleHookSizeSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnCrochet().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().
                verifyNittyGritty_PrimeryHookSizeDropDownOptions().verifyAddMultipleHooksAndRemoved();
    }


    @Test(priority = 44, description = "GP_S2_Web_044")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Add new yarn link is accessible or not ")
    @Story("As a user I should able Add new yarn link is accessible or not")
    public void testToVerifyAddNewYarnLink() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp();
    }


    @Test(priority = 47, description = "GP_S2_Web_047")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify The parent window must be disabled during the pop up window on focus")
    @Story("As a user I should able to verify parent window must be disabled during the pop up window on focus")
    public void testToVerifyParentWindowdIsDisabled() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyParentWindowDisable();
    }

    //Need discussion
    @Test(priority = 48, description = "GP_S2_Web_048", enabled = false)
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify With the close of the parent window the pop up window should be closed.")
    @Story("As a user I should able to verify parent window must be disabled during the pop up window on focus")
    public void testToVerifyParentWindowdIsClosed() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyParentWindowDisable();
    }


    @Test(priority = 49, description = "GP_S2_Web_049")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify cross icon is accessible or not")
    @Story("As a user I should able to verify cross icon is accessible or not")
    public void testToVerifyCrossIconIsAccessible() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyCloseButtonOnNewYarnPopup();
    }


    @Test(priority = 50, description = "GP_S2_Web_050")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify image upload icon is accessible or not")
    @Story("As a user I should able to verify image upload icon is accessible or not")
    public void testToVerifyImageUploadIconIsAccessible() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyImageUploadIconIsAccessible();
    }


    @Test(priority = 52, description = "GP_S2_Web_052")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Firstly, check Image upload path")
    @Story("As a user I should able to verify Firstly, check Image upload path")
    public void testToVerifyNoImageIsUploaded() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyImageUploadIconIsAccessible1();
    }


    @Test(priority = 53, description = "GP_S2_Web_053")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify the Image Upload feature with image files of different extensions like PNG, BMP, JPEG etc.")
    @Story("As a user I should able to verify the Image Upload feature with image files of different extensions like PNG, BMP, JPEG etc")
    public void testToVerifyUploadedDifferentImageFormat() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyUploadedDifferentImageFormat();
    }


    @Test(priority = 54, description = "GP_S2_Web_054")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify test with the image whose names contain space or some special characters.")
    @Story("As a user I should able to verify test with the image whose names contain space or some special characters")
    public void testToVerifyUplosdingImageNamewithSpecialCharAndSpaces() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyUploadImageNameWithSpecialCharAndSpaces();
    }


    @Test(priority = 55, description = "GP_S2_Web_055")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Check image upload with image size greater than the maximum allowed size(3mb).Proper message should be displayed.")
    @Story("As a user I should able to verify Check image upload with image size greater than the maximum allowed size(3mb).Proper message should be displayed.")
    public void testToVerifyUploadImageMaxSizeWith3Mb() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyUploadImageMaxSizeWith3Mb();
    }


    @Test(priority = 56, description = "GP_S2_Web_056")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify check image upload feature with file types other than images like txt, doc, exe, pdf etc.")
    @Story("As a user I should able to verify  check image upload feature with file types other than images like txt, doc, exe, pdf etc.")
    public void testToVerifyUploadedDifferentFormats() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyOtherFileFormates();
    }

    @Test(priority = 59, description = "GP_S2_Web_059")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify check multiple images upload functionality")
    @Story("As a user I should able to verify check multiple images upload functionality")
    public void testToVerifyUploadedMultipleImages() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyMultipleImageUpload();
    }

    @Test(priority = 74, description = "GP_S2_Web_074")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Yarn weight dropdown field is accessible or not  ")
    @Story("Yarn weight dropdown field should be  accessible ")
    public void testToVerifyYarnWeightField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightVisible();

    }

    @Test(priority = 75, description = "GP_S2_Web_075")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify When user hit the Yarn weight field dropdown then all options populated or not ")
    @Story("As a user hit the Yarn weight field dropdown then all options populated or not ")
    public void testToVerifyYarnWeightOptions() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightVisible().verifyYarnWeightOptionPopulated();

    }*/

  /*  @Test(priority = 76, description = "GP_S2_Web_076")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user try to select multiple option from the yarn weight dropdown ")
    @Story("As a user should not select multiple option from the yarn weight dropdown ")
    public void testToVerifyOnlySelectOneOption() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightVisible().verifyYarnWeightOptionPopulated().verifyYarnWeightSelectOnlyOneOption();

    }*/

   /* @Test(priority = 77, description = "GP_S2_Web_077")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Yarn weight field is mandatory or not ")
    @Story("Verify Yarn weight field is mandatory or not ")
    public void testToVerifyYarnWeightIsRequired() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightFieldRequired();

    }

    @Test(priority = 78, description = "GP_S2_Web_078")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify after adding value the yarn weight field then astrik sign replace with the green check mark or not ")
    @Story("User after adding value the yarn weight field then astrik sign replace with the green check mark or not ")
    public void testToVerifyGreenCheckOnYarnField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightVisible().verifyYarnWeightOptionPopulated().verifyGreenTickOfYarnWeightField();

    }

    @Test(priority = 79, description = "GP_S2_Web_079")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify once user select any option from the yarn weight dropdown then Wraps per Inch field must be prefilled with the data accordingly or not")
    @Story("As a user select any option from the yarn weight dropdown then Wraps per Inch field must be prefilled with the data accordingly or not")
    public void testToVerifyAutoFilledWrapPerInch() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightVisible().verifyYarnWeightOptionPopulated().verifyWrapsPerInchAutoFilled();

    }

    @Test(priority = 80, description = "GP_S2_Web_080")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user change WPI field value then Yarn weight value updated accordingly or not  ")
    @Story("user should change WPI field value then Yarn weight value updated accordingly or not")
    public void testToVerifyUpdateYarnWeightField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightVisible().verifyYarnWeightOptionPopulated().verifyYarnWeightUpdate();
    }

    @Test(priority = 81, description = "GP_S2_Web_081")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify WPI field  is accessible or not")
    @Story("Verify  WPI field  is accessible or not ")
    public void testToVerifyWpiFieldIsAccessible() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightVisible().verifyYarnWeightOptionPopulated();
    }

    @Test(priority = 82, description = "GP_S2_Web_082")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select only one from from the WPI List at a time or not")
    @Story("User is able to select only one from from the WPI List at a time or not")
    public void testToVerifySelectOneOption() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightVisible().verifySelectOneOptionInOneTime();
    }


    @Test(priority = 83, description = "GP_S2_Web_083")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user try to select multiple option from the WPI dropdown")
    @Story("User try to select multiple option from the WPI dropdown  ")
    public void testToVerifyMultipleOptionSelectOrNot() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyIsYarnWeightVisible().verifySelectOneOptionInOneTime();
    }


    @Test(priority = 84, description = "GP_S2_Web_084")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify WPI field is mandatory or not ")
    @Story("User WPI field is mandatory or not ")
    public void testToVerifyWpi() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyWpiIsRequired();
    }

    @Test(priority = 85, description = "GP_S2_Web_085")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify WPI unit field is accessible or not ")
    @Story("User able to access WPI unit field or not")
    public void testToVerifyWpiUnitField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyWpiUnitRequired();
    }

    @Test(priority = 86, description = "GP_S2_Web_086")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select only one from from the WPI unit  List at a time or not")
    @Story("User is able to select only one from from the WPI unit  List at a time or not")
    public void testToVerifyWpiUnitSelectOnlyNotValue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyWpiUnitSelectOnlyOneOption();
    }

    @Test(priority = 88, description = "GP_S2_Web_88")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add data to the Length field or not")
    @Story("As a user I should able to add data to the Length field or not")
    public void testToVerifyAddDataToTheLength() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyToAddDataInLengthField();
    }


    @Test(priority = 89, description = "GP_S2_Web_89")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Length field accepts only numeric value or not")
    @Story("As a user I should able to verify Length field accepts only numeric value or not")
    public void testToVerifyLengthAcceptsOnlyNumeric() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyLengthFieldAcceptsOnlyNumeric();
    }


    @Test(priority = 90, description = "GP_S2_Web_90")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Length field accepts only numeric value or not")
    @Story("As a user I should able to verify Length field accepts only numeric value or not")
    public void testToVerifyFieldAcceptsAlphaNumericAndSpecialChar() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyLengthFieldAcceptsAplhaNumericAndSpecialChar();
    }

    @Test(priority = 91, description = "GP_S2_Web_91")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Length field is mandatory or not")
    @Story("As a user I should able to verify Length field is mandatory or not")
    public void testToVerifyLengthMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyLengthFieldMandatory();
    }


    @Test(priority = 92, description = "GP_S2_Web_92")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user enter blank spaces to Length field ")
    @Story("As a user I should able to verify if user enter blank spaces to Length field ")
    public void testToVerifyBlankSpacesLengthField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyEnterBlankSpacesLengthField();
    }


    @Test(priority = 93, description = "GP_S2_Web_93")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Unit field is accessible or not ")
    @Story("As a user I should able to verify unit field is accessible or not")
    public void testToVerifyUnitFieldIsAccessible() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyUnitFieldIsAccessible();
    }

    @Test(priority = 94, description = "GP_S2_Web_94")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select the one option from the populated list or not ")
    @Story("As a user I should able to able to select the one option from the populated list or not ")
    public void testToVerifySelectUnitField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifySelectUnitFieldFromDD();
    }


    @Test(priority = 95, description = "GP_S2_Web_95")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user try to select both the options from the Unit list ")
    @Story("As a user I should able to able to select both the options from the Unit list")
    public void testToVerifySelectBothOptionsUnitField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyToSelectBothOptions();
    }

    @Test(priority = 96, description = "GP_S2_Web_96")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify selected option visible inside the field ")
    @Story("As a user I should able to able to selected option visible inside the field")
    public void testToVerifySelectBothOptionsVisible() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyToSeeAllOptions();
    }


    @Test(priority = 97, description = "GP_S2_Web_97")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Unit field is mandatory or not")
    @Story("As a user I should able to able to selected option visible inside the field")
    public void testToVerifyIsUnitMandatoryField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyUnitFieldMandatory();
    }


    @Test(priority = 98, description = "GP_S2_Web_98")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add value to the Texture field or not ")
    @Story("As a user I should able to add value to the Texture field or not")
    public void testToVerifyAddValueToTheTextureField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyAddValueToTheTextureField();
    }


    //Need to work on this
    @Test(priority = 99, description = "GP_S2_Web_99")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Texture field is non mandatory or not ")
    @Story("As a user I should able to verify Texture field is non mandatory or not ")
    public void testToVerifyTextureFieldIsNonMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyTextureFieldIsNonMandatory();
    }


    @Test(priority = 100, description = "GP_S2_Web_100")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to enter value to the Weight field or not ")
    @Story("As a user I should able to enter value to the Weight field or not")
    public void testToVerifyEnterDataInWeightField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyEnterDataInWeightField();
    }

    //Need to work on this
    @Test(priority = 101, description = "GP_S2_Web_101")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Weight (grams) field is mandatory or not ")
    @Story("As a user I should able to verify Weight (grams) field is mandatory or not")
    public void testToVerifyWeightFieldMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyWeightFieldIsNonMandatory();
    }


    @Test(priority = 102, description = "GP_S2_Web_102")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Weight (grams) field accepts numeric value only or not")
    @Story("As a user I should able to verify Weight (grams) field is mandatory or not")
    public void testToVerifyWeightFieldAcceptsNumericValue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyWeightFieldAcceptsNumericValue();
    }


    @Test(priority = 103, description = "GP_S2_Web_103")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user try to enter alphabets, alphanumeric, special character to Weight (grams) field ")
    @Story("As a user I should able to verify if user try to enter alphabets, alphanumeric, special character to Weight (grams) field")
    public void testToVerifyWeightFieldWithAlphabetsSpecialCharacter() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyWeightFieldAcceptsAlphaNumericValue();
    }


    @Test(priority = 104, description = "GP_S2_Web_104")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Fiber content field is accessible or not ")
    @Story("As a user I should able to verify Fiber content field is accessible or not")
    public void testToVerifyFiberContentField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyFiberContentField();
    }


    @Test(priority = 105, description = "GP_S2_Web_105")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select the option from the Fiber content dropdown or not ")
    @Story("As a user I should able to verify user is able to select the option from the Fiber content dropdown or not ")
    public void testToVerifySelectOptionFromFiberContentDropdown() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifySelectOptionFromFiberDropdown();
    }


    @Test(priority = 106, description = "GP_S2_Web_106")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify selected option visible inside the field ")
    @Story("As a user I should able to verify selected option visible inside the field")
    public void testToVerifySelectedOptionVisibleFiberContentDropdown() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifySelectedOptionVisibleFiber();
    }


    @Test(priority = 107, description = "GP_S2_Web_107")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user try to select multiple options from the dropdown at the same time  ")
    @Story("As a user I should able to verify if user try to select multiple options from the dropdown at the same time")
    public void testToVerifySelectedMultipleOptionFiberContentDropdown() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifySelectedMultipleFiber();
    }


    @Test(priority = 108, description = "GP_S2_Web_108")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add % to the Fiber % field or not ")
    @Story("As a user I should able to verify user is able to add % to the Fiber % field or not ")
    public void testToVerifyAddPercentToFiberPercent() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyAddPercentToFiberPercent();
    }


    @Test(priority = 109, description = "GP_S2_Web_109")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Fiber content field accepts only numeric value or not ")
    @Story("As a user I should able to verify fiber content field accepts only numeric value or not  ")
    public void testToVerifyFiberAcceptsNumeric() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyFiberFieldAcceptsNumericValue();
    }

    @Test(priority = 110, description = "GP_S2_Web_110")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user try to enter alphabets , alphanumeric and special character to the Fiber Content % field ")
    @Story("As a user I should able to verify if user try to enter alphabets , alphanumeric and special character to the Fiber Content % field ")
    public void testToVerifyFiberAcceptsNumericNotOtherSequence() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyFiberFieldAcceptsNumericValue();
    }


    @Test(priority = 111, description = "GP_S2_Web_111")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user enter 0 to the Fiber Content %  ")
    @Story("As a user I should able to verify if user enter 0 to the Fiber Content % ")
    public void testToVerifyFiberValueZero() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyFiberValueWithZero();
    }


    @Test(priority = 112, description = "GP_S2_Web_112")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Fiber Content % field accepts only 1 to 100 digits")
    @Story("As a user I should able to verify Fiber Content % field accepts only 1 to 100 digits ")
    public void testToVerifyFiberValueAcceptsOneToHundred() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyFiberValueAcceptsOneToHundred();
    }

    @Test(priority = 113, description = "GP_S2_Web_113")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user enter more than100 i.e;  101, 102...... to the Fiber Content % field ")
    @Story("As a user I should able to verify if user enter more than 100 i.e; 101, 102...... to the Fiber Content % field ")
    public void testToVerifyFiberValueMoreThanHundred() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyFiberValueMoreThanHundred();
    }


    @Test(priority = 115, description = "GP_S2_Web_115")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Add a Fiber link is accessible or not ")
    @Story("As a user I should able to verify add a Fiber link is accessible or not")
    public void testToVerifyFiberLinkIsAccessible() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyFiberLinkIsAccessible();
    }


    @Test(priority = 116, description = "GP_S2_Web_116")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user hit Add a fiber link ")
    @Story("As a user I should able to verify if user hit Add a fiber link")
    public void testToVerifyHitAddFiberLink() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyFiberLinkIsClickable();
    }


    @Test(priority = 117, description = "GP_S2_Web_117")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add multiple fiber Content or not ")
    @Story("As a user I should able to add multiple fiber Content or not")
    public void testToVerifyAddMultipleFiberContent() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyAddMultipleFiberContent();
    }

    @Test(priority = 118, description = "GP_S2_Web_118")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add fiber content only if all added fiber content sum is 100")
    @Story("As a user I should able to add fiber content only if all added fiber content sum is 100")
    public void testToVerifyAddFiberContentSum() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyAddFiberContentSum();
    }


    @Test(priority = 119, description = "GP_S2_Web_119")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user enter fiber content with sum of more than 100 ")
    @Story("As a user I should able to enter fiber content with sum of more than 100")
    public void testToVerifyAddFiberContentSumMoreThan100() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyAddFiberContentSumMoreThan100();
    }


    @Test(priority = 120, description = "GP_S2_Web_120")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify delete icon is accessible or not ")
    @Story("As a user I should able to delete icon is accessible or not ")
    public void testToVerifyAddFiberContentDeleteIconAccessible() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyAddFiberContentDeleteIconAccessible();
    }

    // M start

    @Test(priority = 121, description = "GP_S2_Web_121")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Hook Range field is accessible or not ")
    @Story("As a user I should able to verify Hook Range field is accessible or not ")
    public void testToVerifyHookRangeField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyHookRangeFieldAccessibility();
    }

    @Test(priority = 122, description = "GP_S2_Web_122")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select the value from Min hook and Max hook drop down or not ")
    @Story("As a user I should able to verify that user is able to select the value from Min hook and Max hook drop down or not ")
    public void testToVerifyMinMaxHookValue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyMinMaxHookValue();
    }

    @Test(priority = 123, description = "GP_S2_Web_123")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user selects the same value to Min Hook and Max Hook ")
    @Story("As a user I should able to verify if user selects the same value to Min Hook and Max Hook ")
    public void testToVerifySameMinMaxHookValue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifySameMinMaxHookValue();
    }

    @Test(priority = 124, description = "GP_S2_Web_124")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user select the large value to Min hook and small value to Max hook ")
    @Story("As a user I should able to verify if user select the large value to Min hook and small value to Max hook ")
    public void TestToVerifyMinMaxHookOrder() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyMinMaxHookOrder();
    }

    @Test(priority = 125, description = "GP_S2_Web_125")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user selects the valid value to both the field Min Hook and Max Hook ")
    @Story("As a user I should able to verify if user selects the valid value to both the field Min Hook and Max Hook ")
    public void testToVerifyHookeRangeDropdownSelectionByValidValue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyMinMaxHookValue();
    }

    @Test(priority = 127, description = "GP_S2_Web_127")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Needle Range field is accessible or not ")
    @Story("As a user I should able to verify Needle Range field is accessible or not ")
    public void testToVerifyNeedleRangeFieldAccessibility() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyNeedleRangeFieldAccessibility();
    }

    @Test(priority = 128, description = "GP_S2_Web_128")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select the value from Min Needle and Max needle drop down or not ")
    @Story("As a user I should able to Verify user is able to select the value from Min Needle and Max needle drop down or not ")
    public void testToVerifyNeedleDropdownSelection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyNeedleDropdownSelection();
    }

    @Test(priority = 129, description = "GP_S2_Web_129")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user selects the same value to Min Needle and Max Needle ")
    @Story("As a user I should able to Verify if user selects the same value to Min Needle and Max Needle ")
    public void testToVerifySameNeedleValues() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifySameNeedleValues();
    }

    @Test(priority = 130, description = "GP_S2_Web_130")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user select the large value to Min needle and small value to Max needle")
    @Story("As a user I should able to verify if user select the large value to Min needle and small value to Max needle")
    public void testToVerifyNeedleRangeOrder() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyNeedleRangeOrder();
    }

    @Test(priority = 131, description = "GP_S2_Web_131")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user selects the valid value to both the field Min Needle and Max Needle ")
    @Story("As a user I should able to verify if user selects the valid value to both the field Min Needle and Max Needle ")
    public void testToVerifyNeedleDropdownSelectionByValidValue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyNeedleDropdownSelection();
    }
    @Test(priority = 145, description = "GP_S2_Web_145")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to enter the value to the Color Url field or not ")
    @Story("As a user I should able to verify user is able to enter the value to the Color Url field or not ")
    public void  testToVerifyColorUrlFieldEntry() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyColorUrlFieldEntry();
    }
    @Test(priority = 146, description = "GP_S2_Web_146")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user enter valid URL to the Color Url field ")
    @Story("As a user I should able to verify if user enter valid URL to the Color Url field ")
    public void  TestToVerifyValidColorUrlEntry() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyColorUrlFieldEntry();
    }
 @Test(priority = 147, description = "GP_S2_Web_147")
 @JiraPolicy(logTicketReady = false)
 @Feature("Create Products")
 @Severity(CRITICAL)
 @Description("Verify if user enter the invalid URL to the Color Url field ")
 @Story("As a user I should able to verify if user enter the invalid URL to the Color Url field")
 public void  TestToVerifyInvalidColorUrlEntry() {
     page = new LoginPage(getDriver());
     manage_products = new Manage_Products(getDriver());
     page.verifyUserLoginWithFreshUser();
     manage_products.gotoCreateProduct().clickOnKnitting().
             verifyThatSaveAndContinueButton().
             NavigateToCategoriesSection().
             verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
             verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyInvalidColorUrlEntry();
 }
    @Test(priority = 149, description = "GP_S2_Web_149")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify  user is able to enter data to the Aliases field or not ")
    @Story("As a user I should able to verify user is able to enter data to the Aliases field or not ")
    public void  TestToVerifyAliasesFieldEntry() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyAliasesFieldEntry();
    }

    // M 30 Jan
    @Test(priority = 133, description = "GP_S2_Web_133")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Gauge Range field is accessible or not ")
    @Story("As a user I should able to verify Gauge Range field is accessible or not ")
    public void  testToVerifyGaugeRangeFieldAccessibility() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyGaugeRangeFieldAccessibility();
    }

    @Test(priority = 134, description = "GP_S2_Web_134")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to enter the value from Min gauge and Max gauge field or not ")
    @Story("As a user I should able to verify user is able to enter the value from Min gauge and Max gauge field or not ")
    public void  testToVerifyGaugeFieldsEntry() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyGaugeFieldsEntry();
    }

    @Test(priority = 135, description = "GP_S2_Web_135")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user enter the same value to Min gauge and Max gauge ")
    @Story("As a user I should able to verify if user enter the same value to Min gauge and Max gauge ")
    public void  testToVerifySameGaugeRangeValue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifySameGaugeRangeValue();
    }

    @Test(priority = 136, description = "GP_S2_Web_136")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user select the large value to Min gauge and small value to Max gauge ")
    @Story("As a user I should able to verify if user select the large value to Min gauge and small value to Max gauge ")
    public void  testToVerifyGaugeRangeOrder() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyGaugeRangeOrder();
    }

    @Test(priority = 137, description = "GP_S2_Web_137")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user selects the valid value to both the field Min gauge and Max gauge ")
    @Story("As a user I should able to verify if user selects the valid value to both the field Min gauge and Max gauge ")
    public void TestToVerifyValidGaugeEntry() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyGaugeFieldsEntry();
    }

    @Test(priority = 139, description = "GP_S2_Web_139")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select the value Guage range unit from the drop down or not ")
    @Story("As a user I should able to verify user is able to select the value Guage range unit from the drop down or not ")
    public void testToVerifyGaugeRangeDropdownSelection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyGaugeRangeDropdownSelection();
    }

    @Test(priority = 140, description = "GP_S2_Web_140")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify selected unit option visible to Field or not ")
    @Story("As a user I should able to verify selected unit option visible to Field or not ")
    public void TestToVerifySelectedUnitOptionVisibility() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyGaugeRangeDropdownSelection();
    }

    @Test(priority = 141, description = "GP_S2_Web_141")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user try to select multiple options from the dropdown at the same time ")
    @Story("As a user I should able to verify if user try to select multiple options from the dropdown at the same time ")
    public void TestToVerifyMultipleOptionsSelection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyMultipleOptionsSelection();
    }

    @Test(priority = 142, description = "GP_S2_Web_142")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify by default Machine Wash checkbox is unselected or not ")
    @Story("As a user I should able to verify by default Machine Wash checkbox is unselected or not ")
    public void testToVerifyMachineWashCheckboxDefaultState() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyMachineWashCheckboxDefaultState();
    }



 @Test(priority = 143, description = "GP_S2_Web_143")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select the Machine wash checkbox or not ")
    @Story("As a user I should able to verify user is able to select the Machine wash checkbox or not ")
    public void testToVerifyMachineWashCheckboxSelection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyMachineWashCheckboxSelection();
    }

    // 2 Feb

    @Test(priority = 69, description = "GP_S2_Web_069")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify when user enter valid three characters then option populated in the form of drop down or not ")
    @Story("As a user I should able to verify when user enter valid three characters then option populated in the form of drop down or not ")
    public void testToVerifyDropdownOptionsPopulated() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyDropdownOptionsPopulated();
    }

    @Test(priority = 70, description = "GP_S2_Web_070")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select the one option from the populated list or not ")
    @Story("As a user I should able to verify user is able to select the one option from the populated list or not ")
    public void testToVerifyBrandNameSelection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyBrandNameSelection();
    }

    @Test(priority = 71, description = "GP_S2_Web_071")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify once user enter the datat to the Brand  field then astrix sign replace with green mark or not ")
    @Story("As a user I should able to verify once user enter the datat to the Brand  field then astrix sign replace with green mark or not ")
    public void testToVerifyGreenMarkAfterBrandEntry() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyGreenMarkAfterBrandEntry();
    }

    @Test(priority = 72, description = "GP_S2_Web_072")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Brand field is mandatory field or not ")
    @Story("As a user I should able to verify Brand field is mandatory field or not ")
    public void testToVerifyYarnBrandMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyYarnBrandMandatory();
    }

    @Test(priority = 202, description = "GP_S2_Web_202")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("when user clicks on save and continue ")
    @Story("As a user I should able to verify when user clicks on save and continue ")
    public void testToVerifySaveAndContinueAndVerifyRedirect() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().
                verifyAddAttributeButton().verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().
                verifyLanguageSection_SaveAndContinue().verifyGallerySection().verifyDragAndDropPhotos().SaveAndContinueAndVerifyRedirect();
    }

    @Test(priority = 204, description = "GP_S2_Web_204")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("when user uploads a file using choose a file option")
    @Story("As a user I should able to verify when user uploads a file using choose a file option")
    public void testToVerifyFileSectionUploadAndView() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().
                verifyAddAttributeButton().verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().
                verifyLanguageSection_SaveAndContinue().verifyGallerySection().verifyDragAndDropPhotos().verifyFileSectionUploadAndView();
 }

    @Test(priority = 205, description = "GP_S2_Web_205")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("when user uploads a file using choose a file option > verify remove button")
    @Story("As a user I should able to verify when user uploads a file using choose a file option > verify remove button")
    public void testToVerifyUploadFileAndVerifyRemoveButton() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().
                verifyAddAttributeButton().verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().
                verifyLanguageSection_SaveAndContinue().verifyGallerySection().verifyDragAndDropPhotos().verifyUploadFileAndVerifyRemoveButton();
    }

    @Test(priority = 207, description = "GP_S2_Web_207")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("when user removes a file")
    @Story("As a user I should able to verify when user removes a file")
    public void testToVerifyRemoveFileAndVerifyRemovedFile() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().
                verifyAddAttributeButton().verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().
                verifyLanguageSection_SaveAndContinue().verifyGallerySection().verifyDragAndDropPhotos().verifyRemoveFileAndVerifyRemovedFile();
    }

 @Test(priority = 206, description = "GP_S2_Web_206")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("when user uploads a file using choose a file option > verify remove button state ")
    @Story("As a user I should able to verify when user uploads a file using choose a file option > verify remove button state ")
    public void testToVerifyRemoveButtonState() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().
                verifyAddAttributeButton().verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().
                verifyLanguageSection_SaveAndContinue().verifyGallerySection().verifyDragAndDropPhotos().verifyRemoveButtonState();
    }

    @Test(priority = 208, description = "GP_S2_Web_208")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("when user uploads a file using drag and drop ")
    @Story("As a user I should able to when user uploads a file using drag and drop ")
    public void testToVerifyUploadFileUsingDragAndDrop() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().
                verifyAddAttributeButton().verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().
                verifyLanguageSection_SaveAndContinue().verifyGallerySection().verifyDragAndDropPhotos().verifyFileSectionUploadAndView();
    }

  //  8 feb
    @Test(priority = 209, description = "GP_S2_Web_209")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("verify file name validations")
    @Story("As a user I should able to verify file name validations")
    public void testToVerifyFileNameValidation() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().
                verifyAddAttributeButton().verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().
                verifyLanguageSection_SaveAndContinue().verifyGallerySection().verifyDragAndDropPhotos().VerifyFileNameValidation();
    }

    @Test(priority = 138, description = "GP_S2_Web_138")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Gauge Range field is mandatory or not ")
    @Story("As a user I should able to verify Gauge Range field is mandatory or not ")
    public void  testToVerifyIsGaugeRangeFieldMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyIsGaugeRangeFieldNonMandatory();
    }

    @Test(priority = 144, description = "GP_S2_Web_144")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Machine Wash checkbox is mandatory or not ")
    @Story("As a user I should able to verify Machine Wash checkbox is mandatory or not ")
    public void  testToVerifyIsMachineWashCheckBoxFieldMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyIsMachineWashNonMandatory();
    }

    @Test(priority = 148, description = "GP_S2_Web_148")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Color Url field is mandatory or not ")
    @Story("As a user I should able to verify Color Url field is mandatory or not ")
    public void  testToVerifyIsColorCardNonMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyIsColorCardNonMandatory();
    }

    @Test(priority = 150, description = "GP_S2_Web_150")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Aliases field is non mandatory or not ")
    @Story("As a user I should able to verify Aliases field is non mandatory or not ")
    public void  testToVerifyIsAliasesNonMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyIsAliasesNonMandatory();
    }

    // 9 feb

    @Test(priority = 151, description = "GP_S2_Web_151")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Submit button is accessible or not ")
    @Story("As a user I should able to verify Submit button is accessible or not ")
    public void testToVerifySubmitButtonAccessibility() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifySubmitButtonAccessibility();

    }*/

 /*   @Test(priority = 152, description = "GP_S2_Web_152")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify cross icon is accessible or not on the popup  ")
    @Story("As a user I should able to verify cross icon is accessible or not on the popup ")
    public void testToVerifyCrossIconAccessibility() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().crossIconAccessibility();

    }

    @Test(priority = 228, description = "GP_S2_Web_228")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify UI and text for ravelry photos")
    @Story("As a user I should able to verify UI and text for ravelry photos ")
    public void testToVerifyRavelryPhotosUIAndText() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().goToRavelryDetailsForm().checkDragPhotosRAVELRYDetail().verifyRavelryPhotosUIAndText();
    }

    @Test(priority = 230, description = "GP_S2_Web_230")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("verify user is able to remove photos")
    @Story("As a user I should able to verify user is able to remove photos")
    public void testToVerifyUserCanRemovePhotos() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().goToRavelryDetailsForm().checkDragPhotosRAVELRYDetail().verifyUserCanRemovePhotos();
    }

    @Test(priority = 231, description = "GP_S2_Web_231")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("verify user is able to access add photos (already removed using remove photos button) ")
    @Story("As a user I should able to verify user is able to access add photos (already removed using remove photos button) ")
    public void testToVerifyUserCanAccessAddPhotosPopup() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().goToRavelryDetailsForm().checkDragPhotosRAVELRYDetail().verifyUserCanAccessAddPhotosPopup();
    }*/


    // Need to add method for uploading multiple images for sequence

  /*  @Test(priority = 232, description = "GP_S2_Web_232")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("verify user is able to access add photos (already removed using remove photos button) > add photos")
    @Story("As a user I should able to verify user is able to access add photos (already removed using remove photos button) > add photos")
    public void testToVerifyAddedPhotosSequence() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().goToRavelryDetailsForm().checkDragPhotosRAVELRYDetail().verifyUserCanAccessAddPhotosPopup();
    }



    @Test(priority = 99, description = "GP_S2_Web_99")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Texture field is non mandatory or not ")
    @Story("As a user I should able to verify Texture field is non mandatory or not ")
    public void testToVerifyIsTextureFieldNonMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyIsTextureFieldNonMandatory();
    }

    @Test(priority = 101, description = "GP_S2_Web_201")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Weight (grams) field is mandatory or not ")
    @Story("As a user I should able to verify Weight (grams) field is mandatory or not ")
    public void testToVerifyIsWeightFieldNonMandatory() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyIsWeightFieldNonMandatory();
    }

    // 19 feb


    @Test(priority = 065, description = "GP_S2_Web_065")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add yarn with same yarn name of same yarn company  ")
    @Story("As a user I should able to verify user is able to add yarn with same yarn name of same yarn company  ")
    public void testToVerifySameYarnName() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifySameYarnName();
    }

    @Test(priority = 073, description = "GP_S2_Web_073")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify once user enter the data to the Brand field then cross icon must appear and accessible ")
    @Story("As a user I should able to verify once user enter the data to the Brand field then cross icon must appear and accessible ")
    public void testToVerifyCrossIconAppearsAndAccessibility() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyCrossIconAppearsAndAccessibility();
    }
    // A
    @Test(priority = 153, description = "GP_S2_Web_153")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user add more than one yarn to the pattern than \"Does the pattern require both the yarns\" Field provided or not")
    @Story("As a user I should able to add more than one yarn to the pattern than \"Does the pattern require both the yarns\" Field provided or not")
    public void testToVerifyPatternRequireBothTheYarnsDD() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().againAddYarnOptions();

    }

    // M

    @Test(priority = 154, description = "GP_S2_Web_154")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user update the added yarns than does the pattern require both the yarns field updated with blank or not ")
    @Story("As a user I should able to verify if user update the added yarns than does the pattern require both the yarns field updated with blank or not ")
    public void testToVerifyUpdateYarn() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().againAddYarnOptions().verifyUpdateYarn();

    }

    @Test(priority = 155, description = "GP_S2_Web_155")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user add two yarns in the Product than Field label Does the pattern require both the yarns have both keyword or not ")
    @Story("As a user I should able to Verify if user add two yarns in the Product than Field label Does the pattern require both the yarns have both keyword or not ")
    public void testToVerifyBothKeywordsInPatternLabel() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().againAddYarnOptions().verifyBothKeywordsInPatternLabel();

    }*/

    @Test(priority = 156, description = "GP_S2_Web_156")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user add multiple yarns than count in the field label\"Does the pattern all 3 yarns\"  is dynamic or not ")
    @Story("As a user I should able to Verify if user add multiple yarns than count in the field label\"Does the pattern all 3 yarns\"  is dynamic or not ")
    public void testToVerifyDynamicYarnCount() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().againAddYarnOptions().againAddAnotherYarnOptions().testToVerifyDynamicYarnCount();

    }

   /* @Test(priority = 157, description = "GP_S2_Web_157")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify \"Does the pattern require both the yarns\" field is accessible or not ")
    @Story("As a user I should able to verify \"Does the pattern require both the yarns\" field is accessible or not  ")
    public void testToVerifyPatternFieldAccessibility() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().againAddYarnOptions().verifyPatternFieldAccessibility();

    }

    @Test(priority = 158, description = "GP_S2_Web_158")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select the option from the dropdown or not ")
    @Story("As a user I should able to Verify user is able to select the option from the dropdown or not ")
    public void testToVerifyPatternDropdownSelection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().againAddYarnOptions().verifyPatternDropdownSelection();

    }

    @Test(priority = 161, description = "GP_S2_Web_161")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user try to select the both options from the dropdown ")
    @Story("As a user I should able to verify if user try to select the both options from the dropdown  ")
    public void testToVerifyMultiplePatternOptionsSelection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().againAddYarnOptions().verifyMultiplePatternOptionsSelection();

    }*/


    // M End
   /* @Test(priority = 201, description = "GP_S2_Web_201")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify when user go back to any option without saving")
    @Story("As a user I should able to verify when user go back to any option without saving")
    public void testToVerifyPhotosWillLostWithoutSave() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().verifyThatSaveAndContinueButton().NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().
                verifyAddAttributeButton().verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().
                verifyLanguageSection_SaveAndContinue().verifyGallerySection().verifyDragAndDropPhotos().verifyWithoutSavePhotos();
    }*/



    // R Started
   /* @Test(priority = 61, description = "GP_S2_Web_061")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to enter Yarn name or not")
    @Story("As a user I should be able to verify to enter Yarn name or not")
    public void testToVerifyYarnNameOnAddYarnForm() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyYarnName();
    }


    @Test(priority = 62, description = "GP_S2_Web_062")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Yarn name field is mandatory or not ")
    @Story("As a user I should able to verify Yarn name is mandatory or not")
    public void testToVerifyYarnNameMandatoryOnAddYarnForm() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyYarnNameMandatory();
    }

    @Test(priority = 63, description = "GP_S2_Web_063")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add blank spaces or not to Yarn name")
    @Story("As a user I should able to verify No blank space should be added in yarn name")
    public void testToVerifyNoBlankSpaceAddedInYarnName() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyNoBlankSpaceAdded();
    }


    @Test(priority = 64, description = "GP_S2_Web_064")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify once user enter the detail to the field then green check mark appears or not inplace of Astrix icon or not ")
    @Story("User enter the detail to the Yarn name field then green check mark replace the Astrix icon")
    public void testToVerifyGreenCheckOnYarnNameField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyGreenTickOfYarnNameField();
    }

    @Test(priority = 66, description = "GP_S2_Web_066")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user not enter the any value then it gives me an error toast or not ")
    @Story("As a user doesn't enter any value then it gives error toast msg")
    public void testToVerifyYarnNameFieldErrorToast() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyErrorToastOnYarnNameField();
    }


    @Test(priority = 67, description = "GP_S2_Web_067")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add Brand name or not")
    @Story("As a user should be able to enter brand name")
    public void testToVerifyBrandNameOnAddYarnForm() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyBrandName();
    }

    @Test(priority = 68, description = "GP_S2_Web_068")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add Brand name or not")
    @Story("As a user should be able to enter brand name")
    public void testToAutoSearchOnMinThreeChar() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp().verifyAutoSearchOnMinThreeChar();
    }*/

// R Ended





}
