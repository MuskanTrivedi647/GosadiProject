package utilities;

import com.github.javafaker.Faker;
import logger.LOG;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DriverUtils {
    public static final int shortTimeOut = 5;
    public static final int second10TimeOut = 10;
    protected static WebDriver driver;

    public DriverUtils(WebDriver driver) {
        this.driver = driver;
    }



    public void clickOnWebElement(WebElement element) {
        waitForVisibility(element);
        Assert.assertTrue(iselementVisible(element, 40));
        element.click();
    }

    public void sendKeys(WebElement elementLocator, String data) {
        Assert.assertTrue(iselementVisible(elementLocator, 50));
        elementLocator.clear();
        elementLocator.sendKeys(data);
    }

    public void sendKeysWithActions(WebElement elementLocator, String data) {
        Assert.assertTrue(iselementVisible(elementLocator, 50));
        Actions actions = new Actions(driver);
        actions.sendKeys(elementLocator, data).build().perform();
    }
    public String getText(WebElement elementLocator) {
        Assert.assertTrue(iselementVisible(elementLocator, 20));
        return elementLocator.getText();
    }

    public String getAttributeValue(WebElement element) {
        Assert.assertTrue(iselementVisible(element));
        return element.getAttribute("value");
    }

    public void switchToTabByIndex(WebDriver driver, int tabIndex) {
        try {
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

            if (tabIndex >= 0 && tabIndex < tabs.size()) {
                driver.switchTo().window(tabs.get(tabIndex));
            } else {
                System.out.println("Invalid tab index: " + tabIndex);
            }
        } catch (Exception e) {
            LOG.Reporter(e.getMessage());
        }
    }


    public WebElement waitForElementVisible(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (Exception ex) {
            LOG.Reporter(ex.getMessage());
            throw new RuntimeException("Unable to find element" + ex.getMessage());
        }
    }

    public boolean iselementVisible(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        } catch (Exception ex) {
            LOG.INFO(ex.getMessage());
            return false;
        }

    }

    public boolean iselementEnable(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.visibilityOf(element)).isEnabled();
        } catch (Exception ex) {
            LOG.INFO(ex.getMessage());
            return false;
        }

    }

    public void clickByAction(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
    }

    public void typeByAction(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).sendKeys().build().perform();
    }

    public void clickByJSE(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    public void waitForVisibility(WebElement e) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void clear(WebElement element) {
        waitForVisibility(element);
        element.clear();
    }
    public void clearWithJavaScript(WebElement element) {
        waitForVisibility(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=''", element);
    }

    public WebElement iselementClickable(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception ex) {
            LOG.INFO(ex.getMessage());
            throw new RuntimeException("element not clickable" + ex.getMessage());
        }
    }

    public boolean iselementVisible(WebElement element) {
        return iselementVisible(element, shortTimeOut);
    }

    public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
        Assert.assertTrue(iselementVisible(ele, 5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", ele);
    }

    public void scrollByElement(WebDriver driver, WebElement ele) {
        waitForElementVisible(ele, 10);  // Wait for element to be visible
        // Try preferred scrolling method first
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ele);

        // If not scrolled to bottom, use direct scrolling
        int scrollHeight = (int) js.executeScript("return document.body.scrollHeight");
        js.executeScript("window.scrollTo(0, " + scrollHeight + ")");
    }

    public void scrollToBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public boolean selectByVisibleText(String visibletext, WebElement ele) {
        boolean flag = false;
        try {
            Select s = new Select(ele);
            s.selectByVisibleText(visibletext);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                LOG.Reporter("Option selected by VisibleText");
            } else {
                LOG.Reporter("Option not selected by VisibleText");
            }
        }
    }

    public void printDropdownOptions(WebElement ele) {
        Select s = new Select(ele);
        List<WebElement> options = s.getOptions();
        for (WebElement option : options) {
            LOG.Reporter("Option Are : " + option.getText());
        }
    }
    public void printDropdownOptions(List<WebElement> options) {
        for (WebElement option : options) {
            LOG.Reporter("Option Are : " + option.getText());
        }
    }


    public boolean isMultiSelectByVisibleText(String visibletext, WebElement ele) {
        boolean flag = false;
        try {
            Select s = new Select(ele);

            // Check if the dropdown is a multi-select dropdown
            boolean isMultiSelect = s.isMultiple();

            if (isMultiSelect) {
                List<WebElement> options = s.getOptions();

                for (WebElement option : options) {
                    if (option.getText().equals(visibletext)) {
                        option.click(); // Select the option
                        flag = true;
                        break;
                    }
                }

            } else {
                s.selectByVisibleText(visibletext);
                flag = true;
            }

            return flag;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                LOG.Reporter("Option selected by VisibleText");
            } else {
                LOG.Reporter("Option not selected by VisibleText");
            }
        }
    }


    public boolean selectByValue(WebElement element, String value) {
        boolean flag = false;
        try {
            Select s = new Select(element);
            s.selectByValue(value);
            flag = true;
            return true;
        } catch (Exception e) {

            return false;
        } finally {
            if (flag) {
                System.out.println("Option selected by Value");
            } else {
                System.out.println("Option not selected by Value");
            }
        }

    }

    public void generateRandomCharacter(WebElement element) {
        String randomAlphabet = generateRandomAlphabet(4);
        sendKeys(element, randomAlphabet);
    }

    public String generateRandomAlphabet(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomAlphabet = (char) (random.nextInt(26) + 'a');
            sb.append(randomAlphabet);
        }
        return sb.toString();
    }

    public String generateRandomEmail() {
        Faker faker = new Faker();
        String username = faker.name().username();
        String domain = "appinventiv.com";
        String randomEmail = username + "@" + domain;
        return randomEmail;
    }

    public static void selectOptionFromDropdown(WebElement dropdown, String optionText) {
        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Click on the dropdown to open it
        dropdown.click();
        // Send keys to the dropdown to filter options (if applicable)
        dropdown.sendKeys(optionText);
        // Perform keyboard actions (DOWN key to navigate down, ENTER key to select)
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    }
}
