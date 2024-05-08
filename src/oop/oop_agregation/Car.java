package oop.oop_agregation;

public class Car {

        private Wheel[] wheels;
        private Door[] doors;
        private float weight;

        public Car(Wheel[] wheels, Door[] doors, float weight) {
            this.wheels = wheels;
            this.doors = doors;
            this.weight = weight;
        }


    /**
     * calculates the total weight of a car (weight of the chassis +
     * sum of weights of doors and wheels)
     * @return the total weight as float
     */
        public float getTotalWeight() {
            float totalWeight = this.weight;

            for (Wheel el : wheels) {
                totalWeight += el.getWeight();
            }

            for (Door el : doors) {
                totalWeight += el.getWeight();
            }

            return totalWeight;

        }

    }




