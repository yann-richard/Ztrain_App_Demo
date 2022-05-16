#Z-Train
Feature: Application personal user operations

  Background:
    Given User is on LoginPage
    And User is connected to his account

  @TEST_28
      Scenario: log-out functionality
      And User click on account setting
      When User click on log-out button
      And User click on back button
      Then User not be able to get back on account setting

#
#  @TEST_17
#  Scenario: mix of langages
#    When User click on account setting
#    Then User should same langage for options
#
#  @TEST_10
#  Scenario: frames superpositioned
#    Given User click on account setting
#    When User click again on account setting
#    And User click on phone back button
#    Then User should return on homepage view
#
#  @TEST_29
#  Scenario: favoris contain functionality
#    When User click on favoris view
#    Then User should see favoris contain
#
#  @TEST_28
#  Scenario: log-out functionality
#    And User click on account setting
#    When User click on log-out button
#    And User click on back button
#    Then User not be able to get back on account setting
#
#  @TEST_30
#  Scenario: sign-in after log-out
#    And User click on account setting
#    When User click on log-out button
#    And User try to connect to his account
#    Then User access to his account
#
#  @TEST_14
#  Scenario: modify account info functionality
#    And User click on account setting
#    When User click on "my account"
#    Then User should see correct account spelling
#
#  @TEST_4
#  Scenario: spaces for account informations
#    And User click on account setting
#    When User click on "my account"
#    And User fill fields with space
#    Then User should see modifications not validated



#



#----------------------------------------------------------------------------------------------
# Non Automatisable :

  #  @OF-1039
#  Scenario Outline:
#    Given User is logged in at the home page
#    And He had some product in his Shopping cart already
#    And he press on the basket icon
#    When  he press on the button "Vider le panier"
#    Then The entire shopping cart of the user is removed permanently

#    @OF-1040
#    Given The user is on the cart page
#    When The user click on "Ajouter un bon d'achat" link
#    Then The user is not redirected to "ajouter un bon d'achat" page
#    And The cart page it's still displayed
#

#  OF-1062
#  Scenario Outline:
#    Given User is logged in at the home page
#    And he had some product in his shopping cart
#    And he press on the basket icon
#    When he make slide the item he want to remove to the left until it got removed from the list
#    And He press back button
#    And He press again on the basket icon
#    Then The shopping cart is listed again but without the item which got removed


#  @OF-1060
#  Scenario Outline:
#    Given The user is on <product> details page
#    When The user click on rating icon
#    Then Nothing happen
#    Examples:
#      |product                    |
#      |wireless Controller for ps4|
#      |logitech Head              |
#
#    @OF-1052
#  Scenario Outline: La recherche est non fonctionnelle
#    Given The user is on Home Page
#    When The user click on search bar
#    And enter <key_words>
#    Then nothing is displayed
#    And The Home Page it's still displayed
#    Examples:
#      |key_words|
#      |jeans    |
#      |pull     |
#
#
#      @OF-1051
#
#      Scenario:Le clique sur le bouton des favoris « cœur » envoie vers la liste des favoris
#      Given The user is on Home Page
#      When The user click on favoris icon
#      Then The user is redirected to his favoris page
##
#
#        @OF-1048
#        Scenario : Lorsque l’utilisateur clique sur log out, l’application le déconnecte sans vraiment le déconnecter. En effet, si on clique sur echap ou la flèche back, on est reconnecté directement.
#        Given The user is on his account profile page
#        When The user click on "Log Out"
#        Then The user is redirected connection page
#        And The user is able to reconnect by clicking <button> on his device
#        Examples:
#          |button|
#          |ESC   |
#          |Back  |
#
#
#        @OF-1040
#        Scenario:Le liens bon d'achat est inaccessible
#          Given The user is on the cart page
#          When The user click on "Ajouter un bon d'achat" link
#          Then The user is not redirected to "ajouter un bon d'achat" page
#          And The cart page it's still displayed
#-----------------------------------------------------------------------------------------------