package OOPSConcpets.Abstraction;

public class B extends A {
    int a,b;
    public B(int a, int b) {
        super(a, b);
        this.a=a;
        this.b=b;
    }

    public int add(){
        return a+b;
    }

    public void Phone(){
        System.out.println("iphone14");
    }

    public int mul()
    {
        return a*b;
    }

    public static int sub(){
        return 30-10;
    }

}
