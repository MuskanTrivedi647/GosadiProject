package pageObjects;

import logger.LOG;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static utilities.CommonUtils.filePath;
import static utilities.CommonUtils.holdForElement;

public class Manage_Products extends BasePage {

    public Manage_Products(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[contains(text(),'Manage Products')]/..")
    private WebElement manageProductsTab;

    @FindBy(xpath = "//p[contains(text(),'Create Product')]/..")
    private WebElement createProduct;

    @FindBy(xpath = "//p[contains(text(),'Product Library')]/..")
    private WebElement productLibrary;

    @FindBy(xpath = "//h1[text()='create new product']")
    private WebElement createNewProductTitle;

    @FindBy(xpath = "//button[text()='Pattern Details']")
    private WebElement patternDetailsTab;

    @FindBy(xpath = "//button[text()='Categories']")
    private WebElement categoriesTab;

    @FindBy(xpath = "//button[text()='Nitty Gritty']")
    private WebElement nittyGrittyTab;

    @FindBy(xpath = "//button[text()='Attributes']")
    private WebElement attributesTab;

    @FindBy(xpath = "//button[text()='Languages']")
    private WebElement LanguagesTab;

    @FindBy(xpath = "//button[text()='Gallery']")
    private WebElement galleryTab;

    @FindBy(xpath = "//button[text()='Files']")
    private WebElement filesTab;

    @FindBy(xpath = "//button[contains(text(),'Descriptive Text')]")
    private WebElement descriptiveTextTab;

    @FindBy(xpath = "//button[contains(text(),'Selling Channels')]")
    private WebElement sellingChannelsTab;

    @FindBy(xpath = "//button[text()='Knitting']")
    private WebElement knitting;

    @FindBy(xpath = "//button[text()='LOOM KNITTING']")
    private WebElement loom_Knitting;

    @FindBy(xpath = "//button[text()='MACHINE KNITTING']")
    private WebElement machine_Knitting;

    @FindBy(xpath = "//button[text()='Crochet']")
    private WebElement crochet;

    @FindBy(xpath = "//button[text()='Tunisian Crochet']")
    private WebElement tunisian_Crochet;

    @FindBy(xpath = "//h5[contains(text(),'Let')]")
    private WebElement buildPatternTitle;

    @FindBy(name = "patternName")
    private WebElement patternName;

    @FindBy(xpath = "//p[text()='Pattern name is required']")
    private WebElement patternNameRequired;

    @FindBy(xpath = "//p[contains(text(),'Skill level ')]")
    private WebElement patternLevelRequired;

    @FindBy(xpath = "//div[text()='Published Month']")
    private WebElement monthPublishedRequired;

    @FindBy(xpath = "//input[@name='patternLevel']/..")
    private WebElement skillLevelDD;

    @FindBy(xpath = "//li[text()='Advanced beginner']")
    private WebElement advancedBeginnerOption;

    @FindBy(xpath = "//input[@name='publishMonth']/..")
    private WebElement monthDD;

    @FindBy(xpath = "//*[@id=\"menu-publishMonth\"]/div[3]/ul/li[1]")
    private WebElement janMonth;

    @FindBy(xpath = "//input[@name='publishedYear']/..")
    private WebElement yearDD;

    @FindBy(xpath = "//*[@id=\"menu-publishedYear\"]/div[3]/ul/li[2]")
    private WebElement year22;

    @FindBy(xpath = "//p[text()='In Print']")
    private WebElement InPrintCB;

    @FindBy(xpath = "//input[@name='publicationNameList.0.publicationName']/..")
    private WebElement publicationNameDD_InPrintCB;

    @FindBy(xpath = "//input[@name='publicationNameList.0.publicationName']")
    private WebElement publicationNameDD_Input;

    @FindBy(xpath = "(//*[contains(text(),'The ABC')])[1]")
    private WebElement publication_NameOptions;

    @FindBy(xpath = "//*[contains(text(),'Publication Name')]/span")
    private WebElement publicationMandatory;

    @FindBy(xpath = "//p[contains(text(),'Available on a ')]")
    private WebElement availableOnSC;

    @FindBy(xpath = "//p[text()='Etsy']")
    private WebElement etsyCb;

    @FindBy(xpath = "//input[@name='etsyStore']/..")
    private WebElement etsyStoreDD;

    @FindBy(xpath = "//ul[contains(@class,'MuiMenu-list')]/li")
    private WebElement listOFEtsyDD;

    @FindBy(xpath = "//p[contains(text(),'Blog, Website')]")
    private WebElement blogWebSiteCB;

    @FindBy(xpath = "//input[@id=':r1d:']/..")
    private WebElement websiteEbookDD;

    @FindBy(xpath = "(//*[contains(text(),'abc')])[1]")
    private WebElement websiteEbookDDFirst;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement saveAndContinue;

    @FindBy(xpath = "//div[@class='right']/button")
    private WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'Select all attributes')]")
    private WebElement selectAllAttributesTitle;

    @FindBy(xpath = "//*[text()='Attribute']")
    private WebElement attributeButton;

    @FindBy(xpath = "//button[text()='Add attribute']")
    private WebElement addAttributeButton;

    @FindBy(xpath = "//li[text()='Accessibility']")
    private WebElement accessibilityDD;

    @FindBy(xpath = "//span[text()='medical device support']/..")
    private WebElement medicalDeviceSupportCB;

    @FindBy(name = "infoUrl")
    private WebElement moreInfoURL_Box;

    @FindBy(xpath = "//h2[contains(text(),'If I make this')]")
    private WebElement categoriesTitle;

    @FindBy(xpath = "//button[@class='drop-btn']")
    private WebElement categoriesDD;

    @FindBy(id = "Clothing")
    private WebElement categoriesOptionsClothing;

    @FindBy(id = "Accessories")
    private WebElement categoriesOptionsAccessories;

    @FindBy(xpath = "//button[contains(text(),'Bag')]")
    private WebElement categoriesOptionsAccessories_Bag;

    @FindBy(xpath = "//button[contains(text(),'Backpack')]")
    private WebElement categoriesOptionsAccessories_Backpack;

    @FindBy(xpath = "//button[contains(text(),'Dress')]")
    private WebElement categoriesOptionsClothing_Dress;

    @FindBy(xpath = "//button[contains(text(),'Belt')]")
    private WebElement categoriesOptionsClothing_Belt;

    @FindBy(xpath = "//button[contains(@aria-label,\"click to remove attribute\")]")
    private WebElement categoriesDeleteIcon;

    @FindBy(xpath = "//button[text()='Add category']")
    private WebElement addCategoryButton;


    @FindBy(xpath = "//div[@class='single-attribute']")
    private WebElement selectedCard;

    @FindBy(xpath = "//*[contains(text(),'Pattern Nitty Gritty')]")
    private WebElement nittyGrittyTitle;

    @FindBy(xpath = "//input[@name='primaryNeedleSize']/..")
    private WebElement primaryNeedleSize;

    @FindBy(xpath = "//input[@name='primaryHookSize']/..")
    private WebElement primaryHookSize;

    @FindBy(xpath = "//p[text()='Add Hook']/..")
    private WebElement addHookButton;


    @FindBy(xpath = "//input[@name='secondaryHookSizes.0.hookSize']")
    private WebElement secondaryHookSize;

    @FindBy(xpath = "//button[@title='Remove Hook']")
    private WebElement removeHookButton;

    @FindBy(xpath = "//input[@name='primaryYarn']")
    private WebElement primaryYarn;

    @FindBy(xpath = "//label[contains(text(),'Primary Yarn Weight')]")
    private WebElement primaryYarnWeightLabel;

    @FindBy(xpath = "//*[contains(text(),'Yarn Not Found')]")
    private WebElement yarnNotFound;

    @FindBy(xpath = "(//*[contains(text(),'Add Yarn')])[2]")
    private WebElement addYarnButton;

    @FindBy(xpath = "//button[@class='close-icon-btn']")
    private WebElement closeIconNewYarn;

    @FindBy(xpath = "//p[contains(text(),'You are adding new yarn to database')]")
    private WebElement popUpYarnTitle;


    @FindBy(id = "myInputFile")
    private WebElement uploadFile;

    @FindBy(xpath = "//div[@class='edit-icon-cover']")
    private WebElement editIcon;

    @FindBy(xpath = "//li[text()='Remove']")
    private WebElement removeOption;


    @FindBy(xpath = "//div[contains(text(),' size upto 3MB.')]")
    private WebElement fileSizeError;

    @FindBy(xpath = "//input[@name='Name']")
    private WebElement yarnName;

    @FindBy(xpath = "//p[contains(text(),'Yarn name is required')]")
    private WebElement yearnNameMandatory;

    @FindBy(xpath = "//p[text()='Length is required']")
    private WebElement lengthMandatoryError;

    @FindBy(xpath = "//div[text()='Yarn Weight']")
    private WebElement yarnWeight;

    @FindBy(xpath = "//p[contains(text(),'Weight is')]")
    private WebElement yearnWeightMandatory;

    @FindBy(xpath = "//input[@name='Yardage']")
    private WebElement yardageLength;

    @FindBy(xpath = "//h6[text()='Wraps per inch']")
    private WebElement WPIType;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//input[@name='CompanyName']")
    private WebElement yarnBrand;

    @FindBy(xpath = "//*[contains(text(),'ABC Wools 8 ply cotton')]")
    private WebElement yarnDDOptions;

    @FindBy(xpath = "//*[text()='Gauge']")
    private WebElement gauge_h5;

    @FindBy(name = "gauges.0.gauge")
    private WebElement stitches_input;

    @FindBy(name = "gauges.0.rowGauge")
    private WebElement rowPound_input;

    @FindBy(name = "gauges.0.gaugeDivisor")
    private WebElement measurementInGauge_input;

    @FindBy(name = "gauges.0.gaugeDivisor")
    private WebElement patternInGauge_input;

    @FindBy(xpath = "//h5[text()='Total yarn for pattern']")
    private WebElement totalYarnForPattern;

    @FindBy(name = "between")
    private WebElement between_input;

    @FindBy(name = "meterage")
    private WebElement meterage_Input;

    @FindBy(name = "and")
    private WebElement and_Input;

    @FindBy(name = "meterageMax")
    private WebElement meterageMax_Input;

    @FindBy(xpath = "//input[@name='yards']/..")
    private WebElement unitDD;

    @FindBy(xpath = "//input[@name='YardageUnit']/..")
    private WebElement yardageUnit;

    @FindBy(xpath = "//ul[@role='listbox']")
    private List<WebElement> unitDDOptions;


    @FindBy(xpath = "//ul[@role='listbox']/li")
    private List<WebElement> unitAllOptions;


    @FindBy(xpath = "//li[text()='Yards']")
    private WebElement yardsDD;

    @FindBy(xpath = "//h5[text()='Available sizes for this pattern']")
    private WebElement availableSizePatternTitle;

    @FindBy(xpath = "//span[text()='Adult']")
    private WebElement adultCB;

    @FindBy(xpath = "//span[text()='6-8 yrs']")
    private WebElement sixToEightCB;


    @FindBy(xpath = "//h5[text()='Needle size']")
    private WebElement needleSize_h5;

    @FindBy(xpath = "//input[@name='secondaryNeedleSizes.0.needleSize']/..")
    private WebElement additionalNeedleSize_input;

    @FindBy(xpath = "//h5[text()='Additional Needle Size']")
    private WebElement additionalNeedleSize_h5;

    @FindBy(xpath = "//h5[text()='Primary Needle Size']")
    private WebElement primaryNeedleSize_h5;

    @FindBy(xpath = "//p[contains(text(),'Needle size is required')]")
    private WebElement needleSizeMandatory;

    @FindBy(xpath = "//p[contains(text(),'Yarn is required')]")
    private WebElement primaryYarnMandatory;


    @FindBy(xpath = "//li[contains(text(),'US')]")
    private List<WebElement> primaryNeedleSizeDD;

    @FindBy(xpath = "//p[text()='Add Needle']")
    private WebElement addNeedleButton;

    @FindBy(xpath = "//input[@name='secondaryNeedleSizes.0.needleSize']/..")
    private WebElement additionalNeedleSize;

    @FindBy(xpath = "//*[contains(text(),'Available languages')]")
    private WebElement availableLanguages_Title;

    @FindBy(xpath = "//*[contains(text(),'Gallery')]")
    private WebElement gallery_h5;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement choosePhoto_input;

    @FindBy(xpath = "//button[text()='Add detail']")
    private WebElement addDetailButton;

    @FindBy(xpath = "//h5[text()='Add Details']")
    private WebElement addDetails_h5;

    @FindBy(xpath = "//input[@name='copyright']/..")
    private WebElement addCopyrightOwner;

    @FindBy(xpath = "//input[@name='caption']")
    private WebElement caption_altText;

    @FindBy(xpath = "//button[text()='Delete Photo']")
    private WebElement deletePhotoButton;

    @FindBy(xpath = "(//input[contains(@class,'PrivateSwitchBase-input')])[1]/..")
    private WebElement deletePhoto_CB1;


    @FindBy(xpath = "(//input[contains(@class,'PrivateSwitchBase-input')])[4]/..")
    private WebElement deleteFile_CB1;

    @FindBy(xpath = "//button[contains(text(),'Remove Files From')]")
    private WebElement removeFileButton;

    @FindBy(xpath = "(//input[contains(@class,'PrivateSwitchBase-input') and @type='checkbox'])[3]")
    private WebElement deletePhoto_CBForEtsy;

    @FindBy(xpath = "//button[text()='Remove Photos']")
    private WebElement removePhotosButton;

    @FindBy(xpath = "//button[contains(text(),'Remove Photo')]")
    private WebElement removePhotosButtonEtsy;

    @FindBy(xpath = "//h3[text()='No added photos']")
    private WebElement noAddedPhotos;

    @FindBy(xpath = "//button[contains(text(),'Add Photo From')]")
    private WebElement addPhotoFrom_Button;

    @FindBy(xpath = "(//button[contains(text(),'Add Photo From')])[2]")
    private WebElement addPhotoFrom_ButtonEtsy;

    @FindBy(xpath = "//button[text()='Save all']")
    private WebElement saveAllButton;

    @FindBy(xpath = "//*[@data-testid=\"CloseIcon\"]")
    private WebElement closeIcon;

    @FindBy(xpath = "//*[contains(text(),\"Files\")]")
    private WebElement files_h5;

    @FindBy(xpath = "//h5[text()='Descriptive Text']")
    private WebElement descriptiveText_h5;

    @FindBy(name = "textarea")
    private WebElement descriptiveText_textarea;

    @FindBy(xpath = "//Input[contains(@aria-activedescendant,'option')]")
    private List<WebElement> ddOptions;

    @FindBy(xpath = "//h5[text()='Etsy Details']")
    private WebElement etsyTitle;

    @FindBy(xpath = "//button[text()='Etsy']")
    private WebElement etsyTabButton;

    @FindBy(xpath = "(//button[@role=\"tab\"])[7]")
    private WebElement fileLibraryButton;

    @FindBy(xpath = "//textarea[@name='patternName']")
    private WebElement patternName_input;

    @FindBy(xpath = "//div[@class='single-photo-content']")
    private WebElement photoContent;

    @FindBy(xpath = "//h5[text()='Description']")
    private WebElement descriptionTitle;

    @FindBy(xpath = "//h5[text()='Notes / Description']")
    private WebElement descriptionOnRavelry;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement etsyNoteDescription;

    @FindBy(xpath = "//h5[text()='Price']")
    private WebElement priceTitle;

    @FindBy(xpath = "//*[text()='Free']")
    private WebElement isFree_CB;

    @FindBy(xpath = "//span[text()='Free pdf download']")
    private WebElement freePdfDownload_CB;

    @FindBy(xpath = "//span[text()='Pattern available online']")
    private WebElement patternAvailableOnline_CB;

    @FindBy(xpath = "//input[@name='patternLink']")
    private WebElement patternLink_input;

    @FindBy(xpath = "//*[text()='Paid']")
    private WebElement isPaid_CB;

    @FindBy(xpath = "//label[text()='Select language']")
    private WebElement selectLanguage_label;

    @FindBy(xpath = "//input[@name='files.0.fileLanguage']")
    private WebElement fileLanguage_input;

    @FindBy(xpath = "//li[text()='English']")
    private WebElement english_li;

    @FindBy(xpath = "//input[@name='price']")
    private WebElement ravelryPrice;

    @FindBy(xpath = "//button[text()='Preview Description']")
    private WebElement previewDescriptionButton;

    @FindBy(xpath = "(//h5[text()='Description'])[2]")
    private WebElement descriptionPopupTitle;

    @FindBy(xpath = "//h5[text()='Description']")
    private WebElement description_h5;

    @FindBy(xpath = "//h5[text()='Renewal Options']")
    private WebElement renewalOptions_h5;

    @FindBy(xpath = "//h5[text()='Sections']")
    private WebElement sections_h5;


    @FindBy(xpath = "//h5[text()='Files']")
    private WebElement fileSection_h5;

    @FindBy(xpath = "//*[text()='Shop Section']")
    private WebElement shopSection_h5;

    @FindBy(xpath = "//*[@name='shopSection']/..")
    private WebElement shopSection_DD;

    @FindBy(xpath = "//div[text()='Cowls']/..")
    private WebElement cowlsOption;

    @FindBy(xpath = "//*[text()='Quantity']")
    private WebElement quantity_input;

    @FindBy(xpath = "//*[@name='quantity']/..")
    private WebElement quantity_TF;

    @FindBy(xpath = "//input[@id=':r40:']")
    private WebElement quantityFile_TF;

    @FindBy(xpath = "//*[text()='Price']")
    private WebElement price_input;

    @FindBy(xpath = "//*[@name='price']/..")
    private WebElement price_TF;

    @FindBy(xpath = "//p[text()='USD']")
    private WebElement currency_input;

    @FindBy(xpath = "//*[@name='tagToAdd']")
    private WebElement tagToAdd_input;

    @FindBy(xpath = "//*[@name='tagToAdd']/..")
    private WebElement addTagButton;

    @FindBy(xpath = "//button[@aria-label='add']")
    private WebElement plusButton;

    @FindBy(xpath = "//span[text()='Dress']")
    private WebElement verifyTag;

    @FindBy(xpath = "//ul[@class='files-list']")
    private List<WebElement> filesList;

    @FindBy(xpath = "//*[contains(@class,'MuiChip-deleteIcon')]")
    private WebElement tagDeleteIcon;

    @FindBy(name = "renewalOption")
    private List<WebElement> renewalOptions_Radio;

    @FindBy(xpath = "//p[text()='Manual']/../h6")
    private WebElement manual_ExpriyDate;

    @FindBy(xpath = "//button[text()='Save Draft']")
    private WebElement saveDraftButton;

    @FindBy(xpath = "//div[text()='Pattern created successfully']")
    private WebElement patternCreatedSuccessfully;

    @FindBy(xpath = "//button[text()='Refresh Etsy Shop']")
    private WebElement refreshEtsyShopButton;

    @FindBy(xpath = "//button[text()='Publish to Etsy']")
    private WebElement publishToEtsyButton;

    @FindBy(xpath = "//button[text()='Publish to Ravelry']")
    private WebElement publishToRavelryButton;


    @FindBy(xpath = "//h6[text()='Price is required']")
    private WebElement priceRequired;

    @FindBy(xpath = "//div[text()='At least one file is required']")
    private WebElement fileRequired;

    @FindBy(xpath = "//button[text()='Ravelry']")
    private WebElement ravelryDetailsButton;

    @FindBy(xpath = "//button[text()='Add From File Library']")
    private WebElement addFromFileLibraryButton;

    @FindBy(xpath = "(//button[text()='Add From File Library'])[2]")
    private WebElement addFromFileLibraryPopupButton;

    @FindBy(xpath = "//input[@name='ravelryBusinessId']/..")
    private WebElement ravelryBusinessId_input;

    @FindBy(xpath = "//li[text()='gosadi']")
    private WebElement gosadi_li;

    @FindBy(xpath = "//input[@name='ravelryProductId']/..")
    private WebElement ravelryProductId_input;

    @FindBy(xpath = "//p[contains(text(),'Unit is')]")
    private WebElement unitFieldRequired;

    @FindBy(xpath = "//input[@name='Texture']")
    private WebElement texture_input;

    @FindBy(xpath = "//h5[text()='Add a fiber']/..")
    private WebElement addFiber_Link;

    @FindBy(xpath = "//div[contains(text(),'percentage limit achieved')]")
    private WebElement fiberContentError;


    @FindBy(xpath = "(//button[contains(@class,'css-1yxmbwk')])[2]")
    private WebElement deleteFiber;

    //M New



    @FindBy(xpath = "//input[@name=\"MinHookSize\"]/..")
    private WebElement minHookRange;

    @FindBy(xpath = "//ul[@role=\"listbox\"]")
    private WebElement hookRangeDropDown;

    @FindBy(xpath = "//input[@name=\"MaxHookSize\"]/..")
    private WebElement maxHookRange;

    @FindBy(xpath = "(//li[@role=\"option\"])[2]")
    private WebElement minHookRangeDropDownOption;

    @FindBy(xpath = "(//li[@role=\"option\"])[3]")
    private WebElement maxHookRangeDropDownOption;

    @FindBy(xpath = "//li[@role=\"option\"]")
    private List<WebElement> hookRangeDropDownOption;

    @FindBy(xpath="//p[contains(text(),'Hook size range should be different')]")
    private WebElement sameHookRange;

    @FindBy(xpath = "(//li[@role=\"option\"])[5]")
    private WebElement maxValueFromMinHookRange;

    @FindBy(xpath = "(//li[@role=\"option\"])[4]")
    private WebElement minValueFromMaxHookRange;

    @FindBy(xpath = "//p[contains(text(),'Min hook should be less than max hook')]")
    private WebElement hookRangeValidationMessage;

    @FindBy(xpath = "//p[contains(text(),'Needle size range should be different')]")
    private WebElement sameNeedleRangeValidation;

    @FindBy(xpath = "//p[contains(text(),'Min needle should be less than max needle')]")
    private WebElement NeedleRangeValidationMessage;
    @FindBy(xpath = "//input[@name=\"MinNeedleSize\"]/..")
    private WebElement minNeedleRange;

    @FindBy(xpath = "//input[@name=\"MaxNeedleSize\"]/..")
    private WebElement maxNeedleRange;

    @FindBy(xpath = "//input[@name=\"ColorCardURL\"]")
    private WebElement colorCardURInput;

    @FindBy(xpath = "//p[contains(text(),'Please enter url in correct format')]")
    private WebElement colorCardValidationMessage;

    @FindBy(xpath = "//input[@name=\"Aliases\"]")
    private WebElement aliasesInputField;

    // M 30 Jan

    @FindBy(xpath = "//input[@name=\"Gauge\"]/..")
    private WebElement gaugeRangeField;

    @FindBy(xpath = "(//input[@id=\"Gauge\"]/../div)[1]")
    private WebElement getGaugeRangeFieldValue;
    @FindBy(xpath = "//input[@name=\"GaugeMin\"]")
    private WebElement minGaugeRange;

    @FindBy(xpath = "//input[@name=\"GaugeMax\"]")
    private WebElement maxGaugeRange;

    @FindBy(xpath = "//ul[@role=\"listbox\"]")
    private WebElement gaugeRangeDropDown;

    @FindBy(xpath = "(//p[contains(text(),\"Gauge range should be different\")])[1]")
    private WebElement sameGaugeRangeValidation;

    @FindBy(xpath = "//p[contains(text(),\"Gauge max should be more than Gauge min\")]")
    private WebElement maxGaugeRangeValidation;

    @FindBy(xpath = "//input[@name=\"IsMachineWash\"]/..")
    private WebElement machineWashCheckBox;

    @FindBy(xpath = "//span[contains(@class,'Mui-checked MuiCheckbox-root')]")
    private WebElement checkedMachineCheckBox;

    // M start 2 Feb

    @FindBy(xpath = "//*[contains(text(),'Universal Yarn')]")
    private WebElement universalYarn;

    @FindBy(xpath = "(//*[contains(@class,'color-green ')])[3]")
    private WebElement yarnBrandGreenTick;

    @FindBy(xpath = "//p[contains(text(),'Brand name is required')]")
    private WebElement brandNameRequired;

    @FindBy(xpath = "//div[@class='single-photo have-button']")
    private WebElement imageUploaded;

    @FindBy(xpath = "//*[contains(text(),\"Files\")]")
    private WebElement files;

    @FindBy(xpath = "//li[@class=\"single-file \"]")
    private WebElement fileCard;

    @FindBy(xpath = "//input[contains(@class,'PrivateSwitchBase-input') and @type='checkbox']/..")
    private WebElement fileCheckbox;

    @FindBy(xpath = "//*[contains(@class,'pdf-icon')]")
    private WebElement pdfButton;

    @FindBy(xpath = "//button[text()=\"Click here to view\"]")
    private WebElement clickHereToView;
