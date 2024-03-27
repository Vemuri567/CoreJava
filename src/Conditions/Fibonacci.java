package Conditions;

public class Fibonacci {

public static void fib()
{
    int a=0,b=1,c;

    System.out.print(a);
    System.out.print(b);
    for (int i=1;i<=10;i++)
    {
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

