package DoWhile;

public class FibSeries {

    public static void fib()
    {
        int a=0,b=1,c;
        System.out.print(a);
        System.out.print(" "+b);
        int i=1;
        do
        {
         c=a+b;
         i++;
         System.out.print(" " +c);
         a=b;
         b=c;

        }while(i<=10);
    }
        public static void main(String[] args) {

        fib();
    }

}
