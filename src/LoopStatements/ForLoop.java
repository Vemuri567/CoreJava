package LoopStatements;

public class ForLoop {

    public static void Sumoffirst10Nos()
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first10nos is:"+sum);
    }
    public static void sumOfFirst10EvenNos(){
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0){
                sum=sum+i;
            }

        }
        System.out.println("Sum of first 10 even nos:"+sum);
    }

    public static void SwappingOf2noswithThirdVariable(int a,int b)
    {
            int temp;
            temp=a;
            a=b;
            b=temp;
        System.out.println("a value:"+a);
        System.out.println("b value:"+b);
    }

    public static void SwappingOf2noswithOutThirdVariable(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value:"+a);
        System.out.println("b value:"+b);
    }

    public static  void FactorialOfaGivenNumber(int no)
    {
        int fact=1;
        int n=1;
        for(int i=n;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }

    public static void starPattern()
    {
        char ch='*';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starPattern();
        FactorialOfaGivenNumber(5);
        Sumoffirst10Nos();
        sumOfFirst10EvenNos();
        SwappingOf2noswithThirdVariable(10,5);
    }
}
