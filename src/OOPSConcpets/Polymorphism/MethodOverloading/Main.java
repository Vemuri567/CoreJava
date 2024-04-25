package OOPSConcpets.Polymorphism.MethodOverloading;

public class Main {

    public static void main(String[] args) {
        A obj=new A();
       obj.add(10,20);
       obj.add(10,20,30);
       obj.add(1.5f,10);
       obj.add(1.3f,1.0f);
       obj.add(new B(10,20));
    }
}
