package com.bakery;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BakeryService {


    ArrayList<Bakery> availableBakery = new ArrayList<>();
    ArrayList<Bakery> searchResult = new ArrayList<>();
    ArrayList<Bakery> deliverAll = new ArrayList<>();

    ArrayList<String> multiGrainRestrictions = new ArrayList<>();               // 1
    ArrayList<String> banabaRestrictions = new ArrayList<>();                   // 2
    ArrayList<String> sixPackMuffinsRestrictions = new ArrayList<>();           // 3
    ArrayList<String> dinnerRollsRestrictions = new ArrayList<>();              // 4
    ArrayList<String> bestBreadsBoxRestrictions = new ArrayList<>();            // 5
    ArrayList<String> cinnamonBreadRestrictions = new ArrayList<>();            // 6
    ArrayList<String> softPizzaCrustRestrictions = new ArrayList<>();           // 7
    ArrayList<String> savorRollsRestrictions = new ArrayList<>();               // 8
    ArrayList<String> hambergerBunsRestrictions = new ArrayList<>();            // 9
    ArrayList<String> springHappySetRestrictions = new ArrayList<>();           // 10
    ArrayList<String> cinnamonRaisinBreadRestrictions = new ArrayList<>();      // 11
    ArrayList<String> dozenSavoryEmpanadasRestrictions = new ArrayList<>();     // 12
    ArrayList<String> sixCupCakeCupsRestrictions = new ArrayList<>();           // 13
    ArrayList<String> zebraDonutRestrictions = new ArrayList<>();               // 14
    ArrayList<String> easterBasketRestrictions = new ArrayList<>();             // 15


    LocalDate d1 = LocalDate.now();
    ArrayList<String> dietRestDomain = new ArrayList<>();


    public void backeryLoader() {

        // add Multi-Grain White Bread
        multiGrainRestrictions.add("sesame");
        multiGrainRestrictions.add("coconut");
        multiGrainRestrictions.add("oats");
        multiGrainRestrictions.add("legume");
        LocalDate multiGrainWhiteDate = d1.plusMonths(2);
        Bakery multiGrainWhiteBread = new Bakery("MULTI-GRAIN WHITE BREAD", 10.95, 100, multiGrainWhiteDate, multiGrainRestrictions);
        availableBakery.add(multiGrainWhiteBread);

        // add Banana Bread
        banabaRestrictions.add("coconut");
        banabaRestrictions.add("oats");
        banabaRestrictions.add("legume");
        LocalDate bananaDate = d1.plusMonths(2);
        Bakery bananaBread = new Bakery("BANANA BREAD", 5.95, 100, bananaDate, banabaRestrictions);
        availableBakery.add(bananaBread);

        // 6-Pack of muffins
        sixPackMuffinsRestrictions.add("legume");
        LocalDate sixPackMuffinsDate = d1.plusMonths(2);
        Bakery sixPackMuffins = new Bakery("6-PACK OF MUFFINS", 16.5, 100, sixPackMuffinsDate, sixPackMuffinsRestrictions);
        availableBakery.add(sixPackMuffins);

        // Gluten free dinner rolls
        dinnerRollsRestrictions.add("coconut");
        dinnerRollsRestrictions.add("oats");
        dinnerRollsRestrictions.add("legume");
        LocalDate dinnerRollsDate = d1.plusMonths(2);
        Bakery dinnerRolls = new Bakery("GLUTEN FREE DINNER ROLLS", 3.00, 100, dinnerRollsDate, dinnerRollsRestrictions);
        availableBakery.add(dinnerRolls);

        // add Best Bread Box
        bestBreadsBoxRestrictions.add("soy");
        bestBreadsBoxRestrictions.add("oats");
        bestBreadsBoxRestrictions.add("legume");
        LocalDate bestBreadsBoxDate = d1.plusMonths(2);
        Bakery bestBreadsBox = new Bakery("BEST BREADS BOX", 24.00, 100, bestBreadsBoxDate, bestBreadsBoxRestrictions);
        availableBakery.add(bestBreadsBox);

        // add Cinnamon bread
        cinnamonBreadRestrictions.add("coconut");
        cinnamonBreadRestrictions.add("oats");
        cinnamonBreadRestrictions.add("legume");
        LocalDate cinnamonBreadDate = d1.plusMonths(2);
        Bakery cinnamonBread = new Bakery("CINNAMON BREAD", 10.95, 100, cinnamonBreadDate, cinnamonBreadRestrictions);
        availableBakery.add(cinnamonBread);

        // add Soft Pizza Crust
        softPizzaCrustRestrictions.add("dairy");
        softPizzaCrustRestrictions.add("eggs");
        softPizzaCrustRestrictions.add("soy");
        softPizzaCrustRestrictions.add("sesame");
        softPizzaCrustRestrictions.add("coconut");
        softPizzaCrustRestrictions.add("oats");
        softPizzaCrustRestrictions.add("legume");
        LocalDate softPizzaCrustDate = d1.plusMonths(3);
        Bakery softPizzaCrust = new Bakery("SOFT PIZZA CRUST", 6.95, 100, softPizzaCrustDate, softPizzaCrustRestrictions);
        availableBakery.add(softPizzaCrust);

        // add Savor Rolls
        savorRollsRestrictions.add("coconut");
        savorRollsRestrictions.add("oats");
        savorRollsRestrictions.add("legume");
        LocalDate savorRollsDate = d1.plusMonths(2);
        Bakery savorRolls = new Bakery("SAVOR ROLLS", 3.0, 100, savorRollsDate, savorRollsRestrictions);
        availableBakery.add(savorRolls);

        // add Large Hamburger Buns
        hambergerBunsRestrictions.add("coconut");
        hambergerBunsRestrictions.add("oats");
        hambergerBunsRestrictions.add("legume");
        LocalDate hambergerBunsDate = d1.plusMonths(2);
        Bakery hambergerBuns = new Bakery("LARGE HAMBURGER BUNS", 5.0, 100, hambergerBunsDate, hambergerBunsRestrictions);
        availableBakery.add(hambergerBuns);

        // add Spring Happy Set
        springHappySetRestrictions.add("eggs");
        springHappySetRestrictions.add("coconut");
        springHappySetRestrictions.add("oats");
        LocalDate springHappySetDate = d1.plusMonths(2);
        Bakery springHappySet = new Bakery("SPRING HAPPY SET", 34.95, 1, springHappySetDate, springHappySetRestrictions);
        availableBakery.add(springHappySet);

        // add Cinnamon Raisin Bread
        cinnamonRaisinBreadRestrictions.add("coconut");
        cinnamonRaisinBreadRestrictions.add("oats");
        cinnamonRaisinBreadRestrictions.add("legume");
        LocalDate cinnamonRaisinBreadDate = d1.plusMonths(2);
        Bakery cinnamonRaisinBread = new Bakery("CINNAMON RAISIN BREAD", 10.95, 1, cinnamonRaisinBreadDate, cinnamonRaisinBreadRestrictions);
        availableBakery.add(cinnamonRaisinBread);

        // add Dozen Savory Empanadas
        dozenSavoryEmpanadasRestrictions.add("oats");
        dozenSavoryEmpanadasRestrictions.add("coconut");
        dozenSavoryEmpanadasRestrictions.add("legume");
        LocalDate dozenSavoryEmpanadasDate = d1.plusMonths(2);
        Bakery dozenSavoryEmpanadas = new Bakery("DOZEN SAVORY EMPANADAS", 39.00, 1, dozenSavoryEmpanadasDate, dozenSavoryEmpanadasRestrictions);
        availableBakery.add(dozenSavoryEmpanadas);

        // add 6 Cupcake Cups
        sixCupCakeCupsRestrictions.add("oats");
        sixCupCakeCupsRestrictions.add("legume");
        LocalDate sixCupCakeCupsDate = d1.plusDays(1);
        Bakery sixCupCakeCups = new Bakery("6 CUPCAKE CUPS", 24.95, 10, sixCupCakeCupsDate, sixCupCakeCupsRestrictions);
        availableBakery.add(sixCupCakeCups);

        // add Zebra Donut
        zebraDonutRestrictions.add("coconut");
        zebraDonutRestrictions.add("oats");
        zebraDonutRestrictions.add("legume");
        LocalDate zebraDonutDate = d1.plusDays(1);
        Bakery zebraDonut = new Bakery("ZEBRA DONUT", 2.75, 10, zebraDonutDate, zebraDonutRestrictions);
        availableBakery.add(zebraDonut);
        // add Easter Basket
        easterBasketRestrictions.add("");
        LocalDate easterBasketDate = d1.plusDays(1);
        Bakery easterBasket = new Bakery("EASTER BASKET", 28.95, 10, easterBasketDate, easterBasketRestrictions);
        availableBakery.add(easterBasket);

        // populate diet restriction domain
        dietRestDomain.add("eggs");
        dietRestDomain.add("dairy");
        dietRestDomain.add("gluten");
        dietRestDomain.add("soy");
        dietRestDomain.add("tree nut");
        dietRestDomain.add("sesame");
        dietRestDomain.add("peanut");
        dietRestDomain.add("vegan");
        dietRestDomain.add("coconut");
        dietRestDomain.add("oats");
        dietRestDomain.add("legume");
    }

    public ArrayList<Bakery> searchDietRestriction(String separatedByComma1) {
        // you need to separate the comma separated string here and create an arraylist of restrictions
        backeryLoader();

        List<String> dietRestrictNames = listOfDietRestrictionNames(separatedByComma1);

        // remove the space char ' ' if user enters space char after comma
        for (int i = 0; i < dietRestrictNames.size(); i++) {
            if (dietRestrictNames.get(i).charAt(0) == ' ') {
                String str = dietRestrictNames.get(i).substring(1);
                dietRestrictNames.remove(i);
                dietRestrictNames.add(str);
            }
        }
//        // confirm if user typed diet restrictions correctly among our domain of restrictions  ?????
//    public void checkDietRestrictionNames(){
//





        String wrongNames = "";
        for (int i = 0; i < dietRestrictNames.size(); i++) {
            int count = 0;
            int temp = -1;
            for (int j = 0; j < dietRestDomain.size(); j++) {
                if(dietRestrictNames.get(i).equals(dietRestDomain.get(j))){

                    count++;
                }
                else{
                    temp = i;
                }
            }
                if(count == 0){
                    wrongNames += dietRestrictNames.get(i) + ", ";
                    dietRestrictNames.remove(i);
                    i--;
                }

        }
        // list wrong or misspelled words ... if user ever typed
        if(!wrongNames.equals("")){

                    System.out.println("\nsearch can't be made for wrong in inputs \" " + wrongNames + "\"");
        }
        else{
            // print just new line
            System.out.println();
        }



//////////////////////////////under construction/////////////////////
        /*
        for (int j = 0; j < availableBakery.size(); j++) {

            int count = 0;
            for (int k = 0; k < availableBakery.get(j).getDietRestriction().size(); k++) {
                for (int i = 0; i < dietRestrictNames.size(); i++) {

                    String nameFromInput1 = dietRestrictNames.get(i);
                    String nameFromExistingBakery = availableBakery.get(j).getDietRestriction().get(k);
                    boolean nameExists = nameFromInput1.equals(nameFromExistingBakery);

                    if (nameExists) {
                        count++;
                    }

                } // for loop i
            }   // for loop k
            int qty = availableBakery.get(j).getQuantityInStock();
            if (count == 0 && qty > 0) {
                Bakery nameResult = new Bakery();

                nameResult.setName(availableBakery.get(j).getName());
                nameResult.setPrice(availableBakery.get(j).getPrice());
                nameResult.setQuantityInStock(availableBakery.get(j).getQuantityInStock());
                nameResult.setExpirationDate(availableBakery.get(j).getExpirationDate());
                nameResult.setDietRestriction(availableBakery.get(j).getDietRestriction());

                searchResult.add(nameResult);
            }
        }
        return searchResult;


        */

//////////////////////////////under construction/////////////////////

//        }
        // check for the match of diet restrictions
        for (int j = 0; j < availableBakery.size(); j++) {

            int count = 0;
            for (int k = 0; k < availableBakery.get(j).getDietRestriction().size(); k++) {
                for (int i = 0; i < dietRestrictNames.size(); i++) {

                    String nameFromInput1 = dietRestrictNames.get(i);
                    String nameFromExistingBakery = availableBakery.get(j).getDietRestriction().get(k);
                    boolean nameExists = nameFromInput1.equals(nameFromExistingBakery);

                    if (nameExists) {
                        count++;
                    }

                } // for loop i
            }   // for loop k
            int qty = availableBakery.get(j).getQuantityInStock();
            if (count == 0 && qty > 0) {
                Bakery nameResult = new Bakery();

                nameResult.setName(availableBakery.get(j).getName());
                nameResult.setPrice(availableBakery.get(j).getPrice());
                nameResult.setQuantityInStock(availableBakery.get(j).getQuantityInStock());
                nameResult.setExpirationDate(availableBakery.get(j).getExpirationDate());
                nameResult.setDietRestriction(availableBakery.get(j).getDietRestriction());

                searchResult.add(nameResult);
            }
        }   // for (int j = 0; j < availableBakery.size(); j++)
        return searchResult;
    }

    // Helper method to the search in spliting the diet restriction names which are separated by comma
    public List<String> listOfDietRestrictionNames(String separatedByComma2) {


        String arrayOfDRNames[] = separatedByComma2.split(",");

        List<String> listedNamesAfterCommaLeft = new ArrayList<String>(Arrays.asList(arrayOfDRNames));

        return listedNamesAfterCommaLeft;
    }

    public ArrayList<Bakery> displayAllFromBS() {
        backeryLoader();
        if (availableBakery.size() > 0) {
            for (int i = 0; i < availableBakery.size(); i++) {
                int qty = availableBakery.get(i).getQuantityInStock();
                if (qty > 0) {
                    Bakery nameResult;
                    nameResult = availableBakery.get(i);
                    deliverAll.add(nameResult);
                }

            }
        }
        return deliverAll;
    }
}