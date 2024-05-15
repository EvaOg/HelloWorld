package assessment1.hike;

public class FoodItem {
    private String name;
    private double weight; // in kilograms
    private int energy; // in kcal

    public FoodItem(String name, double weight, int energy) {
        this.name = name;
        this.energy = energy;
        this.weight = weight;
    }



    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", energy=" + energy +
                '}';
    }
}

