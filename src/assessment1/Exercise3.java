package assessment1;

import assessment1.hike.FoodItem;
import assessment1.hike.Hiker;
import assessment1.test.Test;

public class Exercise3 {
    /*
    Finally, we need to implement our hikers 🚶‍♂️! We will create a class for them 🤓
    🚨 Follow the steps one by one and comment in the test cases to verify your results
     */
    public static void main(String[] args) {
        /*
        Exercise 3 (50P):
        a) Create a class Hiker which contains information about a hiking Java student
        The class has the following properties:
        - Strings: name, hikingArea, country,
        - int: weight (in kilograms), height (in centimeters), age (in years)
        - boolean: isFemale
        - Collection of FoodItems: rucksack
        - FoodItem: favouriteFood

        All properties must be readable with getter methods!
        If you need to extend the list above: feel free! In this case no getters (or setters) shall be implemented.

        Constructing an object must be possible without parameters.
        (Strings shall be empty then, ints shall be 0, booleans shall be false, rucksack and favouriteFood shall be null)
        There should also be a way to create a hiker object by providing name, hikingArea and country plus a maximum item
        capacity (int) of the rucksack (we'll come back to that later - you don't need to do anything with this value here,
         just keep it in mind). The property country shall always be converted to uppercase letters.
         */

        Hiker h1 = new Hiker();
        Hiker h2 = new Hiker("Wanderer", "Upper-Bavaria", "Germany", 10);

        Test.equals("Wanderer", h2.getName());
        Test.equals("GERMANY", h2.getCountry());
        Test.equals(null, h1.getRucksack());
        Test.equals(null, h1.getFavouriteFood());


        /*
        b)
        All properties shall be set with setters. When setting the property country, it shall be converted to uppercase letters.
         */
        h1.setName("Walker");
        h1.setCountry("austria");
        Test.equals("Walker", h1.getName());
        Test.equals("AUSTRIA",h1.getCountry());

        /*
        c)
        When trying to print a hiker object, we want to see a nicely formated string. Create the needed method to do this.
        The output shall print name, hikingArea, country and favouriteFood in separate lines. If any of the elements is
        empty no blank line shall appear.
        You don't need to care for the output of foodItems - just print them as they are.
         */

        // check your output with the following lines:
        System.out.print(h1);
        System.out.print(h2);

        /*
        d)
        When creating a hiker with the second way of a) we provided a maximumCapacity of the rucksack. Implement a way
        to initialize the (internal) rucksack of the hiker with exactly the right number of foodItems.
        - Encapsulate this behaviour to hide it form the world outside the object.
        - init the rucksack only with favouriteFood elements - we don't need perfectly evened nutrition 😉
        - Your solution shall work in any case (= when creating a rucksack internally AND when changing favouriteFood elements)
         */

       // Hiker h3 = new Hiker("Mad-Crawler", "South-Tyrol", "République-Togolaise", 0);
       // Hiker h4 = new Hiker("Seated-Runner", "West-Wales", "Türkiye", 42);
       // FoodItem f3 = new FoodItem("Bier", 500, 210);
     //   FoodItem f4 = new FoodItem("Sucuki", 100, 340);

       // h3.setFavouriteFood(f3);

      //  Test.equals(0, h3.getRucksack().size());
      //  h4.setFavouriteFood(f4);
     //   Test.equals(42, h4.getRucksack().size());
     //   Test.equals("Sucuki", h4.getRucksack().get(0).getName());

        /*
        e)
        Create a method canSurviveTheDay which shall be callable from the outside which checks if the contents of the rucksack are
        sufficient to provide the needed energy for a whole day.
        The calories needed for one day are calculated as follows (Mifflin-St. Jeor-Formula):
        - male hikers:   10 * body weight (kg) + 6.25 * height (cm) - 5 * age (years) + 5
        - female hikers: 10 * body weight (kg) + 6.25 * height (cm) - 5 * age (years) - 161

        If the energy of the items in the rucksack is sufficient, the method shall return true - otherwise false.
        Take care of empty and "null" rucksacks!
         */

     //   Test.equals(false, h3.canSurviveTheDay());
     //   Test.equals(true, h4.canSurviveTheDay());
        //female edge testcase
        Hiker h5 = new Hiker("Female-Runner", "Alps", "France", 1); // 1189 kcal per day
        h5.setHeight(160);
        h5.setWeight(50);
        h5.setAge(30);
        h5.setFemale(true);
        FoodItem f5 = new FoodItem("Dummy-Food1", 100, 1189);
        FoodItem f6 = new FoodItem("Dummy-Food2", 100, 1188);
        h5.setFavouriteFood(f5);
        Test.equals(true, h5.canSurviveTheDay());
        h5.setFavouriteFood(f6);
        Test.equals(false,h5.canSurviveTheDay());
    }
}