// 8 feb

    @FindBy(xpath = "//button[text()=\"Click here to view\"]/preceding-sibling::p")
    private WebElement pdfName;

    @FindBy(xpath = "//*[contains(text(),'Gauge Min - Max')]")
    private WebElement gaugeFieldNonMandatory;

    @FindBy(xpath = "//span[text()=\"Machine Wash?\"]")
    private WebElement isMachineCheckBoxMandatory;

    @FindBy(xpath = "(//*[contains(text(),'Color card URL')])[1]")
    private WebElement isColorCardUrlMandatory;

    @FindBy(xpath = "(//*[contains(text(),'Aliases ?')])[1]")
    private WebElement isAliasesMandatory;





    //M end

    //P new
    @FindBy(xpath = "//button[@aria-label=\"add category\"]")
    private WebElement categoryDropdown;

    @FindBy(xpath = "//li[@class='has-sub-listing']")
    private List<WebElement> categoryOptionList;

    @FindBy(xpath = "//input[@placeholder='Search Category']")
    private WebElement searchInputField;

    @FindBy(xpath = "//div[contains(@class,'Mui-expanded Mui-focused')]/div/div/input[@value='Components']")
    private WebElement matchingOption;

    @FindBy(xpath = "//li[@id='Components']/ul")
    private WebElement subCategory;

    @FindBy(id = "Components")
    private WebElement componentsCategory;

    @FindBy(xpath = "//input[@name='WIG']")
    private WebElement weightField;

    @FindBy(xpath = "//input[@name='Fiber[0].FiberName']/..")
    private WebElement fiberDropdown;

    @FindBy(xpath = "//li[text()='Test']")
    private List<WebElement> fiberDropdownOption;

    @FindBy(xpath = "//input[@name='Fiber[0].Percentage']")
    private WebElement fiberPercentage;

    @FindBy(xpath = "//p[text()='Fiber is required']")
    private WebElement fiberRequired;

    @FindBy(xpath = "//p[contains(text(),'percentage should be 1')]")
    private WebElement percentageShouldBe1;

    @FindBy(xpath = "//ul[contains(@class,'MuiMenu-list')]")
    private WebElement yarnWeightOptions;

    @FindBy(xpath = "(//li[@role='option'])[1]")
    private WebElement yarnWeightOption;

    @FindBy(xpath = "//input[@name=\"WeightName\"]/preceding-sibling ::div")
    private WebElement yarnWeightSelected;

    @FindBy(xpath = "//input[@name='WeightName']/..")
    private WebElement weightYarn;

    @FindBy(xpath = "//p[contains(text(),'Weight is')]")
    private WebElement yarnWeightRequired;

    @FindBy(xpath = "//*[contains(@class,'color-green ')]")
    private WebElement greenTick;


    @FindBy(xpath = "//input[@name='WPIType']/..")
    private WebElement wrapsPerInch;

    @FindBy(xpath = "(//li[@role='option'])[1]")
    private WebElement wrapsPerInchValue;

    @FindBy(xpath = "(//li[@role='option'])[2]")
    private WebElement wrapsPerInchValue2;

    @FindBy(xpath = "//ul[@role='listbox']")
    private WebElement wrapsList;

    @FindBy(xpath = "//p[contains(text(),'WPI is required')]")
    private WebElement wpiRequired;

    @FindBy(xpath = "//input[@name='WPIType2']")
    private WebElement wpiUnit;

    //P End
    @FindBy(xpath = "(//button[@role=\"tab\"])[6]")
    private WebElement photoGalleryTab;

    @FindBy(xpath = "//div[@class='single-photo-content']")
    private WebElement photoDivVisible;
    //R Started
    @FindBy(xpath = "//p[contains(text(),'Yarn name is required')]")
    private WebElement yarnNameRequired;

    @FindBy(xpath = "//input[@role='combobox']")
    private WebElement yarnBrandAutoSearch;

    //R Ended


    public Manage_Products checkRefreshEtsyShopButton() {
        if (iselementVisible(refreshEtsyShopButton)) {
            clickOnWebElement(refreshEtsyShopButton);
            LOG.Reporter("Click on Refresh Etsy Shop Button");
            holdForElement(30);
            waitForVisibility(createProduct);
            clickOnWebElement(createProduct);
            LOG.Reporter("Click on Create Product Button");

        } else {
            LOG.Reporter("Refresh Etsy Shop Button is not visible");
        }
        return this;
    }

    public void click_ManageProductsTab() {
        clickOnWebElement(manageProductsTab);
        LOG.Reporter("Click on Manage Products tab ");

    }

    public Manage_Products gotoCreateProduct() {
        try {
            iselementVisible(manageProductsTab, second10TimeOut);
            click_ManageProductsTab();
            Assert.assertTrue(iselementVisible(createProduct));
            clickOnWebElement(createProduct);
            LOG.Reporter("Click on Create Product tab ");
            verifyTitleOfManageProductsPage();
        } catch (Exception e) {
            reTryGoToCreateProduct();
            LOG.Reporter("Error occurred ");
        }
        return this;
    }

    public void reTryGoToCreateProduct() {
        click_ManageProductsTab();
        Assert.assertTrue(iselementVisible(createProduct));
        clickOnWebElement(createProduct);
        LOG.Reporter("Click on Create Product tab ");
        verifyTitleOfManageProductsPage();

    }

    public Manage_Products gotoProductLibrary() {
        click_ManageProductsTab();
        Assert.assertTrue(iselementVisible(productLibrary));
        clickByAction(productLibrary);
        LOG.Reporter("Click on Product Library tab ");
        return this;
    }

    public void verifyTitleOfManageProductsPage() {
        String title = getText(createNewProductTitle);
        Assert.assertEquals(title, "Create New Product");
        LOG.Reporter("Verify title of Manage Products page :: " + title);
    }

    public Manage_Products verifyCreateNewProductAllOptions() {
        Assert.assertTrue(iselementVisible(knitting, second10TimeOut));
        LOG.Reporter("Verify Create New Product All Options :: " + knitting.getText());
        Assert.assertTrue(iselementVisible(loom_Knitting, second10TimeOut));
        LOG.Reporter("Verify Create New Product All Options :: " + loom_Knitting.getText());
        Assert.assertTrue(iselementVisible(machine_Knitting, second10TimeOut));
        LOG.Reporter("Verify Create New Product All Options :: " + machine_Knitting.getText());
        Assert.assertTrue(iselementVisible(crochet, second10TimeOut));
        LOG.Reporter("Verify Create New Product All Options :: " + crochet.getText());
        Assert.assertTrue(iselementVisible(tunisian_Crochet, second10TimeOut));
        LOG.Reporter("Verify Create New Product All Options :: " + tunisian_Crochet.getText());
        return this;
    }

    public Manage_Products verifyKnittingTextOptions() {
        clickOnWebElement(knitting);
        LOG.Reporter("Click on Knitting :: " + knitting.getText());
        sendKeys(patternName, "Test_Thread");
        LOG.Reporter("Send Pattern Name :: " + patternName.getAttribute("value"));
        return this;
    }

    public Manage_Products verifyPatternNameMandatory() {
        clickOnWebElement(knitting);
        LOG.Reporter("Click on Knitting :: " + knitting.getText());
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("Click on Save and Continue :: " + saveAndContinue.getText());
        Assert.assertTrue(iselementVisible(patternNameRequired, second10TimeOut));
        String mandatory = getText(patternNameRequired);
        String expected = "Pattern name is required";
        Assert.assertEquals(mandatory, expected);
        LOG.Reporter("Verify Pattern Name Mandatory :: " + patternNameRequired.getText());
        return this;
    }

    public Manage_Products verifyPatternLevelMandatory() {
        clickOnWebElement(knitting);
        LOG.Reporter("Click on Knitting :: " + knitting.getText());
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("Click on Save and Continue :: " + saveAndContinue.getText());
        Assert.assertTrue(iselementVisible(patternLevelRequired, second10TimeOut));
        String mandatory = getText(patternLevelRequired);
        String expected = "Skill level is required";
        Assert.assertEquals(mandatory, expected);
        LOG.Reporter("Verify Pattern level Mandatory :: " + patternLevelRequired.getText());
        return this;
    }

    public Manage_Products verifyPublishedMonthMandatory() {
        clickOnWebElement(knitting);
        LOG.Reporter("Click on Knitting :: " + knitting.getText());
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("Click on Save and Continue :: " + saveAndContinue.getText());
        Assert.assertTrue(iselementVisible(monthPublishedRequired, second10TimeOut));
        String mandatory = getText(monthPublishedRequired);
        String expected = "Published Month*";
        Assert.assertEquals(mandatory, expected);
        LOG.Reporter("Verify Published Month Mandatory :: " + monthPublishedRequired.getText());
        return this;
    }

    public Manage_Products verifySelectPublishedMonth() {
        clickOnWebElement(monthDD);
        clickOnWebElement(janMonth);
        LOG.Reporter("Select Month :: " + janMonth.getText());
        return this;
    }

    public Manage_Products verifySelectPublishedYear() {
        clickOnWebElement(yearDD);
        clickOnWebElement(year22);
        LOG.Reporter("Select Year :: " + year22.getText());
        return this;
    }

    public Manage_Products verifyMoreInfoURLbox() {
        Assert.assertTrue(iselementVisible(moreInfoURL_Box, second10TimeOut));
        sendKeys(moreInfoURL_Box, "https://www.stitchandhustle.com/free-patterns-1");
        LOG.Reporter("Send More Info URL :: " + moreInfoURL_Box.getAttribute("value"));
        return this;
    }

    public Manage_Products verifyMoreInfoURLboxOptional() {
        Assert.assertTrue(iselementVisible(moreInfoURL_Box, second10TimeOut));
        sendKeys(moreInfoURL_Box, "https://www.stitchandhustle.com/free-patterns-1");
        LOG.Reporter("Send More Info URL :: " + moreInfoURL_Box.getAttribute("value"));
        return this;
    }

    public Manage_Products clickOnKnitting() {
        waitForVisibility(knitting);
        clickOnWebElement(knitting);
        LOG.Reporter("Click on Knitting :: " + knitting.getText());
        return this;
    }

    public Manage_Products clickOnCrochet() {
        waitForVisibility(knitting);
        clickOnWebElement(crochet);
        LOG.Reporter("Click on Loom crochet :: " + crochet.getText());
        return this;
    }

    public Manage_Products clickOnLoom_Knitting() {
        clickOnWebElement(loom_Knitting);
        LOG.Reporter("Click on Loom Knitting :: " + loom_Knitting.getText());
        return this;
    }

    public Manage_Products clickOnMachine_Knitting() {
        clickOnWebElement(machine_Knitting);
        LOG.Reporter("Click on Machine Knitting :: " + machine_Knitting.getText());
        return this;
    }

    public Manage_Products verifyBuildPatternTitle() {
        String title = getText(buildPatternTitle);
        Assert.assertEquals(title, "Let's build a pattern!");
        LOG.Reporter("Verify Build Pattern Title :: " + title);

        return this;

    }

    public Manage_Products enteringAllDataInPatternDetails() {
        enterAllDataInPatternDetails();
        verifyPublishInPrintCB();
        return this;
    }

    public void enterAllDataInPatternDetails() {
        sendKeys(patternName, "Testing");
        generateRandomCharacter(patternName);
        LOG.Reporter("Send Pattern Name :: " + patternName.getAttribute("value"));
        clickOnWebElement(skillLevelDD);
        clickOnWebElement(advancedBeginnerOption);
        LOG.Reporter("Select Skill Level :: " + advancedBeginnerOption.getText());
        clickOnWebElement(monthDD);
        clickOnWebElement(janMonth);
        LOG.Reporter("Select Month :: " + janMonth.getText());
        clickOnWebElement(yearDD);
        clickOnWebElement(year22);
        LOG.Reporter("Select Year :: " + year22.getText());

    }

    public void verifyPublishInPrintCB() {
        clickOnWebElement(availableOnSC);
        LOG.Reporter("Select available on a Selling Channel :: " + availableOnSC.getText());
        if (iselementVisible(etsyCb, second10TimeOut)) {
            clickOnWebElement(etsyCb);
            LOG.Reporter("Select Etsy :: " + etsyCb.getText());
            clickOnWebElement(etsyStoreDD);
            clickByAction(listOFEtsyDD);
            LOG.Reporter("Select Etsy Store options from dropdown:: " + listOFEtsyDD.getText());
        } else {
            clickOnWebElement(saveAndContinue);
            LOG.Reporter("Clicked on Save and continue ");
        }
    }

    public void verifyInPrintCBFlow() {
        clickOnWebElement(InPrintCB);
        LOG.Reporter("Select In Print checkbox ");
        Assert.assertTrue(iselementEnable(InPrintCB, second10TimeOut));
        sendKeys(publicationNameDD_Input, "ABC");
        holdForElement(3);
        clickByJSE(publication_NameOptions);
        LOG.Reporter("Selected Publication Name from dropdown ");
    }


    public Manage_Products verifyINPRINT_CB() {
        enterAllDataInPatternDetails();
        verifyInPrintCBFlow();
        return this;
    }

    public Manage_Products publicationNameMandatory() {
        clickOnWebElement(InPrintCB);
        LOG.Reporter("Select In Print checkbox ");
        Assert.assertTrue(iselementEnable(InPrintCB, second10TimeOut));
        clickOnWebElement(publicationNameDD_InPrintCB);
        String mandatory = getText(publicationMandatory);
        String expected = "*";
        Assert.assertEquals(mandatory, expected);
        LOG.Reporter("Verify Publication Name Mandatory :: " + publicationMandatory.getText());
        return this;
    }

    public void verifySaveAndContinueButton() {
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("Click on Save and Continue :: " + saveAndContinue.getText());
    }

    public Manage_Products verifyThatSaveAndContinueButton() {
        enterAllDataInPatternDetails();
        verifyPublishInPrintCB();
        verifySaveAndContinueButton();
        return this;
    }

    public Manage_Products NavigateToCategoriesSection() {
        verifyCategoriesSection();
        holdForElement(3);
        return this;
    }

    public void verifyCategoriesSection() {
        String expected = getText(categoriesTitle);
        Assert.assertEquals(expected, "If I make this what will I have in my hands?");
        LOG.Reporter("Verify Categories Section :: " + categoriesTitle.getText());
    }

    public void selectCategoriesOne() {
        clickOnWebElement(categoriesDD);
        LOG.Reporter("Clicked on categories dropdown");
        clickOnWebElement(categoriesOptionsClothing);
        LOG.Reporter("Clicked on categories options Clothing");
        clickOnWebElement(categoriesOptionsClothing_Dress);
        LOG.Reporter("Clicked on categories options Clothing>Dress");
    }

    public void selectCategoriesTwo() {
        clickOnWebElement(categoriesDD);
        LOG.Reporter("Clicked on categories dropdown");
        clickOnWebElement(categoriesOptionsAccessories);
        LOG.Reporter("Clicked on categories options Accessories");
        clickOnWebElement(categoriesOptionsClothing_Belt);
        LOG.Reporter("Clicked on categories options Accessories>Belt");
    }

    public Manage_Products verifyNavigationOnNittyGritty() {
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("Clicked on Save and Continue");
        waitForVisibility(nittyGrittyTitle);
        Assert.assertTrue(iselementVisible(nittyGrittyTitle, second10TimeOut));
        LOG.Reporter("Verified Nitty Gritty Section is displayed");
        return this;
    }

    public Manage_Products verifyAllOptionsOfNittyGrittyTab() {
        Assert.assertTrue(iselementVisible(primaryNeedleSize, second10TimeOut));
        LOG.Reporter("Verified Primary Needle Size");
        Assert.assertTrue(iselementVisible(primaryYarn, second10TimeOut));
        LOG.Reporter("Verified Primary Yarn");
        scrollByVisibilityOfElement(driver, gauge_h5);
        Assert.assertTrue(iselementVisible(gauge_h5, second10TimeOut));
        LOG.Reporter("Verified Gauge");
        scrollByVisibilityOfElement(driver, totalYarnForPattern);
        Assert.assertTrue(iselementVisible(totalYarnForPattern, second10TimeOut));
        LOG.Reporter("Verified Total Yarn For Pattern");
        scrollByVisibilityOfElement(driver, saveAndContinue);
        Assert.assertTrue(iselementVisible(saveAndContinue, second10TimeOut));
        LOG.Reporter("Verified Save and Continue");
        return this;
    }

    public void verifyCategoriesSectionCrossIcon() {
        selectCategoriesOne();
        waitForVisibility(categoriesDeleteIcon);
        clickOnWebElement(categoriesDeleteIcon);
        LOG.Reporter("Clicked on categories delete icon");
        Assert.assertFalse(iselementVisible(selectedCard, second10TimeOut));
        LOG.Reporter("Verify that selected card is deleted");
    }

    public Manage_Products verifyTwoCategoriesSelected() {
        selectCategoriesOne();
        waitForVisibility(selectedCard);
        Assert.assertTrue(iselementVisible(selectedCard, second10TimeOut));
        LOG.Reporter("Verify that selected card is displayed");
        selectCategoriesTwo();
        waitForVisibility(selectedCard);
        Assert.assertTrue(iselementVisible(selectedCard, second10TimeOut));
        LOG.Reporter("Verify that selected card is displayed");
        return this;
    }

    public Manage_Products verifySubCategoryThenSubCategorySection() {
        clickOnWebElement(categoriesDD);
        LOG.Reporter("Clicked on categories dropdown");
        clickOnWebElement(categoriesOptionsAccessories);
        LOG.Reporter("Clicked on categories options Clothing");
        clickOnWebElement(categoriesOptionsAccessories_Bag);
        LOG.Reporter("Clicked on categories options Accessories>Bag");
        clickOnWebElement(categoriesOptionsAccessories_Backpack);
        LOG.Reporter("Clicked on categories options Accessories>Bag>Backpack");
        return this;
    }

    public Manage_Products verifyAddCategoryButton() {
        clickOnWebElement(addCategoryButton);
        LOG.Reporter("Clicked on add category button");
        Assert.assertTrue(iselementVisible(categoriesOptionsAccessories));
        LOG.Reporter("Verified categories options are displayed");
        return this;
    }

    public Manage_Products verifyCategoriesSection_SaveAndContinue() {
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("Clicked on Save and Continue");
        waitForVisibility(nittyGrittyTitle);
        Assert.assertTrue(iselementVisible(nittyGrittyTitle, second10TimeOut));
        LOG.Reporter("Verified Nitty Gritty Section is displayed");
        return this;
    }

    public Manage_Products verifyNittyGrittyMandatoryFields() {
        scrollByVisibilityOfElement(driver, saveAndContinue);
        clickOnWebElement(saveAndContinue);
        scrollByVisibilityOfElement(driver, needleSizeMandatory);
        Assert.assertTrue(iselementVisible(needleSizeMandatory, second10TimeOut));
        LOG.Reporter("Verify Needle Size Mandatory :: " + needleSizeMandatory.getText());
        Assert.assertTrue(iselementVisible(primaryYarnMandatory, second10TimeOut));
        LOG.Reporter("Verify Primary Yarn Mandatory :: " + primaryYarnMandatory.getText());
        return this;
    }

    public Manage_Products verifyNittyGritty_NeedleSizeDropDownOptions() {
        waitForVisibility(primaryNeedleSize);
        clickOnWebElement(primaryNeedleSize);
        getPrimaryNeedleSizeDropDownOptions(primaryNeedleSizeDD);
        return this;
    }

    public Manage_Products verifyNittyGritty_PrimeryHookSizeDropDownOptions() {
        clickOnWebElement(primaryHookSize);
        getPrimaryNeedleSizeDropDownOptions(primaryNeedleSizeDD);
        return this;
    }

    public Manage_Products verifyAddHookButton() {
        clickOnWebElement(addHookButton);
        LOG.Reporter("Clicked on add hook button");
        getPrimaryNeedleSizeDropDownOptions(primaryNeedleSizeDD);

        return this;
    }

    public Manage_Products verifyAddMultipleHooksAndRemoved() {
        clickOnWebElement(addHookButton);
        LOG.Reporter("Clicked on add hook button");
        getPrimaryNeedleSizeDropDownOptions(primaryNeedleSizeDD);
        clickOnWebElement(removeHookButton);
        LOG.Reporter("Clicked on remove hook button");

        return this;
    }


    public Manage_Products verifyAddNeedleSizeButton() {
        clickOnWebElement(addNeedleButton);
        LOG.Reporter("Clicked on add needle button");
        clickOnWebElement(additionalNeedleSize);
        getPrimaryNeedleSizeDropDownOptions(primaryNeedleSizeDD);
        return this;
    }

    public void getPrimaryNeedleSizeDropDownOptions(List<WebElement> element) {
        for (int i = 0; i < element.size(); i++) {
            if (i == 2) {
                clickOnWebElement(element.get(i));
                LOG.Reporter("Select Primary Needle Size :: " + primaryNeedleSizeDD.get(i).getText());
            }
        }
    }

    public void getHookSizeDropDownOptions(List<WebElement> element) {
        clickOnWebElement(secondaryHookSize);
        for (int i = 0; i < element.size(); i++) {
            if (i == 2) {
                clickOnWebElement(element.get(i));
                LOG.Reporter("Select Primary Needle Size :: " + primaryNeedleSizeDD.get(i).getText());
            }
        }
    }

    public Manage_Products verifyNittyGritty_AddYarnOptions() {
        clickOnWebElement(primaryYarn);
        LOG.Reporter("Clicked on Primary Yarn");
        sendKeys(primaryYarn, "abc" + Keys.ARROW_DOWN + Keys.ENTER);
        clickOnWebElement(yarnDDOptions);
        LOG.Reporter("Clicked on Yarn Dropdown Options");
        Assert.assertTrue(iselementVisible(primaryYarnWeightLabel, second10TimeOut));
        LOG.Reporter("Verify Primary Yarn Weight Label :: " + primaryYarnWeightLabel.getText());
        return this;
    }

    public Manage_Products verifyNittyGritty_AddMultipleYarn() {
        clickOnWebElement(primaryYarn);
        LOG.Reporter("Clicked on Primary Yarn");
        sendKeys(primaryYarn, "  " + Keys.SPACE + Keys.SPACE);
        waitForVisibility(yarnNotFound);
        Assert.assertTrue(iselementVisible(yarnNotFound, second10TimeOut));
        LOG.Reporter("Verify Yarn Not Found :: " + yarnNotFound.getText());
        return this;
    }

    public Manage_Products verifyNittyGritty_AddYarnSuggestionPopUp() {
        clickOnWebElement(addYarnButton);
        LOG.Reporter("Clicked on Add Yarn Button");
        Assert.assertTrue(iselementVisible(popUpYarnTitle, second10TimeOut));
        LOG.Reporter("Verified Add Yarn Heading Title :: " + popUpYarnTitle.getText());
        return this;
    }

    public Manage_Products verifyParentWindowDisable() {
        if (iselementVisible(primaryHookSize)) {

            LOG.Reporter("Parent window is Enable verified");
        } else {
            LOG.Reporter("Parent window is disable verified");
        }
        return this;
    }

    public Manage_Products verifyCloseButtonOnNewYarnPopup() {
        Assert.assertTrue(iselementVisible(closeIconNewYarn));
        LOG.Reporter("Verify Close Button is displayed");
        clickOnWebElement(closeIconNewYarn);
        LOG.Reporter("Clicked on Close Button");
        return this;
    }

    public Manage_Products verifyImageUploadIconIsAccessible() {
        uploadFile.sendKeys(filePath("pic2.jpeg"));
        LOG.Reporter("Image file is uploaded successfully");
        return this;
    }

    public Manage_Products verifyImageUploadIconIsAccessible1() {
        verifyImageUploadIconIsAccessible();
        String expectedPath = "C:\\fakepath\\pic2.jpeg";
        String acutalPath = uploadFile.getAttribute("value");
        Assert.assertEquals(acutalPath, expectedPath);
        LOG.Reporter("Image file Path validated successfully");
        return this;
    }

    public Manage_Products verifyUploadedDifferentImageFormat() {
        uploadFile.sendKeys(filePath("pic2.jpeg"));
        LOG.Reporter("Image file with .jpeg uploaded successfully");
        holdForElement(4);
        removeUploadedPhoto();

        holdForElement(4);
        uploadFile.sendKeys(filePath("pic2.png"));
        LOG.Reporter("Image file with .png uploaded successfully");
        holdForElement(4);
        removeUploadedPhoto();
        holdForElement(4);
        return this;
    }

    public void removeUploadedPhoto() {
        clickOnWebElement(editIcon);
        LOG.Reporter("Clicked on Edit Icon");
        clickOnWebElement(removeOption);
        LOG.Reporter("Clicked on Remove Photo");
    }

    public Manage_Products verifyNittyGrittyAddYarnSuggestionPopUp_AllMandatoryFields() {
        clickOnWebElement(addYarnButton);
        LOG.Reporter("Clicked on Add Yarn Button");
        scrollByVisibilityOfElement(driver, submitButton);
        clickOnWebElement(submitButton);
        LOG.Reporter("Clicked on Submit Button");
        scrollByVisibilityOfElement(driver, yarnName);
        Assert.assertTrue(iselementVisible(yearnNameMandatory, second10TimeOut));
        LOG.Reporter("Verify Yarn Name Mandatory :: " + yearnNameMandatory.getText());
        Assert.assertTrue(iselementVisible(yearnWeightMandatory, second10TimeOut));
        LOG.Reporter("Verify Yarn Weight Mandatory :: " + yearnWeightMandatory.getText());
        return this;
    }

    public Manage_Products verifyEnterDataInGauge() {
        enterDataInGauge();
        return this;
    }

    public void enterDataInGauge() {
        Assert.assertTrue(iselementVisible(gauge_h5, second10TimeOut));
        LOG.Reporter("Verify Gauge:: " + gauge_h5.getText());
        scrollByVisibilityOfElement(driver, primaryYarn);
        clickOnWebElement(stitches_input);
        sendKeys(stitches_input, "11");
        LOG.Reporter("Entered Stitches:: " + stitches_input.getAttribute("value"));
        sendKeys(rowPound_input, "12");
        LOG.Reporter("Entered Yarn Weight:: " + rowPound_input.getAttribute("value"));
        sendKeys(measurementInGauge_input, "13");
        LOG.Reporter("Entered Measurement in Gauge:: " + measurementInGauge_input.getAttribute("value"));
        sendKeys(patternInGauge_input, "12");
        LOG.Reporter("Entered Pattern in Gauge:: " + patternInGauge_input.getAttribute("value"));
    }

    public void enterDataInTotalYarnPattern() {
        sendKeys(between_input, "12");
        LOG.Reporter("Entered Between:: " + between_input.getAttribute("value"));
        clickOnWebElement(unitDD);
        LOG.Reporter("Clicked on Unit Dropdown");
        clickByAction(yardsDD);
        LOG.Reporter("Selected Yards");
    }

    public void selectAvailableSizeInPattern() {
        clickOnWebElement(adultCB);
        LOG.Reporter("Clicked on Adult CB");
        clickOnWebElement(sixToEightCB);
        LOG.Reporter("Clicked on Six To Eight CB");
    }

    public Manage_Products verifyNittyGritty_SaveAndContinue() {
        enterDataInTotalYarnPattern();
        selectAvailableSizeInPattern();
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("Clicked on Save and Continue");
        return this;
    }

    public Manage_Products verifyAttributeScreen() {
        verifyAttributeScreenTitle();
        clickOnWebElement(attributeButton);
        LOG.Reporter("Clicked on Attribute Button");
        clickOnWebElement(accessibilityDD);
        LOG.Reporter("Clicked on Accessibility Dropdown");
        clickOnWebElement(medicalDeviceSupportCB);
        LOG.Reporter("Clicked on Medical Device Support Checkbox");
        clickOnWebElement(attributeButton);
        return this;
    }

    public void verifyAttributeScreenTitle() {
        String attributeScreen = getText(selectAllAttributesTitle);
        Assert.assertEquals(attributeScreen, "Select all attributes that apply");
        LOG.Reporter("Verified Attribute Screen Title :: " + attributeScreen);
    }

    public Manage_Products verifyAttributeScreen_DeleteIcon() {
        Assert.assertTrue(iselementVisible(categoriesDeleteIcon, second10TimeOut));
        LOG.Reporter("Verified Attribute Screen Delete Icon");
        return this;
    }

    public Manage_Products verifySecondSubAttributeSection() {
        verifyAttributeScreenTitle();
        clickOnWebElement(attributeButton);
        LOG.Reporter("Clicked on Attribute Button");
        clickOnWebElement(accessibilityDD);
        LOG.Reporter("Clicked on Accessibility Dropdown");
        Assert.assertTrue(iselementVisible(accessibilityDD, second10TimeOut));
        LOG.Reporter("1st Sub Attribute Section is displayed");
        clickOnWebElement(medicalDeviceSupportCB);
        LOG.Reporter("Clicked on Medical Device Support Checkbox");
        Assert.assertTrue(iselementVisible(accessibilityDD, second10TimeOut));
        LOG.Reporter("2nd Sub Attribute Section is displayed");
        clickOnWebElement(attributeButton);
        return this;
    }

    public Manage_Products verifyAddAttributeButton() {
        try {
            verifyAttributeScreenTitle();
            clickOnWebElement(addAttributeButton);
            LOG.Reporter("Clicked on add attribute Button");
            clickOnWebElement(accessibilityDD);
            LOG.Reporter("Clicked on Accessibility Dropdown");
            Assert.assertTrue(iselementVisible(accessibilityDD, second10TimeOut));
            LOG.Reporter("1st Sub Attribute Section is displayed");
            clickOnWebElement(medicalDeviceSupportCB);
            LOG.Reporter("Clicked on Medical Device Support Checkbox");
            Assert.assertTrue(iselementVisible(accessibilityDD, second10TimeOut));
            LOG.Reporter("2nd Sub Attribute Section is displayed");
            clickOnWebElement(attributeButton);
        } catch (Exception e) {
            LOG.Reporter("Exception Occurred");
        }


        return this;
    }

    public Manage_Products verifyAddAttributeButton_SaveAndContinue() {
        waitForVisibility(saveAndContinue);
        clickByAction(saveAndContinue);
        LOG.Reporter("Clicked on Save and Continue");
        return this;
    }

    public Manage_Products verifyLanguageSection() {
        String languageScreen = getText(availableLanguages_Title);
        Assert.assertEquals(languageScreen, "Available languages for this pattern");
        LOG.Reporter("Language Screen is displayed");
        return this;
    }

    public Manage_Products verifyLanguageSection_SaveAndContinue() {
        try {
            holdForElement(3);
            scrollByVisibilityOfElement(driver, saveButton);
            clickOnWebElement(saveButton);
            LOG.Reporter("Clicked on Save and Continue");
        } catch (Exception e) {
            LOG.Reporter("Exception Occurred");
        }

        return this;
    }

    public Manage_Products verifyGallerySection() {
        String galleryScreen = getText(gallery_h5);
        Assert.assertEquals(galleryScreen, "Gallery");
        LOG.Reporter("Gallery Screen is displayed");

        return this;
    }

    public Manage_Products addGalleryPhotoAndAddDetailButton() {
        upLoadPhoto();
        clickOnWebElement(addDetailButton);
        LOG.Reporter("Clicked on Add Detail Button");
        verifyAddDetailsPopUp();
        return this;
    }

    public Manage_Products verifyPhotoDeleteButton() {
        upLoadPhoto();
        clickOnWebElement(deletePhoto_CB1);
        LOG.Reporter("Clicked on Delete Photo Checkbox");
        clickOnWebElement(removePhotosButton);
        LOG.Reporter("Clicked on Delete Photo Button");
        Assert.assertFalse(iselementVisible(deletePhoto_CB1, second10TimeOut));
        LOG.Reporter("Photo is Deleted");
        return this;
    }

    public void upLoadPhoto() {
        choosePhoto_input.sendKeys(filePath("img1.jpeg"));
        LOG.Reporter("Photo is uploaded");

    }

    public Manage_Products uploadPhoto() {
        choosePhoto_input.sendKeys(filePath("img1.jpeg"));
        LOG.Reporter("Photo 1 is uploaded");
        return this;
    }

    public Manage_Products photosTab_SaveAndContinue() {
        try {
            holdForElement(4);
            scrollByVisibilityOfElement(driver, saveButton);
            clickOnWebElement(saveButton);
            LOG.Reporter("Clicked on Save and Continue");
        } catch (Exception e) {
            LOG.Reporter("Exception Occurred" + e.getMessage().toString());
        }
        return this;
    }

    public void verifyAddDetailsPopUp() {
        String addDetailsPopUpTitle = getText(addDetails_h5);
        Assert.assertEquals(addDetailsPopUpTitle, "Add Details");
        LOG.Reporter("Add Details Pop Up is displayed");
    }

    public void verifyAddDetailsPopUp_AllOptions() {
        Assert.assertTrue(iselementVisible(addCopyrightOwner, second10TimeOut));
        LOG.Reporter("Copyright Owner is displayed");
        Assert.assertTrue(iselementVisible(caption_altText, second10TimeOut));
        LOG.Reporter("Caption Alt Text is displayed");
        Assert.assertTrue(iselementVisible(deletePhotoButton, second10TimeOut));
        LOG.Reporter("Delete Photo Button is displayed");
        Assert.assertTrue(iselementVisible(saveAllButton, second10TimeOut));
        LOG.Reporter("Save All Button is displayed");
        Assert.assertTrue(iselementVisible(closeIcon, second10TimeOut));
        LOG.Reporter("Close Icon is displayed");
    }

    public Manage_Products verifyAddDetailsPopUp_SaveAll() {
        sendKeys(caption_altText, "Wool");
        LOG.Reporter("Entered Caption Alt Text :: " + caption_altText.getAttribute("value"));
        clickOnWebElement(saveAllButton);
        LOG.Reporter("Clicked on Save All Button");
        return this;
    }

    public Manage_Products verifyFileTabVisible() {
        String fileTabTitle = getText(files_h5);
        Assert.assertEquals(fileTabTitle, "Files");
        LOG.Reporter("File Tab is displayed");
        return this;
    }

    public Manage_Products verifyFileTab_UploadPDF() {
        uploadPDFDoc();
        return this;
    }

    public void uploadPDFDoc() {
        choosePhoto_input.sendKeys(filePath("dummy.pdf"));
        LOG.Reporter("PDF File is uploaded");
    }

    public Manage_Products filesTab_SaveAndContinue() {
        try {
            holdForElement(3);
            scrollByVisibilityOfElement(driver, saveButton);
            clickOnWebElement(saveButton);
            LOG.Reporter("Clicked on Save and Continue");
        } catch (Exception e) {
            LOG.Reporter("Exception Occurred" + e.getMessage().toString());
        }
        return this;
    }

    public Manage_Products verifyDescriptiveTextTabVisible() {
        String fileTabTitle = getText(descriptiveText_h5);
        Assert.assertEquals(fileTabTitle, "Descriptive Text");
        LOG.Reporter("Descriptive Text Tab is displayed");
        sendKeys(descriptiveText_textarea, "Product details text area");
        LOG.Reporter("Descriptive Text Text Area is displayed");
        return this;
    }
    public Manage_Products DescriptiveText_SaveAndContinue() {
        try {
            holdForElement(3);
            scrollByVisibilityOfElement(driver, saveButton);
            clickOnWebElement(saveButton);
            LOG.Reporter("Clicked on Save and Continue");
        } catch (Exception e) {
            LOG.Reporter("Exception Occurred" + e.getMessage().toString());
        }
        return this;
    }

    public Manage_Products verifySellingChannelTab() {
        goToEtsyTab();
        String expected = "Etsy Details";
        String acutal = etsyTitle.getText();
        Assert.assertEquals(expected, acutal);
        LOG.Reporter("Etsy Details Tab is displayed");
        return this;
    }

    public Manage_Products goToEtsyTab() {
        clickOnWebElement(etsyTabButton);
        LOG.Reporter("Clicked on Etsy Tab");
        return this;
    }

    public Manage_Products goToSellingChannel() {
        holdForElement(3);
        clickOnWebElement(sellingChannelsTab);
        LOG.Reporter("Clicked on Selling Channel Tab");
        return this;
    }

    public void verifyEtsyTitle() {
        holdForElement(3);
        Assert.assertTrue(iselementVisible(patternName_input, second10TimeOut));
        String patternDetails = patternName_input.getText();
        LOG.Reporter("Pattern Details :: " + patternDetails);

    }

    public Manage_Products verifyDragPhotos() {
        verifyEtsyTitle();
        Assert.assertTrue(iselementVisible(photoContent, second10TimeOut));
        LOG.Reporter("Photo Content is displayed");
        return this;
    }

    public Manage_Products verifyPhotosDeleteFromEtsyTab() {
        clickOnWebElement(deletePhoto_CB1);
        LOG.Reporter("Clicked on Delete Photo Checkbox");
        clickOnWebElement(removePhotosButtonEtsy);
        LOG.Reporter("Clicked on Delete Photo Button");
        holdForElement(3);
        Assert.assertTrue(iselementVisible(noAddedPhotos, second10TimeOut));
        LOG.Reporter("Photo is Deleted :: " + noAddedPhotos.getText());
        return this;
    }

    public Manage_Products verifyAfterDeleteAddPhotoButton() {
        clickOnWebElement(addPhotoFrom_Button);
        LOG.Reporter("Clicked on Add Photo From Button");
        holdForElement(3);
        clickOnWebElement(deletePhoto_CBForEtsy);
        LOG.Reporter("Clicked on Photo Checkbox");
        clickOnWebElement(addPhotoFrom_ButtonEtsy);
        LOG.Reporter("Clicked on Add Photo From Button");
        Assert.assertTrue(iselementVisible(photoContent, second10TimeOut));
        LOG.Reporter("Photo Content is displayed");
        return this;
    }

    public Manage_Products verifyEtsyNoteDescription() {
        holdForElement(3);
        scrollByVisibilityOfElement(driver, descriptionTitle);
        Assert.assertTrue((iselementVisible(descriptionTitle)));
        LOG.Reporter("Description Title is displayed");
        Assert.assertTrue(iselementVisible(etsyNoteDescription, second10TimeOut));
        LOG.Reporter("Etsy Note Description :: " + etsyNoteDescription.getText());
        Assert.assertTrue(iselementVisible(previewDescriptionButton, second10TimeOut));
        LOG.Reporter("Preview Description button verified :: " + previewDescriptionButton.getText());
        return this;
    }

    public Manage_Products verifyPreviewDescription() {
        holdForElement(3);
        scrollByVisibilityOfElement(driver, descriptionTitle);
        Assert.assertTrue((iselementVisible(descriptionTitle)));
        LOG.Reporter("Description Title is displayed");
        clickOnWebElement(previewDescriptionButton);
        LOG.Reporter("Clicked on Preview Description Button");
        Assert.assertTrue(iselementVisible(descriptionPopupTitle, second10TimeOut));
        LOG.Reporter("Description Popup Title is displayed and verified");
        return this;
    }

    public Manage_Products verifyRenewalOptions() {
        holdForElement(3);
        scrollByVisibilityOfElement(driver, renewalOptions_h5);
        Assert.assertTrue((iselementVisible(renewalOptions_h5)));
        LOG.Reporter("Renewal Options is displayed :: " + renewalOptions_h5.getText());
        for (int i = 0; i < renewalOptions_Radio.size(); i++) {
            String optionText = renewalOptions_Radio.get(i).getText().trim();

            if (optionText.equalsIgnoreCase("Automatic")) {
                renewalOptions_Radio.get(i).click();
                LOG.Reporter("Clicked on Automatic Radio Button");
            } else {
                renewalOptions_Radio.get(i).click();
                LOG.Reporter("Clicked on Manual Radio Button");
                break;
            }
        }
        return this;
    }

    public Manage_Products verifyRenewalOptions_Automatic() {
        holdForElement(3);
        scrollByVisibilityOfElement(driver, renewalOptions_h5);
        Assert.assertTrue((iselementVisible(renewalOptions_h5)));
        LOG.Reporter("Renewal Options is displayed :: " + renewalOptions_h5.getText());

        return this;
    }

    public Manage_Products verifyRenewalOptions_Manual() {
        holdForElement(3);
        scrollByVisibilityOfElement(driver, renewalOptions_h5);
        Assert.assertTrue((iselementVisible(renewalOptions_h5)));
        LOG.Reporter("Renewal Options is displayed :: " + renewalOptions_h5.getText());
        Assert.assertTrue(iselementVisible(manual_ExpriyDate, second10TimeOut));
        LOG.Reporter("Manual Expiry Date is displayed :: " + manual_ExpriyDate.getText());
        return this;
    }

    public void scrollToSectionOptions() {
        holdForElement(3);
        scrollByVisibilityOfElement(driver, sections_h5);
        Assert.assertTrue((iselementVisible(sections_h5)));
        LOG.Reporter("Sections is displayed :: " + sections_h5.getText());
        Assert.assertTrue(iselementVisible(shopSection_h5, second10TimeOut));
        LOG.Reporter("Shop Section is displayed :: " + shopSection_h5.getText());
    }

    public void scrollToFileOptions() {
        holdForElement(3);
        scrollByVisibilityOfElement(driver, fileSection_h5);
        Assert.assertTrue((iselementVisible(fileSection_h5)));
        LOG.Reporter("Sections is displayed :: " + fileSection_h5.getText());
    }

    public Manage_Products verifySectionOptions() {
        scrollToSectionOptions();
        Assert.assertTrue(iselementVisible(quantity_input, second10TimeOut));
        LOG.Reporter("Quantity is displayed :: " + quantity_input.getText());
        Assert.assertTrue(iselementVisible(price_input, second10TimeOut));
        LOG.Reporter("Price is displayed :: " + price_input.getText());
        Assert.assertTrue(iselementVisible(tagToAdd_input, second10TimeOut));
        LOG.Reporter("Tag To Add is displayed :: " + tagToAdd_input.getText());
        return this;
    }

    public Manage_Products verifySectionOptions_ShopSection() {
        scrollToSectionOptions();
        clickOnWebElement(shopSection_DD);
        LOG.Reporter("Clicked on Shop Section Dropdown");
        clickOnWebElement(cowlsOption);
        LOG.Reporter("Clicked on Cowls Option");
        return this;
    }

    public Manage_Products verifySectionOptions_Quantity() {
        scrollToSectionOptions();
        holdForElement(2);
        clickOnWebElement(quantity_TF);
        LOG.Reporter("Clicked on Quantity Text Field");
        holdForElement(2);
        clearWithJavaScript(quantity_TF);
        LOG.Reporter("Quantity is entered and verified ");
        return this;
    }

    public Manage_Products verifySectionOptions_Price() {
        scrollToSectionOptions();
        clickOnWebElement(price_TF);
        LOG.Reporter("Clicked on Price Text Field");
        holdForElement(2);
        sendKeysWithActions(price_TF, "1");
        LOG.Reporter("Price is entered and verified ");
        Assert.assertTrue(iselementVisible(currency_input, second10TimeOut));
        LOG.Reporter("Currency is displayed :: " + currency_input.getText());
        return this;
    }

    public Manage_Products verifySectionOptions_TagSection() {
        scrollToSectionOptions();
        clickOnWebElement(tagToAdd_input);
        LOG.Reporter("Clicked on Tag To Add Input");
        holdForElement(2);
        sendKeysWithActions(addTagButton, "Dress");
        LOG.Reporter("Tag is entered and verified ");
        return this;
    }

    public Manage_Products verifySectionOptions_TagSectionAddButton() {
        scrollToSectionOptions();
        clickOnWebElement(tagToAdd_input);
        LOG.Reporter("Clicked on Tag To Add Input");
        holdForElement(2);
        sendKeysWithActions(addTagButton, "Dress");
        LOG.Reporter("Tag is entered ");
        clickOnWebElement(plusButton);
        LOG.Reporter("Clicked on Plus Button");
        Assert.assertTrue(iselementVisible(verifyTag, second10TimeOut));
        LOG.Reporter("Tag is displayed and verified  :: " + verifyTag.getText());
        return this;
    }

    public Manage_Products verifySectionOptions_TagSectionEnableAddButton() {
        scrollToSectionOptions();
        clickOnWebElement(tagToAdd_input);
        LOG.Reporter("Clicked on Tag To Add Input");
        holdForElement(2);
        sendKeysWithActions(addTagButton, "Dress");
        LOG.Reporter("Tag is entered ");
        Assert.assertTrue(iselementVisible(plusButton, second10TimeOut));
        LOG.Reporter("Plus Button is displayed ");
        return this;
    }

    public Manage_Products verifySectionOptions_PlusIconActivateWhenTextEntered() {
        scrollToSectionOptions();
        clickOnWebElement(tagToAdd_input);
        LOG.Reporter("Clicked on Tag To Add Input");
        holdForElement(2);
        LOG.Reporter("Plus Button is not displayed ");
        sendKeysWithActions(addTagButton, "Dress");
        LOG.Reporter("Tag is entered ");
        Assert.assertTrue(iselementVisible(plusButton, second10TimeOut));
        LOG.Reporter("Plus Button is displayed ");
        return this;
    }

    public Manage_Products verifySectionOptions_TagsCrossIcon() {
        scrollToSectionOptions();
        clickOnWebElement(tagToAdd_input);
        LOG.Reporter("Clicked on Tag To Add Input");
        holdForElement(2);
        LOG.Reporter("Plus Button is not displayed ");
        sendKeysWithActions(addTagButton, "Dress");
        LOG.Reporter("Tag is entered ");
        clickOnWebElement(plusButton);
        LOG.Reporter("Clicked on Plus Button");
        Assert.assertTrue(iselementVisible(verifyTag, second10TimeOut));
        LOG.Reporter("Tag is displayed and verified  :: " + verifyTag.getText());
        Assert.assertTrue(iselementVisible(tagDeleteIcon, second10TimeOut));
        LOG.Reporter("Tag Delete Icon is displayed and verified ");
        clickOnWebElement(tagDeleteIcon);
        LOG.Reporter("Clicked on Tag Delete Icon");
        return this;
    }

    public Manage_Products verifyFileOnETSYDetail() {
        scrollToFileOptions();
        for (WebElement file : filesList) {
            LOG.Reporter("Files List and verified :: " + file.getText());
        }
        return this;
    }

    public Manage_Products verifyDeleteFileOnETSYDetail() {
        scrollToFileOptions();
        scrollByVisibilityOfElement(driver, fileLibraryButton);
        clickOnWebElement(fileLibraryButton);
        LOG.Reporter("Clicked on File Library Button");
        deleteFile();
        DescriptiveText_SaveAndContinue();
        scrollToFileOptions();
        clickOnWebElement(fileLibraryButton);
        LOG.Reporter("Clicked on File Library Button");
        return this;
    }


    public void deleteFile() {
        clickOnWebElement(deleteFile_CB1);
        LOG.Reporter("Clicked on File Checkbox");
        waitForVisibility(removeFileButton);
        clickOnWebElement(removeFileButton);
        LOG.Reporter("Clicked on Delete File Button");
        filesTab_SaveAndContinue();
    }

    public void AddFile() {
        clickOnWebElement(fileLibraryButton);
        LOG.Reporter("Clicked on File Library Button");
        holdForElement(3);
        verifyFileTab_UploadPDF();
        filesTab_SaveAndContinue();
    }

    public Manage_Products verifyAddDeleteFileOnETSYDetail() {
        AddFile();
        clickOnWebElement(sellingChannelsTab);
        scrollToFileOptions();
        verifyFileOnETSYDetail();
        return this;
    }

    public Manage_Products verifyAddDeleteFileOnRAVELRYDetail() {
        clickOnWebElement(addFromFileLibraryButton);
        LOG.Reporter("Clicked on Add From File Library Button");
        clickOnWebElement(deleteFile_CB1);
        LOG.Reporter("Clicked on File Checkbox");
        clickOnWebElement(addFromFileLibraryPopupButton);
        LOG.Reporter("Clicked on Add From File Library Popup Button");

        return this;
    }


    public Manage_Products verifySaveDraft() {
        clickOnWebElement(saveDraftButton);
        LOG.Reporter("Clicked on Save Draft Button");
        Assert.assertTrue(iselementVisible(patternCreatedSuccessfully, second10TimeOut));
        LOG.Reporter("Pattern Created Successfully message :: " + patternCreatedSuccessfully.getText());
        return this;
    }

    public Manage_Products verifyPublishToEtsy() {
        clickOnWebElement(publishToEtsyButton);
        LOG.Reporter("Clicked on Publish To Etsy Button");
        return this;
    }

    public Manage_Products verifyPublishToEtsy_Popup() {
        scrollToFileOptions();
        verifyPublishToEtsy();
        Assert.assertTrue(iselementVisible(fileRequired, second10TimeOut));
        LOG.Reporter("File Required message :: " + fileRequired.getText());
        return this;
    }

    public Manage_Products goToRavelryDetailsForm() {
        clickOnWebElement(ravelryDetailsButton);
        LOG.Reporter("Clicked on Ravelry Details Button");
        return this;
    }

    public Manage_Products checkDragPhotosRAVELRYDetail() {
        scrollByVisibilityOfElement(driver, photoContent);
        Assert.assertTrue(iselementVisible(photoContent, second10TimeOut));
        LOG.Reporter("Photo Content is displayed");
        return this;
    }

    public Manage_Products verifyPhotosDeleteFromRAVELRYTab() {
        clickOnWebElement(deletePhoto_CB1);
        LOG.Reporter("Clicked on Delete Photo Checkbox");
        clickOnWebElement(removePhotosButtonEtsy);
        LOG.Reporter("Clicked on Delete Photo Button");
        holdForElement(3);
        Assert.assertTrue(iselementVisible(noAddedPhotos, second10TimeOut));
        LOG.Reporter("Photo is Deleted :: " + noAddedPhotos.getText());
        return this;
    }

    public Manage_Products verifyAbleToAddDeletePhotos() {
        clickOnWebElement(addPhotoFrom_Button);
        LOG.Reporter("Clicked on Add Photo From Button");
        holdForElement(3);
        clickOnWebElement(deletePhoto_CBForEtsy);
        LOG.Reporter("Clicked on Photo Checkbox");
        clickOnWebElement(addPhotoFrom_ButtonEtsy);
        LOG.Reporter("Clicked on Add Photo From Button");
        Assert.assertTrue(iselementVisible(photoContent, second10TimeOut));
        LOG.Reporter("Photo Content is displayed");
        return this;

    }

    public Manage_Products verifyPreviewDescripitonRAVELRYDetail() {
        holdForElement(3);
        scrollByVisibilityOfElement(driver, descriptionOnRavelry);
        Assert.assertTrue((iselementVisible(descriptionOnRavelry)));
        LOG.Reporter("Description Title is displayed");
        clickOnWebElement(previewDescriptionButton);
        LOG.Reporter("Clicked on Preview Description Button");
        Assert.assertTrue(iselementVisible(description_h5, second10TimeOut));
        LOG.Reporter("Description Popup Title is displayed and verified");
        return this;
    }

    public Manage_Products verifyPreviewDescripitonRAVELRYDetail_Close() {
        goToPriceSection();
        Assert.assertTrue(iselementVisible(isFree_CB, second10TimeOut));
        LOG.Reporter("Is Free Checkbox is displayed");
        Assert.assertTrue(iselementVisible(isPaid_CB, second10TimeOut));
        LOG.Reporter("Is Paid Checkbox is displayed");
        return this;
    }

    public Manage_Products verifyFreeCheckBoxRavelryTab() {
        goToPriceSection();
        clickOnWebElement(isFree_CB);
        LOG.Reporter("Clicked on Is Free Checkbox");
        iselementEnable(isFree_CB, second10TimeOut);
        LOG.Reporter("Is Free Checkbox is Enabled");
        Assert.assertTrue(iselementVisible(freePdfDownload_CB, second10TimeOut));
        LOG.Reporter("Free Pdf Download Checkbox is displayed :: " + freePdfDownload_CB.getText());
        Assert.assertTrue(iselementVisible(patternAvailableOnline_CB, second10TimeOut));
        LOG.Reporter("Pattern Available Online Checkbox is displayed :: " + patternAvailableOnline_CB.getText());
        return this;
    }


    public void goToPriceSection() {
        holdForElement(3);
        scrollByVisibilityOfElement(driver, priceTitle);
        Assert.assertTrue(iselementVisible(priceTitle));
        LOG.Reporter("Price Title is displayed");
    }

    public Manage_Products verifySubOptionFreeDownloadPDF() {
        goToPriceSection();
        clickOnWebElement(isFree_CB);
        LOG.Reporter("Clicked on Is Free Checkbox");
        iselementEnable(isFree_CB, second10TimeOut);
        LOG.Reporter("Is Free Checkbox is Enabled");
        clickOnWebElement(freePdfDownload_CB);
        LOG.Reporter("Clicked on Free Pdf Download Checkbox");
        return this;
    }

    public Manage_Products verifySubOptionPatternAvailableOnline() {
        goToPriceSection();
        clickOnWebElement(isFree_CB);
        LOG.Reporter("Clicked on Is Free Checkbox");
        iselementEnable(isFree_CB, second10TimeOut);
        LOG.Reporter("Is Free Checkbox is Enabled");
        clickOnWebElement(patternAvailableOnline_CB);
        LOG.Reporter("Clicked on Pattern Available Online Checkbox");
        return this;
    }

    public Manage_Products verifyPatternAvailableOnlinePatternLinkFiled() {
        goToPriceSection();
        clickOnWebElement(isFree_CB);
        LOG.Reporter("Clicked on Is Free Checkbox");
        iselementEnable(isFree_CB, second10TimeOut);
        LOG.Reporter("Is Free Checkbox is Enabled");
        clickOnWebElement(patternAvailableOnline_CB);
        LOG.Reporter("Clicked on Pattern Available Online Checkbox");
        sendKeys(patternLink_input, "https://qa.gosadi.com/");
        LOG.Reporter("Pattern Link is entered");
        return this;
    }

    public Manage_Products verifyFileDragToRavelryForm() {
        scrollToFileOptions();
        return this;
    }

    public Manage_Products verifyLanguageDropdownForTheFile() {
        scrollToFileOptions();
        Assert.assertTrue(iselementVisible(selectLanguage_label, second10TimeOut));
        LOG.Reporter("Select Language Label is displayed :: " + selectLanguage_label.getText());
        clickOnWebElement(fileLanguage_input);
        LOG.Reporter("Clicked on File Language Input");
        Assert.assertTrue(iselementVisible(english_li, second10TimeOut));
        clickOnWebElement(english_li);
        LOG.Reporter("Clicked on English Language");

        return this;
    }

    public Manage_Products verifyDeleteTheFileOnRAVELRYDetail() {
        scrollToFileOptions();
        deleteFile();
        LOG.Reporter("File is Deleted");
        return this;
    }

    public Manage_Products verifyAddTheDeletedFilesRAVELRYDetail() {
        verifyDeleteTheFileOnRAVELRYDetail();
        verifyAddDeleteFileOnRAVELRYDetail();

        return this;
    }

    public void selectBusinessAndProductStore() {
        clickOnWebElement(ravelryBusinessId_input);
        LOG.Reporter("Clicked on Ravelry Business Id Input");
        clickOnWebElement(gosadi_li);
        LOG.Reporter("Clicked on Gosadi Business");
        clickOnWebElement(ravelryProductId_input);
        LOG.Reporter("Clicked on Ravelry Product Id Input");
        clickOnWebElement(gosadi_li);
        LOG.Reporter("Clicked on Gosadi Product");
    }

    public Manage_Products verifySelectBusinessAndProductStoreandSaveDraft() {
        selectBusinessAndProductStore();
        goToPriceSection();
        clickOnWebElement(isPaid_CB);
        LOG.Reporter("Clicked on Is Paid Checkbox");
        iselementEnable(isPaid_CB, second10TimeOut);
        LOG.Reporter("Is Paid Checkbox is Enabled");
        sendKeys(ravelryPrice, "1");
        LOG.Reporter("Price is entered");
        clickOnWebElement(saveDraftButton);
        LOG.Reporter("Clicked on Save Draft Button");
        Assert.assertTrue(iselementVisible(patternCreatedSuccessfully, second10TimeOut));
        LOG.Reporter("Pattern Created Successfully message :: " + patternCreatedSuccessfully.getText());
        return this;
    }

    public Manage_Products verifyPublishToRavelryButton() {
        selectBusinessAndProductStore();
        goToPriceSection();
        clickOnWebElement(isPaid_CB);
        LOG.Reporter("Clicked on Is Paid Checkbox");
        iselementEnable(isPaid_CB, second10TimeOut);
        LOG.Reporter("Is Paid Checkbox is Enabled");
        sendKeys(ravelryPrice, "1");
        LOG.Reporter("Price is entered");
        clickOnWebElement(publishToRavelryButton);
        LOG.Reporter("Clicked on Publish To Ravelry Button");
        return this;
    }

    public Manage_Products verifyErrorInRAVELRYDetail() {
        selectBusinessAndProductStore();
        goToPriceSection();
        Assert.assertTrue(iselementVisible(priceRequired, second10TimeOut));
        LOG.Reporter("Price Required message :: " + priceRequired.getText());
        return this;
    }

    public Manage_Products verifyUploadImageNameWithSpecialCharAndSpaces() {
        uploadFile.sendKeys(filePath("img 1@#$%.bmp"));
        LOG.Reporter("Image file with name img 1@#$%.bmp uploaded successfully");
        return this;
    }

    public Manage_Products verifyUploadImageMaxSizeWith3Mb() {
        uploadFile.sendKeys(filePath("image3.4MB.png"));
        LOG.Reporter("Image file with size 3.4mb uploaded successfully");
        Assert.assertTrue(iselementVisible(fileSizeError));
        LOG.Reporter("File size error message is displayed :: " + fileSizeError.getText());
        return this;
    }

    public Manage_Products verifyOtherFileFormates() {
        uploadFile.sendKeys(filePath("dummy.pdf"));
        LOG.Reporter("PDF File is uploaded");
        return this;
    }

    public Manage_Products verifyMultipleImageUpload() {
        uploadFile.sendKeys(filePath("pic2.png"));
        LOG.Reporter("Image file pic2.png uploaded successfully");
        uploadFile.sendKeys(filePath("img1.jpeg"));
        LOG.Reporter("Image file img1.jpeg uploaded successfully");
        return this;

    }

    public Manage_Products verifyToAddDataInLengthField() {
        sendKeys(yardageLength, "10");
        Assert.assertEquals(yardageLength.getAttribute("value"), "10");
        LOG.Reporter("Length is entered " + yardageLength.getAttribute("value"));
        return this;
    }

    public Manage_Products verifyLengthFieldAcceptsOnlyNumeric() {
        sendKeys(yardageLength, "ajsddashshhd");
        Assert.assertEquals(yardageLength.getAttribute("value"), "");
        LOG.Reporter("Length is entered as alphanumeric and with special char" + yardageLength.getAttribute("value"));
        return this;
    }

    public Manage_Products verifyLengthFieldAcceptsAplhaNumericAndSpecialChar() {
        sendKeys(yardageLength, "ajsdds22374@$$%%74");
        Assert.assertEquals(yardageLength.getAttribute("value"), "");
        LOG.Reporter("Length is entered as alphanumeric and with special char" + yardageLength.getAttribute("value"));
        return this;
    }

    public Manage_Products verifyLengthFieldMandatory() {
        scrollByVisibilityOfElement(driver, submitButton);
        clickOnWebElement(submitButton);
        LOG.Reporter("Clicked on Submit Button");
        scrollByVisibilityOfElement(driver, yardageLength);
        Assert.assertTrue(iselementVisible(lengthMandatoryError, second10TimeOut));
        LOG.Reporter("Length Mandatory Error message is displayed :: " + lengthMandatoryError.getText());
        return this;
    }

    public Manage_Products verifyEnterBlankSpacesLengthField() {
        sendKeys(yardageLength, "   ");
        Assert.assertEquals(yardageLength.getAttribute("value"), "");
        LOG.Reporter("Length field is cleared Not taking any blank spaces");
        return this;
    }

    public Manage_Products verifyUnitFieldIsAccessible() {
        Assert.assertTrue(iselementVisible(yardageUnit, second10TimeOut));
        LOG.Reporter("Unit Dropdown is visible and accessible");
        return this;
    }

    public Manage_Products verifySelectUnitFieldFromDD() {
        clickOnWebElement(yardageUnit);
        LOG.Reporter("Clicked on Unit Dropdown");
        for (WebElement element : unitDDOptions) {
            Assert.assertTrue(iselementVisible(element));
            clickOnWebElement(element);
            LOG.Reporter("Clicked on Unit option :: " + element.getText());
        }
        return this;
    }

    public Manage_Products verifyToSelectBothOptions() {
        clickOnWebElement(yardageUnit);
        LOG.Reporter("Clicked on Unit Dropdown");
        for (WebElement element : unitDDOptions) {
            Assert.assertTrue(iselementVisible(element));
            clickOnWebElement(element);
            Assert.assertTrue(iselementEnable(element, 10));
            LOG.Reporter("Clicked on Unit option :: " + element.getText());
        }
        return this;
    }

    public Manage_Products verifyToSeeAllOptions() {
        clickOnWebElement(yardageUnit);
        LOG.Reporter("Clicked on Unit Dropdown");
        for (WebElement element : unitAllOptions) {
            LOG.Reporter("All Unit options name :- " + element.getText());
        }
        return this;
    }

    public Manage_Products verifyUnitFieldMandatory() {
        scrollByVisibilityOfElement(driver, submitButton);
        clickOnWebElement(submitButton);
        LOG.Reporter("Clicked on Submit Button");
        scrollByVisibilityOfElement(driver, yardageLength);
        Assert.assertEquals("Unit is required", getText(unitFieldRequired));
        LOG.Reporter("Length Mandatory Error message is displayed :: " + unitFieldRequired.getText());

        return this;
    }

    public Manage_Products verifyAddValueToTheTextureField() {
        sendKeys(texture_input, "Textured");
        Assert.assertEquals(texture_input.getAttribute("value"), "Textured");
        LOG.Reporter("Value is entered in the texture field" + texture_input.getAttribute("value"));
        return this;
    }

    //Need to work on this Provide all data to the form
    public Manage_Products verifyTextureFieldIsNonMandatory() {

        return this;
    }

    public Manage_Products verifyEnterDataInWeightField() {
        sendKeys(weightField, "10");
        Assert.assertEquals(weightField.getAttribute("value"), "10");
        LOG.Reporter("Value is entered in the weight field " + weightField.getAttribute("value"));

        return this;
    }

    //Need to work on this Provide all data to the form
    public Manage_Products verifyWeightFieldIsNonMandatory() {

        return this;
    }

    public Manage_Products verifyWeightFieldAcceptsNumericValue() {
        sendKeys(weightField, "11");
        Assert.assertEquals(weightField.getAttribute("value"), "11");
        LOG.Reporter("Value is entered in the weight field " + weightField.getAttribute("value"));
        return this;
    }

    public Manage_Products verifyWeightFieldAcceptsAlphaNumericValue() {
        sendKeys(weightField, "abc");
        Assert.assertNotEquals(weightField.getAttribute("value"), "abc", "Field accepted alphabets");
        sendKeys(weightField, "123abc");
        Assert.assertNotEquals(weightField.getAttribute("value"), "123abc", "Field did not clear for alphanumeric values");
        sendKeys(weightField, "!@#");
        Assert.assertNotEquals(weightField.getAttribute("value"), "!@#", "Field did not clear for special characters");
        LOG.Reporter("Value is entered in the weight field and verified ");
        return this;
    }

    public Manage_Products verifyFiberContentField() {
        Assert.assertTrue(iselementVisible(fiberDropdown, second10TimeOut));
        LOG.Reporter("Fiber Content field is visible and accessible");
        return this;
    }

    public Manage_Products verifySelectOptionFromFiberDropdown() {
        clickOnWebElement(fiberDropdown);
        LOG.Reporter("Clicked on Fiber Dropdown");
        if (!fiberDropdownOption.isEmpty()) {
            WebElement firstOption = fiberDropdownOption.get(0);
            Assert.assertTrue(iselementVisible(firstOption));
            holdForElement(1);
            clickByAction(firstOption);
            LOG.Reporter("Clicked on the first Fiber option :: " + firstOption.getText());
        } else {
            LOG.Reporter("No options found in the Fiber Dropdown");
        }

        return this;
    }

    public Manage_Products verifySelectedOptionVisibleFiber() {
        clickOnWebElement(fiberDropdown);
        LOG.Reporter("Clicked on Fiber Dropdown");
        printDropdownOptions(fiberDropdownOption);
        return this;

    }

    public Manage_Products verifySelectedMultipleFiber() {
        clickOnWebElement(fiberDropdown);
        LOG.Reporter("Clicked on Fiber Dropdown");
        printDropdownOptions(fiberDropdownOption);
        for (WebElement element : fiberDropdownOption) {
            Assert.assertTrue(iselementVisible(element));
            clickOnWebElement(element);
            LOG.Reporter("Clicked on the Fiber option :: " + element.getText());
        }

        return this;
    }


    public Manage_Products verifyAddPercentToFiberPercent() {
        sendKeys(fiberPercentage, "10");
        Assert.assertEquals(fiberPercentage.getAttribute("value"), "10");
        LOG.Reporter("Value is entered in the Fiber Percentage field " + fiberPercentage.getAttribute("value"));
        return this;
    }

    public Manage_Products verifyFiberPercentageFieldAcceptsNumericValue() {
        sendKeys(fiberPercentage, "10");
        Assert.assertEquals(fiberPercentage.getAttribute("value"), "10");
        LOG.Reporter("Value is entered in the Fiber Percentage field " + fiberPercentage.getAttribute("value"));
        sendKeys(fiberPercentage, "abc123");
        Assert.assertNotEquals(fiberPercentage.getAttribute("value"), "", "Fiber content field did not clear for alphanumeric values");
        LOG.Reporter("Fiber Field only accepts Numeric values ");
        return this;
    }

    public Manage_Products verifyFiberFieldAcceptsNumericValue() {
        sendKeys(fiberPercentage, "10");
        Assert.assertEquals(fiberPercentage.getAttribute("value"), "10");
        LOG.Reporter("Value is entered in the Fiber Percentage field " + fiberPercentage.getAttribute("value"));
        return this;
    }

    public Manage_Products verifyFiberAcceptsNumericNotOtherSequence() {
        sendKeys(fiberPercentage, "abc");
        Assert.assertNotEquals(weightField.getAttribute("value"), "abc", "Field accepted alphabets");
        sendKeys(fiberPercentage, "123abc");
        Assert.assertNotEquals(weightField.getAttribute("value"), "123abc", "Field did not clear for alphanumeric values");
        sendKeys(fiberPercentage, "!@#");
        Assert.assertNotEquals(weightField.getAttribute("value"), "!@#", "Field did not clear for special characters");
        LOG.Reporter("Value is entered in the Fiber Percentage field and verified ");
        return this;
    }

    public Manage_Products verifyFiberValueWithZero() {
        sendKeys(fiberPercentage, "0");
        Assert.assertEquals(fiberPercentage.getAttribute("value"), "0");
        LOG.Reporter("Value is entered in the Fiber Percentage field " + fiberPercentage.getAttribute("value"));
        clickOnWebElement(submitButton);
        LOG.Reporter("Clicked on Submit Button");
        Assert.assertTrue(iselementEnable(percentageShouldBe1, second10TimeOut));
        LOG.Reporter("Error message is displayed :: " + percentageShouldBe1.getText());
        return this;
    }

    public Manage_Products verifyFiberValueAcceptsOneToHundred() {
        // Try to enter a valid percentage within the range (e.g., 50)
        sendKeys(fiberPercentage, "50");
        Assert.assertEquals(fiberPercentage.getAttribute("value"), "50", "Fiber content percentage field did not accept a valid value");
        clearWithJavaScript(fiberPercentage);
        // Try to enter a value less than 1
        sendKeys(fiberPercentage, "100");
        Assert.assertEquals(fiberPercentage.getAttribute("value"), "100", "Fiber content percentage field did not clear for a value less than 1");
        LOG.Reporter("Fiber Field accepts values between 1 to 100");
        return this;
    }

    public Manage_Products verifyFiberValueMoreThanHundred() {
        sendKeys(fiberPercentage, "150");
        Assert.assertNotEquals(fiberPercentage.getAttribute("value"), "", "Fiber content percentage field did not clear for a value greater than 100");
        LOG.Reporter("Fiber Field not accepts values greater than 100");
        return this;
    }

    public Manage_Products verifyFiberContentRequiredField() {
        sendKeys(fiberPercentage, "16");
        Assert.assertNotEquals(fiberPercentage.getAttribute("value"), "", "Fiber content percentage field did not clear for a value greater than 100");
        LOG.Reporter("Fiber Field not accepts values greater than 100");
        clickOnWebElement(submitButton);
        LOG.Reporter("Clicked on Submit Button");
        Assert.assertTrue(iselementEnable(fiberRequired, second10TimeOut));
        LOG.Reporter("Error message is displayed and verified :: " + fiberRequired.getText());


        return this;
    }

    public Manage_Products verifyFiberLinkIsAccessible() {
        verifySelectOptionFromFiberDropdown();
        Assert.assertTrue(iselementEnable(addFiber_Link, second10TimeOut));
        LOG.Reporter("Fiber Link is accessible");
        return this;
    }

    public Manage_Products verifyFiberLinkIsClickable() {
        verifySelectOptionFromFiberDropdown();
        clickOnWebElement(addFiber_Link);
        LOG.Reporter("Clicked on Fiber Link");

        return this;
    }

    public Manage_Products verifyAddMultipleFiberContent() {
        verifySelectOptionFromFiberDropdown();
        clickOnWebElement(addFiber_Link);
        LOG.Reporter("Clicked on Fiber Link");
        holdForElement(3);
        verifySelectOptionFromFiberDropdown();
        LOG.Reporter("Clicked on Fiber Link 2nd time");
        return this;
    }

    public Manage_Products verifyAddFiberContentSum() {
        sendKeys(fiberPercentage, "100");
        Assert.assertEquals(fiberPercentage.getAttribute("value"), "100", "Fiber content percentage field did not clear for a value greater than 100");
        LOG.Reporter("Fiber Field added fiber content sum is 100");
        return this;
    }

    public Manage_Products verifyAddFiberContentSumMoreThan100() {
        verifySelectOptionFromFiberDropdown();
        verifyAddFiberContentSum();
        clickOnWebElement(addFiber_Link);
        LOG.Reporter("Clicked on Fiber Link");
        Assert.assertTrue(iselementVisible(fiberContentError, second10TimeOut));
        LOG.Reporter("Error message is displayed and verified :: " + fiberContentError.getText());
        return this;

    }

    public Manage_Products verifyAddFiberContentDeleteIconAccessible() {
        verifySelectOptionFromFiberDropdown();
        verifyFiberFieldAcceptsNumericValue();
        clickOnWebElement(addFiber_Link);
        LOG.Reporter("Clicked on Fiber Link");
        Assert.assertTrue(iselementVisible(deleteFiber));
        LOG.Reporter("Delete icon is visible and accessible ");
        return this;
    }

