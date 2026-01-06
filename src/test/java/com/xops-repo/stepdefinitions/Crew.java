package com.xops-repo.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.xops-repo.pages.CrewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Crews extends DriverFactory {
CrewPage crewPage = new CrewPage(driver);
@Given("the user is logged into the XOPS application")
public void the_user_is_logged_into_the_XOPS_application() {
driver = DriverFactory.getDriver();
crewPage.loginToApplication();
}
@Given("the user is on the Home Page")
public void the_user_is_on_the_Home_Page() {
crewPage.navigateToHomePage();
}
@And("the user clicks on the Reference Data option")
public void the_user_clicks_on_the_Reference_Data_option() {
crewPage.clicksReferenceDataOption();
}
@Given("the user clicks on Crews")
public void the_user_clicks_on_Crews() {
crewPage.clicksOnCrews();
}
@When("I verify the table columns {string}, {string}, {string}, {string}, {string}, {string}, {string}")
public void i_verify_the_table_columns(String column1, String column2, String column3, String column4, String column5, String column6, String column7) {
crewPage.verifyTableColumns(column1, column2, column3, column4, column5, column6, column7);
}
@And("I verify the +New Crew button is visible")
public void i_verify_the_New_Crew_button_is_visible() {
crewPage.isNewCrewButtonVisible();
}
@Then("all columns and +New Crew button are displayed")
public void all_columns_and_New_Crew_button_are_displayed() {
crewPage.verifyAllColumnsAndNewCrewButton();
}
@When("the user clicks on the +New Crew button")
public void the_user_clicks_on_the_New_Crew_button() {
crewPage.clicksNewCrewButton();
}
@Then("the Add/Edit Crew popup is displayed")
public void the_Add_Edit_Crew_popup_is_displayed() {
crewPage.isAddEditCrewPopupDisplayed();
}
@When("the user selects Fleet from the Fleet dropdown")
public void the_user_selects_Fleet_from_the_Fleet_dropdown() {
crewPage.selectFleetFromDropdown();
}
@When("the user enters Crew Name {string}")
public void the_user_enters_Crew_Name(String crewName) {
crewPage.enterCrewName(crewName);
}
@When("the user selects Job Pattern as {string}")
public void the_user_selects_Job_Pattern_as(String jobPattern) {
crewPage.selectJobPattern(jobPattern);
}
@When("the user selects Shift Start as {string}")
public void the_user_selects_Shift_Start_as(String shiftStart) {
crewPage.selectShiftStart(shiftStart);
}
@When("the user selects Start Date from the date picker")
public void the_user_selects_Start_Date_from_the_date_picker() {
crewPage.selectStartDate();
}
@Then("the Preview Section is displayed")
public void the_Preview_Section_is_displayed() {
crewPage.isPreviewSectionDisplayed();
}
@When("the user clicks on the Save button")
public void the_user_clicks_on_the_Save_button() {
crewPage.clicksSaveButton();
}
@Then("the crew {string} is created successfully and displayed in the Manage Crews table")
public void the_crew_is_created_successfully_and_displayed_in_the_Manage_Crews_table(String crewName) {
crewPage.isCrewDisplayedInTable(crewName);
}

@Given("the user enters crew name")
public void the_user_enters_crew_name() {
crewPage.enterCrewName("crew name");
}
@Given("the user enters crew name3")
public void the_user_enters_crew_name3() {
crewPage.enterCrewName("crew name3");
}
@Then("the second crew is created successfully displayed in the manage crews table")
public void the_second_crew_is_created_successfully_displayed_in_the_manage_crews_table() {
crewPage.isCrewDisplayed("crew name3");
}
@Given("the user selects shift start as day")
public void the_user_selects_shift_start_as_day() {
crewPage.selectShiftStart("day");
}
@Given("the user selects job pattern as 14/14")
public void the_user_selects_job_pattern_as_14_14() {
crewPage.selectJobPattern("14/14");
}
@Given("the user enters crew name2")
public void the_user_enters_crew_name2() {
crewPage.enterCrewName("crew name2");
}
@Then("the third crew is created successfully displayed in the manage crews table")
public void the_third_crew_is_created_successfully_displayed_in_the_manage_crews_table() {
crewPage.isCrewDisplayed("crew name2");
}
@Then("the first crew is created successfully displayed in the manage crews table")
public void the_first_crew_is_created_successfully_displayed_in_the_manage_crews_table() {
crewPage.isCrewDisplayed("crew name");
}
@Given("the user selects job pattern as 14/7")
public void the_user_selects_job_pattern_as_14_7() {
crewPage.selectJobPattern("14/7");
}
}