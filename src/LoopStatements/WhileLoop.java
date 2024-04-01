package LoopStatements;

public class WhileLoop {
    public void SumOf10Nos()
    {
        int sum=0;
        int i=1;
        while(i<=10)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }

    public void FactorialOfAGivenNumber(int no)
    {
        int fact=1;
        int i=1;
        while (i<=no)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        WhileLoop obj=new WhileLoop();
        obj.FactorialOfAGivenNumber(6);
        obj.SumOf10Nos();
    }
}
