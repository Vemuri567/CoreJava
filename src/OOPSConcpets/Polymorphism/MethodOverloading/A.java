package OOPSConcpets.Polymorphism.MethodOverloading;

public class A {


    public void add(int a,int b){
        System.out.println(a+b);
    }

   /* public int add(int a,int b){
        return a+b;
    }*/
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(float a,float b)
    {
        System.out.println(a+b);
    }
    public void add(float a,int b)
    {
        System.out.println(a+b);
    }
    public void add(B obj){
        obj.mul(10,20);
    }
}
