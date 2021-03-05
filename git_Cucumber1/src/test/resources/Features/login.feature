Feature: Verify the login page functionality

  Scenario Outline: Verify login functionality with valid Username and Password
    Given User is at login page and enter <URL>
    When User enters <Username> and <Password>
    And User clicks on login button
    Then User should be able to navigates to homepage

    Examples: 
      | URL                                 | Username | Password |
      | https://example.testproject.io/web/ | akash    |    12345 |

  #Scenario Outline: Verify login functionality with invalid Username and Password
    #Given User is at login page and enter <URL>
    #When User enters <Username> and <Password>
    #And User clicks on login button
    #Then User should not be able to navigates to homepage
#
    #Examples: 
      #| URL                                 | Username | Password |
      #| https://example.testproject.io/web/ | akash2   |      123 |
