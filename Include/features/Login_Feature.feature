@loginFeature
Feature: Login Buyer Feature

  Scenario Outline: Test login with invalid credential
    Given User navigate to main Homepage
    When User click menu Login
    When User enter the <email> and <password>
    And Click the button Login
    Then User see the error message 'Silahkan periksa kembali email dan kata sandi anda'

    Examples: 
      | email                   | password |
      | fawziridwan@yopmail.com | 12345678 |
	
	@test
  Scenario Outline: Test login with valid credential
    Given User navigate to main Homepage
    When User click menu Login
    When User enter incorrect the <email> and <password>
    And Click the button Login
    Then User is navigate to Homepage

    Examples: 
      | email              | password |
      | alex90@yopmail.com | 12345678 |
