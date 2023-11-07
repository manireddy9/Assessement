Feature: Account Registration in Opencart using Datatable
Scenario: Register by using valid entires
Given user must be in registration page
When user clicks the registration link
When  user enter the required details
|gender|FirstName    |LastName|Email                      |password|confirm  |
|male|captainAmerican         |halla  |mango9381@gmail.com            |Mani@123|Mani@123 |

Then click the register to navigate to HomePage.
And  verify the user landed in correct page or not

