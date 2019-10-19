Feature: CreateAccount
  Scenario: Creating an account on the site
    Given user has open page "https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1"
    When he user completes the registration form for the new account
    And user clicks on Save
    Then user has a new account on the store's website
