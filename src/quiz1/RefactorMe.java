package quiz1;

        public class RefactorMe {
            public static void main(String[] args) {
                char input = 'c';
                handleB(input);
            }

            private static void handleB(char input) {
                switch (input) {
                    case 'a':
                        System.out.println("You pressed 'a'");
                        break;
                    case 'b':
                        System.out.println("You pressed 'b' and here's 10 numbers");
                        for (int i = 0; i < 10; i++) {
                            System.out.println(i);
                        }
                        break;
                    case 'c':
                        System.out.println("You pressed 'c'");
                        System.out.println("The sum of the 10 first numbers is ");
                        int sum = 0;
                        for (int i = 0; i < 10; i++) {
                            sum = sum + i;
                        }
                        System.out.println("Sum = " + sum);
                        break;
                }



            }
        }


