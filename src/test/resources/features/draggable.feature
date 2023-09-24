@Interactions
Feature: Interactions Menu

    As a tester I want to open interaction section menu on website jQueryiu. Start from landing page, select draggable menu until sortable menu.

    Scenario: Interactions Menu
        Given User already on website jQueryui.com
        When User clicks Draggable menu
        And User already on draggable menu page
        And User clicks and hold the object
        Then User clicks Droppable menu