Feature: To Validate facebook application login functionality

Background:
    Given user have to launch the facebook url by using chrome browser

  Scenario: To validate the login by using valid username and invalid password
    When user enter valid username and Invalid password
    Then user hava to receive the message as invalid password
    And user to close the Browser

  Scenario: To validate the login by using valid username and empty password
    When user enter valid username and empty password
    Then user hava to receive the message as invalid password
    And user to close the Browser
