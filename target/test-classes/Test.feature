Feature: Trigger the API and validate response

  @TestCase_01  @Test
  Scenario: Validate API details
    Given I trigger the get API
    Then I verify API statuscode
    Then I verify title
