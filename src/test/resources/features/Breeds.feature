Feature: Breeds API endpoint

  Scenario: Happy path - Valid request to GET /breeds
    When I send a GET request to "/breeds"
    Then the response status code should be 200
    And the response should contain a non-empty list of breeds

  Scenario: Happy path - Check if each item contains required fields
    When I send a GET request to "/breeds"
    Then each breed should have a breed, country, origin, coat, and pattern

  Scenario: Happy path - Validate pagination (limit=5)
    When I send a GET request to "/breeds?limit=5"
    Then the response status code should be 200
    And the response should contain exactly 5 breeds

  Scenario: Unhappy path - Invalid endpoint
    When I send a GET request to "/breedz"
    Then the response status code should be 404

  Scenario: Unhappy path - Invalid query parameter
    When I send a GET request to "/breeds?page=abc"
    Then the response should return status code 400 or a validation error

