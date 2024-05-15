package threads.exercises.primenumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbersTest {

    private static final int NUMBER_OF_THREADS = 10;
    private static Thread[] threads = new Thread[NUMBER_OF_THREADS];  // fixed size Array

    public static void main(String[] args) {

        // Part 0: Create Threads manually
//        Thread t1 = new Thread(new PrimeNumber(2357, 1));
//        Thread t2 = new Thread(new PrimeNumber(2358, 2));
//        Thread t3 = new Thread(new PrimeNumber(2359, 3));
//        Thread t4 = new Thread(new PrimeNumber(2360, 4));
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        // Part 1: Test 10 numbers from a given start value
//        int start = readInt("What is the starting value?");
//        int start = 123456789;
//        testPrimeThread(start);

        // Part 2: Test x numbers from a given start value
//        start = readInt("What is the starting value?");
//        int noOfTests = readInt("How many numbers shall be tested?");
        testPrimeThreadXNumbers(123456789, 200);

        // Part 3: Test numbers within a given range
//        start = readInt("Which starting value");
//        int end = readInt("Which end value?");
//        testPrimeThreadRange(start, end);

    }

    private static void testPrimeThread(int startValue) {
        // startValue = 2357
        // i | startValue + i | i + 1
        // 0 | 2357           | 1
        // 1 | 2358           | 2
        // 2 | 2359           | 3
        // 3 | 2360           | 4
        //...
        // 9 | 2366      | 10
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new threads.exercises.primenumbers.PrimeNumber(startValue + i, i + 1));
            threads[i].start();
        }
    }

    /**
     * Tests for noOfTests values from the given start value if the numbers are prime
     * @param startVal - start value
     * @param noOfTests - number of values to be tested
     */
    private static void testPrimeThreadXNumbers(int startVal, int noOfTests) {

        for (int no = startVal; no < startVal + noOfTests; no++) {
            boolean isThreadStarted = false;
            while (!isThreadStarted) {
                // walk through all threads
                for (int i = 0; i < threads.length; i++) {
                    // when a non-busy thread is found: create a new one and provide the current number to be tested
                    if (!threads[i].isAlive() && !isThreadStarted) {
                        threads[i] = new Thread(new threads.exercises.primenumbers.PrimeNumber(no,i));
                        isThreadStarted = true;
                        threads[i].start();
                    }
                }
            }
        }
    }

    private static void testPrimeThreadRange(int start, int end) {
        //TODO
    }


    /**
     * Asks the user for the input of a number of type int (via command line), and returns it
     * @param message a message that is shown to the user
     * @return  the read int-value
     */
    public static int readInt(String message)  {
        try {
            int a;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(message);
            a = Integer.parseInt(br.readLine());
            return a;
        }
        catch (IOException e) {return 42;}
    }
}
