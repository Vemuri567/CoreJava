package OOPSConcpets.Abstraction;

public abstract class A {
    int a,b;
    public A(int a,int b){
        this.a=a;
        this.b=b;
    }

    public abstract int add();

    public void Phone(){
        System.out.println("Nokia");
    }

    public static int sub(){
        return 20-10;
    }
}
