package DoWhile;
public class Fact5 {
    public void fac() {
        int fact = 1;
        int i = 5;
        do {

            fact = fact * i;
            i--;

        } while (i >= 1);

        System.out.println("factioral of 5  = " + fact);

    }

    public static void main (String[]args) {
        Fact5 obj = new Fact5();
        obj.fac();
    }

}

