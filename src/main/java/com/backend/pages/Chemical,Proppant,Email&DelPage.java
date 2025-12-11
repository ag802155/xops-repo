package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.default_project.utils.ElementUtils;
import org.junit.Assert;

public class ChemicalProppantEmailDelPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public ChemicalProppantEmailDelPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "jobsSection")
    private WebElement jobsSection;

    @FindBy(css = ".job-list")
    private WebElement jobList;

    @FindBy(id = "wellDropdown")
    private WebElement wellDropdown;

    @FindBy(id = "stageDropdown")
    private WebElement stageDropdown;

    @FindBy(id = "chemicalSetupButton")
    private WebElement chemicalSetupButton;

    @FindBy(id = "chemicalSetupScreen")
    private WebElement chemicalSetupScreen;

    @FindBy(id = "proppantSetupButton")
    private WebElement proppantSetupButton;

    @FindBy(id = "proppantSetupScreen")
    private WebElement proppantSetupScreen;

    @FindBy(id = "addChemicalButton")
    private WebElement addChemicalButton;

    @FindBy(id = "chemicalNameDropdown")
    private WebElement chemicalNameDropdown;

    @FindBy(id = "designConcentrationInput")
    private WebElement designConcentrationInput;

    @FindBy(id = "designedVolumeInput")
    private WebElement designedVolumeInput;

    @FindBy(id = "refreshChemicalSetupButton")
    private WebElement refreshChemicalSetupButton;

    @FindBy(css = ".acid-list")
    private WebElement acidList;

    @FindBy(id = "vendorNameInput")
    private WebElement vendorNameInput;

    @FindBy(id = "meetingIDField")
    private WebElement meetingIDField;

    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;

    @FindBy(id = "addDeliveryRecordButton")
    private WebElement addDeliveryRecordButton;

    @FindBy(id = "vendorDropdown")
    private WebElement vendorDropdown;

    @FindBy(id = "poNumberInput")
    private WebElement poNumberInput;

    @FindBy(id = "chemicalTypeDropdown")
    private WebElement chemicalTypeDropdown;

    @FindBy(id = "bolNumberInput")
    private WebElement bolNumberInput;

    @FindBy(id = "receivedQuantityInput")
    private WebElement receivedQuantityInput;

    @FindBy(id = "chemicalSaveConfirmation")
    private WebElement chemicalSaveConfirmation;

    @FindBy(id = "designedVolumeDropdown")
    private WebElement designedVolumeDropdown;

    @FindBy(id = "chemicalList")
    private WebElement chemicalList;

    @FindBy(id = "vendorList")
    private WebElement vendorList;

    public void navigateToJobsSection() {
        elementUtils.clickElement(jobsSection);
    }

    public void selectJobFromList() {
        elementUtils.clickElement(jobList);
    }

    public void chooseWellAssociatedWithJob() {
        elementUtils.clickElement(wellDropdown);
    }

    public void selectStageForJob() {
        elementUtils.clickElement(stageDropdown);
    }


    public boolean isChemicalSetupScreenDisplayed() {
        return elementUtils.isElementDisplayed(chemicalSetupScreen);
    }


    public boolean isProppantSetupScreenDisplayed() {
        return elementUtils.isElementDisplayed(proppantSetupScreen);
    }


    public void selectChemicalFromDropdown(String chemicalName) {
        elementUtils.selectOptionInDropdown(chemicalNameDropdown, chemicalName);
    }

    public void enterDesignConcentration(String designConcentration) {
        elementUtils.clearAndSendKeys(designConcentrationInput, designConcentration);
    }

    public void enterDesignedVolume(String designedVolume) {
        elementUtils.clearAndSendKeys(designedVolumeInput, designedVolume);
    }

    public void refreshChemicalSetupScreen() {
        elementUtils.clickElement(refreshChemicalSetupButton);
    }

    public boolean isAcidAddedToList() {
        return elementUtils.isElementDisplayed(acidList);
    }

    public void enterVendorName(String vendorName) {
        elementUtils.clearAndSendKeys(vendorNameInput, vendorName);
    }

    public void locateMeetingIDField(String section) {
        elementUtils.clickElement(meetingIDField);
    }

    public void enterMeetingID(String meetingId) {
        elementUtils.clearAndSendKeys(meetingIDField, meetingId);
    }

    public boolean isMeetingIDUpdated() {
        return elementUtils.isElementDisplayed(meetingIDField);
    }

    public boolean hasValidationErrors() {
        return false; // Implement logic to check for validation errors
    }

    public boolean isConfirmationMessageDisplayed() {
        return elementUtils.isElementDisplayed(confirmationMessage);
    }


    public void selectVendorFromDropdown(String vendor) {
        elementUtils.selectOptionInDropdown(vendorDropdown, vendor);
    }

    public void enterPONumber(String poNumber) {
        elementUtils.clearAndSendKeys(poNumberInput, poNumber);
    }

    public void selectChemicalTypeFromDropdown(String chemicalType) {
        elementUtils.selectOptionInDropdown(chemicalTypeDropdown, chemicalType);
    }

    public void enterBOLNumber(String bolNumber) {
        elementUtils.clearAndSendKeys(bolNumberInput, bolNumber);
    }

    public void enterReceivedQuantity(String receivedQuantity) {
        elementUtils.clearAndSendKeys(receivedQuantityInput, receivedQuantity);
    }

    public boolean isDeliveryRecordSaved() {
        return true; // Implement logic to check if the delivery record is saved
    }

    public boolean isChemicalSavedSuccessfully() {
        return elementUtils.isElementDisplayed(chemicalSaveConfirmation);
    }

    public boolean isSaveConfirmationDisplayed() {
        return elementUtils.isElementDisplayed(chemicalSaveConfirmation);
    }

    public boolean isNewChemicalEntryFormDisplayed() {
        return false; // Implement logic to check if the new chemical entry form is displayed
    }

    public void fillInValidDataForChemical(String chemicalName) {
        // Implementation for filling in valid data for chemical
    }

    public boolean areExpectedChemicalNamesListed() {
        return false; // Implement logic to check if expected chemical names are listed
    }

    public void clickChemicalNameDropdown() {
        elementUtils.clickElement(chemicalNameDropdown);
    }

    public void clickDesignConcentrationDropdown() {
        elementUtils.clickElement(designConcentrationInput);
    }

    public boolean areValidConcentrationOptionsDisplayed() {
        return false; // Implement logic to check if valid concentration options are displayed
    }

    public void clickDesignedVolumeDropdown() {
        elementUtils.clickElement(designedVolumeInput);
    }

    public boolean areValidVolumeOptionsDisplayed() {
        return false; // Implement logic to check if valid volume options are displayed
    }

    public boolean hasLoadingErrors() {
        return false; // Implement logic to check if there are loading errors
    }

    public void fillInRequiredFields(String companyName, String chemicalName, String quantity, String deliveryDate, String email) {
        // Implementation for filling in required fields
    }

    public void clickDesignedVolumeDropdown() {
        elementUtils.clickElement(designedVolumeDropdown);
    }

    public void isChemicalAddedToList() {
        Assert.assertTrue(elementUtils.isElementDisplayed(chemicalList), "Chemical is not added to the list!");
    }

    public void isVendorAddedToList() {
        Assert.assertTrue(elementUtils.isElementDisplayed(vendorList), "Vendor is not added to the list!");
    }

    public void clickSaveButton() {
        // Assuming there's a save button to click
        WebElement saveButton = driver.findElement(By.id("saveButton")); // example locator
        elementUtils.clickElement(saveButton);
    }
}

public void clickProppantSetupOption() {
    try {
        WebElement proppantSetupOption = driver.findElement(By.id("proppantSetup"));
        elementUtils.clickElement(proppantSetupOption);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void clickAddDeliveryRecordButton() {
    try {
        WebElement addDeliveryRecordButton = driver.findElement(By.id("addDeliveryRecord"));
        elementUtils.clickElement(addDeliveryRecordButton);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void clickAddChemicalButton() {
    try {
        WebElement addChemicalButton = driver.findElement(By.id("addChemical"));
        elementUtils.clickElement(addChemicalButton);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void clickChemicalSetupOption() {
    try {
        WebElement chemicalSetupOption = driver.findElement(By.id("chemicalSetup"));
        elementUtils.clickElement(chemicalSetupOption);
    } catch (Exception e) {
        e.printStackTrace();
    }
}