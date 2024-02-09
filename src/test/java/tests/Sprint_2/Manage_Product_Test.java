package tests.Sprint_2;


import io.qameta.allure.*;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.Manage_Products;
import tests.SuiteSetup;
import utilities.JiraPolicy;

import static io.qameta.allure.SeverityLevel.CRITICAL;

@Epic("Manage Products")
public class Manage_Product_Test extends SuiteSetup {

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

     //Need discussion
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
    @Description("Verify user is able to see and select the 2nd sub Category after selecting 1st sub Category section")
    @Story("As a user I should able to see and select the 2nd sub Category after selecting 1st sub Category section")
    public void testToVerifySelectingTwoCategories() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected();
    }


   @Test(priority = 23, description = "GP_S2_Web_023")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user should able to see and enter data in Does the pattern have further sub Category section")
    @Story("As a user I should able to see and enter data in Does the pattern have further sub Category section")
    public void testToVerifyCategorySectionAndSubCategorySection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifySubCategoryThenSubCategorySection();
    }

    @Test(priority = 24, description = "GP_S2_Web_024")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user click on Add Category button then new Category section shows for that particular pattern and add multipule categories for that pattern ")
    @Story("As a user I should able to change next Category automatically goes blank on the basis of the change These all categories are interlinked with each other")
    public void testToVerifyCategoryAreInterlinked() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifySubCategoryThenSubCategorySection();
    }

    @Test(priority = 25, description = "GP_S2_Web_025")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user is able to add category using search input box")
    @Story("As a user I should able to add category using search input box")
    public void testToVerifyAddCategoryButton() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyAddCategoryButton();
    }



    @Test(priority = 26, description = "GP_S2_Web_026")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user click on Save & Continue button")
    @Story("As a user I should able to Verify if user click on Save & Continue button")
    public void testToVerifyAddCategorySaveAndContinue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyCategoriesSection_SaveAndContinue();
    }

    @Test(priority = 27, description = "GP_S2_Web_027")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is navigated on Nitty Gritty section of the create product page after Save & continue button of Category section")
    @Story("As a user I should able to Verify navigated on Nitty Gritty section of the create product page after Save & continue button")
    public void testToVerifyNavigatedOnNittyGrittySection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().
                verifyAllOptionsOfNittyGrittyTab();
    }

    @Test(priority = 28, description = "GP_S2_Web_028")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user receive an error without filling mandatory data in Nitty gritty section and click on Save & Continue button")
    @Story("As a user I should able to receive an error without filling mandatory data in Nitty gritty section and click on Save & Continue")
    public void testToVerifyNittyGrittyMandatoryField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().
                verifyNittyGrittyMandatoryFields();
    }


    @Test(priority = 29, description = "GP_S2_Web_029")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that if user select the KNITTING Craft then in Pattern Nitty Gritty section there is a Primary Needle Size section with Add needle option shows for add multiple needle size.")
    @Story("As a user I should able to select the KNITTING Craft then in Pattern Nitty Gritty section there is a Primary Needle Size section with Add needle option shows for add multiple needle size")
    public void testToVerifyNittyGrittyPrimaryNeedleSizeSectionDD() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().
                verifyNittyGritty_NeedleSizeDropDownOptions();
    }



    @Test(priority = 30, description = "GP_S2_Web_030")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that if user select the KNITTING Craft then in Pattern Nitty Gritty section there is a Primary Needle Size section with Add needle option shows for add multiple needle size")
    @Story("As a user I should able to select the KNITTING Craft then in Pattern Nitty Gritty section there is a Primary Needle Size section with Add needle option shows for add multiple needle size")
    public void testToVerifyNittyGrittyAddNeedleSizeSectionDD() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyAddNeedleSizeButton();
    }


    @Test(priority = 31, description = "GP_S2_Web_031")
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

   @Test(priority = 32, description = "GP_S2_Web_032")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that if user select the KNITTING/ CROCHET/ TUNISIAN CROCHET Craft then the Yarn section with Add Yarn option shows for add multiple Yarn")
    @Story("As a user I should able to verify that if user select the KNITTING/ CROCHET/ TUNISIAN CROCHET Craft then the Yarn section with Add Yarn option shows for add multiple Yarn")
    public void testToVerifyNittyGrittyAddYarnOptions() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddYarnOptions();
    }

    @Test(priority = 33, description = "GP_S2_Web_033")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that if user select the KNITTING/ CROCHET/ TUNISIAN CROCHET Craft then the Yarn section with Add Yarn option shows for add multiple Yarn")
    @Story("As a user I should able to verify that if user select the KNITTING/ CROCHET/ TUNISIAN CROCHET Craft then the Yarn section with Add Yarn option shows for add multiple Yarn")
    public void testToVerifyNittyGrittyMultipleYarnOptions() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn();
    }



    @Test(priority = 34, description = "GP_S2_Web_034")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that if Searched Yarn not show on Suggestion list then user receive a message Yarn not found and Add Yarn option shows in suggestion list and user able to click on it")
    @Story("As a user I should able to verify that if Searched Yarn not show on Suggestion list then user receive a message Yarn not found and Add Yarn option shows in suggestion list and user able to click on it")
    public void testToVerifyAddYarnSuggestionPopUp() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().verifyNittyGritty_AddYarnSuggestionPopUp();
    }

    @Test(priority = 35, description = "GP_S2_Web_035")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that click on Add Yarn option user receive a popup (All are mandatory Fields) and click on save after filling data User should able to add multiple yarn in this section")
    @Story("As a user I should able to verify that if Searched Yarn not show on Suggestion list then user receive a message Yarn not found and Add Yarn option shows in suggestion list and user able to click on it")
    public void testToVerifyAddYarnSuggestionPopUpAllMandatoryField() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().
                verifyNittyGrittyAddYarnSuggestionPopUp_AllMandatoryFields();
    }


    @Test(priority = 36, description = "GP_S2_Web_036")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that User is able to see and enter data in Gauge section in Nitty Gritty")
    @Story("As a user I should able to see and enter data in Gauge section in Nitty Gritty")
    public void testToVerifyNittyGrittyEnterDataInGaugeSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyEnterDataInGauge()
        ;
    }

    @Test(priority = 37, description = "GP_S2_Web_037")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that User is able to see and enter data in Total Yardage for Pattern section in Nitty Gritty")
    @Story("As a user I should able to verify that User is able to see and enter data in Total Yardage for Pattern section in Nitty Gritty")
    public void testToVerifyAddYarnTotalYardageForPattern() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().enterDataInTotalYarnPattern();
    }

    @Test(priority = 38, description = "GP_S2_Web_038")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that User is able to see and enter data in Size information section in Nitty Gritty.")
    @Story("As a user I should able to see and enter data in Size information section in Nitty Gritty")
    public void testToVerifyAddYarnEnterDataInSizeInformation() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().selectAvailableSizeInPattern();
    }


    @Test(priority = 39, description = "GP_S2_Web_039")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that User is able to see and enter data in Size information section in Nitty Gritty")
    @Story("As a user I should able to verify that User is able to see and enter data in Size information section in Nitty Gritty")
    public void testToVerifyDataInSizeInformationInNittyGritty() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAttributeScreen();
    }


    //Need discussion
    @Test(priority = 40, description = "GP_S2_Web_040" ,enabled = false)
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify that if User select personalize option in popup of Size information section in Nitty Gritty then user is able to receive a popup.")
    @Story("As a user I should able to verify that select personalize option in popup of Size information section in Nitty Gritty then user is able to receive a popup")
    public void testToVerifySelectPersonalizeOptionPopupSize() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().
                verifyNittyGritty_AddMultipleYarn().selectAvailableSizeInPattern();
    }

    @Test(priority = 41, description = "GP_S2_Web_041")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user click on Save & Continue button")
    @Story("As a user I should able to verify if user click on Save & Continue button")
    public void testToVerifyNittyGrittySaveAndContinue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue();
    }

    @Test(priority = 42, description = "GP_S2_Web_042")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is navigated on Attributes section of the create product page after Save & continue button of Nitty Gritty section.")
    @Story("As a user I should able to navigated on Attributes section of the create product page after Save & continue button of Nitty Gritty section")
    public void testToVerify_selectingMainAttributeSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAttributeScreen();
    }

    @Test(priority = 43, description = "GP_S2_Web_043")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see and select the sub Attribute after selecting Main Attribute section hows cross icon on the Attribute section ")
    @Story("As a user I should able to verify user is able to see and select the sub Attribute after selecting Main Attribute section hows cross icon on the Attribute section")
    public void testToVerify_selectingMainAttributeSectionDeleteIcon() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAttributeScreen().verifyAttributeScreen_DeleteIcon();
    }

    @Test(priority = 44, description = "GP_S2_Web_044")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see and select the 2nd sub Attribute after selecting 1st sub Attribute section")
    @Story("As a user I should able to verify user is able to see and and select the 2nd sub Attribute after selecting 1st sub Attribute section")
    public void testToVerify_selectingSecondAttributeSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifySecondSubAttributeSection();
    }

    //Need discussion
    @Test(priority = 45, description = "GP_S2_Web_045" ,enabled = false)
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see and select the 2nd sub Attribute after selecting 1st sub Attribute section.")
    @Story("As a user I should able to verify user is able to see and select the 2nd sub Attribute after selecting 1st sub Attribute section")
    public void testToVerify_selecting2ndSubAttributeSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifySecondSubAttributeSection();
    }


    @Test(priority = 46, description = "GP_S2_Web_046")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user click on Save & Continue button")
    @Story("As a user I should able to verify if user click on Save & Continue button")
    public void testToVerifyAddAttributeButtonSaveAndContinue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue();
    }


    @Test(priority = 47, description = "GP_S2_Web_047")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is navigated on Language section of the create product page after Save & continue button of Languages section")
    @Story("As a user I should able to verify user is navigated on Language section of the create product page after Save & continue button of Languages section")
    public void testToVerifyAddAttributeToLanguageSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection();
    }

    @Test(priority = 48, description = "GP_S2_Web_048")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify if user click on Save & Continue button.")
    @Story("As a user I should able to verify if user click on Save & Continue button")
    public void testToVerifyLanguageSectionSaveAndContinue() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue();
    }



    @Test(priority = 49, description = "GP_S2_Web_049")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is navigated on Photos section of the create product page after Save & continue button of gallery section.")
    @Story("As a user I should able to verify user is navigated on Photos section of the create product page after Save & continue button of gallery section")
    public void testToVerifyNavigatedToGallery() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection();
    }

    @Test(priority = 50, description = "GP_S2_Web_050")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see images with cross icon and Add detail button on Photos section.")
    @Story("As a user I should able to verify user is able to see images with cross icon and Add detail button on Photos section")
    public void testToVerifyNavigatedToGalleryAddDetailButton() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().addGalleryPhotoAndAddDetailButton();
    }

