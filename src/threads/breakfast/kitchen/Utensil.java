package threads.breakfast.kitchen;

class Utensil {
    protected void use(int milliSeconds) {
        System.out.println("Using " + this.getClass().getSimpleName() + " for " + (milliSeconds / 1000) + "s");
        try {
            Thread.sleep(milliSeconds / Breakfast.TIMEWARP);
        } catch (InterruptedException e) {
            throw new Breakfast.BreakfastError("Thread interrupted");
        }
    }
}
