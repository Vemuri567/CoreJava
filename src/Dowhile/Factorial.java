package Dowhile;

public class Factorial {
    public void Fact(){
        int fact=1,i=5;
        do {
                fact=fact*i;
            i--;

                System.out.println(fact);

            }
            while (i>=1);
         }
    public static void main(String[] args) {
        Factorial obj=new Factorial();
        obj.Fact();
    }
    }
