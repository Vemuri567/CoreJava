package OOPSConcpets.Abstraction;

public class Main {
    public static void main(String[] args) {
      /*  A parentobj=new A(10,20);
        System.out.println("A class add method output:"+parentobj.add());*/
       /* B childobj=new B(10,20);
        System.out.println("B class add method output:"+childobj.add());*/

        B obj=new B(20,30);
        System.out.println(B.sub());
        System.out.println(obj.add());
        System.out.println(obj.mul());
        obj.Phone();
        //A obj1=new A(8,9);
        A parentref=new B(10,20);
        System.out.println(A.sub());
        int parentrefop=parentref.add();
        //System.out.println(parentrefop);
        parentref.Phone();
        System.out.println("A class add method output:"+parentrefop);
    }
}
