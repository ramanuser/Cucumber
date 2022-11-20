Feature: 
     To validate the facebook application forgot password module

  Scenario Outline: 
    To validate the facebook forgot password functionality

    Given user have to launch the facebook url by using chrome browser
    When User enters the incorrect email id "<email>"and forgot the password
    Then user will be receive invalid email id
    And user to close the Browser

    Examples: 
      | email               |
      | kannan_58582@gmail.com    |
      | selvam88@gmial.cpom |
      | esswarm@gimail.com  |
