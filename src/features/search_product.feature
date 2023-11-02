Feature: Search Functionality

@regression
Scenario: Open Browser
Given Browser is already opened

@regression
  Scenario Outline: To validate the search functionality
    Given User is in home page
    When User enter valid "<product>" in seach field
    And User click on search button
    Then Product "<product>" should list down

    Examples: 
      | product  |
      | iPhone |    
      | MacBook Air |   
      | MacBook Pro |  
@regression      
Scenario: Close Browser
Given Closed opened

@smoke
Scenario: Smoke Testing
Given Smoke Testing
