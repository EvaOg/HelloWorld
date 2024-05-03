package all_methods;

public class Continue {
    public static void main(String[] args) {

        int i = 20;

        for(int j = 0; j < i; j++) {
            if (j % 2 == 0) {
                continue;
            } else {
                System.out.println(j);
            }
        }
    }
}
