Feature: Nykaa Application Tests

  Scenario: Sign-in should be successful
    Given User launches the Nykaa Application
    And User clicks the Sign-in button
    And User click the Sign-in with Mobile number 
    And User enters the Mobile number as Username 
    And User clicks the Proceed button
    And User enters the OTP in console output as otp
    When User click on Verify button
    Then Login should be successful
    
    
    
    
    