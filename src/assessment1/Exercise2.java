package assessment1;

import assessment1.hike.FoodItem;
import assessment1.test.Test;

import java.util.*;

public class Exercise2 {

    public static Collection<FoodItem> prepareRucksack(List<FoodItem> foodItems, int maxWeight) {
       // TODO Your implementation of 2a

        Set<FoodItem> backpack = new HashSet<>();
        int totalWeight = 0;

        for (FoodItem item : foodItems) {
            if ((totalWeight + item.getWeight()) <= maxWeight) {  // didn't write   && !(backpack.contains(item))   while ich Set auchewelt habe, war Fehler!
                backpack.add(item);
                totalWeight += item.getWeight();
                System.out.println(item);
            }
        }

        return backpack;

    }

    public static double calculateHikingRadius(Collection<FoodItem> rucksack) {

        double totalCal = 0;

        if (!rucksack.isEmpty()) {
            for (FoodItem item : rucksack) {
                totalCal += item.getEnergy();
            }
            double radius = totalCal / 50.0;
            return radius;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        /*
        Before starting out for their hike, the Java students prepare their rucksack. They take various food items with them
        to not get hungry (or thirsty) during their hard walk 😓.
        A rucksack is limited by the weight it can carry.
        Although some students prefer to take only beers 🍻 along, their hiking instructor tells them to select various items.
        No item shall be carried twice.
         */


        FoodItem f1 = new FoodItem("Banane", 120, 89);
        FoodItem f2 = new FoodItem("Bier", 500, 210);
        FoodItem f3 = new FoodItem("Dööner", 350, 750);
        FoodItem f4 = new FoodItem("Olivenöl", 100, 884);
        FoodItem f5 = new FoodItem("Haribo", 200, 680);
        FoodItem f6 = new FoodItem("Leberkaese", 150, 406);
        FoodItem f7 = new FoodItem("Sucuki", 100, 340);

        /*
        Exercise 2a (10P):
        Implement the method prepareRucksack which takes two parameters:
        1. an ArrayList of FoodItems (doubles may be present!)
        2. an int for the maximum weight in grams that can be put into the rucksack
        The method shall return a NEW collection with the FoodItems that fit into
        the rucksack. (Hint: take a moment to think about the best-fitting Collection!)

        - No food item shall appear twice in the result
        - if the maximum weight is reached no more items shall be put into the rucksack
        - take the FoodItems in the order of appearance (= no fancy "backtracking" algorithms needed!)
        - No validation of the FoodItems (as in Exercise 1) has to be done here!

         */

        // Test cases
        List<FoodItem> foodItems = List.of(f1,f1,f2,f5,f3,f4,f4,f5,f6,f7);
        // 1. rucksack to weak
        Collection<FoodItem> rucksack1 = prepareRucksack(foodItems, 99);
        Test.equals(true, rucksack1.isEmpty());
        // 2. only one banana
        Collection<FoodItem> rucksack2 = prepareRucksack(foodItems, 200);
        Test.equals(1, rucksack2.size());
        // 3. banana + beer
        Collection<FoodItem> rucksack3 = prepareRucksack(foodItems, 620);
        Test.equals(2, rucksack3.size());
        for (FoodItem item : rucksack3) {
            Test.equals(true, item.getName().equals("Banane") || item.getName().equals("Bier"));
        }
        // 4. only one Olivenöl
        Collection<FoodItem> rucksack4 = prepareRucksack(foodItems, 1369);
        Test.equals(5, rucksack4.size());
        Test.equals(true, rucksack4.contains(f4));
        // 5. all items once
        Collection<FoodItem> rucksack5 = prepareRucksack(foodItems, 5000);
        Test.equals(7, rucksack5.size());
        Test.equals(true, rucksack5.contains(f1));
        Test.equals(true, rucksack5.contains(f2));
        Test.equals(true, rucksack5.contains(f3));
        Test.equals(true, rucksack5.contains(f4));
        Test.equals(true, rucksack5.contains(f5));
        Test.equals(true, rucksack5.contains(f6));
        Test.equals(true, rucksack5.contains(f7));

        /*
        Exercise 2b (10P):
        A rule of thumb says that a hiker needs approx. 50 kcal per kilometer.
        Create a method calculateHikingRadius which takes a predefined rucksack (Collection)
        as parameter and returns a double value of the maximum distance (in km) that can be
        hiked when "consuming" all calories of the FoodItems in the rucksack.
        Hints:
        - don't forget to check for empty rucksacks
        - Expect the parameters to be "clean" (= valid rucksacks)
        - you don't need the implementation of 2a here
         */

        // Test cases
        // 1. empty rucksack
        List<FoodItem> r1 = new ArrayList<>();
        Test.equals(0.0, calculateHikingRadius(r1));
        r1 = null;
        Test.equals(0.0, calculateHikingRadius(r1));
        // 2. rucksack with beer
        List<FoodItem> r2 = List.of(f2);
        Test.equals(4.2, calculateHikingRadius(r2));
        // 3. rucksack with beer, sucuk, haribo
        List<FoodItem> r3 = List.of(f2,f7, f5);
        Test.equals(24.6, calculateHikingRadius(r3));
        // 4. rucksack with leberkäse, olivenöl
        List<FoodItem> r4 = List.of(f4, f6);
        Test.equals(25.8, calculateHikingRadius(r4));
        // 5. rucksack with all items
        List<FoodItem> r5 = List.of(f1, f2, f3, f4, f5, f6, f7);
        Test.equals(67.18, calculateHikingRadius(r5));
    }


}
