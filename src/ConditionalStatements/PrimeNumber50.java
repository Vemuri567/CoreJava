
package ConditionalStatements;
public class PrimeNumber50 {
    public static void main(String[] args) {

        for (int i=1;i<= 50;i++) {
            int count = 0;
            for (int j=1;j<= i;j++)
            {
                if (i%j == 0) {
                    count++;
                }
            }
            if (i == 1) {
                if (count == 1) {
                    System.out.println(i);
                }
            }
            if (count == 2) {
                System.out.println(i);


            }
        }
    }
}