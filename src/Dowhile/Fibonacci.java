package Dowhile;

public class Fibonacci {
    public void fib() {
        int i = 1, a = 0, b = 1, c;
        do {
            System.out.print(a);
            System.out.print(b);
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        while (i <= 10);
        System.out.print(c);


    }
    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci();
        obj.fib();
    }
}