*/


    /*
        @Test(priority = 51, description = "GP_S2_Web_051")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to see Popup when user click on Add detail button on Photos section")
        @Story("As a user I should able to verify user is able to see Popup when user click on Add detail button on Photos section")
        public void testToVerifyAddDetailsButtonOnPhotosSection() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().addGalleryPhotoAndAddDetailButton().verifyAddDetailsPopUp_AllOptions();
        }

        @Test(priority = 52, description = "GP_S2_Web_052")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to click on save button in popup after fill details. After that Add Detail button change in Edit Detail button")
        @Story("As a user I should able to verify user is able to click on save button in popup after fill details. After that Add Detail button change in Edit Detail button")
        public void testToVerifyAddDetailsButtonSaveAll() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().addGalleryPhotoAndAddDetailButton().verifyAddDetailsPopUp_SaveAll();
        }




        @Test(priority = 53, description = "GP_S2_Web_053")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to click on Delete button in popup and that photo deleted from the Photo Section")
        @Story("As a user I should able to verify user is able to click on Delete button in popup and that photo deleted from the Photo Section")
        public void testToVerifyPhotoDeletedButton() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().verifyPhotoDeleteButton();
        }

        @Test(priority = 54, description = "GP_S2_Web_054")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify if user click on Save & Continue button")
        @Story("As a user I should able to verify if user click on Save & Continue button")
        public void testToVerifyPhotoSaveContinueButton() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue();
        }




        @Test(priority = 55, description = "GP_S2_Web_055")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is navigated on Files section of the create product page after Save & continue button of Photo section")
        @Story("As a user I should able to verify if user is navigated on Files section of the create product page after Save & continue button of Photo section")
        public void testToVerifyPhotoToFileTab() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible();
        }

        @Test(priority = 56, description = "GP_S2_Web_056")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to see Add File button on File section")
        @Story("As a user I should able to verify if user is able to see Add File button on File section")
        public void testToVerifyAddFileButtonOnFileSection() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF();
        }


        @Test(priority = 57, description = "GP_S2_Web_057")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify if user click on Save & Continue button")
        @Story("As a user I should able to verify if user click on Save & Continue button")
        public void testToVerifyFileSection_SaveAndContinue() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue();
        }

        @Test(priority = 58, description = "GP_S2_Web_058")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is navigated on Note section of the create product page after Save & continue button of File section.")
        @Story("As a user I should able to verify if  user is navigated on Note section of the create product page after Save & continue button of File section")
        public void testToVerifyNavigationToFileToNoteSection() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible();
        }


        @Test(priority = 59, description = "GP_S2_Web_059")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify if user click on Save & Continue button")
        @Story("As a user I should able to verify if user click on Save & Continue button")
        public void testToVerifyDescriptiveText_SaveAndContinue() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab();
        }

        @Test(priority = 60, description = "GP_S2_Web_060")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is navigated on Selling Channel section of the create product page after Save & continue button of Note section.")
        @Story("As a user I should able to navigated on Selling Channel section of the create product page after Save & continue button of Note section")
        public void testToVerifyDescriptiveTextToNavigatedSellingChannelSection () {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab();
        }

        // new
        @Test(priority = 61, description = "GP_S2_Web_061")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to drag the photos on ETSY Detail form of the create product page of Selling chanel section")
        @Story("As a user I should able to drag the photos on ETSY Detail form of the create product page of Selling chanel section")
        public void testToVerifyDragThePhotosOnETSYDetailForm() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifyDragPhotos();
        }

        @Test(priority = 62, description = "GP_S2_Web_062")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to delete the photos on ETSY Detail form of the create product page of Selling chanel section.")
        @Story("As a user I should able to navigated on Selling Channel section of the create product page after Save & continue button of Note section")
        public void testToVerifyDeletePhotosOnETSYDetailForm () {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().verifyPhotosDeleteFromEtsyTab();
        }

        @Test(priority = 63, description = "GP_S2_Web_063")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to add the deleted photos on ETSY Detail form of the create product page of Selling chanel section.")
        @Story("As a user I should able to add the deleted photos on ETSY Detail form of the create product page of Selling chanel section")
        public void testToVerifyDeletePhotosOnETSYDetailFormAddAgain() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                    verifyPhotosDeleteFromEtsyTab().verifyAfterDeleteAddPhotoButton();
        }



       @Test(priority = 64, description = "GP_S2_Web_064")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to see notes in Description with Preview description button on ETSY Detail form of the create product page of Selling chanel section.")
        @Story("As a user I should able to able to see notes in Description with Preview description button on ETSY Detail form of the create product page of Selling chanel section")
        public void testToVerifyEtsyNotesDescriptionWithPreview() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().verifyEtsyNoteDescription();
        }



        @Test(priority = 65, description = "GP_S2_Web_065")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to see Description when click on Preview Descripiton button on ETSY Detail form of the create product page of Selling chanel section.")
        @Story("As a user I should able able to see Description when click on Preview Descripiton button on ETSY Detail form of the create product page of Selling chanel section")
        public void testToVerifyEtsyNotesDescriptionWithPreviewETSYDetailForm() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().verifyPreviewDescription();
        }

        @Test(priority = 66, description = "GP_S2_Web_066")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to see Renewal option on ETSY Detail form of the create product page of Selling chanel section.")
        @Story("As a user I should able to navigated on Selling Channel section of the create product page after Save & continue button of Note section")
        public void testToVerifyRenewalOptionOnETSYDetail() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().verifyRenewalOptions();
        }

        //Need discussion
        @Test(priority = 67, description = "GP_S2_Web_067", enabled = false)
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to select Automatic Renewal option on ETSY Detail form of the create product page of Selling chanel section.")
        @Story("As a user I should able to select Automatic Renewal option on ETSY Detail form of the create product page of Selling chanel section")
        public void testToVerifyAutomaticRenewalOptionOnETSYDetail() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().verifyRenewalOptions_Automatic();
        }





        @Test(priority = 68, description = "GP_S2_Web_068")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to select Manual Renewal option on ETSY Detail form of the create product page of Selling chanel section.")
        @Story("As a user I should able to select Manual Renewal option on ETSY Detail form of the create product page of Selling chanel section")
        public void testToVerifyManualRenewalOptionOnETSYDetail() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().verifyRenewalOptions_Manual();
        }

        @Test(priority = 69, description = "GP_S2_Web_069")
        @JiraPolicy(logTicketReady = false)
        @Feature("Create Products")
        @Severity(CRITICAL)
        @Description("Verify user is able to a Section on ETSY Detail form of the create product page of Selling chanel section.")
        @Story("As a user I should able to a Section on ETSY Detail form of the create product page of Selling chanel section")
        public void testToVerifySectionOnETSYDetail() {
            page = new LoginPage(getDriver());
            manage_products = new Manage_Products(getDriver());
            page.verifyUserLoginWithFreshUser();
            manage_products.gotoCreateProduct().clickOnKnitting().
                    verifyThatSaveAndContinueButton().
                    NavigateToCategoriesSection().
                    verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                    verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                    verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                    verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                    filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySectionOptions();
        }

    @Test(priority = 70, description = "GP_S2_Web_070")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see and select dropdown option in shop section on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to see and select dropdown option in shop section on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyDropdownOptionInShopSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_ShopSection();
    }


    @Test(priority = 71, description = "GP_S2_Web_071")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see and enter data in Quantity section on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to see and enter data in Quantity section on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyEnterDataInQuantitySection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_Quantity();
    }

  @Test(priority = 72, description = "GP_S2_Web_072")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to a see and enter data in Price section on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to see and enter data in Price section on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyEnterDataInPriceSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_Price();
    }
   

    //new
    @Test(priority = 73, description = "GP_S2_Web_073")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to a see and enter data in Tag section on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to see and enter data in Tag section on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyEnterDataInTagSection() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_TagSection();
    }
    


    @Test(priority = 74, description = "GP_S2_Web_074")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Plus icon activate when text entered in Tag section on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to add Plus icon activate when text entered in Tag section on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyEnterDataInTagSectionPlusIconEnable() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_TagSectionEnableAddButton();
    }


    @Test(priority = 75, description = "GP_S2_Web_075")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify Plus icon activate when text entered in Tag section on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to see Plus icon activate when text entered in Tag section on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyPlusIconActivateWhenTextEntered() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_PlusIconActivateWhenTextEntered();
    }





    @Test(priority = 76, description = "GP_S2_Web_076")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user able to click on Cross icon on tag in Tag section on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to click on Cross icon on tag in Tag section on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyEnterDataInTagCrossIcon() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_TagsCrossIcon();
    }



    @Test(priority = 77, description = "GP_S2_Web_077")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to drag the file on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to see and enter data in Tag section on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyDragTheFileOnETSYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifyFileOnETSYDetail();
    }

    @Test(priority = 78, description = "GP_S2_Web_078")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to delete the file on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to to delete the file on ETSY Detail form of the create product page of Selling chanel section.")
    public void testToVerifyDeleteTheFileOnETSYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifyDeleteFileOnETSYDetail();
    }



    @Test(priority = 79, description = "GP_S2_Web_079")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add the deleted files on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to add the deleted files on ETSY Detail form of the create product page of Selling chanel section.")
    public void testToVerifyAddTheDeletedFiles() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                checkRefreshEtsyShopButton().verifyDeleteFileOnETSYDetail().verifyFileTab_UploadPDF().filesTab_SaveAndContinue().DescriptiveText_SaveAndContinue().verifyFileOnETSYDetail();
    }


    @Test(priority = 80, description = "GP_S2_Web_080")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to Click Save button on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to Click Save button on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyClickSaveButtonOnETSYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
        verifySectionOptions_ShopSection().verifySectionOptions_Quantity().verifySectionOptions_Price().verifySectionOptions_TagSection().verifySaveDraft();
    }


    @Test(priority = 81, description = "GP_S2_Web_081")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to Click Publish to ETSy button on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to Click Publish to ETSy button on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyClickSaveButtonOnETSYDetail1() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_ShopSection().verifySectionOptions_Quantity().verifySectionOptions_Price().verifySectionOptions_TagSection().verifySaveDraft().verifyPublishToEtsy();
    }


    @Test(priority = 82, description = "GP_S2_Web_082")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to receive an error if user Click Publish to ETSy button on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to receive an error if user Click Publish to ETSy button on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyETSYDetailReceiveAnError() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                goToSellingChannel().verifyPublishToEtsy_Popup();
    }



    //Need Discussion
    @Test(priority = 83, description = "GP_S2_Web_083" ,enabled = false)
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to Click on View it here link of popup on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to Click on View it here link of popup on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyClickSave0ButtonOnETSYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_ShopSection().verifySectionOptions_Quantity().verifySectionOptions_Price().verifySectionOptions_TagSection().verifySaveDraft();
    }


    //Need discussion
    @Test(priority = 84, description = "GP_S2_Web_084",enabled = false)
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to Click Save button on ETSY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to Click Save button on ETSY Detail form of the create product page of Selling chanel section")
    public void testToVerifyClickSaveButtonOnETSYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                verifySectionOptions_ShopSection().verifySectionOptions_Quantity().verifySectionOptions_Price().verifySectionOptions_TagSection().verifySaveDraft();
    }





    @Test(priority = 85, description = "GP_S2_Web_085")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is navigated on Ravelry Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to navigated on Ravelry Detail form of the create product page of Selling chanel section")
    public void testToVerifyNavigatedOnRavelryDetailDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                goToRavelryDetailsForm();
    }



    @Test(priority = 86, description = "GP_S2_Web_086")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to drag the photos on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to drag the photos on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyDragThePhotosOnRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().checkDragPhotosRAVELRYDetail();
    }



    @Test(priority = 87, description = "GP_S2_Web_087")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to delete the photos on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to delete the photos on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyDeleteThePhotosOnRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().checkDragPhotosRAVELRYDetail().verifyPhotosDeleteFromRAVELRYTab();
    }




    //New
    //Need to work on this
   @Test(priority = 88, description = "GP_S2_Web_088")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to delete the photos on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to delete the photos on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyDeleteThePhotosOnRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().
                goToRavelryDetailsForm().checkDragPhotosRAVELRYDetail().verifyPhotosDeleteFromRAVELRYTab().verifyAbleToAddDeletePhotos();
    }

    //Need to work on this
    @Test(priority = 89, description = "GP_S2_Web_089")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see notes in Description with Preview Descripiton button on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to see notes in Description with Preview Descripiton button on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifySeeNotesInPreviewDescripitonOnRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().checkDragPhotosRAVELRYDetail().verifyPhotosDeleteFromRAVELRYTab();
    }



    @Test(priority = 90, description = "GP_S2_Web_090")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see Popup Description when click on Preview Descripiton button on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to see Popup Description when click on Preview Descripiton button on RAVELRY Detailof the create product page of Selling chanel section")
    public void testToVerifyPopupDescriptionOnPreviewDescripitonRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().goToRavelryDetailsForm().verifyPreviewDescripitonRAVELRYDetail();
    }




    @Test(priority = 91, description = "GP_S2_Web_091")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see Price section on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to  see Price section on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyPriceSectionOnRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyPreviewDescripitonRAVELRYDetail_Close();
    }


    @Test(priority = 92, description = "GP_S2_Web_092")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select FREE option on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to select FREE option on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyFREEOptionOnRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().
                verifyFreeCheckBoxRavelryTab();
    }



    @Test(priority = 93, description = "GP_S2_Web_093")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select sub option Free download PDF option on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to select sub option Free download PDF option on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifySelectSubOptionFreeDownloadPDFOptionRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifySubOptionFreeDownloadPDF();
    }


   // New
    @Test(priority = 94, description = "GP_S2_Web_094")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select sub option Pattern available online option on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to select sub option Pattern available online on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifySelectSubOptionPatternAvailableOnlineRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifySubOptionPatternAvailableOnline();
    }

   @Test(priority = 95, description = "GP_S2_Web_095")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to enter data in text filed of sub option Pattern available online option on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to select sub option Free download PDF option on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyPatternAvailableOnlinePatternLinkRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyPatternAvailableOnlinePatternLinkFiled();
    }

    //Need Disccusion
    @Test(priority = 96, description = "GP_S2_Web_096")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select sub option Free download PDF option on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to select sub option Free download PDF option on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifySelectSubOptionFreeDownloadPDFOptionRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifySubOptionFreeDownloadPDF();
    }

    @Test(priority = 97, description = "GP_S2_Web_097")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to drag the file on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to drag the file on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyDragTheFileOnRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyFileDragToRavelryForm();
    }



    @Test(priority = 98, description = "GP_S2_Web_098")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to see language dropdown for the file on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to see language dropdown for the file on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyLanguageDropdownForTheFileRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyLanguageDropdownForTheFile();
    }


    @Test(priority = 99, description = "GP_S2_Web_099")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to select sub option Free download PDF option on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to select sub option Free download PDF option on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifySelectSubOptionFreeDownloadPDFOptionRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifySubOptionFreeDownloadPDF();
    }



    @Test(priority = 100, description = "GP_S2_Web_100")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to delete the file on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to delete the file on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyDeleteTheFileOnRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyDeleteTheFileOnRAVELRYDetail();
    }


    @Test(priority = 101, description = "GP_S2_Web_101")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to add the deleted files on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to add the deleted files on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyAddTheDeletedFilesRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyAddTheDeletedFilesRAVELRYDetail();
    }


    //New
    @Test(priority = 102, description = "GP_S2_Web_102")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to Click Save Draft button on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to Click Save Draft button on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyClickSaveDraftButtonOnRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifySelectBusinessAndProductStoreandSaveDraft();
    }

    @Test(priority = 103, description = "GP_S2_Web_103")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to Click Publish to RAVELRY button on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to Click Publish to RAVELRY button RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyAddTheDeletedFilesRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyPublishToRavelryButton();
    }


    @Test(priority = 104, description = "GP_S2_Web_104")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to receive an error if user Click Publish to RAVELRY button on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to receive an error if user Click Publish to RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyReceiveAnErrorRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyErrorInRAVELRYDetail();
    }

     */


    //Need Discussion
    @Test(priority = 105, description = "GP_S2_Web_105")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to Click on View it here link of popup on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should  able to Click on View it here link of popup on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyViewItHereLinkOfPopupRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyAddTheDeletedFilesRAVELRYDetail();
    }
    /*

      //Need Discussion
    @Test(priority = 106, description = "GP_S2_Web_106")
    @JiraPolicy(logTicketReady = false)
    @Feature("Create Products")
    @Severity(CRITICAL)
    @Description("Verify user is able to Click on "Continue" button on popup on RAVELRY Detail form of the create product page of Selling chanel section.")
    @Story("As a user I should able to add the deleted files on RAVELRY Detail form of the create product page of Selling chanel section")
    public void testToVerifyClickOnContinueButtonOnPopupRAVELRYDetail() {
        page = new LoginPage(getDriver());
        manage_products = new Manage_Products(getDriver());
        page.verifyUserLoginWithFreshUser();
        manage_products.gotoCreateProduct().clickOnKnitting().
                verifyThatSaveAndContinueButton().
                NavigateToCategoriesSection().
                verifyTwoCategoriesSelected().verifyNavigationOnNittyGritty().verifyNittyGritty_NeedleSizeDropDownOptions().verifyNittyGritty_AddYarnOptions().
                verifyNittyGritty_AddMultipleYarn().verifyEnterDataInGauge().verifyNittyGritty_SaveAndContinue().verifyAddAttributeButton().
                verifyAddAttributeButton_SaveAndContinue().verifyLanguageSection().verifyLanguageSection_SaveAndContinue().
                verifyGallerySection().uploadPhoto().photosTab_SaveAndContinue().verifyFileTabVisible().verifyFileTab_UploadPDF().
                filesTab_SaveAndContinue().verifyDescriptiveTextTabVisible().DescriptiveText_SaveAndContinue().verifySellingChannelTab().goToRavelryDetailsForm().verifyAddTheDeletedFilesRAVELRYDetail();
    }
*/
}
