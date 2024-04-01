package LoopStatements;

public class WhileLoopPrograms {
    public void factorial() {
        int fact = 1;
        int i = 1;
        while (i <= 7) {
            fact = fact * i;
            i++;
        }
        System.out.println("The value of 7! is: " + fact);
    }

    public void fibonacci() {
        int a = 0, b = 1, c;
        int i = 1;
        System.out.print("The fibonacci series is: ");
        System.out.print(a);
        System.out.print(" " + b);
        while (i <= 10) {
            c = a + b;
            a = b;
            b = c;
            i++;
            System.out.print(" " + c);
        }
    }

   public void starpattern() {
        char ch = '*';
        int i,j;
        i=1;
       System.out.println("The star pattern is");
        while (i <= 5) {
             j = 1;
            while (j <= i) {
                System.out.print(ch);
                j++;
            }
            System.out.println();
            i++;

        }
    }

    public static void main(String[] args) {
        WhileLoopPrograms obj = new WhileLoopPrograms();
        obj.factorial();
        obj.fibonacci();
        obj.starpattern();
    }


}
