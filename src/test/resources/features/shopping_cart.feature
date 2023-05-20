Feature: Shopping cart in SwagsLabs
  Me being QA automation
  I need to select products
  To ensure the correctness of the shopping cart

  @ANDROID
  Scenario Outline: Shopping cart
    Given the user enters his credentials
      | user     | standard_user |
      | password | secret_sauce  |
    When the user selects the <product>
    Then he can view <product> it in the shopping cart
    Examples:
      | product                |
      | Camisa Sauce Labs Bolt |

  @IOS
  Scenario Outline: Shopping cart
    Given the user enters his credentials in ios
      | user     | standard_user |
      | password | secret_sauce  |
    When the user in ios selects the <product>
    Then he can view <product> it in the shopping cart in ios
    Examples:
      | product                |
      | Camisa Sauce Labs Bolt |

