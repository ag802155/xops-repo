
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

  @feature_user_login
  @navigate_to_chemical_proppant_email_setup
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user selects a current Job from the list
    And the user chooses a Well associated with the Job
    And the user selects a Stage for the Job
    And the user clicks on the Chemical Setup option
    Then the user is redirected to the Chemical Setup screen
    And the selected Job, Well, and Stage are displayed correctly on the Chemical Setup screen
    When the user clicks on the Proppant Setup option
    Then the user is redirected to the Proppant Setup screen
    And the selected Job, Well, and Stage are displayed correctly on the Proppant Setup screen
    When the user clicks on the Email Setup option
    Then the user is redirected to the Email Setup screen
    And the selected Job, Well, and Stage are displayed correctly on the Email Setup screen

    Examples:
      | Job   | Well   | Stage   |
      | Job 1 | Well A | Stage 1 |

  @feature_user_login
  @add_acid_additive
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user is on the Chemical Setup Page
    When the user clicks on the "Add Chemical" button
    And the user selects "<chemical_name>" from the chemical dropdown
    And the user enters a design concentration value of "<design_concentration>"
    And the user enters a designed volume of "<designed_volume>"
    And the user clicks on the "Save" button
    And the user refreshes the page
    Then the Acid & Additives entry should be added to the list
    And the entry should persist after the page refresh
    And the correct design concentration and volume should be displayed
    And no validation errors should occur during the process

    Examples:
      | chemical_name | design_concentration | designed_volume |
      | Acid          | 10                   | 100             |

@add_slickwater
Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
  Given the user clicks on the "Add Chemical" button
  When the user selects "<chemical_name>" from the chemical dropdown
  And the user enters "<design_concentration>" as the design concentration value
  And the user enters "<designed_volume>" as the designed volume
  And the user clicks on the "Save" button
  And the user refreshes the page
  Then the Slickwater entry should be added to the list
  And the entry should persist after the page refresh
  And the correct design concentration "<design_concentration>" and volume "<designed_volume>" should be displayed
  And there should be no validation errors during the process

  Examples:
    | chemical_name | design_concentration | designed_volume |
    | Slickwater    | 0                    | a * 100        |

  @add_proppant_test
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Proppant" button
    When the user selects "<proppant_name>" from the dropdown
    And the user enters "<total_design_volume>"
    And the user clicks on the "Save" button
    Then the user should see the Proppant "<proppant_name>" with total design volume "<total_design_volume>" in the setup list

    Examples:
      | proppant_name | total_design_volume |
      | Proppant A    | 1000                |
      | Proppant B    | 2000                |
      | Proppant C    | 3000                |
      | Proppant D    | 4000                |

  @refresh_page
  Scenario: Refresh the page
    Given the user refreshes the Job Stages Setup Page
    Then the user should see all four Proppants added to the list
    And each Proppant should display the correct name and design volume
    And the entries should persist after the page refresh
    And no validation errors should occur during the process

  @feature_user_login
  @add_vendor
  Scenario Outline: Chemical and Proppant Vendor Addition
    When the user clicks on the "Add Vendor" button
    And the user selects a vendor type "<vendor_type>"
    And the user enters the vendor name "<vendor_name>"
    And the user enters the PO number "<po_number>"
    And the user clicks on the "Save" button
    Then all vendors should be added to the list
    And each vendor should display the correct name and PO number
    And the entries should persist after the page refresh
    And no validation errors should occur during the process

    Examples:
      | vendor_type | vendor_name  | po_number  |
      | Chemical    | ChemVendor1  | PO1234     |
      | Proppant    | PropVendor1  | PO5678     |

  @update_meeting_id
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user locates the Others section on the Email Setup screen
    When the user clicks on the Meeting ID field
    And the user enters "<meeting_id>"
    And the user clicks on the Save button
    And the user refreshes the page
    Then the Meeting ID is updated successfully
    And the new Meeting ID persists after the page refresh
    And no validation errors occur during the process

    Examples:
      | meeting_id     |
      | meeting_id_123 |

  @feature_user_login
  @add-delivery-record
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Delivery Record" button
    And the user selects a vendor from the dropdown
    And the user selects a PO from the dropdown
    And the user selects a chemical type from the dropdown
    And the user enters <BOL number>, <received quantity>, <UOM>, and <BOL quantity>
    And the user selects <inventory type>
    And the user clicks on the "Save" button
    Then the delivery record is added to the list
    And all entered details are displayed correctly
    And the entry persists after the page refresh
    And no validation errors occur during the process

    Examples:
      | vendor   | PO   | chemical type | BOL number | received quantity | UOM | BOL quantity | inventory type   |
      | Vendor1  | PO1  | ChemicalA     | BOL001     | 100              | L   | 100          | InventoryType1   |
      | Vendor2  | PO2  | ChemicalB     | BOL002     | 200              | Kg  | 200          | InventoryType2   |

  @feature_user_login
  @verify_dropdowns
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When I click on the chemical name dropdown
    Then the chemical name dropdown displays all available chemicals
    When I open the Proppant Setup screen
    When I click on the Proppant name dropdown
    Then the Proppant name dropdown displays all available Proppants
    When I open the Email Setup screen
    When I click on the vendor type dropdown
    Then the vendor type dropdown displays all available vendor types
    Then no errors occur during the loading of dropdown options

    Examples:
      | chemical_name | proppant_name | vendor_type |
      | Chemical A    | Proppant A    | Vendor A    |

  @feature_user_login
  @valid-chemical-setup
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Chemical" button
    And the user fills in the required fields
    And the user clicks "Save"
    Then the first Chemical is saved successfully

    When the user clicks on the "Add Chemical" button
    And the user fills in the required fields
    And the user clicks "Save & New"
    Then the second Chemical is added and the form resets for new entry

    When the user clicks on the "Save" button for the last entry
    Then the last entry is saved successfully
    And no validation errors occur during the process

  Examples:
    | chemicalName | requiredField1 | requiredField2 |
    | Chemical A   | Value 1        | Value 2        |
    | Chemical B   | Value 3        | Value 4        |

  @feature_user_login
  @missing-fields-error
  Scenario Outline: Validate that the system prevents adding a Chemical with missing fields
    When the user clicks on the "Add Chemical" button
    And the user leaves the chemical name field empty
    And the user enters a design concentration value of "<design_concentration>"
    And the user leaves the designed volume field empty
    And the user clicks on the "Save" button
    Then the system should not add the Chemical
    And appropriate error messages should be displayed for missing fields
    And the user should remain on the Chemical Setup screen

    Examples:
      | design_concentration |
      | 5.0                  |

