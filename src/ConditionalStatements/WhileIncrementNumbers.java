package ConditionalStatements;

public class WhileIncrementNumbers {
    public void incrementnumbers() {
        int r = 1, x = 1;

        while (r <= 5) {
            int c = 1;
            while (c <= r) {
                System.out.println(x + "\t");
                c++;
                x ++;
            }
            System.out.println("\n");
            r++;
        }
    }

    public static void main(String[] args)

    {
        WhileIncrementNumbers obj = new WhileIncrementNumbers();
        obj.incrementnumbers();
    }
}

