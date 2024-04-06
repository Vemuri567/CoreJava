package ConditionalStatements;
public class AllNumbers {
    public void numbersx() {
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
    public static void main ( String [] args)
    {
        AllNumbers obj = new AllNumbers();
        obj.numbersx();
    }

}