//M Started
public Manage_Products verifyHookRangeFieldAccessibility(){
    Assert.assertTrue(iselementVisible(minHookRange));
    LOG.Reporter("Hook Range Field is accessible ");
    clickOnWebElement(minHookRange);
    LOG.Reporter("Click on Hook Range Field ");
    Assert.assertTrue(iselementVisible(hookRangeDropDown));
    LOG.Reporter("Hook Range Dropdown is populated ");
    return this;
}

    public Manage_Products verifyMinMaxHookValue(){
        clickOnWebElement(minHookRange);
        LOG.Reporter("Clicked on Min Hook Dropdown Field ");
        clickOnWebElement(minHookRangeDropDownOption);
        LOG.Reporter("Min Hook Value :: "+minHookRangeDropDownOption.getText());
        clickOnWebElement(maxHookRange);
        LOG.Reporter("Clicked on Max Hook Dropdown Field ");
        clickOnWebElement(maxHookRangeDropDownOption);
        LOG.Reporter("Max Hook Value :: "+maxHookRangeDropDownOption.getText());
        return this;
    }

    public Manage_Products verifySameMinMaxHookValue(){
        clickOnWebElement(minHookRange);
        LOG.Reporter("Clicked on Min Hook Dropdown Field ");
        getHookSizeDropDownList(hookRangeDropDownOption);
        LOG.Reporter("Min Hook Value Selected");
        clickOnWebElement(maxHookRange);
        LOG.Reporter("Clicked on Max Hook Dropdown Field ");
        getHookSizeDropDownList(hookRangeDropDownOption);
        LOG.Reporter("Max Hook Value Selected");
        waitForElementVisible(sameHookRange,second10TimeOut);
        Assert.assertEquals("Hook size range should be different",getText(sameHookRange));
        LOG.Reporter("Error message is displayed :: " + getText(sameHookRange));
        return this;
    }

    public Manage_Products verifyMinMaxHookOrder(){
        clickOnWebElement(minHookRange);
        LOG.Reporter("Clicked on Min Hook Dropdown Field ");
        clickOnWebElement(maxValueFromMinHookRange);
        LOG.Reporter("Selected Max value from minimum Hook range dropdown");
        clickOnWebElement(maxHookRange);
        LOG.Reporter("Clicked on Max Hook Dropdown Field ");
        clickOnWebElement(minValueFromMaxHookRange);
        LOG.Reporter("Selected Min value from maximum Hook range dropdown ");
        Assert.assertEquals("Min hook should be less than max hook",getText(hookRangeValidationMessage));
        waitForElementVisible(hookRangeValidationMessage,second10TimeOut);
        LOG.Reporter("Error message is displayed :: " + getText(hookRangeValidationMessage));
        return this;
    }

    public Manage_Products verifyNeedleRangeFieldAccessibility(){
        Assert.assertTrue(iselementVisible(minNeedleRange));
        LOG.Reporter("Needle Range field is accessible ");
        clickOnWebElement(minNeedleRange);
        LOG.Reporter("Click on Needle Range Field ");
        Assert.assertTrue(iselementVisible(hookRangeDropDown));
        LOG.Reporter("Needle Range Dropdown is populated ");
        return this;
    }

    public Manage_Products verifyNeedleDropdownSelection(){
        clickOnWebElement(minNeedleRange);
        LOG.Reporter("Clicked on Min Needle range Dropdown Field ");
        clickOnWebElement(minHookRangeDropDownOption);
        LOG.Reporter("Min Needle Value :: "+minHookRangeDropDownOption.getText());
        clickOnWebElement(maxNeedleRange);
        LOG.Reporter("Clicked on Max Needle range Dropdown Field ");
        clickOnWebElement(maxHookRangeDropDownOption);
        LOG.Reporter("Max Needle Value :: "+maxHookRangeDropDownOption.getText());
        return this;
    }

    public void getHookSizeDropDownList(List<WebElement> element){
        for (int i = 0; i < element.size(); i++) {
            if (i == 2) {
                clickByAction(element.get(i));
            }
        }
    }

    public Manage_Products verifySameNeedleValues(){
        clickOnWebElement(minNeedleRange);
        LOG.Reporter("Clicked on Min Needle range Dropdown Field ");
        getHookSizeDropDownList(hookRangeDropDownOption);
        LOG.Reporter("Min Needle Value Selected");
        clickOnWebElement(maxNeedleRange);
        LOG.Reporter("Clicked on Max Needle range Dropdown Field ");
        getHookSizeDropDownList(hookRangeDropDownOption);
        LOG.Reporter("Max Needle Value Selected");
        Assert.assertEquals("Needle size range should be different",getText(sameNeedleRangeValidation));
        LOG.Reporter("Error message is displayed :: " + getText(sameNeedleRangeValidation));
        return this;
    }

    public Manage_Products verifyNeedleRangeOrder(){
        clickOnWebElement(minNeedleRange);
        LOG.Reporter("Clicked on Min Needle range Dropdown Field ");
        clickOnWebElement(maxValueFromMinHookRange);
        LOG.Reporter("Selected Max value from minimum Needle range dropdown");
        clickOnWebElement(maxNeedleRange);
        LOG.Reporter("Clicked on Max Needle range Dropdown Field ");
        clickOnWebElement(minValueFromMaxHookRange);
        LOG.Reporter("Selected Min value from maximum Needle range dropdown ");
        Assert.assertEquals("Min needle should be less than max needle",getText(NeedleRangeValidationMessage));
        LOG.Reporter("Error message is displayed :: " + getText(NeedleRangeValidationMessage));
        return this;

    }

    public Manage_Products verifyColorUrlFieldEntry(){
        sendKeys(colorCardURInput, "https://qa.gosadi.com");
        Assert.assertEquals(getAttributeValue(colorCardURInput),"https://qa.gosadi.com");
        LOG.Reporter("Entered Valid URL to color card field ::"+ getAttributeValue(colorCardURInput));
        return this;
    }

    public Manage_Products verifyInvalidColorUrlEntry(){
        sendKeys(colorCardURInput, "qa.gosadi.com");
        LOG.Reporter("Entered Invalid URL to color card field ::"+ getAttributeValue(colorCardURInput));
        Assert.assertEquals("Please enter url in correct format",getText(colorCardValidationMessage));
        LOG.Reporter("Error message is displayed :: " + getText(colorCardValidationMessage));
        return this;
    }

    public Manage_Products verifyAliasesFieldEntry(){
        sendKeys(aliasesInputField,"aliases");
        Assert.assertEquals(getAttributeValue(aliasesInputField),"aliases");
        LOG.Reporter("Entered data to the Aliases Field :: "+ getAttributeValue(aliasesInputField));
        return this;

    }
    // M started 30 jan
    public Manage_Products verifyGaugeRangeFieldAccessibility(){
        Assert.assertTrue(iselementVisible(gaugeRangeField));
        LOG.Reporter("Gauge Range field is accessible ");
        clickOnWebElement(gaugeRangeField);
        LOG.Reporter("Click on Gauge Range Field ");
        Assert.assertTrue(iselementVisible(gaugeRangeDropDown));
        LOG.Reporter("Gauge Range Dropdown is populated ");
        return this;
    }

    public Manage_Products verifyGaugeFieldsEntry(){
        sendKeys(minGaugeRange, "2");
        LOG.Reporter("Min Gauge Value :: "+getAttributeValue(minGaugeRange));
        sendKeys(maxGaugeRange,"3");
        LOG.Reporter("Max Guage Value ::"+getAttributeValue(maxGaugeRange));
        return this;
    }

    public Manage_Products verifySameGaugeRangeValue(){
        sendKeys(minGaugeRange,"3");
        LOG.Reporter("Min Gauge Range Value :: "+getAttributeValue(minGaugeRange));
        sendKeys(maxGaugeRange,"3");
        LOG.Reporter("Max Gauge Range Value :: "+getAttributeValue(maxGaugeRange));
        Assert.assertEquals("Gauge range should be different",getText(sameGaugeRangeValidation));
        LOG.Reporter("Error message is displayed :: " + getText(sameGaugeRangeValidation));
        return this;
    }

    public Manage_Products verifyGaugeRangeOrder(){
        sendKeys(minGaugeRange,"3");
        LOG.Reporter("Entered Max value in Min gauge range field :: "+getAttributeValue(minGaugeRange));
        sendKeys(maxGaugeRange,"2");
        LOG.Reporter("Entered Min value in Max gauge range field :: "+getAttributeValue(maxGaugeRange));
        Assert.assertEquals("Gauge max should be more than Gauge min",getText(maxGaugeRangeValidation));
        LOG.Reporter("Error message is displayed :: " + getText(maxGaugeRangeValidation));
        return this;

    }
    public Manage_Products verifyGaugeRangeDropdownSelection() {
        clickOnWebElement(gaugeRangeField);
        LOG.Reporter("Clicked on Gauge Range Dropdown Field ");
        getHookSizeDropDownList(hookRangeDropDownOption);
        LOG.Reporter("Gauge Range Value Selected :: " +getText(getGaugeRangeFieldValue));
        Assert.assertFalse(getText(getGaugeRangeFieldValue).isEmpty());
        return this;
    }

    public Manage_Products verifyMultipleOptionsSelection(){
        clickOnWebElement(gaugeRangeField);
        LOG.Reporter("Clicked on Gauge Range Dropdown Field ");
        getHookSizeDropDownList(hookRangeDropDownOption);
        LOG.Reporter("Gauge Range Value Selected :: " +getText(getGaugeRangeFieldValue));
        holdForElement(2);
        Assert.assertFalse(iselementVisible(gaugeRangeDropDown),"Guage Range dropdown is visible");
        LOG.Reporter("Guage Range Dropdown is not visible");
        return this;
    }

    public Manage_Products verifyMachineWashCheckboxDefaultState(){
        waitForElementVisible(machineWashCheckBox,second10TimeOut);
        LOG.Reporter("Machine wash checkbox is visible");
        Assert.assertFalse(machineWashCheckBox.isSelected(), "Machine Wash checkbox is selected by default");
        LOG.Reporter("Machine Wash checkbox is unselected by default");
        return this;
    }
