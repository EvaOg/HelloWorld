package assessment1.hike;


import java.util.Collection;
import java.util.List;

public class Hiker {


        private String name;
        private String hikingArea;
        private String country;
        private int weight; // (in kilograms)
        private int height;// (in centimeters)
        private int  age = 15; //(in years)
        private boolean isFemale;

        private int maxCapat;

        private FoodItem favouriteFood; //


        private Collection<FoodItem> rucksack;
        //List<FoodItem> rucksack = new ArrayList<>();

        public Hiker() {
                this.name = "";
                this.hikingArea = "";
                this.country = "";
                this.weight = 0;
                this.height = 0;
                this.age = 0;
                this.isFemale = false;
        }

        public Hiker(String wanderer, String s, String germany, int i) {
        this.name = wanderer;
        this.hikingArea = s;
        this.country = germany.toUpperCase(); // didn't write it here, war Fehler!
        this.maxCapat = i;
        }


        public String toString() {
                StringBuilder hikerDetails = new StringBuilder();
                hikerDetails.append("The hiker details:\n");

                if (name != null) {
                        hikerDetails.append("\tThe hiker name: ").append(name).append("\n");
                }
                if (hikingArea != null) {
                        hikerDetails.append("\tThe hiking area: ").append(hikingArea).append("\n");
                }
                if (country != null) {
                        hikerDetails.append("\tThe country: ").append(country).append("\n");
                }
                if (favouriteFood != null) {
                        hikerDetails.append("\tThe country: ").append(country).append("\n");
                }

                return hikerDetails.toString();
        }


        public boolean canSurviveTheDay() {


                int caloriesNeeded = 0;
                if (isFemale) {
                        caloriesNeeded = (int) (10 * weight + 6.25 * height - 5 * age - 161);

                }
                if (!isFemale) {
                        caloriesNeeded = (int) (10 * weight + 6.25 * height - 5 * age + 5);
                }

                //Hätte keine Zeit, aber musste auch Energy vom Rucksack kalkulieren :

                double totalCalories = 0;
                System.out.println("current calories1: " + totalCalories);
                for (FoodItem item : rucksack) {
                        totalCalories += item.getEnergy();
                        System.out.println("current calories2: " + totalCalories);
                }
                return caloriesNeeded <= totalCalories;
        }

                public FoodItem getFavouriteFood () {
                        return favouriteFood;
                }

                public Collection<FoodItem> getRucksack () {
                        return rucksack;
                }

                public boolean isFemale () {
                        return isFemale;
                }

                public int getAge () {
                        return age;
                }

                public int getHeight () {
                        return height;
                }

                public int getWeight () {
                        return weight;
                }

                public String getCountry () {
                        return country;
                }

                public String getHikingArea () {
                        return hikingArea;
                }

                public String getName () {
                        return name;
                }


                public void setCountry (String country){
                        this.country = country.toUpperCase();
                        System.out.println(country);
                }

                public void setName (String name){
                        this.name = name;
                }

                public void setHikingArea (String hikingArea){
                        this.hikingArea = hikingArea;
                }

                public void setWeight ( int weight){
                        this.weight = weight;
                }

                public void setHeight ( int height){
                        this.height = height;
                }

                public void setAge ( int age){
                        this.age = age;
                }

                public void setFemale ( boolean female){
                        isFemale = female;
                }

                public void setFavouriteFood (FoodItem favouriteFood){
                        this.favouriteFood = favouriteFood;
                }

                public void setRucksack (List < FoodItem > rucksack) {
                        this.rucksack = rucksack;
                }

}
