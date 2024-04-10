package ConditionalStatements;
public class AverageOf100Numbers {
    public static void main(String[] args) {
       int sum = 0;
        int count = 0;
        int avg = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            count = count + 1;
        }
             avg = sum/ count;
        System.out.println("Average of the first100 numbers: " +avg);
            }

        }



