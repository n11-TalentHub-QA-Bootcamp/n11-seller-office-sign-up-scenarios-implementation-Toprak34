Feature: n11 so signUp
#https://so.n11.com/


  @selleroffice-signup
  Scenario: n11 selleroffice login
    Given user launch browser and open the signUp page
    When user signed in sellerOffice with valid credentials
    Then user signed in sellerOffice successfully


  @selleroffice-signup
  Scenario: n11 selleroffice login1
    Given user launch browser and open the signUp page
    When user signed in sellerOffice with valid credentials
