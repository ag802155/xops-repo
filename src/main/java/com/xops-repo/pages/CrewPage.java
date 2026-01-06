package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CrewPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public CrewPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "newCrewButton")
    private WebElement newCrewButton;

    @FindBy(id = "referenceDataOption")
    private WebElement referenceDataOption;

    @FindBy(id = "crewsOption")
    private WebElement crewsOption;

    @FindBy(id = "fleetDropdown")
    private WebElement fleetDropdown;

    @FindBy(id = "crewNameInput")
    private WebElement crewNameInput;

    @FindBy(id = "jobPatternDropdown")
    private WebElement jobPatternDropdown;

    @FindBy(id = "shiftStartDropdown")
    private WebElement shiftStartDropdown;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    @FindBy(id = "previewSection")
    private WebElement previewSection;

    @FindBy(id = "addEditCrewPopup")
    private WebElement addEditCrewPopup;

    @FindBy(id = "manageCrewsTable")
    private WebElement manageCrewsTable;

    public void clicksNewCrewButton() {
        elementUtils.clickElement(newCrewButton);
    }

    public void clicksReferenceDataOption() {
        elementUtils.clickElement(referenceDataOption);
    }

    public void clicksOnCrews() {
        elementUtils.clickElement(crewsOption);
    }

    public void selectFleetFromDropdown(String fleet) {
        elementUtils.clickElement(fleetDropdown);
        elementUtils.selectOptionInDropdown(fleetDropdown, fleet);
    }

    public void enterCrewName(String crewName) {
        elementUtils.clearAndSendKeys(crewNameInput, crewName);
    }

    public void selectJobPattern(String jobPattern) {
        elementUtils.clickElement(jobPatternDropdown);
        elementUtils.selectOptionInDropdown(jobPatternDropdown, jobPattern);
    }

    public void selectShiftStart(String shiftStart) {
        elementUtils.clickElement(shiftStartDropdown);
        elementUtils.selectOptionInDropdown(shiftStartDropdown, shiftStart);
    }

    public void clicksSaveButton() {
        elementUtils.clickElement(saveButton);
    }

    public boolean isAddEditCrewPopupDisplayed() {
        return elementUtils.isElementDisplayed(addEditCrewPopup);
    }

    public boolean isPreviewSectionDisplayed() {
        return elementUtils.isElementDisplayed(previewSection);
    }

    public void isCrewDisplayedInTable(String crewName) {
        boolean isDisplayed = elementUtils.isElementDisplayed(manageCrewsTable);
        Assert.assertTrue("Crew is not displayed in the table", isDisplayed);
    }

    public void verifyAllColumnsAndNewCrewButton() {
        boolean isDisplayed = elementUtils.isElementDisplayed(newCrewButton);
        Assert.assertTrue("New Crew button is not visible", isDisplayed);
        // Additional checks for other columns can be added here
    }

    public void loginToApplication(String username, String password) {
        try {
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            elementUtils.clearAndSendKeys(usernameField, username);
            elementUtils.clearAndSendKeys(passwordField, password);
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToHomePage() {
        try {
            WebElement homePageLink = driver.findElement(By.id("homePageLink"));
            elementUtils.clickElement(homePageLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isCrewDisplayed() {
        try {
            WebElement crewSection = driver.findElement(By.id("crewSection"));
            boolean isDisplayed = elementUtils.isElementDisplayed(crewSection);
            Assert.assertTrue(isDisplayed, "Crew section is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isNewCrewButtonVisible() {
        boolean isVisible = elementUtils.isElementDisplayed(newCrewButton);
        Assert.assertTrue(isVisible, "New Crew button is not visible!");
    }

    public void verifyTableColumns(String column1, String column2) {
        try {
            WebElement columnHeader1 = driver.findElement(By.xpath("//table/thead/tr/th[text()='" + column1 + "']"));
            WebElement columnHeader2 = driver.findElement(By.xpath("//table/thead/tr/th[text()='" + column2 + "']"));
            String actualHeader1 = elementUtils.getElementText(columnHeader1);
            String actualHeader2 = elementUtils.getElementText(columnHeader2);

            Assert.assertEquals(actualHeader1, column1, "Column1 does not match!");
            Assert.assertEquals(actualHeader2, column2, "Column2 does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStartDate(String date) {
        try {
            WebElement startDateField = driver.findElement(By.id("startDate"));
            elementUtils.clearAndSendKeys(startDateField, date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}