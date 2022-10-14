@gp1
Feature: US01 Procenne Contact Us test case

  Scenario: Procenne Contact Us test case
    Given User goes to "procenneUrl" website
    And User waits 3 seconds.
    Then User clicks the contact button
    And User waits 3 seconds.
    And User enters contact information
    And User waits 3 seconds.
    And User writes "MERHABA TEST TAKIMI" in the message box
    And User waits 3 seconds.
    And User clicks the checkbox one
    And User waits 3 seconds.
    And User clicks the checkbox2
    And User waits 3 seconds.
    And User clicks submit button
    And User waits 3 seconds.
    And User closes the driver.







