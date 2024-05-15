package threads.exercises.primenumbers;

public class PrimeNumber implements Runnable {

    private long number;  // test this number if it is prime
    private int id; // to distinct the thread objects later

    public PrimeNumber(long number, int id) {
        this.number = number;
        this.id = id;
    }

    private boolean isPrime() {
        for (int i = 2; i <= Math.sqrt(this.number); i++) {  // look this up if you don't understand it spontaneously
            if (this.number % i == 0) {
                return false;  // to not test tooooo long....
            }
        }
        return true;
    }

    @Override
    public void run() {
        // let the thread sleep a random time
        try {
            Thread.sleep((long) (Math.random()*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Runnable " + this.id + ": " + this.number + " is prime? " + this.isPrime());
    }
}
