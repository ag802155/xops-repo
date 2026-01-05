
@feature_user_navigation
Feature: Sheet1

  Background: 
    Given the user is logged into the XOPS application

  @navigate-crews
  Scenario Outline: Navigation to Manage Crews
    When the user clicks on Reference Data from the navigation panel
    And the user clicks on Crews
    Then the Manage Crews screen is displayed successfully

    Examples:
      | username | password |
      | user1    | pass1    |

  @verify_manage_crews
  Scenario Outline: Verify Manage Crews UI
    When I verify the table columns "<column1>", "<column2>", "<column3>", "<column4>", "<column5>", "<column6>", "<column7>"
    And I verify the +New Crew button is visible
    Then all columns and +New Crew button are displayed

    Examples:
      | column1 | column2  | column3 | column4 | column5   | column6   | column7 |
      | #       | Crew Name | Fleet   | District | Job Pattern | Start Date | Actions |

  @feature_create_first_crew
  @create-crew
  Scenario Outline: Create First Crew
    When the user clicks on the +New Crew button
    Then the Add/Edit Crew popup is displayed
    When the user selects Fleet from the Fleet dropdown
    And the user enters <crew_name>
    And the user selects Job Pattern as 14/7
    And the user selects Shift Start as Day
    And the user selects Start Date from the date picker
    Then the Preview Section is displayed
    When the user clicks on the Save button
    Then the first crew is created successfully and displayed in the Manage Crews table

    Examples:
      | crew_name     |
      | Test Crew 1   |

  @feature_create_second_crew
  @create-second-crew
  Scenario Outline: Create Second Crew
    When I click on the +New Crew button
    Then the Add/Edit Crew popup is displayed
    When I select Fleet from the Fleet dropdown
    And I enter <crew_name>
    And I select Job Pattern as <job_pattern>
    And I select Shift Start as <shift_start>
    And I select Start Date from the date picker
    Then I verify the Preview Section
    When I click on the Save button
    Then the second crew is created successfully and displayed in the Manage Crews table

    Examples:
      | crew_name   | job_pattern | shift_start |
      | Crew Name2  | 14/7       | Day         |

  @create-crew
  Scenario Outline: Create Third Crew
    When the user clicks on the +New Crew button
    Then the Add/Edit Crew popup is displayed
    When the user selects Fleet from the Fleet dropdown
    When the user enters <crew_name>
    When the user selects Job Pattern as <job_pattern>
    When the user selects Shift Start as <shift_start>
    When the user selects Start Date from the date picker
    Then the Preview Section is displayed
    When the user clicks on the Save button
    Then the third crew is created successfully and displayed in the Manage Crews table

    Examples:
      | crew_name | job_pattern | shift_start |
      | Crew Name3 | 14/7       | Day         |

  @verify-crew-order
  Scenario Outline: Verify Crew Order
    Given the user observes the Crew Name column in the table
    Then the user verifies that crew names are sorted in ascending alphanumeric order

    Examples:
      | <crew_name> |
      | Crew A     |
      | Crew B     |
      | Crew C     |
