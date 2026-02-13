
@feature_verify_personnel_option_placement
Feature: Personnelfeature

  Background: 
    Given the user is on the XOPS application login page

  @verify-personnel-option-placement
  Scenario Outline: Verify Personnel option placement in Reference Data
    When I login to XOPS application
    Then the user successfully logs in

  Examples:
    | action                |
    | Login to XOPS application |

@view_personnel_option
Scenario Outline: Expand "Reference Data" to View Personnel Option
  When the user expands "Reference Data"
  Then the "Personnel" option should appear between "Crews" and "Operators"

Examples:
  | action                     | expected_result                                      |
  | Expand "Reference Data"    | "Personnel" option appears between "Crews" and "Operators" |

  @verify_manage_personnel_screen
  Scenario Outline: Verify Manage Personnel screen layout
    When I click on "Personnel" under Reference Data
    Then the Manage Personnel screen opens

    Examples:
      | action                          | expected_result                     |
      | Click on "Personnel" under Reference Data | Manage Personnel screen opens |

@verify_table_columns
Scenario Outline: Verify table columns
  When I verify the table columns
  Then the columns displayed are <column1>, <column2>, <column3>, <column4>, <column5>, <column6>, <column7>, <column8>, <column9>

  Examples:
    | column1 | column2   | column3   | column4   | column5     | column6 | column7   | column8 | column9 |
    | #       | First Name | Last Name | Job Title | Employee ID | District| Supervisor | Crew    | Actions |

@verify_new_personnel_button
Scenario Outline: Verify "+New Personnel" button
  Given the admin is on the Personnel Management Page
  Then the "+New Personnel" button is visible

Examples:
  |  |
  |  |

  @verify-pagination
  Scenario Outline: Verify pagination
    Given the admin is on the Personnel Management Page
    When I verify the pagination
    Then a maximum of 10 records should be displayed per page
    And the pagination control should be visible

    Examples:
      | N/A |

  @verify-sorting
  Scenario Outline: Verify list sorting
    When I verify the personnel list sorting
    Then the personnel list should be displayed in ascending alphanumeric order

    Examples:
      | <sorting> |
      | Verify list sorting |

  @validate_table_headers
  Scenario Outline: Validate Personnel table column headers display
    Given the user logs in to the XOPS application
    Then the following column headers should be displayed:
      | Column Header         |
      | Name                  |
      | Position              |
      | Department            |
      | Hire Date             |

  Examples:
    | Column Header         |
    | Name                  |
    | Position              |
    | Department            |
    | Hire Date             |

  @navigate-personnel
  Scenario Outline: Navigate to Manage Personnel
    When I navigate to Personnel
    Then the Manage Personnel screen opens

    Examples:
      | <action>                | <expected_result>                     |
      | Navigate to Personnel   | Manage Personnel screen opens         |

@observe_table_header
Scenario Outline: Observe the Table Header Row
  Given the user is on the Personnel Table Page
  When the user observes the table header row
  Then the column headers should be visible

  Examples:
    | step_action                          | expected_result                |
    | Observe the table header row         | Column headers are visible     |

