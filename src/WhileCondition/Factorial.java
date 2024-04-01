package WhileCondition;

public class Factorial {
    public static void factorial1(){
        int fact=1,i=1;
        while (i<=20)
        {
            i++;
            fact=fact*i;
            System.out.println(fact);
        }
    }

    public static void main(String[] args) {
        factorial1();

    }
}
