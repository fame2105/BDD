Feature: Application Login


  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username = "John" and password = "Dickenson"
    Then Home page is populated
    And Cards displayed = "false"


  Scenario: Home page default login 2
    Given User is on NetBanking landing page
    When User login into application with username = "Fame" and password = "admin123"
    Then Home page is populated
    And Cards displayed = "true"