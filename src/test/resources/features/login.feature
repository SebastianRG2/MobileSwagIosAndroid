Feature: Login in SwagsLabs
  Me being QA automation
  I need to enter the login
  To ensure the proper functioning of this

  @IOS
  Scenario Outline: Login succesfully in IOS
    Given that the user enters the mobile app in ios
    When the user enters his credentials in ios
      | user     | <user>     |
      | password | <password> |
    Then the user will be able to observe the successful login in ios
    Examples:
      | user          | password     |
      | standard_user | secret_sauce |

  @ANDROID
  Scenario Outline: Login succesfully
    Given that the user enters the mobile app
    When the user enters his credentials
      | user     | <user>     |
      | password | <password> |
    Then the user will be able to observe the successful login
    Examples:
      | user          | password     |
      | standard_user | secret_sauce |






