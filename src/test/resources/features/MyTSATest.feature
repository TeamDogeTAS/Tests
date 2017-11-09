Feature: MyTSA Smoke Test

  Scenario: Open MyTSA and check basic functions of app
    Given The MyTSA app opens and updates

    When updates are finished, the User goes through the setup process and allows all permissions
    Then The My Favorites Page appears

