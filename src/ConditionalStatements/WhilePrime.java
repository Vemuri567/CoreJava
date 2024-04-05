package ConditionalStatements;

public class WhilePrime {
    public  void  prime()
    {
        int i=1;
        System.out.println("prime numbers from 1 to 50:");
        while(i<= 50)
        {
            i++;
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

