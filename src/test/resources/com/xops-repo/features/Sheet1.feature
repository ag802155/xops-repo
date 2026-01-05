@feature_user_navigation
Feature: Crews

  Background: 
    Given the user is logged into the XOPS application

  @navigate-crews
  Scenario: Navigation to Manage Crews
    Given the user is on the Home Page
    And the user clicks on the Reference Data option
    Given the user clicks on Crews
    

  @verify_manage_crews
  Scenario Outline: Verify Manage Crews UI
    When I verify the table columns "<column1>", "<column2>", "<column3>", "<column4>", "<column5>", "<column6>", "<column7>"
    And I verify the +New Crew button is visible
    Then all columns and +New Crew button are displayed

    Examples:
      | column1 | column2  | column3 | column4 | column5   | column6   | column7 |
      | #       | Crew Name | Fleet   | District | Job Pattern | Start Date | Actions |

  @feature_create_first_crew
  Scenario: Create First Crew
    When the user clicks on the +New Crew button
    Then the Add/Edit Crew popup is displayed
    When the user selects Fleet from the Fleet dropdown
    And the user enters Crew Name
    And the user selects Job Pattern as 14/7
    And the user selects Shift Start as Day
    And the user selects Start Date from the date picker
    Then the Preview Section is displayed
    When the user clicks on the Save button
    Then the first crew is created successfully and displayed in the Manage Crews table

  @feature_create_second_crew
  Scenario: Create Second Crew
    When the user clicks on the +New Crew button
    Then the Add/Edit Crew popup is displayed
    When the user selects Fleet from the Fleet dropdown
    And the user enters Crew Name2
    And the user selects Job Pattern as 14/14
    And the user selects Shift Start as Day
    And the user selects Start Date from the date picker
    Then the Preview Section is displayed
    When the user clicks on the Save button
    Then the second crew is created successfully and displayed in the Manage Crews table

  @feature_create_third_crew
  Scenario Outline: Create Third Crew
    When the user clicks on the +New Crew button
    Then the Add/Edit Crew popup is displayed
    When the user selects Fleet from the Fleet dropdown
    And the user enters Crew Name3
    And the user selects Job Pattern as 14/14
    And the user selects Shift Start as Day
    And the user selects Start Date from the date picker
    Then the Preview Section is displayed
    When the user clicks on the Save button
    Then the Third crew is created successfully and displayed in the Manage Crews table
    
