package com.bakery;

import java.util.ArrayList;

public class PrintClass {
    String print_dashes = "";

    public void printDietRestrictedBakery(ArrayList<Bakery> arr, String str1) {
        // prompt user to display what the search result revealed.
        System.out.print("Your search for \"" + str1 + "\" revealed the following:\n");
        // print output table head
        printTableHeader();
        for (int i = 0; i < arr.size(); i++) {
            // format diet restriction names separated by comma
            String dietRestrictionList = "";
            for (int j = 0; j < arr.get(i).getDietRestriction().size(); j++) {
                if (j > 0) {
                    dietRestrictionList += ", ";
                }
                dietRestrictionList += arr.get(i).getDietRestriction().get(j);
            }
            // print one record of bakery product
            System.out.printf("\n%1s %3s %1s %-38s %1s %14s  %1s %14s %1s %27s %1s %-51s %1s", "|", (i + 1),
                    "-", arr.get(i).getName(), "|", String.format("%(,.2f", arr.get(i).getPrice()), "|",
                    arr.get(i).getQuantityInStock(), "|", arr.get(i).getExpirationDate(), "|", dietRestrictionList, "|");
        }
        System.out.print(print_dashes);
    }

    public void printTableHeader() {

        print_dashes = "";
        print_dashes = "\n";
        for (int i1 = 0; i1 < 167; i1++) {
            print_dashes += "-";
        }
        System.out.print(print_dashes);
        System.out.printf("\n%1s %20s Name %20s %5s Price %5s %1s Qty In Stock %1s %5s Expiration Date %4s %2s " +
                "%18s Diet Restriction%18s", "|", " ", "|", " ", "|", " ", "|", "", " ", "|", " ", "|");

        System.out.print(print_dashes);
    }
}