package ConditionalStatements;

public class IncrementNumbers {
    public void inc(){
        int x = 1;
        for(int r = 1; r <= 5; r++)
        {
            for(int c = 1; c <= r ;c++)
            {
                System.out.print(x + " ");
                x ++;
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args){
        IncrementNumbers obj =new IncrementNumbers();
        obj.inc();

    }
}
