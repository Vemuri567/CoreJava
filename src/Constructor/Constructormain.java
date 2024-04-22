package Constructor;

public class Constructormain {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        Constructors add=new Constructors(a,b);
        Constructor2 add2=new Constructor2(a,b);

      int c= add.addition();
       int d= add.substraction();
       int e= add.multiplication();
       int c1=add2.addition();
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println( "constructor2 class addition"+c1);
        if(c==c1){
            System.out.println(true);

        }
        else {
            System.out.println(false);
        }
        Constructors add1=new Constructors(7,3);
        int f= add1.addition();
        int g= add1.substraction();
        int h= add1.multiplication();
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
