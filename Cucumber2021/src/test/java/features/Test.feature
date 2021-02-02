Feature: Addition
  Scenario Outline: Add two numbers
    Given user have <number1> and <number2>
     When user adds the numbers
     Then user gets sum as <number3>
     And user print "Success" as output
     And the result output is
     | <number1> | <number2> | <number3> |
    Examples: 
      | number1 | number2 | number3 | 
      | 2.0       | 3       | 4       | 
      | 10		| 12.0	  | 22		|	



      