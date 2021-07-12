
@vip
Feature: Navigation Menu
Background: the user is on the home page


  Scenario: verifying modulus PERSONAL
    Given the user is on the home page
    When the user clicks the PERSONAL tabs
    Then user should see the url contains personal

  Scenario: verifying modulus COMMERCIAL
    Given the user is on the home page
    When the user clicks the COMMERCIAL tabs
    Then user should see the url contains commercial

  Scenario: verifying CLAIMS
    Given the user is on the home page
    When the user clicks the CLAIMS tabs
    Then user should see the url contains claims

  Scenario: verifying WHY LAREAU
    Given the user is on the home page
    When the user clicks the WHY LAREAU tabs
    Then user should see the url contains why-lareau

  Scenario: verifying BLOG
    Given the user is on the home page
    When the user clicks the BLOG tabs
    Then user should see the url contains blog

  Scenario: verifying CONTACT US
    Given the user is on the home page
    When the user clicks the CONTACT US tabs
    Then user should see the url contains contact-us