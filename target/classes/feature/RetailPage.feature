@TestallRetailFeatures
Feature: Retail Page

  # For this feature you have to have an existing account
  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username "sahbanishukria@gmail.com"  and password "123456"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @RegisterAnAffilateUser
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | Company    | WebSite     | TaxID     | PaymentMethod | chequePayeeName |
      | TheCompany | www.chc.org | 123456789 | Cheque        | Eimaan          |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @EditAffiliateInformation
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | BankName | BranchNumber | SwiftCode | AccountName | AccountNumber |
      | BOFA     |     76326329 |    123456 | Michael     |     123456789 |
    And User click on Continue button
    Then User should see a success message

  @EditAccountInformation
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName   | email           | telephone  |
      | Ellen     | DeGenerous | Ellen@gmail.com | 5713976327 |
    And User click on continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’
