package WhileCondition;

public  class Sumof100 {
    public static void Sumof100()
    {
        int i=1,sum=0;
        while (i<=100) {
            i++;
            sum = sum + i;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Sumof100();
    }
}
