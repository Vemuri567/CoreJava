package DoWhile;

import ConditionalStatements.WhilePrime;

public class PrimeDoWhile {
    public  void  prime()
    {
        int i=1;
        do{
            i++;
            System.out.println("prime numbers from 1 to 50:");
        }while(i<= 50);
        {

            int count = 0, j =1;
            while(j <= i)
            {
                if (i % j == 0)
                {
                    count++;
                }
                j ++;
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        WhilePrime obj=new WhilePrime();
        obj.prime();
    }
}