@sequence-column-verification
Scenario Outline: Verify presence of sequence column
  Given the user is on the Personnel Page
  When the user verifies the presence of the sequence column
  Then the blank header column (#) should be displayed for sequencing

  Examples:
    | <action>                          | <expected_result>                          |
    | Verify presence of sequence column | Blank header column (#) is displayed for sequencing |

  @verify_first_name_column_header
  Scenario Outline: Verify "First Name" Column Header
    Given the admin is on the Personnel Management Page
    Then the "First Name" header is displayed correctly

  Examples:
    | <first_name_header> |
    | First Name          |

@verify_last_name_header
Scenario Outline: Verify "Last Name" Column Header
  Given the user is on the Personnel Page
  When the user verifies the "<header>" column header
  Then the "<header>" header should be displayed correctly

  Examples:
    | header      |
    | Last Name   |

@job-title-header-verification
Scenario Outline: Verify Job Title Column Header
  Given the user is on the Personnel Management Page
  When the user verifies the Job Title column header
  Then the Job Title header is displayed correctly

  Examples:
    | job_title_header |
    | Job Title        |

@verify_employee_id_header
Scenario Outline: Verify Employee ID Column Header
  Given the user is on the Employee Management Page
  Then the "Employee ID" header is displayed correctly

  Examples:
    | <employee_id> |
    | 12345         |

@district-column-header-verify
Scenario Outline: Verify "District" column header
  Given the user is on the Personnel Page
  Then the "District" header is displayed correctly

  Examples:
    | <district_header> |
    | District          |

@verify_supervisor_header
Scenario Outline: Verify Supervisor Column Header
  Given the user is on the Personnel Page
  Then the "Supervisor" header is displayed correctly

  Examples:
    | <step_actions>                          | <step_expected_result>                     |
    | Verify "Supervisor" column header       | "Supervisor" header is displayed correctly |

@verify-crew-header
Scenario Outline: Verify "Crew" column header
  Given the user is on the Personnel Page
  Then the user should see the "Crew" column header displayed correctly

  Examples:
    | step_action                          | expected_result                          |
    | Verify "Crew" column header          | "Crew" header is displayed correctly    |

@verify_actions_header
Scenario Outline: Verify Actions Column Header
  Given the user is on the Admin Page
  When the user verifies the "Actions" column header
  Then the "Actions" header should be displayed correctly

  Examples:
    |   |
    |   |

@header-alignment-check
Scenario Outline: Verify column header alignment
  Given the admin is on the personnel data page
  Then all headers are properly aligned with corresponding columns

Examples:
  | <header> |
  | Name     |
  | Age      |
  | Position  |

@verify_column_headers
Scenario Outline: Verify Column Header Visibility
  Given the user is on the relevant data table page
  Then all headers should be clearly visible without truncation

Examples:
  | <header> |
  | Header 1 |
  | Header 2 |
  | Header 3 |

@verify_add_personnel
Scenario Outline: Verify Add Personnel – all the fields present
  When I click on "+New Personnel"
  Then the Add/Edit Personnel popup appears with required fields

  Examples:
    | action            |
    | "+New Personnel"  |

  @field-verification
  Scenario Outline: Verify fields are displayed
    Given the user is on the Personnel Management Page
    Then the following fields should be displayed:
      | Field Name          |
      | First Name         |
      | Last Name          |
      | Job Title          |
      | Employee ID        |
      | District           |
      | Supervisor         |
      | Fleet              |
      | Crew               |
      | Supervisor checkbox |

    Examples:
      | Field Name          |
      | First Name         |
      | Last Name          |
      | Job Title          |
      | Employee ID        |
      | District           |
      | Supervisor         |
      | Fleet              |
      | Crew               |
      | Supervisor checkbox |

  @valid-personnel-creation
  Scenario Outline: Create Personnel with all fields populated
    Given the user is on the XOPS application
    When the user logs in with username <username> and password <password>
    Then the user should successfully log in

    Examples:
      | username | password  |
      | admin1   | Admin321  |

  @navigate_manage_personnel
  Scenario Outline: Navigate to Manage Personnel
    When the user navigates to Reference Data
    And the user selects Personnel
    Then the Manage Personnel screen opens

    Examples:
      | <navigate_to_reference_data> | <select_personnel> |
      | Reference Data                | Personnel          |

  @add_personnel_popup
  Scenario Outline: Click on "+New Personnel" button
    When the user clicks on "+New Personnel" button
    Then the Add/Edit Personnel popup appears

    Examples:
      | action                       | expected_result                     |
      | Click on "+New Personnel"    | Add/Edit Personnel popup appears    |

@accepts_input_first_name
Scenario Outline: Enter First Name
  Given the user is on the Personnel Page
  When I enter "<first_name>"
  Then the First Name field accepts input

  Examples:
    | first_name |
    | John       |
    | Jane       |

  @last-name-input
  Scenario Outline: Enter Last Name
    When I enter "<last_name>"
    Then the Last Name field accepts input

    Examples:
      | last_name |
      | Smith     |
      | Johnson   |

@job_title_input
Scenario Outline: Admin Enters Job Title
  Given the user is on the Job Title input area
  When the user enters "<job_title>"
  Then the Job Title field accepts input or selection

  Examples:
    | job_title        |
    | Software Engineer |
    | Project Manager   |

@employee_id_entry
Scenario Outline: Enter Employee ID
  Given the user is on the Employee Entry Page
  When I enter "<employee_id>"
  Then the Employee ID is accepted

  Examples:
    | employee_id |
    | emp123456  |
    | empABC123  |

  @district-selection
  Scenario Outline: Select District from Dropdown
    When I select the "<district>" from the dropdown
    Then the district should be selected successfully

    Examples:
      | district  |
      | District A|
      | District B|

  @verify_add_personnel_supervisor
  Scenario Outline: Verify Add Personnel – First Personnel (Supervisor)
    Given the user selects the Supervisor checkbox
    Then the personnel should be marked as Supervisor

    Examples:
      | <title>                                      |
      | Verify Add Personnel – First Personnel (Supervisor) |

  @supervisor-selection
  Scenario Outline: Select Supervisor from Dropdown
    Given the user is on the Supervisor Selection Page
    When the user selects <supervisor> from the dropdown
    Then the Supervisor dropdown allows selection

    Examples:
      | supervisor   |
      | Supervisor A |
      | Supervisor B |

@fleet-selection
Scenario Outline: Select Fleet from dropdown
  Given the user selects Fleet from the dropdown
  Then Fleet is selected successfully

  Examples:
    | <fleet> |
    | Fleet   |

  @crew-selection
  Scenario Outline: Select Crew from dropdown
    Given the user is on the Crew Selection Page
    When the user selects <Crew> from the dropdown
    Then Crew is selected successfully

    Examples:
      | Crew   |
      | Crew1  |
      | Crew2  |

  @create_personnel_record
  Scenario Outline: Click "Add" button to create a Personnel Record
    When I click the "Add" button
    Then the personnel record is created successfully
    And the popup closes

    Examples:
      | action          | expected_result                                   |
      | Click "Add"    | Personnel record is created successfully          |

  @verify_personnel
  Scenario Outline: Verify new personnel in table
    Given the admin observes the personnel table
    Then the newly created personnel appears in the table with correct details

    Examples:
      | personnel_name | personnel_position | personnel_department |
      | John Doe       | Manager            | Sales                |
      | Jane Smith     | Developer          | IT                   |

@verify_employee_id_display
Scenario Outline: Verify Employee ID display
  Given the user observes the Employee ID in the table
  Then only the first 8 characters of Employee ID are displayed

  Examples:
    | Employee ID |
    | EMP1234567  |
    | EMP9876543  |

  @verify_sorting
  Scenario Outline: Verify sorting
    When the admin initiates sorting
    Then the records should appear in ascending alphanumeric order in the list

    Examples:
      | <sorting_action> | <expected_result>                       |
      | Verify sorting   | Record appears in ascending alphanumeric order in list |

@validate_add_personnel
Scenario Outline: Verify Add Personnel – Second Personnel (Non-Supervisor)
  When the user clicks "+New Personnel"
  Then the Add/Edit Personnel popup appears

Examples:
  | action               | expected_result                     |
  | "+New Personnel"     | "Add/Edit Personnel popup appears"  |

@valid_details_entry
Scenario Outline: Enter valid details without selecting Supervisor checkbox
  Given the user is on the Personnel Page
  When I enter <details>
  And I do not select the Supervisor checkbox
  Then the mandatory fields accept valid input

  Examples:
    | details            |
    | Valid Information  |

@verify_supervisor_dropdown
Scenario Outline: Verify Supervisor dropdown
  When the user views the Supervisor dropdown
  Then the Supervisor dropdown contains "<supervisor_name>"

  Examples:
    | supervisor_name    |
    | Rahul Sharma       |

  @first-personnel-creation
  Scenario Outline: Verify second Personnel – First Personnel (cordinator)
    Given the user is on the Personnel Creation Page
    When I enter "<cordinator_name>"
    Then the First Name field should accept input

    Examples:
      | cordinator_name |
      | John            |
      | Alice           |

  @last_name_input
  Scenario Outline: Enter Coordinator Last Name
    Given the user is on the Coordinator Input Page
    When I enter "<last_name>"
    Then the Last Name field accepts input

    Examples:
      | last_name |
      | Smith     |
      | Johnson   |

@job_title_entry
Scenario Outline: Enter Coordinator Job Title
  Given the user is on the Job Title Entry Page
  When I enter "<job_title>"
  Then the Job Title field should accept the input

  Examples:
    | job_title   |
    | Coordinator |

  @valid-employee-id
  Scenario Outline: Enter Coordinator Employee ID
    Given the user is on the Personnel Entry Page
    When I enter "<employee_id>"
    Then the employee ID is accepted

    Examples:
      | employee_id      |
      | C12345           |
      | E67890           |

@district-selection
Scenario Outline: Select District from Dropdown
  Given the user is on the District Selection Page
  When the user selects <district> from the dropdown
  Then the district is selected successfully

  Examples:
    | district   |
    | District A |
    | District B |

@select-fleet
Scenario Outline: Select Fleet from Dropdown
  Given the user selects Fleet from the dropdown
  Then Fleet is selected successfully

  Examples:
    | <fleet> |
    | Fleet   |

  @select-crew
  Scenario Outline: Select Crew from Dropdown
    Given the user selects <crew_name> from the dropdown
    Then <expected_result> is displayed successfully

    Examples:
      | crew_name | expected_result |
      | Crew      | Crew            |

@add_personnel
Scenario Outline: Admin Clicks Add to Create a Personnel Record
  When the admin clicks "Add"
  Then the personnel record is added successfully

Examples:
  | step_action                     | expected_result                     |
  | Click "Add"                     | Personnel record added successfully  |

@verify_table_entry
Scenario Outline: Verify table entry
  When I verify the personnel entries in the table
  Then the second personnel should appear in ascending order

  Examples:
    | personnel_entry |
    | Personnel A     |
    | Personnel B     |

  @edit-personnel
  Scenario Outline: Verify Edit Personnel
    Given the user clicks the Edit icon for "<personnel_name>"
    Then the Add/Edit Personnel popup should appear with pre-populated data

    Examples:
      | personnel_name |
      | Amit Verma     |

@job-title-modification
Scenario Outline: Modify Job Title
  Given the admin is on the Job Title Modification Page
  When I modify the job title to "<new_job_title>"
  Then the job title field accepts the updated value

  Examples:
    | new_job_title       |
    | Senior Developer     |
    | Project Manager      |

  @update-personnel
  Scenario Outline: Update Personnel Record
    When the user clicks the Save button
    Then the personnel record should be updated successfully

    Examples:
      | action          | expected_result                          |
      | Click "Save"   | Personnel record updated successfully    |

@delete-personnel
Scenario Outline: Verify Delete Personnel
  When I click the Delete icon for "<name>"
  Then a confirmation message appears

  Examples:
    | name          |
    | Amit Verma    |

  @confirm-deletion
  Scenario Outline: Confirm deletion
    Given the user selects a personnel record with ID <personnel_id> to delete
    When the user confirms the deletion
    Then the personnel record should be deleted from the table

    Examples:
      | personnel_id |
      | 1            |
      | 2            |

  @supervisor_checkbox_validation
  Scenario Outline: Verify Supervisor checkbox behavior
    When I edit the record of "<employee_name>"
    Then the Add/Edit popup should open

    Examples:
      | employee_name   |
      | Rahul Sharma     |

@verify_supervisor_checkbox
Scenario Outline: Verify Supervisor checkbox selected
  When the admin verifies the Supervisor checkbox is selected
  Then the personnel should be marked as Supervisor

  Examples:
    | <action>                          | <expected_result>                     |
    | Verify Supervisor checkbox selected | Personnel marked as Supervisor        |

@verify_dropdown_order
Scenario Outline: Verify Supervisor dropdown list order
  Given the user is on the Supervisor Selection Page
  When the user views the Supervisor dropdown list
  Then the dropdown list should be displayed in ascending alphanumeric order

Examples:
  | supervisor_name |
  | Alice           |
  | Bob             |
  | Charlie         |
  | David           |

@cancel-close-popup
Scenario Outline: Verify Cancel and Close functionality
  Given the user clicks "+New Personnel"
  Then the popup opens

Examples:
  | action            |
  | "+New Personnel"  |

@cancel-popup
Scenario Outline: Admin Clicks Cancel on Popup
  When the user clicks <action>
  Then the popup closes without saving data

  Examples:
    | action   |
    | Cancel   |

  @reopen_popup
  Scenario Outline: Reopen popup and click Close icon
    When I reopen the popup
    And I click the Close icon
    Then the popup closes successfully

  Examples:
    | action               | expected_result               |
    | reopen popup        | popup closes successfully      |

  @search_personnel
  Scenario Outline: Verify Personnel Search filter
    Given the user types "<search_input>" in the Personnel search box
    Then relevant name suggestions should appear

    Examples:
      | search_input |
      | Rah          |

@filter-personnel
Scenario Outline: Admin Selects Suggested Name
  Given the admin is on the Personnel Management Page
  When the admin selects the suggested name <suggested_name>
  Then the table filters to show matching personnel

  Examples:
    | suggested_name |
    | John Doe       |
    | Jane Smith     |

  @filter-personnel
  Scenario Outline: User Filters Personnel by Full Name
    When I type <full_name> in the filter input
    And I press Enter
    Then the table filters correctly

    Examples:
      | full_name        |
      | John Doe         |
      | Jane Smith       |

@district-filter-validation
Scenario Outline: Verify District filter
  When I select "<district>" from District dropdown
  Then the table displays only personnel from "<district>" district

  Examples:
    | district |
    | North    |

@default_selection_verification
Scenario Outline: Verify Default District Selection
  Given the user is on the Personnel Page
  Then the user should see "<default_selection>" selected by default
  And all districts should be displayed

Examples:
  | default_selection |
  | All               |

  @validate_job_title_filter
  Scenario Outline: Verify Job Title filter
    Given the user is on the Personnel Management Page
    When I select "<job_title>" from Job Title dropdown
    Then the table displays only personnel with selected job title

    Examples:
      | job_title        |
      | Field Supervisor  |

  @default-selection
  Scenario Outline: Verify Default Selection of Job Titles
    Given the admin is on the Job Titles Page
    When the admin verifies the default selection
    Then "All" should be selected by default
    And all job titles should be displayed

    Examples:
      | Default State |
      | Default State |

@validate-pagination
Scenario Outline: Verify Pagination
  When the user navigates to the personnel records page
  Then pagination should activate

  Examples:
    | <personnel_records> |
    | 11                   |

@navigate_to_next_page
Scenario Outline: Navigate to next page
  When the user navigates to the next page
  Then the next set of personnel records should be displayed

  Examples:
    | action                     | expected_result                          |
    | Navigate to next page     | Next set of personnel records displayed |
