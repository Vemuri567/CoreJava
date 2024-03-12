package Methods;

public class VoidType {
    public static void addition()
    {
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

    public static int add(){
        int a=20;
        int b=30;
        int c=a+b;
        return c;
    }

    public void sub(){
        System.out.println(20-10);
    }

    public int addTwoNumbers()
    {
        int a=20;
        int b=30;
        int c=a+b;
        return c;
    }

    public static void main(String[] args)
    {
        int a=30;
        a=a+20;
        addition();
       // Datatype variable=value;
       int sum=add();
       System.out.println("void method explanation");
       //if you want to access nonstatic method in the static method either you can create object of that class and access that method or make that method as static
        VoidType obj=new VoidType();
        obj.sub();

        int result=obj.addTwoNumbers();
        System.out.println(10+result);
    }
}
