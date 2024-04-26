package OOPSConcpets.Polymorphism.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        A parentobj=new A(10,20);
        System.out.println("A class add method output:"+parentobj.add());
        B childobj=new B(10,20);
        System.out.println("B class add method output:"+childobj.add());
        A parentref=new B(10,20);
        int parentrefop=parentref.add();
        System.out.println("A class add method output:"+parentrefop);
    }
}
