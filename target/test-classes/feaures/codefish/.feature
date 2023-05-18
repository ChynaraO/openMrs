@regression
Feature: Register user into e-commerce
  Background:
    When user clicks register button
    And user provides '<username>' and '<password>' and user clicks register button and clicks Give user ADMIN role

  Scenario Outline: : Happy path username and password
    Then user is on the main page
    Examples:
      | username | password |
      | 386      | 386      |
      | 388      | 386      |

  Scenario Outline: Negative username and password
    Then user validates the '<message>'
    Examples:
      | username    | password    | message                |
      | 386         | codefish386 | Username already taken |
      | 386         |             | Username already taken |
      |             |             | Username already taken |
      |             | codefish387 | Username already taken |
      | codefish387 |             | Username already taken |

#  Scenario: Negative existing username and empty password
#    When user clicks register button
#    And user provides existing username and empty password
#    And user clicks register button and clicks Give user ADMIN role
#    Then there is a message 'Username already taken'
#
#  Scenario: Negative empty username and empty password
#    When user clicks register button
#    And user provides empty username and empty password
#    And user clicks register button and clicks Give user ADMIN role
#    Then there is a message 'Username already taken'
#
#  Scenario: Negative empty username and password
#    When user clicks register button
#    And user provides empty username and password
#    And user clicks register button and clicks Give user ADMIN role
#    Then there is a message 'Username already taken'
#
#  Scenario: Negative username and empty password
#    When user clicks register button
#    And user provides username and empty password
#    And user clicks register button and clicks Give user ADMIN role
#    Then there is a message 'Username already taken'