@invalid_design_volume
Scenario Outline: Validate Proppant Addition with Negative Design Volume
  When the user clicks on the "Add Proppant" button
  And the user selects the "<proppant_name>" from the dropdown
  And the user enters a total design volume of "<total_design_volume>"
  And the user clicks on the "Save" button
  Then the system does not add the Proppant
  And an error message is displayed indicating that the total design volume must be positive
  And the user remains on the Proppant Setup screen

  Examples:
    | proppant_name    | total_design_volume |
    | NegativeProppant | -10                 |

  @feature_user_login
  @missing-vendor-name
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Vendor" button
    And the user selects a vendor type "<vendor_type>"
    And the user leaves the vendor name field empty
    And the user enters a PO number "<po_number>"
    And the user clicks on the "Save" button
    Then the system should not save the vendor
    And an error message should be displayed indicating that the vendor name is required
    And the user should remain on the Email Setup screen

    Examples:
      | vendor_type | po_number |
      | Chemical    | 12345     |
      | Proppant    | 12345     |

  @missing_vendor_error
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Delivery Record" button
    And the user leaves the vendor field empty
    And the user selects "<po>" from the dropdown
    And the user selects "<chemical>" from the dropdown
    When the user clicks on the "Save" button
    Then the system does not create the delivery record
    And an error message is displayed indicating that the vendor is required
    And the user remains on the Chemical Delivery Tracking screen

    Examples:
      | po                     | chemical                     |
      | PO_Selection_Value     | Chemical_Type_Selection_Value |

  @feature_user_login
  @maximum_proppants
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Proppant" button
    And the user selects "<proppant_name>" from the dropdown
    And the user enters a total design volume of "<design_volume>"
    And the user clicks on the "Save" button
    Then the user should see the Proppant successfully added
    And the user repeats the above steps

    Examples:
      | proppant_name     | design_volume |
      | Proppant Name 1   | 1000          |
      | Proppant Name 2   | 1000          |
      | Proppant Name 3   | 1000          |
      | Proppant Name 4   | 1000          |

  @exceeding_proppants
  Scenario Outline: Attempting to add a fifth Proppant
    When the user clicks on the "Add Proppant" button
    And the user selects "<proppant_name>" from the dropdown
    And the user enters a total design volume of "<design_volume>"
    And the user clicks on the "Save" button
    Then the user should see an error message
    And the user should remain on the Proppant Setup screen

    Examples:
      | proppant_name     | design_volume |
      | Proppant Name 5   |               |

  @feature_user_login
  @valid-delivery-creation
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Delivery Record" button
    When the user selects "<vendor>" from the dropdown
    And the user selects "<po>" from the dropdown
    And the user selects "<chemical_type>" from the dropdown
    And the user enters a valid BOL number "<bol_number>"
    And the user enters the received quantity "<received_quantity>"
    And the user enters the UOM "<uom>"
    And the user enters the BOL quantity "<bol_quantity>"
    And the user selects "<inventory_type>"
    And the user clicks on the "Save" button
    Then the delivery record should be added successfully
    And all entered details should be displayed correctly
    And the entry should persist after the page refresh
    And no validation errors should occur during the process

    Examples:
      | vendor      | po       | chemical_type | bol_number  | received_quantity | uom | bol_quantity | inventory_type    |
      | Vendor A    | PO12345  | Chemical X    | BOL123456   | 100               | kg  | 150          | Inventory Type A  |
