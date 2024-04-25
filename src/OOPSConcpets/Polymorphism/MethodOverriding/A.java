package OOPSConcpets.Polymorphism.MethodOverriding;

public class A {
    int a,b;
    public A(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int add()
    {
        return a+b;
    }
    public void Phone(){
        System.out.println("Nokia");
    }
}
