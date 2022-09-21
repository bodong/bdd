Feature: Is it correct gender?
  Everybody wants to know if user is female or male

  Scenario Outline: user enter gender as <name>
    Given user enter is <name>
    And gender is  <gender>
    And marital status is <status>
    When generate certificate
    Then title <title> must be present before name

    Examples:
      |name|gender|status|title|
      |"Annie"|"female"|"single"|"ms"|
      |"Winnie"|"female"|"married"|"Mrs"|
      |"John"|"male"  |"single" |"Mr"|