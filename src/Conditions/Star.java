package Conditions;

public class Star {
    public static void main(String[] args) {
        Starpattern();
        Starpattern1();

    }

    public static void Starpattern() {


        char ch = '*';

        for (int i = 5; i >= 1; i--) {


            for (int j = 2; j <= i; j++) {

                System.out.print(ch);
            }
            System.out.println(ch);


        }
    }
        public static void Starpattern1()
        {


            char ch = '*';

            for (int i = 1; i <= 5; i++) {


                for (int j = 1; j <= i; j++) {

                    System.out.print(ch);
                }

                System.out.println(ch);


            }
        }
    }













