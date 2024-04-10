package DoWhile;

public class AvgOf100 {
    public static void Avg (){
        int sum=0, i =1;
        do
        {
            sum=sum+i;
              i++;
        }while (i<=100);

        System.out.println(sum);
        float avg= (float) sum /100;
        System.out.println(avg);

    }

    public static void main(String[] args)
    {
        AvgOf100 obj =new AvgOf100();
        obj. Avg();
    }
}
