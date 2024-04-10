package ConditionalStatements;

public class WhileFibonacci {
    public void fibonacci() {
        int a = 0;
        int b = 1;
        int c = 0;
        int i = 1;
        while (i <= 20) {
            i++;
            System.out.println("fibonacci series : " + c);
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        WhileFibonacci obj = new WhileFibonacci();
        obj.fibonacci();

    }

}



