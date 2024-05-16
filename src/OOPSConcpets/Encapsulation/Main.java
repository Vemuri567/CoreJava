package OOPSConcpets.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setEmpId("120s");
        String empid=emp.getEmpId();
        System.out.println(empid);
    }
}
