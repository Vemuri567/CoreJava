package ConditionalStatements;
public class WhileStarProgram {
    public void starprogram() {
        char ch = '*';
        int r = 1;
        while (r <= 5) {
            int c = 1;
            while (c <= r) {
                System.out.print(ch);
                c++;
            }
            r++;
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        WhileStarProgram obj = new WhileStarProgram();
        obj.starprogram();
    }

}



