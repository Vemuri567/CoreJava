package Conditions;

public class StarDotExample {
    public static void StarDot()
    {
        char ch='*';
        char ch1='.';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0){
                    System.out.print(ch1);
                }
                else {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        StarDot();
    }
}

