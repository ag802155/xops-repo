package com.default_project.stepdefinitions;

import com.default_project.utils.ElementUtils;
import org.junit.Assert;
import com.default_project.driverfactory.DriverFactory;
import com.default_project.pages.ChemicalProppantEmailDelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ChemicalProppantEmailDel extends DriverFactory {
ChemicalProppantEmailDelPage chemicalProppantEmailDelPage = new ChemicalProppantEmailDelPage(driver);
@Given("the user is on the Jobs section")
public void the_user_is_on_the_jobs_section() {
chemicalProppantEmailDelPage.navigateToJobsSection();
}
@When("the user selects a Job from the list")
public void the_user_selects_a_job_from_the_list() {
chemicalProppantEmailDelPage.selectJobFromList();
}
@And("the user chooses a Well associated with the Job")
public void the_user_chooses_a_well_associated_with_the_job() {
chemicalProppantEmailDelPage.chooseWellAssociatedWithJob();
}
@And("the user selects a Stage for the Job")
public void the_user_selects_a_stage_for_the_job() {
chemicalProppantEmailDelPage.selectStageForJob();
}
@And("the user clicks on the Chemical Setup option")
public void the_user_clicks_on_the_chemical_setup_option() {
chemicalProppantEmailDelPage.clickChemicalSetupOption();
}
@Then("the Chemical Setup screen is displayed")
public void the_chemical_setup_screen_is_displayed() {
chemicalProppantEmailDelPage.isChemicalSetupScreenDisplayed();
}
@And("the user clicks on the Proppant Setup option")
public void the_user_clicks_on_the_proppant_setup_option() {
chemicalProppantEmailDelPage.clickProppantSetupOption();
}
@Then("the Proppant Setup screen is displayed")
public void the_proppant_setup_screen_is_displayed() {
chemicalProppantEmailDelPage.isProppantSetupScreenDisplayed();
}
@When("the user clicks on the {string} button")
public void the_user_clicks_on_the_add_chemical_button(String buttonName) {
chemicalProppantEmailDelPage.clickAddChemicalButton(buttonName);
}
@And("the user selects {string} from the chemical name dropdown")
public void the_user_selects_from_the_chemical_name_dropdown(String chemicalName) {
chemicalProppantEmailDelPage.selectChemicalFromDropdown(chemicalName);
}
@And("the user enters a valid design concentration of {string}")
public void the_user_enters_a_valid_design_concentration_of(String designConcentration) {
chemicalProppantEmailDelPage.enterDesignConcentration(designConcentration);
}
@And("the user enters a valid designed volume of {string}")
public void the_user_enters_a_valid_designed_volume_of(String designedVolume) {
chemicalProppantEmailDelPage.enterDesignedVolume(designedVolume);
}
// @And("the user clicks on the {string} button")
// public void the_user_clicks_on_the_save_button(String buttonName) {
// chemicalProppantEmailDelPage.clickSaveButton(buttonName);
// }
@And("the user refreshes the Chemical Setup screen")
public void the_user_refreshes_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.refreshChemicalSetupScreen();
}
@Then("the added Acid should appear in the list")
public void the_added_acid_should_appear_in_the_list() {
chemicalProppantEmailDelPage.isAcidAddedToList();
}
@Then("the added {string} should appear in the list")
public void the_added_chemical_should_appear_in_the_list(String chemicalName) {
chemicalProppantEmailDelPage.isChemicalAddedToList(chemicalName);
}
@When("the user enters {string}")
public void the_user_enters(String vendorName) {
chemicalProppantEmailDelPage.enterVendorName(vendorName);
}
// @And("the user enters {string}")
// public void the_user_enters_po_number(String poNumber) {
// chemicalProppantEmailDelPage.enterPONumber(poNumber);
// }
@Then("the added Chemical vendor should appear in the list")
public void the_added_chemical_vendor_should_appear_in_the_list() {
chemicalProppantEmailDelPage.isVendorAddedToList();
}
@When("the user locates the Meeting ID field under {string}")
public void the_user_locates_the_meeting_id_field_under(String section) {
chemicalProppantEmailDelPage.locateMeetingIDField(section);
}
@And("the user enters a new valid Meeting ID {string}")
public void the_user_enters_a_new_valid_meeting_id(String meetingId) {
chemicalProppantEmailDelPage.enterMeetingID(meetingId);
}
@Then("the updated Meeting ID should be displayed correctly")
public void the_updated_meeting_id_should_be_displayed_correctly() {
chemicalProppantEmailDelPage.isMeetingIDUpdated();
}
@Then("no validation errors should occur")
public void no_validation_errors_should_occur() {
chemicalProppantEmailDelPage.hasValidationErrors();
}
@Then("a confirmation message is displayed")
public void a_confirmation_message_is_displayed() {
chemicalProppantEmailDelPage.isConfirmationMessageDisplayed();
}
@When("the user clicks on the {string} button")
public void the_user_clicks_on_the_add_delivery_record_button(String buttonName) {
chemicalProppantEmailDelPage.clickAddDeliveryRecordButton(buttonName);
}
@And("the user selects {string} from the dropdown")
public void the_user_selects_from_the_dropdown(String vendor) {
chemicalProppantEmailDelPage.selectVendorFromDropdown(vendor);
}
@And("the user enters a valid PO number {string}")
public void the_user_enters_a_valid_po_number(String poNumber) {
chemicalProppantEmailDelPage.enterPONumber(poNumber);
}
@And("the user selects {string} from the dropdown")
public void the_user_selects_chemical_type_from_dropdown(String chemicalType) {
chemicalProppantEmailDelPage.selectChemicalTypeFromDropdown(chemicalType);
}
@And("the user enters a valid BOL number {string}")
public void the_user_enters_a_valid_bol_number(String bolNumber) {
chemicalProppantEmailDelPage.enterBOLNumber(bolNumber);
}
@And("the user enters a received quantity {string}")
public void the_user_enters_a_received_quantity(String receivedQuantity) {
chemicalProppantEmailDelPage.enterReceivedQuantity(receivedQuantity);
}
@Then("the delivery record should be saved successfully")
public void the_delivery_record_should_be_saved_successfully() {
chemicalProppantEmailDelPage.isDeliveryRecordSaved();
}
@When("I click on the chemical name dropdown")
public void i_click_on_the_chemical_name_dropdown() {
chemicalProppantEmailDelPage.clickChemicalNameDropdown();
}
@Then("all expected chemical names should be listed correctly")
public void all_expected_chemical_names_should_be_listed_correctly() {
chemicalProppantEmailDelPage.areExpectedChemicalNamesListed();
}
@When("I click on the design concentration dropdown")
public void i_click_on_the_design_concentration_dropdown() {
chemicalProppantEmailDelPage.clickDesignConcentrationDropdown();
}
@Then("valid concentration options should be displayed")
public void valid_concentration_options_should_be_displayed() {
chemicalProppantEmailDelPage.areValidConcentrationOptionsDisplayed();
}
@When("I click on the designed volume dropdown")
public void i_click_on_the_designed_volume_dropdown() {
chemicalProppantEmailDelPage.clickDesignedVolumeDropdown();
}
@Then("valid volume options should be displayed")
public void valid_volume_options_should_be_displayed() {
chemicalProppantEmailDelPage.areValidVolumeOptionsDisplayed();
}
@Then("there should be no loading errors")
public void there_should_be_no_loading_errors() {
chemicalProppantEmailDelPage.hasLoadingErrors();
}
@When("I fill in the required fields with company name {string}, chemical name {string}, quantity {string}, delivery date {string}, and email {string}")
public void i_fill_in_the_required_fields(String companyName, String chemicalName, String quantity, String deliveryDate, String email) {
chemicalProppantEmailDelPage.fillInRequiredFields(companyName, chemicalName, quantity, deliveryDate, email);
}
@Then("the chemical should be saved successfully")
public void the_chemical_should_be_saved_successfully() {
chemicalProppantEmailDelPage.isChemicalSavedSuccessfully();
}
@Then("the confirmation of save is displayed")
public void the_confirmation_of_save_is_displayed() {
chemicalProppantEmailDelPage.isSaveConfirmationDisplayed();
}
@When("I fill in the required fields with company name {string}, chemical name {string}, quantity {string}, delivery date {string}, and email {string}")
public void i_fill_in_the_required_fields_with_new_entry(String companyName, String chemicalName, String quantity, String deliveryDate, String email) {
chemicalProppantEmailDelPage.fillInRequiredFields(companyName, chemicalName, quantity, deliveryDate, email);
}
@Then("a new chemical entry form should be displayed")
public void a_new_chemical_entry_form_should_be_displayed() {
chemicalProppantEmailDelPage.isNewChemicalEntryFormDisplayed();
}
// @Given("the user clicks on the {string} button")
// public void the_user_clicks_on_the_add_chemical_button_again(String buttonName) {
// chemicalProppantEmailDelPage.clickAddChemicalButton(buttonName);
// }
@When("the user fills in valid data for {string}")
public void the_user_fills_in_valid_data_for(String chemicalName) {
chemicalProppantEmailDelPage.fillInValidDataForChemical(chemicalName);
}
@Then("no validation errors are displayed")
public void no_validation_errors_are_displayed() {
chemicalProppantEmailDelPage.hasValidationErrors();
}