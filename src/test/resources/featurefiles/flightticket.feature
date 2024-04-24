
@tag
Feature: Booking ticket for user
  I want to book a ticket for given date 

  @tag1
  Scenario: User is in flight booking page
    Given User is selecting a country by entering key word "ind"
    And Selecting departure city by entering key word "CJB"
    When Selecting arrival city by entering key word "GOI"
    And Select depart date as "January" month "28"
    And Select return date as "February" month "14"
    
    And select currency as "INR"
    Then select option as " Indian Armed Forces" 

