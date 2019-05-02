Feature: User Authentication
  Scenario: If user provides correct Username and Password

    Given the website page is open
    When user provides Username as "Admin"
    And user provides Password as "admin123"
    And user click on submit button
    Then System should direct user to admin page