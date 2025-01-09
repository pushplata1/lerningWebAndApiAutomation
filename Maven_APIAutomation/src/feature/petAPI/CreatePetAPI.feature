Feature: PET API


  Scenario Outline:  Validate the CreatePetAPI with Mutilple Dong Breaed name

    Given Add header map details
          |Key|Value|
          |Content-Type|application/json|
          |accept|*/*|
    And Add RequestBody <FileName>
    When  Enter <MethodType> <EndPoint> CreatePetApi
    Then Validate the status <code>
    Examples:
      | EndPoint  | code |MethodType|FileName|
      |"/v2/pet"|200|"POST"|"FileName"|



