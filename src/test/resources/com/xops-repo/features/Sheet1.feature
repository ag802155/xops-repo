
@feature_navigation_to_procurement
Feature: Sheet1

  Background: 
    Given the user is logged into the application

  @navigate-procurement
  Scenario Outline: Navigation to Procurement
    When the user clicks on the Procurement sidebar
    Then the Procurement page is displayed successfully

    Examples:
      | username | password |
      | user1    | pass1    |

  @clickable_create_new_po
  Scenario Outline: Create New PO Button is Clickable
    When the user clicks on "Create New PO" button
    Then the Create PO form opens

    Examples:
      |   |
      |   |

  @job-number-dropdown
  Scenario Outline: Job Number Selection
    Given the user is on the Job Number Selection Page
    When I click the Job Number dropdown
    And I select <job_number>
    Then the selected job number is displayed

    Examples:
      | job_number     |
      | Job Number 1   |
      | Job Number 2   |
      | Job Number 3   |

@po-number-entry
Scenario Outline: PO Number Entry for First Chemical Vendor
  Given the user clicks the PO Number input field
  When the user enters the PO number <po_number>
  Then the PO number is accepted and displayed

Examples:
  | po_number     |
  | 123456        |
  | 789012        |

  @feature_vendor_selection
  @vendor-selection
  Scenario Outline: Vendor Selection
    Given the user clicks the Vendor dropdown
    When the user selects the first chemical vendor
    Then the vendor is selected successfully

  Examples:
    | vendor          |
    | first chemical vendor |

@first-chemical-selection
Scenario Outline: First Chemical Selection
  Given the user clicks the Chemical Item dropdown
  Then the chemical is selected

  Examples:
    |   |
    |   |

  @verify_po_quantity_entry
  Scenario Outline: First Chemical Quantity Entry
    Given the user enters <po_quantity>
    And the user selects the first chemical
    Then the quantity is accepted

    Examples:
      | po_quantity |
      | 10          |
      | 20          |
      | 30          |

  @add-first-chemical
  Scenario Outline: Add First Chemical
    When the user clicks the plus icon
    Then the chemical is added to the list

    Examples:
      |   |
      |   |

  @feature_second_chemical_selection
  @select-second-chemical
  Scenario Outline: Second Chemical Selection
    Given the user selects the second chemical
    And the user enters "<quantity>"
    And the user clicks the plus icon
    Then the second chemical should be added successfully

    Examples:
      | quantity |
      | 150      |

@third-chemical-selection
Scenario Outline: Third Chemical Selection
  Given the user selects the second chemical
  And the user enters "<quantity>"
  When the user clicks the plus icon
  Then the third chemical should be added successfully

  Examples:
    | quantity |
    | 200      |

  @select-fourth-chemical
  Scenario Outline: Fourth Chemical Selection
    When I select the second chemical
    And I enter quantity "<quantity>"
    And I click the plus icon
    Then the fourth chemical should be added successfully

    Examples:
      | quantity |
      | 120      |

  @feature_fifth_chemical_selection
  @fifth-chemical-selection
  Scenario Outline: Fifth Chemical Selection
    Given the user selects the second chemical
    When the user enters "<quantity>"
    And the user clicks the plus icon
    Then the fifth chemical should be added successfully

    Examples:
      | quantity |
      | 80      |

  @select-sixth-chemical
  Scenario Outline: Sixth Chemical Selection
    Given the user selects the second chemical
    And the user enters "<quantity>"
    When the user clicks the plus icon
    Then the sixth chemical should be added successfully

    Examples:
      | quantity |
      | 60      |

  @seventh-chemical-selection
  Scenario Outline: Verify Seventh Chemical Selection
    When I select the seventh chemical
    And I enter "<quantity>"
    Then the seventh chemical details entered

    Examples:
      | quantity |
      | 90      |

  @feature_user_login
  @procurement_po_creation
  Scenario Outline: Add Procurement
    When the admin clicks the Add button
    Then the PO is created successfully and a confirmation message is shown

    Examples:
      | entered_data      |
      | All entered data  |
