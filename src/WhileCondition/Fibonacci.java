package WhileCondition;

public class Fibonacci {
    public static void fib(){
        int a=0,b=1,c,i=0;
        System.out.print(a);
        System.out.print(b);

        while (i<20)
        {
            i++;
            c=a+b;
            a=b;
            b=c;
            System.out.print(c);

        }

    }

    public static void main(String[] args) {
       fib();

    }
}
