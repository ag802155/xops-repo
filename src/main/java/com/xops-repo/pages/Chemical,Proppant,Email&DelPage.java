package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class ChemicalProppantEmailDelPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "jobsSection")
    private WebElement jobsSection;
    @FindBy(id = "jobList")
    private WebElement jobList;
    @FindBy(id = "wellDropdown")
    private WebElement wellDropdown;
    @FindBy(id = "stageDropdown")
    private WebElement stageDropdown;
    @FindBy(id = "chemicalSetupOption")
    private WebElement chemicalSetupOption;
    @FindBy(id = "proppantSetupOption")
    private WebElement proppantSetupOption;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;
    @FindBy(id = "chemicalNameDropdown")
    private WebElement chemicalNameDropdown;
    @FindBy(id = "designConcentrationInput")
    private WebElement designConcentrationInput;
    @FindBy(id = "designedVolumeInput")
    private WebElement designedVolumeInput;
    @FindBy(id = "vendorNameInput")
    private WebElement vendorNameInput;
    @FindBy(id = "meetingIdField")
    private WebElement meetingIdField;
    @FindBy(id = "deliveryRecordList")
    private WebElement deliveryRecordList;
    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    public ChemicalProppantEmailDelPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToJobsSection() {
        elementUtils.clickElement(jobsSection);
    }

    public void selectJobFromList() {
        elementUtils.clickElement(jobList);
    }

    public void chooseWellForJob() {
        elementUtils.clickElement(wellDropdown);
    }

    public void selectStageForJob() {
        elementUtils.clickElement(stageDropdown);
    }

    public void clickChemicalSetupOption() {
        elementUtils.clickElement(chemicalSetupOption);
    }

    public boolean isChemicalSetupScreenDisplayed() {
        return elementUtils.isElementDisplayed(chemicalSetupOption);
    }

    public void clickProppantSetupOption() {
        elementUtils.clickElement(proppantSetupOption);
    }

    public boolean isProppantSetupScreenDisplayed() {
        return elementUtils.isElementDisplayed(proppantSetupOption);
    }

    public void selectChemicalFromDropdown(String chemicalName) {
        elementUtils.clickElement(chemicalNameDropdown);
        elementUtils.selectOptionInDropdown(chemicalNameDropdown, chemicalName);
    }

    public void enterDesignConcentration(String designConcentration) {
        elementUtils.clearAndSendKeys(designConcentrationInput, designConcentration);
    }

    public void enterDesignedVolume(String designedVolume) {
        elementUtils.clearAndSendKeys(designedVolumeInput, designedVolume);
    }

    public void enterPONumber(String poNumber) {
        elementUtils.clearAndSendKeys(vendorNameInput, poNumber);
    }

    public void clickSave() {
        elementUtils.clickElement(saveButton);
    }

    public boolean isConfirmationMessageDisplayed() {
        return elementUtils.isElementDisplayed(confirmationMessage);
    }

    public void enterMeetingID(String meetingId) {
        elementUtils.clearAndSendKeys(meetingIdField, meetingId);
    }

    public boolean isDeliveryRecordAdded() {
        return elementUtils.isElementDisplayed(deliveryRecordList);
    }

    public boolean isErrorMessageDisplayed() {
        return elementUtils.isElementDisplayed(errorMessage);
    }

    public void isOnEmailSetupScreen() {
        WebElement emailSetupScreen = driver.findElement(By.id("emailSetupScreen"));
        Assert.assertTrue(emailSetupScreen.isDisplayed(), "Email Setup Screen is not displayed!");
    }

    ublic void isAcidInListenerVendorName() {
        WebElement acidVendorName = driver.findElement(By.id("acidVendorName"));
        Assert.assertTrue(acidVendorName.isDisplayed(), "Acid in Vendor Name not found!");
    }

    public void clickDesignedVolumeDropdown() {
        WebElement designedVolumeDropdown = driver.findElement(By.id("designedVolumeDropdown"));
        ElementUtils.clickElement(designedVolumeDropdown);
    }

    public void enterEmailSetupDetails(String email) {
        WebElement emailInput = driver.findElement(By.id("emailInput"));
        ElementUtils.clearAndSendKeys(emailInput, email);
    }

    public void isOnProppantSetupScreen() {
        WebElement proppantSetupScreen = driver.findElement(By.id("proppantSetupScreen"));
        Assert.assertTrue(proppantSetupScreen.isDisplayed(), "Proppant Setup Screen is not displayed!");
    }

    public void verifyEntryPersistence() {
        WebElement entryField = driver.findElement(By.id("entryField"));
        String actualValue = ElementUtils.getElementText(entryField);
        String expectedValue = "Expected Value"; // Replace with actual expected value
        Assert.assertEquals(actualValue, expectedValue, "Entry persistence check failed!");
    }

    public void selectChemicalTypeFromDropdown(String chemicalType) {
        WebElement chemicalTypeDropdown = driver.findElement(By.id("chemicalTypeDropdown"));
        ElementUtils.selectOptionInDropdown(chemicalTypeDropdown, chemicalType);
    }

    public void clickAddProppantButton() {
        WebElement addProppantButton = driver.findElement(By.id("addProppantButton"));
        ElementUtils.clickElement(addProppantButton);
    }

    public void isVendorSaved() {
        WebElement vendorSavedMessage = driver.findElement(By.id("vendorSavedMessage"));
        Assert.assertTrue(vendorSavedMessage.isDisplayed(), "Vendor not saved!");
    }

    public void isVendorInList(String vendorName) {
        WebElement vendorList = driver.findElement(By.id("vendorList"));
        Assert.assertTrue(vendorList.getText().contains(vendorName), "Vendor not found in list!");
    }

    public void noValidationErrors() {
        WebElement validationErrors = driver.findElement(By.id("validationErrors"));
        Assert.assertFalse(validationErrors.isDisplayed(), "Validation errors are present!");
    }

    public void verifyAllEnteredDetails(String expectedDetails) {
        WebElement detailsField = driver.findElement(By.id("detailsField"));
        String actualDetails = ElementUtils.getElementText(detailsField);
        Assert.assertEquals(actualDetails, expectedDetails, "Entered details do not match!");
    }

    public void enterDesignConcentrationValue(String value) {
        WebElement designConcentrationInput = driver.findElement(By.id("designConcentrationInput"));
        ElementUtils.clearAndSendKeys(designConcentrationInput, value);
    }

    public void isOnChemicalDeliveryTrackingScreen() {
        WebElement chemicalTrackingScreen = driver.findElement(By.id("chemicalTrackingScreen"));
        Assert.assertTrue(chemicalTrackingScreen.isDisplayed(), "Chemical Delivery Tracking Screen is not displayed!");
    }

    public void enterBOLNumber(String bolNumber) {
        WebElement bolInput = driver.findElement(By.id("bolInput"));
        ElementUtils.clearAndSendKeys(bolInput, bolNumber);
    }

    public void isProppantSuccessfullyAdded() {
        WebElement proppantSuccessMessage = driver.findElement(By.id("proppantSuccessMessage"));
        Assert.assertTrue(proppantSuccessMessage.isDisplayed(), "Proppant was not successfully added!");
    }

    public void isMeetingIdUpdatedSuccessfully(String expectedMeetingId) {
        WebElement meetingIdField = driver.findElement(By.id("meetingIdField"));
        String actualMeetingId = ElementUtils.getElementText(meetingIdField);
        Assert.assertEquals(actualMeetingId, expectedMeetingId, "Meeting ID was not updated successfully!");
    }

    public void verifyAllProppantsAdded(String expectedProppants) {
        WebElement proppantsList = driver.findElement(By.id("proppantsList"));
        String actualProppants = ElementUtils.getElementText(proppantsList);
        Assert.assertEquals(actualProppants, expectedProppants, "Not all proppants were added!");
    }

    public void refreshEmailSetupScreen() {
        driver.navigate().refresh();
        isOnEmailSetupScreen();
    }

    public void areJobWellStageDisplayedCorrectly() {
        WebElement wellStage = driver.findElement(By.id("wellStage"));
        Assert.assertTrue(wellStage.isDisplayed(), "Job Well Stage is not displayed correctly!");
    }

    public void selectFromDropdown(String dropdownId, String option) {
        WebElement dropdown = driver.findElement(By.id(dropdownId));
        ElementUtils.selectOptionInDropdown(dropdown, option);
    }

    public void refreshProppantSetupScreen() {
        driver.navigate().refresh();
        isOnProppantSetupScreen();
    }

    public void verifyProppantWithTotalDesignVolume(String expectedVolume) {
        WebElement volumeField = driver.findElement(By.id("totalDesignVolume"));
        String actualVolume = ElementUtils.getElementText(volumeField);
        Assert.assertEquals(actualVolume, expectedVolume, "Total Design Volume does not match!");
    }

    public void verifyAddedProppantInList(String expectedProppant) {
        WebElement proppantList = driver.findElement(By.id("proppantList"));
        Assert.assertTrue(proppantList.getText().contains(expectedProppant), "Added Proppant not found in the list!");
    }

    public void clickDesignConcentrationDropdown() {
        WebElement designConcentrationDropdown = driver.findElement(By.id("designConcentrationDropdown"));
        ElementUtils.clickElement(designConcentrationDropdown);
    }

    public void locateMeetingIdField() {
        WebElement meetingIdField = driver.findElement(By.id("meetingIdField"));
        Assert.assertTrue(meetingIdField.isDisplayed(), "Meeting ID field not found!");
    }

    public void isChemicalSaved() {
        WebElement chemicalSavedMessage = driver.findElement(By.id("chemicalSavedMessage"));
        Assert.assertTrue(chemicalSavedMessage.isDisplayed(), "Chemical was not saved!");
    }

    public void isDeliveryRecordSuccessfullyAdded() {
        WebElement deliverySuccessMessage = driver.findElement(By.id("deliverySuccessMessage"));
        Assert.assertTrue(deliverySuccessMessage.isDisplayed(), "Delivery record was not successfully added!");
    }

    public void verifyJobWellStageDisplay() {
        WebElement jobWellStage = driver.findElement(By.id("jobWellStage"));
        Assert.assertTrue(jobWellStage.isDisplayed(), "Job Well Stage is not displayed correctly!");
    }

    public void isProppantAdded(String expectedProppant) {
        WebElement proppantList = driver.findElement(By.id("proppantList"));
        Assert.assertTrue(proppantList.getText().contains(expectedProppant), "Proppant not added!");
    }

    public void clickSaveButtonForLastEntry() {
        WebElement saveButton = driver.findElement(By.id("saveButtonLastEntry"));
        ElementUtils.clickElement(saveButton);
    }

    public void verifyChemicalNameDropdown(String expectedChemicalName) {
        WebElement chemicalNameDropdown = driver.findElement(By.id("chemicalNameDropdown"));
        Assert.assertTrue(chemicalNameDropdown.getText().contains(expectedChemicalName), "Chemical name not found in dropdown!");
    }

    public void verifyEnteredDetails(String expectedDetails) {
        WebElement detailsField = driver.findElement(By.id("detailsField"));
        String actualDetails = ElementUtils.getElementText(detailsField);
        Assert.assertEquals(actualDetails, expectedDetails, "Entered details do not match!");
    }

    public void enterReceivedQuantity(String quantity) {
        WebElement receivedQuantityInput = driver.findElement(By.id("receivedQuantityInput"));
        ElementUtils.clearAndSendKeys(receivedQuantityInput, quantity);
    }

    public void isRedirectedToScreen(String expectedUrl) {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl, "Not redirected to expected screen!");
    }

    public void clickEmailSetupOption() {
        WebElement emailSetupOption = driver.findElement(By.id("emailSetupOption"));
        ElementUtils.clickElement(emailSetupOption);
    }

    public void verifyJobWellStageDisplayOnEmailSetup() {
        WebElement jobWellStageEmail = driver.findElement(By.id("jobWellStageEmail"));
        Assert.assertTrue(jobWellStageEmail.isDisplayed(), "Job Well Stage is not displayed on Email Setup!");
    }

    public void leaveVendorNameFieldEmpty() {
        WebElement vendorNameInput = driver.findElement(By.id("vendorNameInput"));
        ElementUtils.clearElement(vendorNameInput);
    }

    public void clickButton(String buttonName) {
        WebElement button = driver.findElement(By.id(buttonName));
        ElementUtils.clickElement(button);
    }

    public void enterUOM(String uom) {
        WebElement uomInput = driver.findElement(By.id("uomInput"));
        ElementUtils.clearAndSendKeys(uomInput, uom);
    }

    public void enterValidDesignConcentration(String concentration) {
        WebElement concentrationInput = driver.findElement(By.id("concentrationInput"));
        ElementUtils.clearAndSendKeys(concentrationInput, concentration);
    }

    public void refreshChemicalSetupScreen() {
        driver.navigate().refresh();
        isOnChemicalSetupScreen();
    }

    public void enterMeetingId(String meetingId) {
        WebElement meetingIdInput = driver.findElement(By.id("meetingIdInput"));
        ElementUtils.clearAndSendKeys(meetingIdInput, meetingId);
    }

    public void leaveDesignedVolumeFieldEmpty() {
        WebElement designedVolumeInput = driver.findElement(By.id("designedVolumeInput"));
        ElementUtils.clearElement(designedVolumeInput);
    }

    public void verifyEntryPersistenceAfterRefresh() {
        WebElement entryField = driver.findElement(By.id("entryField"));
        String actualValue = ElementUtils.getElementText(entryField);
        String expectedValue = "Expected Value"; // Replace with actual expected value
        Assert.assertEquals(actualValue, expectedValue, "Entry persistence check failed after refresh!");
    }

    public void clickSaveButton() {
        ElementUtils.clickElement(saveButton);
    }

    public void isDeliveryRecordCreated() {
        WebElement deliveryRecordMessage = driver.findElement(By.id("deliveryRecordMessage"));
        Assert.assertTrue(deliveryRecordMessage.isDisplayed(), "Delivery record was not created!");
    }

    public void selectCurrentJobFromList(String jobName) {
        WebElement jobList = driver.findElement(By.id("jobList"));
        WebElement currentJob = jobList.findElement(By.xpath(".//option[text()='" + jobName + "']"));
        ElementUtils.selectOptionInDropdown(currentJob, jobName);
    }

    public void verifyProppantNameDropdown(String expectedProppantName) {
        WebElement proppantNameDropdown = driver.findElement(By.id("proppantNameDropdown"));
        Assert.assertTrue(proppantNameDropdown.getText().contains(expectedProppantName), "Proppant name not found in dropdown!");
    }

    public void areValidVolumeOptionsDisplayed() {
        WebElement volumeOptions = driver.findElement(By.id("volumeOptions"));
        Assert.assertTrue(volumeOptions.isDisplayed(), "Valid volume options are not displayed!");
    }

    public void clickSaveAndNewButton() {
        WebElement saveAndNewButton = driver.findElement(By.id("saveAndNewButton"));
        ElementUtils.clickElement(saveAndNewButton);
    }

    public void clickProppantNameDropdown() {
        WebElement proppantNameDropdown = driver.findElement(By.id("proppantNameDropdown"));
        ElementUtils.clickElement(proppantNameDropdown);
    }

    public void navigateToProppantSetupScreen() {
        driver.navigate().to("http://localhost/proppantSetup");
        isOnProppantSetupScreen();
    }

    public void clickAddChemicalButtonAgain() {
        WebElement addChemicalButton = driver.findElement(By.id("addChemicalButton"));
        ElementUtils.clickElement(addChemicalButton);
    }

    public void isDeliveryRecordSaved() {
        WebElement deliveryRecordSavedMessage = driver.findElement(By.id("deliveryRecordSavedMessage"));
        Assert.assertTrue(deliveryRecordSavedMessage.isDisplayed(), "Delivery record was not saved!");
    }

    public void verifyJobWellStageDisplayOnChemicalSetup() {
        WebElement jobWellStageChemical = driver.findElement(By.id("jobWellStageChemical"));
        Assert.assertTrue(jobWellStageChemical.isDisplayed(), "Job Well Stage is not displayed on Chemical Setup!");
    }

    public void verifyCorrectDesignConcentrationVolume(String expectedVolume) {
        WebElement concentrationVolumeField = driver.findElement(By.id("concentrationVolumeField"));
        String actualVolume = ElementUtils.getElementText(concentrationVolumeField);
        Assert.assertEquals(actualVolume, expectedVolume, "Design Concentration Volume is incorrect!");
    }

    public void verifyTotalDesignVolume(String expectedVolume) {
        WebElement totalDesignVolumeField = driver.findElement(By.id("totalDesignVolumeField"));
        String actualVolume = ElementUtils.getElementText(totalDesignVolumeField);
        Assert.assertEquals(actualVolume, expectedVolume, "Total Design Volume does not match!");
    }

    public void hasValidationErrors() {
        WebElement validationErrors = driver.findElement(By.id("validationErrors"));
        Assert.assertTrue(validationErrors.isDisplayed(), "No validation errors displayed when they are expected!");
    }

    public void clickChemicalNameDropdown() {
        WebElement chemicalNameDropdown = driver.findElement(By.id("chemicalNameDropdown"));
        ElementUtils.clickElement(chemicalNameDropdown);
    }

    public void verifyProppantNameAndDesignVolume(String expectedProppant, String expectedVolume) {
        WebElement proppantList = driver.findElement(By.id("proppantList"));
        Assert.assertTrue(proppantList.getText().contains(expectedProppant), "Proppant name not found!");
        WebElement designVolumeField = driver.findElement(By.id("designVolumeField"));
        String actualVolume = ElementUtils.getElementText(designVolumeField);
        Assert.assertEquals(actualVolume, expectedVolume, "Design Volume does not match!");
    }

    public void noValidationErrorsDuringProcess() {
        WebElement validationErrors = driver.findElement(By.id("validationErrors"));
        Assert.assertFalse(validationErrors.isDisplayed(), "Validation errors are present when they should not be!");
    }

    public void locateMeetingIDField() {
        WebElement meetingIdField = driver.findElement(By.id("meetingIdField"));
        Assert.assertTrue(meetingIdField.isDisplayed(), "Meeting ID field not found!");
    }

    public void isAcidAdditivesEntryAdded() {
        WebElement acidAdditivesEntry = driver.findElement(By.id("acidAdditivesEntry"));
        Assert.assertTrue(acidAdditivesEntry.isDisplayed(), "Acid Additives entry was not added!");
    }

    public void isMeetingIDUpdated(String expectedMeetingId) {
        WebElement meetingIdField = driver.findElement(By.id("meetingIdField"));
        String actualMeetingId = ElementUtils.getElementText(meetingIdField);
        Assert.assertEquals(actualMeetingId, expectedMeetingId, "Meeting ID was not updated!");
    }

    public void verifyMeetingIdPersistence(String expectedMeetingId) {
        WebElement meetingIdField = driver.findElement(By.id("meetingIdField"));
        String actualMeetingId = ElementUtils.getElementText(meetingIdField);
        Assert.assertEquals(actualMeetingId, expectedMeetingId, "Meeting ID persistence check failed!");
    }

    public void verifyVendorNameAndPONumber(String expectedVendorName, String expectedPONumber) {
        WebElement vendorNameField = driver.findElement(By.id("vendorNameField"));
        String actualVendorName = ElementUtils.getElementText(vendorNameField);
        Assert.assertEquals(actualVendorName, expectedVendorName, "Vendor name does not match!");

        WebElement poNumberField = driver.findElement(By.id("poNumberField"));
        String actualPONumber = ElementUtils.getElementText(poNumberField);
        Assert.assertEquals(actualPONumber, expectedPONumber, "PO Number does not match!");
    }

    public void enterBolQuantity(String quantity) {
        WebElement bolQuantityInput = driver.findElement(By.id("bolQuantityInput"));
        ElementUtils.clearAndSendKeys(bolQuantityInput, quantity);
    }

    public void selectPOFromDropdown(String poNumber) {
        WebElement poDropdown = driver.findElement(By.id("poDropdown"));
        ElementUtils.selectOptionInDropdown(poDropdown, poNumber);
    }

    public void clickAddChemicalButton() {
        WebElement addChemicalButton = driver.findElement(By.id("addChemicalButton"));
        ElementUtils.clickElement(addChemicalButton);
    }

    public void verifyDesignConcentrationAndVolume(String expectedConcentration, String expectedVolume) {
        WebElement concentrationField = driver.findElement(By.id("concentrationField"));
        String actualConcentration = ElementUtils.getElementText(concentrationField);
        Assert.assertEquals(actualConcentration, expectedConcentration, "Design Concentration does not match!");

        WebElement volumeField = driver.findElement(By.id("volumeField"));
        String actualVolume = ElementUtils.getElementText(volumeField);
        Assert.assertEquals(actualVolume, expectedVolume, "Design Volume does not match!");
    }

    public void noErrorsLoadingDropdownOptions() {
        WebElement dropdownError = driver.findElement(By.id("dropdownError"));
        Assert.assertFalse(dropdownError.isDisplayed(), "There are errors loading dropdown options!");
    }

    public void leaveChemicalNameFieldEmpty() {
        WebElement chemicalNameInput = driver.findElement(By.id("chemicalNameInput"));
        ElementUtils.clearElement(chemicalNameInput);
    }

    public void areExpectedChemicalNamesListed(String[] expectedChemicalNames) {
        WebElement chemicalNamesDropdown = driver.findElement(By.id("chemicalNamesDropdown"));
        for (String expectedName : expectedChemicalNames) {
            Assert.assertTrue(chemicalNamesDropdown.getText().contains(expectedName), "Expected chemical name not listed: " + expectedName);
        }
    }

    public void isSlickwaterEntryAdded() {
        WebElement slickwaterEntry = driver.findElement(By.id("slickwaterEntry"));
        Assert.assertTrue(slickwaterEntry.isDisplayed(), "Slickwater entry was not added!");
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void clickVendorTypeDropdown() {
        WebElement vendorTypeDropdown = driver.findElement(By.id("vendorTypeDropdown"));
        ElementUtils.clickElement(vendorTypeDropdown);
    }

    public void selectVendorType(String vendorType) {
        WebElement vendorTypeDropdown = driver.findElement(By.id("vendorTypeDropdown"));
        ElementUtils.selectOptionInDropdown(vendorTypeDropdown, vendorType);
    }

    public void selectChemicalFromVendorTypeDropdown(String chemical) {
        WebElement chemicalDropdown = driver.findElement(By.id("chemicalDropdownFromVendorType"));
        ElementUtils.selectOptionInDropdown(chemicalDropdown, chemical);
    }

    public void isSaveConfirmationDisplayed() {
        WebElement saveConfirmationMessage = driver.findElement(By.id("saveConfirmationMessage"));
        Assert.assertTrue(saveConfirmationMessage.isDisplayed(), "Save confirmation is not displayed!");
    }

    public void enterTotalDesignVolume(String volume) {
        WebElement totalDesignVolumeInput = driver.findElement(By.id("totalDesignVolumeInput"));
        ElementUtils.clearAndSendKeys(totalDesignVolumeInput, volume);
    }

    public void selectOption(String dropdownId, String option) {
        WebElement dropdown = driver.findElement(By.id(dropdownId));
        ElementUtils.selectOptionInDropdown(dropdown, option);
    }

    public void openEmailSetupScreen() {
        driver.navigate().to("http://localhost/emailSetup");
        isOnEmailSetupScreen();
    }

    public void isVendorNameRequiredErrorDisplayed() {
        WebElement errorMessage = driver.findElement(By.id("vendorNameRequiredError"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Vendor Name required error is not displayed!");
    }

    public void isFormResetForNewEntry() {
        WebElement form = driver.findElement(By.id("entryForm"));
        Assert.assertTrue(form.getText().isEmpty(), "Form is not reset for a new entry!");
    }

    public void navigateToChemicalSetupScreen() {
        driver.navigate().to("http://localhost/chemicalSetup");
        isOnChemicalSetupScreen();
    }

    public void isTotalDesignVolumePositiveErrorDisplayed() {
        WebElement errorMessage = driver.findElement(By.id("totalDesignVolumePositiveError"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Total Design Volume positive error is not displayed!");
    }

    public void enterValidDesignedVolume(String volume) {
        WebElement designedVolumeInput = driver.findElement(By.id("designedVolumeInput"));
        ElementUtils.clearAndSendKeys(designedVolumeInput, volume);
    }

    public void verifyEntriesPersistence() {
        // Implement persistence check logic as required.
    }

    public void clickMeetingIdField() {
        WebElement meetingIdField = driver.findElement(By.id("meetingIdField"));
        ElementUtils.clickElement(meetingIdField);
    }

    public void isChemicalInList(String expectedChemical) {
        WebElement chemicalList = driver.findElement(By.id("chemicalList"));
        Assert.assertTrue(chemicalList.getText().contains(expectedChemical), "Chemical not found in list!");
    }

    public void isChemicalAdded() {
        WebElement chemicalSuccessMessage = driver.findElement(By.id("chemicalSuccessMessage"));
        Assert.assertTrue(chemicalSuccessMessage.isDisplayed(), "Chemical was not added!");
    }

    public void isLastEntrySavedSuccessfully() {
        WebElement successMessage = driver.findElement(By.id("lastEntrySuccessMessage"));
        Assert.assertTrue(successMessage.isDisplayed(), "Last entry was not saved successfully!");
    }

    public void repeatPreviousSteps() {
        // This method can contain logic to repeat previous steps as required.
    }

    public void verifyAllVendorsAdded() {
        // Implement logic to verify all vendors have been added.
    }

    public void fillInRequiredFields(String requiredFieldsData) {
        // Fill in required fields based on provided data.
    }

    public void isFirstChemicalSavedSuccessfully() {
        WebElement firstChemicalSuccessMessage = driver.findElement(By.id("firstChemicalSuccessMessage"));
        Assert.assertTrue(firstChemicalSuccessMessage.isDisplayed(), "First chemical was not saved successfully!");
    }

    public void clickSaveAndNew() {
        WebElement saveAndNewButton = driver.findElement(By.id("saveAndNewButton"));
        ElementUtils.clickElement(saveAndNewButton);
    }

    public void clickAddDeliveryRecordButton() {
        WebElement addDeliveryRecordButton = driver.findElement(By.id("addDeliveryRecordButton"));
        ElementUtils.clickElement(addDeliveryRecordButton);
    }

    public void isVendorRequiredErrorDisplayed() {
        WebElement vendorRequiredError = driver.findElement(By.id("vendorRequiredError"));
        Assert.assertTrue(vendorRequiredError.isDisplayed(), "Vendor required error is not displayed!");
    }

    public void clickDropdown(String dropdownId) {
        WebElement dropdown = driver.findElement(By.id(dropdownId));
        ElementUtils.clickElement(dropdown);
    }

    public void leaveVendorFieldEmpty() {
        WebElement vendorField = driver.findElement(By.id("vendorField"));
        ElementUtils.clearElement(vendorField);
    }

    public void openProppantSetupScreen() {
        driver.navigate().to("http://localhost/proppantSetup");
        isOnProppantSetupScreen();
    }

    public void fillInValidData(String data) {
        // Fill in valid data as required.
    }

    public void isNewChemicalEntryFormDisplayed() {
        WebElement newChemicalForm = driver.findElement(By.id("newChemicalForm"));
        Assert.assertTrue(newChemicalForm.isDisplayed(), "New Chemical Entry Form is not displayed!");
    }

    public void areValidConcentrationOptionsDisplayed() {
        WebElement concentrationOptions = driver.findElement(By.id("concentrationOptions"));
        Assert.assertTrue(concentrationOptions.isDisplayed(), "Valid concentration options are not displayed!");
    }

    public void clickAddVendorButton() {
        WebElement addVendorButton = driver.findElement(By.id("addVendorButton"));
        ElementUtils.clickElement(addVendorButton);
    }

    public void hasLoadingErrors() {
        WebElement loadingError = driver.findElement(By.id("loadingError"));
        Assert.assertFalse(loadingError.isDisplayed(), "There are loading errors!");
    }

    public void verifyErrorMessagesForMissingFields() {
        WebElement errorMessages = driver.findElement(By.id("errorMessages"));
        Assert.assertTrue(errorMessages.isDisplayed(), "Error messages for missing fields are not displayed!");
    }

    public void verifyVendorTypeDropdown(String expectedVendorType) {
        WebElement vendorTypeDropdown = driver.findElement(By.id("vendorTypeDropdown"));
        Assert.assertTrue(vendorTypeDropdown.getText().contains(expectedVendorType), "Expected Vendor Type not found in dropdown!");
    }

    public void selectVendorFromDropdown(String vendorName) {
        WebElement vendorDropdown = driver.findElement(By.id("vendorDropdown"));
        ElementUtils.selectOptionInDropdown(vendorDropdown, vendorName);
    }

    public void isOnChemicalSetupScreen() {
        WebElement chemicalSetupScreen = driver.findElement(By.id("chemicalSetupScreen"));
        Assert.assertTrue(chemicalSetupScreen.isDisplayed(), "Chemical Setup Screen is not displayed!");
    }

    public void navigateToEmailSetupScreen() {
        driver.navigate().to("http://localhost/emailSetup");
        isOnEmailSetupScreen();
    }
}