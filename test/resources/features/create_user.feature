Feature: Create an user on Reqres.in
  I want to create un user

  Scenario: Creation an user
     When you create an user
       |name    | job  |
       |willian | java |
    Then I should see the user created