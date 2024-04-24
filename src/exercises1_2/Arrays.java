package exercises1_2;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[] {12, -22, 300, 43, 0};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        //2. Maximum and Minimum
        // Determine the maximum and minimum values from the array used in the previous exercise and print them out

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The minimum values of the array is : " + min);
        System.out.println("The maximum values of the array is : " + max);

        usingMethods();
    }


    public static void usingMethods() {
        int[] arr = {6, 15, 7, 76, 1, 9};
        int multiplier = 5;
        printMultipliedArray(multiplier, arr);
        System.out.println(multiplier);
        /*Even though I have added 1 to multiplier ant arr is multiplied to 6, we still see 5.
        It happens because multiplier was changed inside of method(function);*/

    }
    private static void printMultipliedArray(int multiplier, int[] arr){
            multiplier = multiplier + 1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * multiplier;
            }

        System.out.println(java.util.Arrays.toString(arr));

            /*The arr was changed because I haven't created a new arr to record changed numbers.
            These changes happened on the string 57.*/

    }


}

