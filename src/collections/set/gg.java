package collections.set;

import java.util.Arrays;

public class gg {
    public static void main(String[] args) {

        int a = 1;
        int b = a;
        a = 5;
        System.out.println(b);

        int [] c = {1, 2, 3, 4, 5};
        int [] d = c;
        c[0] = 0;
        System.out.println(Arrays.toString(d));

    }


}
