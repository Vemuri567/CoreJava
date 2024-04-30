package OOPSConcpets.MethodChaining;

public class MainMethod {
    public static void main(String[] args) {
        A obj=new A();
        /*B obj1=obj.Amethod();
        C obj2=obj1.Bmethod();
        int result=obj2.add(10,20);*/
        obj.Amethod().Bmethod().add(10,20);
        A1 obj2=new C1();
        B1 obj4=obj2.add(10,20);
        obj2.add(10,20).mul(10,20);
        A1 obj3=new D1();
    }
}
