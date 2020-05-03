package com.bakery;

import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    static Scanner keyboard = new Scanner(System.in);
    static String input;

    public static void main(String[] args) {

        System.out.println("Welcome to the Brookley's Better Bakery App!");
        System.out.println("We contain peanut, gluten, soy and dairy in our products.");

        mainMenu();

    }   // end of main() method

    public static void mainMenu() {
        System.out.print("\nTo search for foods that you can eat, please enter the name of the diet restriction.");
        System.out.print("\nTo see a list of all our foods, please type \"all\". ");
        input = keyboard.nextLine();
        String userChoice = input;

        if (userChoice.equalsIgnoreCase("all")) {
            displayAll(userChoice);
        } else {
            searchDietRestriction(userChoice);
        }
    }

    public static void searchDietRestriction(String str2) {

        System.out.println("=========================================================================================");
        System.out.println("                                    BREAD & MUFFINS");
        System.out.println("FREE OF GLUTEN, DAIRY, EGGS, SOY, PEANUT, TREENUT, VEGAN, SESAME, COCONUT, OATS & LEGUME");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Please enter Diet Restrictions.");
        System.out.print("If the diet restrictions are more than one, separate names with comma: ");
        // scan what user's diet restrictions are
        String dietRestriction = keyboard.nextLine();

        ArrayList<Bakery> searchResultFromService;

        BakeryService breadMenu = new BakeryService();

        searchResultFromService = breadMenu.searchDietRestriction(dietRestriction);

        PrintClass printSearchResult = new PrintClass();

        printSearchResult.printDietRestrictedBakery(searchResultFromService, dietRestriction);

    }

    public static void displayAll(String str) {
        BakeryService display = new BakeryService();
        ArrayList<Bakery> displayToPrint;
        displayToPrint = display.displayAllFromBS();

        PrintClass printAllResult = new PrintClass();

        printAllResult.printDietRestrictedBakery(displayToPrint, str);

    }
}