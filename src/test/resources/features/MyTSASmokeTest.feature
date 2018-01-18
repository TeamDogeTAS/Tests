@complete
Feature: MyTSA Smoke Test
  @android
  Scenario: Open MyTSA on Android and check basic functions of app
    Given The MyTSA app opens on Android and updates
    When updates are finished, the User goes through the setup process and allows all permissions for Android
    And the My Airports Page on Android appears
    Then all pages will be checked for correctness
#  @ios
#  Scenario: Open MyTSA on iOS and check basic functions of app
#    Given The MyTSA app opens on iOS and updates
#    When updates are finished, the User goes through the setup process and allows all permissions for iOS
#    And the My Airports Page on iOS appears
#    Then all pages will be checked for correctness
