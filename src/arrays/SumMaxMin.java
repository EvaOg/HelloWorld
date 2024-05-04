package arrays;

public class SumMaxMin {
    public static void main(String[] args) {
        //Write a program, which determines the sum, maximum and minimum value of this array using a for loop.
        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};

        int sum = 0;
        for (int i: input) {
            sum += i;
        }
        System.out.println(sum);

        int min = 0;
        int max = 0;
        for (int i: input) {
            if (i < min) {
                min = i;
            }
        }
        for (int i: input) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The minimum values of the array is : " + min);
        System.out.println("The maximum values of the array is : " + max);


    }
}
