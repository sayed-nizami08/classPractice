Feature: Access Test Environment from Tek School Page
  

  @test
  Scenario: Access Test Environment and check for environment title
    Given User is on Tek School of America Web Page
  	When User Navigates to Test Environment
    Then TEK SCHOOL is displayed 


