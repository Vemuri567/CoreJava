package OOPSConcpets.Polymorphism.MethodOverriding;

public class B extends A{
    int a,b;
   public B(int a, int b) {
        super(a, b);
    }
    public int add(){
        int parentSum=super.add();
        return parentSum+10;
    }

    public void Phone(){
        System.out.println("iphone14");
    }
    public int sub(){
        return a-b;
    }
}