// Need for Enhancememt
    public Manage_Products verifyMachineWashCheckboxSelection(){
        waitForElementVisible(machineWashCheckBox,second10TimeOut);
        Assert.assertFalse(machineWashCheckBox.isSelected(), "Machine Wash checkbox is selected by default");
        LOG.Reporter("Machine Wash checkbox is unselected by default");
        machineWashCheckBox.click();
        iselementEnable(machineWashCheckBox,2);
        Assert.assertTrue(machineWashCheckBox.isEnabled(), "Machine Wash checkbox is selected");
        LOG.Reporter("Machine Wash checkbox is selected");
        return this;
    }

    // M started 2 Feb

    public Manage_Products verifyDropdownOptionsPopulated(){
        clickOnWebElement(yarnBrand);
        LOG.Reporter("Clicked on Brand");
        sendKeys(yarnBrand, "  " + Keys.SPACE + Keys.SPACE);
        waitForVisibility(universalYarn);
        Assert.assertTrue(iselementVisible(universalYarn, second10TimeOut));
        LOG.Reporter("Verify Drop Down is Populated :: " + universalYarn.getText());
        return this;
    }

    public Manage_Products verifyBrandNameSelection(){
        verifyDropdownOptionsPopulated();
        clickOnWebElement(universalYarn);
        LOG.Reporter("Selected option from the brand drop down list ");
        Assert.assertEquals("Universal Yarn",getAttributeValue(yarnBrand));
        LOG.Reporter("Selected Value from the brand name drop down list :: "+getAttributeValue(yarnBrand));
        return this;
    }

    public Manage_Products verifyGreenMarkAfterBrandEntry(){
        Assert.assertFalse(iselementVisible(yarnBrandGreenTick),"Before entering data green tick is appearing ");
        LOG.Reporter("Green Tick is not appearing before entering data to yarn brand ");
        verifyBrandNameSelection();
        Assert.assertTrue(iselementVisible(yarnBrandGreenTick), "Green tick is not appearing after entering data ");
        LOG.Reporter("Green Tick is appearing after entering data");
        return this;

    }

    public Manage_Products verifyYarnBrandMandatory(){
        Assert.assertTrue(iselementVisible(yarnBrand));
        clickOnWebElement(submitButton);
        LOG.Reporter("Click on submit button");
        Assert.assertEquals("Brand name is required", getText(brandNameRequired));
        LOG.Reporter("Brand Name is required field ");
        return this;

    }

    public Manage_Products SaveAndContinueAndVerifyRedirect(){
        clickOnWebElement(saveAndContinue);
        Assert.assertTrue(iselementVisible(files),"User is not redirected to files screen ");
        LOG.Reporter("User is redirected to files screen ");
        clickOnWebElement(photoGalleryTab);
        LOG.Reporter("Clicked on Photo Gallery Tab");
        Assert.assertTrue(iselementVisible(photoDivVisible));
        LOG.Reporter("Previous data is saved");
        return this;
    }

    public Manage_Products verifyFileSectionUploadAndView(){
        clickOnWebElement(saveAndContinue);
        Assert.assertTrue(iselementVisible(files),"User is not redirected to files screen ");
        LOG.Reporter("User is redirected to files screen ");
        verifyFileTabVisible();
        verifyFileTab_UploadPDF();
        Assert.assertTrue(iselementVisible(fileCard), "File is not selected ");
        LOG.Reporter("File is uploaded ");
        waitForElementVisible(fileCheckbox,second10TimeOut);
        Assert.assertTrue(iselementVisible(fileCheckbox));
        LOG.Reporter("Checkbox on the right hand side of the card is displayed ");
        Assert.assertTrue(iselementVisible(pdfButton));
        LOG.Reporter("PDF on the left hand side of the card is displayed ");
        Assert.assertTrue(iselementVisible(clickHereToView));
        LOG.Reporter("Click here to view is available at the bottom the card ");
        return this;
    }

    public Manage_Products verifyUploadFileAndVerifyRemoveButton(){
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("User is redirected to files screen ");
        Assert.assertFalse(iselementVisible(removeFileButton));
        LOG.Reporter("Remove Files from selling channel button is not appearing before uploading file");
        verifyFileTab_UploadPDF();
        Assert.assertTrue(iselementVisible(removeFileButton));
        LOG.Reporter("Remove Files from selling channel button is appearing after uploading file");
        return this;
    }

    public Manage_Products verifyRemoveButtonState(){
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("User is redirected to files screen ");
        Assert.assertTrue(iselementVisible(files),"User is not redirected to files screen ");
        verifyFileTab_UploadPDF();
        Assert.assertFalse(iselementEnable(removeFileButton,2));
        LOG.Reporter("Remove File button is inactive");
        return this;
    }

    public Manage_Products verifyRemoveFileAndVerifyRemovedFile(){
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("User is redirected to files screen ");
        Assert.assertTrue(iselementVisible(files),"User is not redirected to files screen ");
        verifyFileTab_UploadPDF();
        Assert.assertTrue(iselementVisible(fileCard), "File is not selected ");
        LOG.Reporter("Uploaded File is displayed ");
        clickOnWebElement(fileCheckbox);
        LOG.Reporter("Clicked on checkbox");
        iselementVisible(removeFileButton, second10TimeOut);
        clickByAction(removeFileButton);
        LOG.Reporter("Clicked on remove file button ");
        Assert.assertFalse(iselementVisible(fileCard));
        LOG.Reporter("File is removed ");
        return this;
    }

    // 8 feb
    public Manage_Products isValidFileName(String filename){
        String pattern = "^[a-zA-Z0-9-_\\.]{3,70}$";
        Assert.assertTrue(filename.matches(pattern));
        LOG.Reporter("File name is valid.");
        return this;
    }
    public Manage_Products VerifyFileNameValidation(){
        clickOnWebElement(saveAndContinue);
        LOG.Reporter("User is redirected to files screen ");
        Assert.assertTrue(iselementVisible(files),"User is not redirected to files screen ");
        verifyFileTab_UploadPDF();
        String fileName = getText(pdfName);
        LOG.Reporter("File Name :: "+ fileName);
        isValidFileName(fileName);
        return this;
    }

    public Manage_Products isFieldNonMandatory(WebElement element){
        Assert.assertTrue(iselementVisible(element));
        String labelText = getText(element);
        LOG.Reporter("Field label Name :: "+labelText);
        Assert.assertTrue(!labelText.contains("Required"), labelText + "Field is mandatory.");
        LOG.Reporter(labelText + "Field is non mandatory Field");
        return this;
    }

    public Manage_Products verifyIsGaugeRangeFieldNonMandatory(){
        isFieldNonMandatory(gaugeFieldNonMandatory);
        return this;
    }

    public Manage_Products verifyIsMachineWashNonMandatory(){
        isFieldNonMandatory(isMachineCheckBoxMandatory);
        return this;
    }
    public Manage_Products verifyIsColorCardNonMandatory(){
        isFieldNonMandatory(isColorCardUrlMandatory);
        return this;
    }
    public Manage_Products verifyIsAliasesNonMandatory(){
        isFieldNonMandatory(isAliasesMandatory);
        return this;
    }

    // 9 Feb

    public Manage_Products verifySubmitButtonAccessibility(){
        verifyYarnName();
        verifyBrandNameSelection();
        verifyYarnWeightOptionPopulated();

        return this;
    }

    //M Ended

    public Manage_Products verifyDragAndDropPhotos() {
        String imagePath = filePath("img1.jpeg");
        choosePhoto_input.sendKeys(imagePath);
        LOG.Reporter("Photo is uploaded through drag and drop");
        Assert.assertTrue(iselementVisible(photoDivVisible, second10TimeOut));
        LOG.Reporter("Photo section visible");
        return this;

    }

    public Manage_Products verifyWithoutSavePhotos() {
        clickOnWebElement(fileLibraryButton);
        LOG.Reporter("Clicked on File Library Button");
        clickByAction(photoGalleryTab);
        LOG.Reporter("Clicked on Photo Gallery Tab");
        Assert.assertFalse(iselementVisible(photoDivVisible, second10TimeOut));
        LOG.Reporter("Photo is not uploaded");
        return this;
    }

    //P start

    public Manage_Products verifyListOfCategoryOptions() {
        clickOnWebElement(categoryDropdown);
        for (WebElement element : categoryOptionList) {
            Assert.assertTrue(iselementVisible(element));
            LOG.Reporter("Category options name :- " + element.getText());
        }
        return this;
    }

    public Manage_Products verifySearchInputCategoryField() {
        sendKeys(searchInputField, "Components");
        Assert.assertTrue(iselementVisible(matchingOption));
        LOG.Reporter("Matching category name :- " + getAttributeValue(matchingOption));
        return this;
    }

    public Manage_Products verifySubCategoryOfCategory() {
        sendKeys(searchInputField, "Component");
        Actions actions = new Actions(driver);
        actions.sendKeys(searchInputField, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        LOG.Reporter("Clicked on Category option");
        Assert.assertTrue(iselementVisible(subCategory));
        LOG.Reporter("Sub category options are visible");
        return this;
    }

    public Manage_Products verifyIsYarnWeightVisible() {
        clickOnWebElement(addYarnButton);
        LOG.Reporter("Click on Add yarn");
        Assert.assertTrue(iselementVisible(weightYarn, second10TimeOut));
        LOG.Reporter("Verified Yarn Weight Label:: " + weightYarn.getText());
        return this;
    }

    public Manage_Products verifyYarnWeightOptionPopulated() {
        clickOnWebElement(weightYarn);
        LOG.Reporter("Click on yarn weight field");
        Assert.assertTrue(iselementVisible(yarnWeightOptions));
        LOG.Reporter("Yarn weight option is displayed");
        clickOnWebElement(yarnWeightOption);
        LOG.Reporter("Selected yarn weight value ");
        LOG.Reporter(getText(yarnWeightSelected));
        Assert.assertEquals("Bulky", getText(yarnWeightSelected));
        LOG.Reporter("Yarn weight is selected");
        return this;
    }

    public Manage_Products verifyYarnWeightSelectOnlyOneOption() {
        Assert.assertFalse(iselementVisible(yarnWeightOptions, second10TimeOut));
        LOG.Reporter("Yarn Weight options are not visible");
        return this;
    }

    public Manage_Products verifyIsYarnWeightFieldRequired() {
        clickOnWebElement(addYarnButton);
        LOG.Reporter("Click on Add yarn");
        clickOnWebElement(submitButton);
        LOG.Reporter("Click on submit button");
        Assert.assertEquals("Weight is required", getText(yarnWeightRequired));
        LOG.Reporter("Yarn field is required");
        return this;
    }

    public Manage_Products verifyGreenTickOfYarnWeightField() {
        Assert.assertTrue(iselementVisible(greenTick));
        LOG.Reporter("Yarn field with green check");
        return this;
    }


    public Manage_Products verifyWrapsPerInchAutoFilled() {
        Assert.assertTrue(iselementVisible(wrapsPerInch));
        LOG.Reporter("Verified yarn weight auto filled " + getText(wrapsPerInch));
        return this;
    }

    public Manage_Products verifyYarnWeightUpdate() {
        String value = getText(weightYarn);
        clickOnWebElement(wrapsPerInch);
        LOG.Reporter("Click on wraps weight dropdown");
        clickOnWebElement(wrapsPerInchValue2);
        LOG.Reporter("Click on wraps weight dropdown value");
        Assert.assertNotEquals(value, getText(weightYarn));
        LOG.Reporter("Yarn weight value is changed");
        return this;
    }

    public Manage_Products verifySelectOneOptionInOneTime() {
        clickOnWebElement(wrapsPerInch);
        LOG.Reporter("Click on wraps weight dropdown");
        clickOnWebElement(wrapsPerInchValue2);
        LOG.Reporter("Click on wraps weight dropdown value");
        holdForElement(2);
        Assert.assertFalse(iselementVisible(wrapsList));
        LOG.Reporter("Wraps dropdown is not visible");
        return this;
    }

    public Manage_Products verifyWpiIsRequired() {
        clickOnWebElement(submitButton);
        LOG.Reporter("Click on submit button");
        Assert.assertEquals("WPI is required", getText(wpiRequired));
        LOG.Reporter("Verify WPI is required");
        return this;
    }

    public Manage_Products verifyWpiUnitRequired() {
        clickOnWebElement(addYarnButton);
        Assert.assertTrue(iselementVisible(wpiUnit));
        LOG.Reporter("WPI unit field is visible");
        return this;
    }

    public Manage_Products verifyWpiUnitSelectOnlyOneOption() {
        clickOnWebElement(addYarnButton);
        LOG.Reporter("Clicking on Add yarn button");
        clickOnWebElement(wpiUnit);
        LOG.Reporter("Clicking on Wpi unit");
        clickOnWebElement(wrapsPerInchValue);
        LOG.Reporter("Clicking on Wpi unit value" + getText(wrapsPerInchValue));

        return this;
    }

    //p End

    // R Started
    public Manage_Products verifyYarnName(){
        Assert.assertTrue(iselementVisible(yarnName));
        sendKeys(yarnName, "Test");
        LOG.Reporter("Entered yarn name in text field");
        return this;
    }

    public Manage_Products verifyYarnNameMandatory(){
        Assert.assertTrue(iselementVisible(yarnName));
        clickOnWebElement(submitButton);
        LOG.Reporter("Click on submit button");
        Assert.assertEquals("Yarn name is required", getText(yarnNameRequired));
        LOG.Reporter("Yarn Name field is required");
        return this;

    }

    public Manage_Products verifyNoBlankSpaceAdded(){
        Assert.assertTrue(iselementVisible(yarnName));
        sendKeys(yarnName, "  " + Keys.SPACE + Keys.SPACE);
        LOG.Reporter("Entered Space in Yarn Name Field ");
        clickOnWebElement(submitButton);
        LOG.Reporter("Click on submit button");
        Assert.assertEquals("Yarn name is required", getText(yarnNameRequired));
        LOG.Reporter("Yarn Name field is required");
        return this;

    }

    public Manage_Products verifyGreenTickOfYarnNameField() {
        sendKeys(yarnName, "Test");
        Assert.assertTrue(iselementVisible(greenTick));
        LOG.Reporter("Yarn Name field with green check");
        return this;
    }

    public Manage_Products verifyErrorToastOnYarnNameField() {
        Assert.assertTrue(iselementVisible(yarnName));
        LOG.Reporter("Nothing entered in Yarn Name Field");
        clickOnWebElement(submitButton);
        LOG.Reporter("Click on submit button");
        Assert.assertEquals("Yarn name is required", getText(yarnNameRequired));
        LOG.Reporter("Error Toast Message Occurred");
        return this;
    }

    public Manage_Products verifyBrandName(){
        Assert.assertTrue(iselementVisible(yarnBrand));
        sendKeys(yarnBrand, "Test");
        LOG.Reporter("Entered Brand name in text field");
        return this;
    }


    public Manage_Products verifyAutoSearchOnMinThreeChar(){
        Assert.assertTrue(iselementVisible(yarnBrand));
        sendKeys(yarnBrand, "ABC");
        LOG.Reporter("Entered Brand name in text field");
        Assert.assertTrue(iselementVisible(yarnBrandAutoSearch));
        LOG.Reporter("Auto search in the Brand field work occured");
        return this;
    }

// R Ended





}

