Feature:Login FUNCTIONALITY

  Scenario Outline:Login using different credential
    Given  The user is on login page
    When  Enters valid "<username>" and "<password>"
    Then User should be navigated to dashboard

    Examples:
      | username        | password      |
      | validusername   | validpassword |
      | validusername   | validpassword |

      | invalidusername | validpassword |
      | invalidusername | validpassword |




