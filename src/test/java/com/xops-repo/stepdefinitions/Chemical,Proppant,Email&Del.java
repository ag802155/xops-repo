package com.xops-repo.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.xops-repo.pages.ChemicalProppantEmailDelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ChemicalProppantEmailDel extends DriverFactory {
ChemicalProppantEmailDelPage chemicalProppantEmailDelPage = new ChemicalProppantEmailDelPage(driver);
@Given("the user is on the Jobs section")
public void theUserIsOnTheJobsSection() {
chemicalProppantEmailDelPage.navigateToJobsSection();
}
@When("the user selects a Job from the list")
public void theUserSelectsAJobFromTheList() {
chemicalProppantEmailDelPage.selectJobFromList();
}
@When("the user chooses a Well associated with the Job")
public void theUserChoosesAWellAssociatedWithTheJob() {
chemicalProppantEmailDelPage.chooseWellForJob();
}
@When("the user selects a Stage for the Job")
public void theUserSelectsAStageForTheJob() {
chemicalProppantEmailDelPage.selectStageForJob();
}
@When("the user clicks on the Chemical Setup option")
public void theUserClicksOnTheChemicalSetupOption() {
chemicalProppantEmailDelPage.clickChemicalSetupOption();
}
@Then("the Chemical Setup screen is displayed")
public void theChemicalSetupScreenIsDisplayed() {
chemicalProppantEmailDelPage.isChemicalSetupScreenDisplayed();
}
@When("the user clicks on the Proppant Setup option")
public void theUserClicksOnTheProppantSetupOption() {
chemicalProppantEmailDelPage.clickProppantSetupOption();
}
@Then("the Proppant Setup screen is displayed")
public void theProppantSetupScreenIsDisplayed() {
chemicalProppantEmailDelPage.isProppantSetupScreenDisplayed();
}
@When("the user clicks on the {string} button")
public void theUserClicksOnTheButton(String buttonName) {
chemicalProppantEmailDelPage.clickButton(buttonName);
}
@When("the user selects {string} from the chemical name dropdown")
public void theUserSelectsFromTheChemicalNameDropdown(String chemicalName) {
chemicalProppantEmailDelPage.selectChemicalFromDropdown(chemicalName);
}
@When("the user enters a valid design concentration of {string}")
public void theUserEntersAValidDesignConcentrationOf(String designConcentration) {
chemicalProppantEmailDelPage.enterDesignConcentration(designConcentration);
}
@When("the user enters a valid designed volume of {string}")
public void theUserEntersAValidDesignedVolumeOf(String designedVolume) {
chemicalProppantEmailDelPage.enterDesignedVolume(designedVolume);
}
@Then("the added Acid should appear in the list")
public void theAddedAcidShouldAppearInTheList() {
chemicalProppantEmailDelPage.isAcidInList();
}
@Then("the added {string} should appear in the list")
public void theAddedChemicalShouldAppearInTheList(String chemicalName) {
chemicalProppantEmailDelPage.isChemicalInList(chemicalName);
}
@When("the user enters a valid PO number {string}")
public void theUserEntersAValidPONumber(String poNumber) {
chemicalProppantEmailDelPage.enterPONumber(poNumber);
}
@Then("the added Chemical vendor should appear in the list")
public void theAddedChemicalVendorShouldAppearInTheList() {
chemicalProppantEmailDelPage.isVendorInList();
}
@When("the user locates the Meeting ID field under {string}")
public void theUserLocatesTheMeetingIDFieldUnder(String section) {
chemicalProppantEmailDelPage.locateMeetingIDField(section);
}
@When("the user enters a new valid Meeting ID {string}")
public void theUserEntersANewValidMeetingID(String meetingId) {
chemicalProppantEmailDelPage.enterMeetingID(meetingId);
}
@Then("the updated Meeting ID should be displayed correctly")
public void theUpdatedMeetingIDShouldBeDisplayedCorrectly() {
chemicalProppantEmailDelPage.isMeetingIDUpdated();
}
@Then("no validation errors should occur")
public void noValidationErrorsShouldOccur() {
chemicalProppantEmailDelPage.hasValidationErrors();
}
@Then("a confirmation message is displayed")
public void aConfirmationMessageIsDisplayed() {
chemicalProppantEmailDelPage.isConfirmationMessageDisplayed();
}
@When("the user enters a valid BOL number {string}")
public void theUserEntersAValidBOLNumber(String bolNumber) {
chemicalProppantEmailDelPage.enterBOLNumber(bolNumber);
}
@When("the user enters a received quantity {string}")
public void theUserEntersAReceivedQuantity(String receivedQuantity) {
chemicalProppantEmailDelPage.enterReceivedQuantity(receivedQuantity);
}
@Then("the delivery record should be saved successfully")
public void theDeliveryRecordShouldBeSavedSuccessfully() {
chemicalProppantEmailDelPage.isDeliveryRecordSaved();
}
@When("the user clicks on the {string} dropdown")
public void theUserClicksOnTheDropdown(String dropdownName) {
chemicalProppantEmailDelPage.clickDropdown(dropdownName);
}
@Then("all expected chemical names should be listed correctly")
public void allExpectedChemicalNamesShouldBeListedCorrectly() {
chemicalProppantEmailDelPage.areExpectedChemicalNamesListed();
}
@Then("valid concentration options should be displayed")
public void validConcentrationOptionsShouldBeDisplayed() {
chemicalProppantEmailDelPage.areValidConcentrationOptionsDisplayed();
}
@Then("valid volume options should be displayed")
public void validVolumeOptionsShouldBeDisplayed() {
chemicalProppantEmailDelPage.areValidVolumeOptionsDisplayed();
}
@Then("there should be no loading errors")
public void thereShouldBeNoLoadingErrors() {
chemicalProppantEmailDelPage.hasLoadingErrors();
}
@Then("the chemical should be saved successfully")
public void theChemicalShouldBeSavedSuccessfully() {
chemicalProppantEmailDelPage.isChemicalSaved();
}
@Then("the confirmation of save is displayed")
public void theConfirmationOfSaveIsDisplayed() {
chemicalProppantEmailDelPage.isSaveConfirmationDisplayed();
}
@Then("a new chemical entry form should be displayed")
public void aNewChemicalEntryFormShouldBeDisplayed() {
chemicalProppantEmailDelPage.isNewChemicalEntryFormDisplayed();
}
@Then("no validation errors are displayed")
public void noValidationErrorsAreDisplayed() {
chemicalProppantEmailDelPage.hasValidationErrors();
}
@When("the user refreshes the Chemical Setup screen")
public void theUserRefreshesTheChemicalSetupScreen() {
chemicalProppantEmailDelPage.refreshChemicalSetupScreen();
}
@When("the user refreshes the Proppant Setup screen")
public void theUserRefreshesTheProppantSetupScreen() {
chemicalProppantEmailDelPage.refreshProppantSetupScreen();
}
@When("the user refreshes the Email Setup screen")
public void theUserRefreshesTheEmailSetupScreen() {
chemicalProppantEmailDelPage.refreshEmailSetupScreen();
}
@Then("the user is redirected to the {string} screen")
public void theUserIsRedirectedToTheScreen(String screenName) {
chemicalProppantEmailDelPage.isRedirectedToScreen(screenName);
}
@Then("the selected Job, Well, and Stage are displayed correctly on the {string} screen")
public void theSelectedJobWellAndStageAreDisplayedCorrectlyOnTheScreen(String screenName) {
chemicalProppantEmailDelPage.areJobWellStageDisplayedCorrectly(screenName);
}

@When("the user clicks on the save button for the last entry")
public void the_user_clicks_on_the_save_button_for_the_last_entry() {
chemicalProppantEmailDelPage.clickSaveButtonForLastEntry();
}
@When("the user enters a valid designed volume {string}")
public void the_user_enters_a_valid_designed_volume(String designedVolume) {
chemicalProppantEmailDelPage.enterValidDesignedVolume(designedVolume);
}
@Then("no validation errors should occur during the process")
public void no_validation_errors_should_occur_during_the_process() {
chemicalProppantEmailDelPage.noValidationErrors();
}
@Then("the user should see all four proppants added to the list")
public void the_user_should_see_all_four_proppants_added_to_the_list() {
chemicalProppantEmailDelPage.verifyAllProppantsAdded();
}
@When("the user selects a po from the dropdown")
public void the_user_selects_a_po_from_the_dropdown() {
chemicalProppantEmailDelPage.selectPOFromDropdown();
}
@Then("the entry should persist after the page refresh")
public void the_entry_should_persist_after_the_page_refresh() {
chemicalProppantEmailDelPage.verifyEntryPersistence();
}
@When("the user selects {string}")
public void the_user_selects(String option) {
chemicalProppantEmailDelPage.selectOption(option);
}
@When("the user enters the received quantity {string}")
public void the_user_enters_the_received_quantity(String receivedQuantity) {
chemicalProppantEmailDelPage.enterReceivedQuantity(receivedQuantity);
}
@When("the user enters the bol quantity {string}")
public void the_user_enters_the_bol_quantity(String bolQuantity) {
chemicalProppantEmailDelPage.enterBolQuantity(bolQuantity);
}
@Then("the added proppant should appear in the list")
public void the_added_proppant_should_appear_in_the_list() {
chemicalProppantEmailDelPage.verifyAddedProppantInList();
}
@Then("an error message is displayed indicating that the vendor is required")
public void an_error_message_is_displayed_indicating_that_the_vendor_is_required() {
chemicalProppantEmailDelPage.isVendorRequiredErrorDisplayed();
}
@Given("the user is redirected to the proppant setup screen")
public void the_user_is_redirected_to_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.navigateToProppantSetupScreen();
}
@Then("the user should see the proppant successfully added")
public void the_user_should_see_the_proppant_successfully_added() {
chemicalProppantEmailDelPage.isProppantSuccessfullyAdded();
}
@Then("an error message is displayed indicating that the total design volume must be positive")
public void an_error_message_is_displayed_indicating_that_the_total_design_volume_must_be_positive() {
chemicalProppantEmailDelPage.isTotalDesignVolumePositiveErrorDisplayed();
}
@When("i clickElement on the add chemical button")
public void i_click_on_the_add_chemical_button() {
chemicalProppantEmailDelPage.clickAddChemicalButton();
}
@Then("the acid & additives entry should be added to the list")
public void the_acid_additives_entry_should_be_added_to_the_list() {
chemicalProppantEmailDelPage.isAcidAdditivesEntryAdded();
}
@When("the user clicks save")
public void the_user_clicks_save() {
chemicalProppantEmailDelPage.clickSave();
}
@Then("each proppant should display the correct name design volume")
public void each_proppant_should_display_the_correct_name_design_volume() {
chemicalProppantEmailDelPage.verifyProppantNameAndDesignVolume();
}
@When("the user selects a current job from the list")
public void the_user_selects_a_current_job_from_the_list() {
chemicalProppantEmailDelPage.selectCurrentJobFromList();
}
@Then("the delivery record is added to the list")
public void the_delivery_record_is_added_to_the_list() {
chemicalProppantEmailDelPage.isDeliveryRecordAdded();
}
@Then("the correct design concentration {string} volume {string} should be displayed")
public void the_correct_design_concentration_volume_should_be_displayed(String concentration, String volume) {
chemicalProppantEmailDelPage.verifyDesignConcentrationAndVolume(concentration, volume);
}
@Then("the new meeting id persists after the page refresh")
public void the_new_meeting_id_persists_after_the_page_refresh() {
chemicalProppantEmailDelPage.verifyMeetingIdPersistence();
}
@When("i clickElement on the designed volume dropdown")
public void i_click_on_the_designed_volume_dropdown() {
chemicalProppantEmailDelPage.clickDesignedVolumeDropdown();
}
@Given("the user is redirected to the email setup screen")
public void the_user_is_redirected_to_the_email_setup_screen() {
chemicalProppantEmailDelPage.navigateToEmailSetupScreen();
}
@When("i open the email setup screen")
public void i_open_the_email_setup_screen() {
chemicalProppantEmailDelPage.openEmailSetupScreen();
}
@Then("the chemical name dropdown displays all available chemicals")
public void the_chemical_name_dropdown_displays_all_available_chemicals() {
chemicalProppantEmailDelPage.verifyChemicalNameDropdown();
}
@When("the user refreshes the page")
public void the_user_refreshes_the_page() {
chemicalProppantEmailDelPage.refreshPage();
}
@Then("the selected job, well, stage are displayed correctly on the proppant setup screen")
public void the_selected_job_well_stage_are_displayed_correctly_on_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.verifyJobWellStageDisplay();
}
@When("the user selects chemical from the vendor type dropdown")
public void the_user_selects_chemical_from_the_vendor_type_dropdown() {
chemicalProppantEmailDelPage.selectChemicalFromVendorTypeDropdown();
}
@When("the user enters the vendor name {string}")
public void the_user_enters_the_vendor_name(String vendorName) {
chemicalProppantEmailDelPage.enterVendorName(vendorName);
}
@When("the user clicks on the add chemical button")
public void the_user_clicks_on_the_add_chemical_button() {
chemicalProppantEmailDelPage.clickAddChemicalButton();
}
@When("the user enters the uom {string}")
public void the_user_enters_the_uom(String uom) {
chemicalProppantEmailDelPage.enterUOM(uom);
}
@Then("each vendor should display the correct name po number")
public void each_vendor_should_display_the_correct_name_po_number() {
chemicalProppantEmailDelPage.verifyVendorNameAndPONumber();
}
@When("the user enters a po number {string}")
public void the_user_enters_a_po_number(String poNumber) {
chemicalProppantEmailDelPage.enterPONumber(poNumber);
}
@When("the user locates the meeting id field under others")
public void the_user_locates_the_meeting_id_field_under_others() {
chemicalProppantEmailDelPage.locateMeetingIdField();
}
@Then("the delivery record should be added successfully")
public void the_delivery_record_should_be_added_successfully() {
chemicalProppantEmailDelPage.isDeliveryRecordSuccessfullyAdded();
}
@When("i clickElement on the add chemical button again")
public void i_click_on_the_add_chemical_button_again() {
chemicalProppantEmailDelPage.clickAddChemicalButtonAgain();
}
@When("i clickElement on the proppant name dropdown")
public void i_click_on_the_proppant_name_dropdown() {
chemicalProppantEmailDelPage.clickProppantNameDropdown();
}
@When("i clickElement on the vendor type dropdown")
public void i_click_on_the_vendor_type_dropdown() {
chemicalProppantEmailDelPage.clickVendorTypeDropdown();
}
@Then("the proppant name dropdown displays all available proppants")
public void the_proppant_name_dropdown_displays_all_available_proppants() {
chemicalProppantEmailDelPage.verifyProppantNameDropdown();
}
@Then("the entries should persist after the page refresh")
public void the_entries_should_persist_after_the_page_refresh() {
chemicalProppantEmailDelPage.verifyEntriesPersistence();
}
@When("i clickElement on the save & new button")
public void i_click_on_the_save_new_button() {
chemicalProppantEmailDelPage.clickSaveAndNewButton();
}
@Then("the entry persists after the page refresh")
public void the_entry_persists_after_the_page_refresh() {
chemicalProppantEmailDelPage.verifyEntryPersistenceAfterRefresh();
}
@When("the user selects the {string} from the dropdown")
public void the_user_selects_from_the_dropdown(String option) {
chemicalProppantEmailDelPage.selectFromDropdown(option);
}
@When("the user selects a vendor type {string}")
public void the_user_selects_a_vendor_type(String vendorType) {
chemicalProppantEmailDelPage.selectVendorType(vendorType);
}
@Then("all entered details are displayed correctly")
public void all_entered_details_are_displayed_correctly() {
chemicalProppantEmailDelPage.verifyEnteredDetails();
}
@When("the user enters a total design volume of {string}")
public void the_user_enters_a_total_design_volume_of(String totalDesignVolume) {
chemicalProppantEmailDelPage.enterTotalDesignVolume(totalDesignVolume);
}
@When("the user leaves the vendor field empty")
public void the_user_leaves_the_vendor_field_empty() {
chemicalProppantEmailDelPage.leaveVendorFieldEmpty();
}
@When("the user enters {string} as the designed volume")
public void the_user_enters_as_the_designed_volume(String designedVolume) {
chemicalProppantEmailDelPage.enterDesignedVolume(designedVolume);
}
@When("i clickElement on the chemical name dropdown")
public void i_click_on_the_chemical_name_dropdown() {
chemicalProppantEmailDelPage.clickChemicalNameDropdown();
}
@When("the user selects a chemical type from the dropdown")
public void the_user_selects_a_chemical_type_from_the_dropdown() {
chemicalProppantEmailDelPage.selectChemicalTypeFromDropdown();
}
@When("the user repeats the above steps")
public void the_user_repeats_the_above_steps() {
chemicalProppantEmailDelPage.repeatPreviousSteps();
}
@When("the user enters a design concentration value of {string}")
public void the_user_enters_a_design_concentration_value_of(String designConcentration) {
chemicalProppantEmailDelPage.enterDesignConcentrationValue(designConcentration);
}
@Then("the user should see an error message")
public void the_user_should_see_an_error_message() {
chemicalProppantEmailDelPage.isErrorMessageDisplayed();
}
@Then("the user should remain on the chemical setup screen")
public void the_user_should_remain_on_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.isOnChemicalSetupScreen();
}
@When("the user clicks on the save button")
public void the_user_clicks_on_the_save_button() {
chemicalProppantEmailDelPage.clickSaveButton();
}
@Then("the slickwater entry should be added to the list")
public void the_slickwater_entry_should_be_added_to_the_list() {
chemicalProppantEmailDelPage.isSlickwaterEntryAdded();
}
@Then("there should be no validation errors during the process")
public void there_should_be_no_validation_errors_during_the_process() {
chemicalProppantEmailDelPage.noValidationErrorsDuringProcess();
}
@When("the user selects {string} from the chemical dropdown")
public void the_user_selects_from_the_chemical_dropdown(String chemical) {
chemicalProppantEmailDelPage.selectChemicalFromDropdown(chemical);
}
@When("the user clicks on the meeting id field")
public void the_user_clicks_on_the_meeting_id_field() {
chemicalProppantEmailDelPage.clickMeetingIdField();
}
@When("the user enters {string}")
public void the_user_enters(String meetingId) {
chemicalProppantEmailDelPage.enterMeetingId(meetingId);
}
@When("the user leaves the vendor name field empty")
public void the_user_leaves_the_vendor_name_field_empty() {
chemicalProppantEmailDelPage.leaveVendorNameFieldEmpty();
}
@Then("an error message should be displayed indicating that the vendor name is required")
public void an_error_message_should_be_displayed_indicating_that_the_vendor_name_is_required() {
chemicalProppantEmailDelPage.isVendorNameRequiredErrorDisplayed();
}
@Then("the user remains on the proppant setup screen")
public void the_user_remains_on_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.isOnProppantSetupScreen();
}
@Then("the system does not create the delivery record")
public void the_system_does_not_create_the_delivery_record() {
chemicalProppantEmailDelPage.isDeliveryRecordCreated();
}
@Then("the second chemical is added the form resets for new entry")
public void the_second_chemical_is_added_the_form_resets_for_new_entry() {
chemicalProppantEmailDelPage.isFormResetForNewEntry();
}
@When("the user fills in valid data for {string}")
public void the_user_fills_in_valid_data_for(String data) {
chemicalProppantEmailDelPage.fillInValidData(data);
}
@When("the user clicks on the email setup option")
public void the_user_clicks_on_the_email_setup_option() {
chemicalProppantEmailDelPage.clickEmailSetupOption();
}
@When("the user enters {string}, {string}, {string}, {string}")
public void the_user_enters(String companyName, String chemicalName, String quantity, String deliveryDate) {
chemicalProppantEmailDelPage.enterEmailSetupDetails(companyName, chemicalName, quantity, deliveryDate);
}
@When("i clickElement on the design concentration dropdown")
public void i_click_on_the_design_concentration_dropdown() {
chemicalProppantEmailDelPage.clickDesignConcentrationDropdown();
}
@Then("appropriate error messages should be displayed for missing fields")
public void appropriate_error_messages_should_be_displayed_for_missing_fields() {
chemicalProppantEmailDelPage.verifyErrorMessagesForMissingFields();
}
@When("the user selects a vendor from the dropdown")
public void the_user_selects_a_vendor_from_the_dropdown() {
chemicalProppantEmailDelPage.selectVendorFromDropdown();
}
@When("the user clicks on the add proppant button")
public void the_user_clicks_on_the_add_proppant_button() {
chemicalProppantEmailDelPage.clickAddProppantButton();
}
@When("i open the proppant setup screen")
public void i_open_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.openProppantSetupScreen();
}
@Then("the correct design concentration volume should be displayed")
public void the_correct_design_concentration_volume_should_be_displayed() {
chemicalProppantEmailDelPage.verifyCorrectDesignConcentrationVolume();
}
@Then("the selected job, well, stage are displayed correctly on the email setup screen")
public void the_selected_job_well_stage_are_displayed_correctly_on_the_email_setup_screen() {
chemicalProppantEmailDelPage.verifyJobWellStageDisplayOnEmailSetup();
}
@When("i fill in the required fields with company name {string}, chemical name {string}, quantity {string}, delivery date {string}, email {string}")
public void i_fill_in_the_required_fields_with_company_name_chemical_name_quantity_delivery_date_email(String companyName, String chemicalName, String quantity, String deliveryDate, String email) {
chemicalProppantEmailDelPage.fillInRequiredFields(companyName, chemicalName, quantity, deliveryDate, email);
}
@Then("the system should not add the chemical")
public void the_system_should_not_add_the_chemical() {
chemicalProppantEmailDelPage.isChemicalAdded();
}
@Then("no validation errors occur during the process")
public void no_validation_errors_occur_during_the_process() {
chemicalProppantEmailDelPage.noValidationErrorsDuringProcess();
}
@Then("no errors occur during the loading of dropdown options")
public void no_errors_occur_during_the_loading_of_dropdown_options() {
chemicalProppantEmailDelPage.noErrorsLoadingDropdownOptions();
}
@Then("the meeting id is updated successfully")
public void the_meeting_id_is_updated_successfully() {
chemicalProppantEmailDelPage.isMeetingIdUpdatedSuccessfully();
}
@Then("the user should remain on the email setup screen")
public void the_user_should_remain_on_the_email_setup_screen() {
chemicalProppantEmailDelPage.isOnEmailSetupScreen();
}
@When("the user fills in the required fields")
public void the_user_fills_in_the_required_fields() {
chemicalProppantEmailDelPage.fillInRequiredFields();
}
@When("i clickElement on the save button")
public void i_click_on_the_save_button() {
chemicalProppantEmailDelPage.clickSaveButton();
}
@Then("the total design volume should be displayed correctly")
public void the_total_design_volume_should_be_displayed_correctly() {
chemicalProppantEmailDelPage.verifyTotalDesignVolume();
}
//    @When("the user selects {string} from the dropdown")
@Then("the system does not add the proppant")
public void the_system_does_not_add_the_proppant() {
chemicalProppantEmailDelPage.isProppantAdded();
}
@When("the user enters a valid design concentration {string}")
public void the_user_enters_a_valid_design_concentration(String designConcentration) {
chemicalProppantEmailDelPage.enterValidDesignConcentration(designConcentration);
}
@Given("the user is redirected to the chemical setup screen")
public void the_user_is_redirected_to_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.navigateToChemicalSetupScreen();
}
@When("the user enters {string} as the design concentration value")
public void the_user_enters_as_the_design_concentration_value(String designConcentrationValue) {
chemicalProppantEmailDelPage.enterDesignConcentrationValue(designConcentrationValue);
}
@Then("the user should see the proppant {string} with total design volume {string} in the setup list")
public void the_user_should_see_the_proppant_with_total_design_volume_in_the_setup_list(String proppant, String totalDesignVolume) {
chemicalProppantEmailDelPage.verifyProppantWithTotalDesignVolume(proppant, totalDesignVolume);
}
@When("the user leaves the chemical name field empty")
public void the_user_leaves_the_chemical_name_field_empty() {
chemicalProppantEmailDelPage.leaveChemicalNameFieldEmpty();
}
@When("the user leaves the designed volume field empty")
public void the_user_leaves_the_designed_volume_field_empty() {
chemicalProppantEmailDelPage.leaveDesignedVolumeFieldEmpty();
}
@Then("the user remains on the chemical delivery tracking screen")
public void the_user_remains_on_the_chemical_delivery_tracking_screen() {
chemicalProppantEmailDelPage.isOnChemicalDeliveryTrackingScreen();
}
@When("the user enters the po number {string}")
public void the_user_enters_the_po_number(String poNumber) {
chemicalProppantEmailDelPage.enterPONumber(poNumber);
}
@When("the user clicks save & new")
public void the_user_clicks_save_new() {
chemicalProppantEmailDelPage.clickSaveAndNew();
}
@Then("the vendor type dropdown displays all available vendor types")
public void the_vendor_type_dropdown_displays_all_available_vendor_types() {
chemicalProppantEmailDelPage.verifyVendorTypeDropdown();
}
@Then("all entered details should be displayed correctly")
public void all_entered_details_should_be_displayed_correctly() {
chemicalProppantEmailDelPage.verifyAllEnteredDetails();
}
@Then("the last entry is saved successfully")
public void the_last_entry_is_saved_successfully() {
chemicalProppantEmailDelPage.isLastEntrySavedSuccessfully();
}
@When("the user clicks on the add vendor button")
public void the_user_clicks_on_the_add_vendor_button() {
chemicalProppantEmailDelPage.clickAddVendorButton();
}
@Then("all vendors should be added to the list")
public void all_vendors_should_be_added_to_the_list() {
chemicalProppantEmailDelPage.verifyAllVendorsAdded();
}
@Then("the system should not save the vendor")
public void the_system_should_not_save_the_vendor() {
chemicalProppantEmailDelPage.isVendorSaved();
}
@Then("the first chemical is saved successfully")
public void the_first_chemical_is_saved_successfully() {
chemicalProppantEmailDelPage.isFirstChemicalSavedSuccessfully();
}
@Then("the selected job, well, stage are displayed correctly on the chemical setup screen")
public void the_selected_job_well_stage_are_displayed_correctly_on_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.verifyJobWellStageDisplayOnChemicalSetup();
}
@When("the user clicks on the add delivery record button")
public void the_user_clicks_on_the_add_delivery_record_button() {
chemicalProppantEmailDelPage.clickAddDeliveryRecordButton();
}
@When("the user enters a designed volume of {string}")
public void the_user_enters_a_designed_volume_of(String designedVolume) {
chemicalProppantEmailDelPage.enterDesignedVolume(designedVolume);
}
@Then("the user should remain on the proppant setup screen")
public void the_user_should_remain_on_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.isOnProppantSetupScreen();
}
}