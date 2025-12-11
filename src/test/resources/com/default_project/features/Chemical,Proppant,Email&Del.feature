
Feature: Chemical,Proppant,Email&Del
  @feature_user_login
  Background: 
    Given the user is on the Jobs section

  @navigate_to_setup_screens
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user selects a Job from the list
    And the user chooses a Well associated with the Job
    And the user selects a Stage for the Job
    And the user clicks on the Chemical Setup option
    Then the Chemical Setup screen is displayed
    And the user clicks on the Proppant Setup option
    Then the Proppant Setup screen is displayed

    Examples:
      | Job  | Well   | Stage  |
      | Job1 | Well1  | Stage1 |

  @feature_user_login
  @add_acid
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Chemical" button
    And the user selects "<chemical_name>" from the chemical name dropdown
    And the user enters a valid design concentration of "<design_concentration>"
    And the user enters a valid designed volume of "<designed_volume>"
    And the user clicks on the "Save" button
    And the user refreshes the Chemical Setup screen
    Then the added Acid should appear in the list

    Examples:
      | chemical_name | design_concentration | designed_volume |
      | Acid          | 15%                  | 1000 liters     |

  @feature_user_login
  @add_slickwater
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Chemical" button
    When the user selects "<chemical_name>" from the chemical name dropdown
    And the user enters a valid design concentration "<design_concentration>"
    And the user enters a valid designed volume "<designed_volume>"
    And the user clicks on the "Save" button
    And the user refreshes the Chemical Setup screen
    Then the added "<chemical_name>" should appear in the list

    Examples:
      | chemical_name | design_concentration | designed_volume |
      | Slickwater    | 20%                  | 500 liters      |

  @feature_user_login
  @add_proppant
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Proppant" button
    And the user selects "<proppant_name>" from the dropdown
    And the user enters "<total_design_volume>"
    And the user clicks on the "Save" button
    And the user refreshes the Proppant Setup screen
    Then the added Proppant should appear in the list
    And the total design volume should be displayed correctly

    Examples:
      | proppant_name | total_design_volume |
      | Proppant A    | 2000 lbs            |

  @feature_user_login
  @add_chemical_vendor
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Vendor" button
    When the user selects "Chemical" from the vendor type dropdown
    And the user enters "<vendor_name>"
    And the user enters "<po_number>"
    And the user clicks on the "Save" button
    And the user refreshes the Email Setup screen
    Then the added Chemical vendor should appear in the list

    Examples:
      | vendor_name     | po_number   |
      | abcd pvt.ltd    | PO123456    |

  @feature_user_login
  @update_meeting_id
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user is on the Email Setup screen
    When the user locates the Meeting ID field under "Others"
    And the user enters a new valid Meeting ID "<meeting_id>"
    And the user clicks on the "Save" button
    And the user refreshes the Email Setup screen
    Then the updated Meeting ID should be displayed correctly
    And no validation errors should occur
    And a confirmation message is displayed

    Examples:
      | meeting_id |
      | 123456     |

  @feature_user_login
  @add_delivery_record
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Delivery Record" button
    And the user selects "<vendor>" from the dropdown
    And the user enters a valid PO number "<po_number>"
    And the user selects "<chemical_type>" from the dropdown
    And the user enters a valid BOL number "<bol_number>"
    And the user enters a received quantity "<received_quantity>"
    And the user clicks on the "Save" button
    Then the delivery record should be saved successfully

    Examples:
      | vendor          | po_number | chemical_type | bol_number   | received_quantity |
      | abcd pvt.ltd   | 123456    | Chemical A    | BOL123456    | 100               |

  @feature_user_login
  @validate_dropdowns
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When I click on the chemical name dropdown
    Then all expected chemical names should be listed correctly
    When I click on the design concentration dropdown
    Then valid concentration options should be displayed
    When I click on the designed volume dropdown
    Then valid volume options should be displayed
    Then there should be no loading errors

    Examples:
      | chemical_name | concentration_option | volume_option |
      | Chemical A    | 10%                  | 100L          |
      | Chemical B    | 20%                  | 200L          |
      | Chemical C    | 30%                  | 300L          |

  @validate_buttons_functionality
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When I click on the "Add Chemical" button
    And I fill in the required fields with company name "<company_name>", chemical name "<chemical_name>", quantity "<quantity>", delivery date "<delivery_date>", and email "<email>"
    And I click on the "Save" button
    Then the chemical should be saved successfully
    And the confirmation of save is displayed
    When I click on the "Add Chemical" button again
    And I fill in the required fields with company name "<company_name>", chemical name "<chemical_name>", quantity "<quantity>", delivery date "<delivery_date>", and email "<email>"
    And I click on the "Save & New" button
    Then a new chemical entry form should be displayed

    Examples:
      | company_name       | chemical_name     | quantity | delivery_date | email                 |
      | abcd pvt.ltd      | sodium chloride    | 100      | 12/5/2025     | supplier@example.com  |

  @feature_user_login
  @chemical_setup_validation
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Chemical" button
    When the user fills in valid data for "<chemical_name>"
    And the user clicks on the "Save" button
    Then no validation errors are displayed

    Examples:
      | chemical_name             |
      | HCl                       |
      | Water with additives      |

  @chemical_setup_validation
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages Again
    Given the user clicks on the "Add Chemical" button
    When the user fills in valid data for "<chemical_name>"
    And the user clicks on the "Save" button
    Then no validation errors are displayed

    Examples:
      | chemical_name             |
      | Slickwater                |
