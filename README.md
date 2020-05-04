#BAKERY APPLICATION

This Bakery Application creates 15 baked goods and save it into a collection of data.
Each baked good has a name, price, an expiration date, one or more diet restrictions.
The Diet Restrictions considered in the Program are: (gluten, dairy, eggs, soy, tree nut, etc)

The Program allows the user to search by diet restrictions adn print all matching results.
The problem statement is taken from GitHub for a list of example products: https://sensitivesweets.com/collections/breads

All processes happen in Classes, even printing.
In the application there are a total of four classes

1 - Bakery Application Class which has the main method at which the total application start executing.
2 - Bakery Class which is used as a template to create the baked object
3 - Bakery Service Class which is used to create the arraylist of baked objects and do the searching, matching and processing
4 - Price Class which does all the formating and printing process 
    
Pseudocode (for Bakery Application class)
start
prompt user with welcome message
go to main menu method in which the user input is required
##//main menu()
    START MAIN MENU METHOD
        prompt user to enter either "all" or "diet restriction option"
        scan user input and assign to a variable
            IF(user choose "all")
                   call display all method
            ELSE
                go to diet restriction option
            END IF
    END MAIN MENU
##// display all method
    START DISPLAY ALL METHOD
        instantiate Bakery Service class
        declare arraylist of Bakery class type to recieve list of baked products
        call display all from bakery service class and assign the result from bakery service to a bakery class data structure
        instantiate print class
        send the result received from bakery service to print class        
    END DISPALY ALL METHOD
##// search diet restriction method
    START SEARCH DIET RESTRICTION METHOD
        print company heading
        prompt user to enter a diet restriction or list separated by comma
        scan user input as a string
        declare new arraylist of bakery class type to receive back the result
        declare new bakery service class object to send the restriction with the input string
        send the received arraylist into print class        
    END SEARCH DIET RESTRICTION METHOD
    
#// Bakery class pseudocode
start Bakery class
    declare private instance variables (name, price, qty, expiration date object, arraylist for diet restriction)
    declare bakery default constructor
    declare bakery constructor with all the instance variables
    declare getters() and setters() for each instance variable
end bakery class

