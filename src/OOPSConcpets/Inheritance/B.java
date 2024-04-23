package OOPSConcpets.Inheritance;

public class B extends A{
    static  int d=20;
    int b;
    public B(int b)
    {
        super(b);
        this.b=b;
    }
    public void ChildBlanace(){
        super.ParentBalance();
        System.out.println("Child Balance");
    }

    public static void add()
    {
        System.out.println("add");
    }
    public static void ChildBlanace1(){
        System.out.println("Child Balance");
    }
}
