package ConditionalStatements;
public class SwapingOfTwoNumbers {
    public static void main(String[] args) {

        int a = 236;
        int b = 452;
        System.out.println("Before swaping number  a is: " + a );
        System.out.println( "Before swaping number  b is:" + b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping a is: "+ a);
        System.out.println(" after swaping b is: "+ b);

    }
}