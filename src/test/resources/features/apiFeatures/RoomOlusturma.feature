Feature: room post testi

  @PostApiRequestRoom
  Scenario: test room api

    Given user sends a post request for rooms data
    And   user gets the room data and validates