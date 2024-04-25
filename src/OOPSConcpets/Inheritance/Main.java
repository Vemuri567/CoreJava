package OOPSConcpets.Inheritance;

public class Main {
    public static void main(String[] args) {
        C grandChildobj=new C(10);
        grandChildobj.ParentBalance();
        grandChildobj.ChildBlanace();
        grandChildobj.GrnadChildMethod();
        /*B.c=30;
        B.d=40;
        System.out.println(B.c);
        System.out.println(B.d);*/
        B obj=new B(10);
        obj.ParentBalance();
        obj.ChildBlanace();
        obj.ChildBlanace1();
        obj.a=10;
        obj.b=20;
        /*A obj1=new A();
        obj1.ParentBalance();
        obj1.a=10;
        A obj2=new B();
        obj2.ParentBalance();
        obj2.a=10;*/
    }
}