##// Bakery Service class
start Bakery Service class
    declare arraylist of Bakery type for available bakery products
    declare arraylist of Bakery type for search result of diet restricted bakery products
    declare arraylist of Bakery type for displaying all bakery products
    declare 15 arraylist structure each one to store a bakery     
    declare localdate object
    declare bakery object loader method to always load the available bakery products before opening the shop and start service :)
    populate data to each (15) bakery arraylist
        search diet restriction method with input diet restriction string
        load bakery method()
        creat list for list of diet restrictions & send it to another helper method (if the user entered list of names separated by comma, it has to be splitted)
        // right here the program gets list of user's diet restriction names with out comma and without starting space char.
            FOR LOOP (index from zero to length of diet restrictions available)
                IF (the first character of the diet restriction name entered is space char)
                    store the substring starting from the second index
                    replace the previous name with non space char in the front
                END IF
            END FOR LP
        // check for the match of restriction names
        FOR LOOP ( index zero to number of available bakery)
            declare counter integer variable
                FOR LOOP (index from zero to a bakery object's diet restriction arraylist length)
                    FOR LOOP(index from zero to length of restriction names entered by user)
                        declare and assign a vairable to deit restriction name entered for a current index 
                        declare and assign a variable to existing list of diet restriction name
                        declare and compare the above two variables if equal and assign it to boolen var
                            IF (true)
                                counter increaments
                            END IF
                    END FOR LP        
                    declare qunatity variable of each bakery product
                        IF( quantity is greater than zero and the counter is greater than zero)
                            declare bakery type variable
                            set all the attributes to the instance (like name, price, qty, exp date, diet restriction)
                            add the bakery object to search result arraylist
                        END IF    
                END FOR LP
            return search result arraylist
end of bakery service class

##// print class
start print class
declare variable to print dashes 
    start print diet restriction bakery method with arraylist of bakery object and string as parameter
        print a sentence with "your search result for ... revealed the follwing"
        print table head for the presentation table
            FOR LOOP (index from to length of arraylist received)
                declare a string variable diet restriction and assign it default empty value
                    FOR (index from zero to lsit of each bakery object's diet restriction size)
                        IF (index is greater than zero)
                            concatenate a comma to the diet restriction string variable
                        END IF
                        concatenate value of diet restrictio name to current index
                    END FOR LP
                    print each attribute of bakery object in a formated way
            END FOR LP
        print dashes
    end print diet restriction bakery method
    // print table head method header
    make sure the print dashes variable is empty
    start concatenating
        FOR LOOP (index from zero to 167)
            print the head
        END FOR LOOP
    print dashes
    end print head method
end print class


#test data - 1 
Welcome to the Brookley's Better Bakery App!
We contain peanut, gluten, soy and dairy in our products.

To search for foods that you can eat, please enter the name of the diet restriction.
To see a list of all our foods, please type "all". all

Your search for "all" revealed the following:

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
|                      Name                    |       Price     |   Qty In Stock |       Expiration Date       |                    Diet Restriction                 |
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
|   1 - MULTI-GRAIN WHITE BREAD                |          10.95  |            100 |                  2020-07-04 | sesame, coconut, oats, legume                       |
|   2 - BANANA BREAD                           |           5.95  |            100 |                  2020-07-04 | coconut, oats, legume                               |
|   3 - 6-PACK OF MUFFINS                      |          16.50  |            100 |                  2020-07-04 | legume                                              |
|   4 - GLUTEN FREE DINNER ROLLS               |           3.00  |            100 |                  2020-07-04 | coconut, oats, legume                               |
|   5 - BEST BREADS BOX                        |          24.00  |            100 |                  2020-07-04 | soy, oats, legume                                   |
|   6 - CINNAMON BREAD                         |          10.95  |            100 |                  2020-07-04 | coconut, oats, legume                               |
|   7 - SOFT PIZZA CRUST                       |           6.95  |            100 |                  2020-08-04 | dairy, eggs, soy, sesame, coconut, oats, legume     |
|   8 - SAVOR ROLLS                            |           3.00  |            100 |                  2020-07-04 | coconut, oats, legume                               |
|   9 - LARGE HAMBURGER BUNS                   |           5.00  |            100 |                  2020-07-04 | coconut, oats, legume                               |
|  10 - SPRING HAPPY SET                       |          34.95  |              1 |                  2020-07-04 | eggs, coconut, oats                                 |
|  11 - CINNAMON RAISIN BREAD                  |          10.95  |              1 |                  2020-07-04 | coconut, oats, legume                               |
|  12 - DOZEN SAVORY EMPANADAS                 |          39.00  |              1 |                  2020-07-04 | oats, coconut, legume                               |
|  13 - 6 CUPCAKE CUPS                         |          24.95  |             10 |                  2020-05-05 | oats, legume                                        |
|  14 - ZEBRA DONUT                            |           2.75  |             10 |                  2020-05-05 | coconut, oats, legume                               |
|  15 - EASTER BASKET                          |          28.95  |             10 |                  2020-05-05 |                                                     |
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



#test data - 2
Welcome to the Brookley's Better Bakery App!
We contain peanut, gluten, soy and dairy in our products.

To search for foods that you can eat, please enter the name of the diet restriction.
To see a list of all our foods, please type "all". 
=========================================================================================
                                    BREAD & MUFFINS
FREE OF GLUTEN, DAIRY, EGGS, SOY, PEANUT, TREENUT, VEGAN, SESAME, COCONUT, OATS & LEGUME
-----------------------------------------------------------------------------------------
Please enter Diet Restrictions.
If the diet restrictions are more than one, separate names with comma: legume, soy, coconut

Your search for "legume, soy, coconut" revealed the following:

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
|                      Name                    |       Price     |   Qty In Stock |       Expiration Date       |                    Diet Restriction                 |
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
|   1 - SPRING HAPPY SET                       |          34.95  |              1 |                  2020-07-04 | eggs, coconut, oats                                 |
|   2 - EASTER BASKET                          |          28.95  |             10 |                  2020-05-05 |                                                     |
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
            
    


