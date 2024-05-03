package all_methods;

public class Arrays {
    public static void main(String[] args) {
        int [] numbers = new int [5];
        //numbers[0] = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += (numbers[i] + 1) * 10;
            numbers[i] += numbers[i];
        }
        System.out.println(java.util.Arrays.toString(numbers));


        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
            System.out.println(sum);
        }

        // двумерный массив

        int[][] x = { {1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(x[0].length);
        x[0][0] = 6;
        System.out.println(x[0][0]);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }



    }
}
