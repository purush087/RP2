Feature:
  As a User I should be able to get an error with no details on Login

  @ok
  Scenario: User SignIn
    Given User is on Landing Page
    When User Chooses to SignIn
    Then User should see an error