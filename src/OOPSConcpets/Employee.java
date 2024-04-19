package OOPSConcpets;

public class Employee {

    String name;
    int age;
   public Employee(String name,int age){
       this.name=name;
       this.age=age;
   }
    public void dispaly()
    {
        System.out.println(name+" age is:"+age);
    }

}
