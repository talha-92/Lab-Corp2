Feature: Career Search
  Scenario: How to find a job

    Given I open the browser
     When I navigate to career page
    And I search for a job
    And I select a job
    Then I apply
