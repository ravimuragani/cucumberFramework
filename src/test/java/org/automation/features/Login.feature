Feature: Test User should be able to login
#// more than 1 tag also can be given
  #// this executes always first or prerequisites
  #// background use when it required run before every test
  #// hooks to be used when it requires to run before and after specific to tags
#  Background:
#    Given check required browser
#    When invoke browser
#    Then validate browser opened
  @Sanity @Smoke
  Scenario Outline: user login to application with valid credentials
    Given Navigate to browser
    When user login to application with "<userName>" and "<password>"
    Then user successfully loggedin and enter below details
    |test|qa|123|datatable

    Examples:
      | userName | password  |
      | ravi | second |
      | ravi | third  |
