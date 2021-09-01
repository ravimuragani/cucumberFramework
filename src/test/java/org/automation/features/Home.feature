Feature: verify user landed on Home Page after Login and profile displayed after click on profile
  @E2E
  Scenario: User landed on home page and click on profile
    Given user logged in
    When click profile tab
    Then profile tab is opened