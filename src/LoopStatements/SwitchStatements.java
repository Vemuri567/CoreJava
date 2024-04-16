package LoopStatements;

public class SwitchStatements {
    public static void main(String[] args) {
        int[] i={1,2,3,4,5,6,7};
        //1 - name
        //2=age
        //3=class
        //4=job
        //5=grade
        //6==salary
        int option=9;
        switch (option)
        {
            case 1:System.out.println("name");break;
            case 2 :
                System.out.println("age");
               break;
            case 3:
                System.out.println("class");break;
            case 4:
                System.out.println("job");break;
            case 5:
                System.out.println("grade");break;
            case 6:
                System.out.println("salary");break;
            default:
                System.out.println("your option is not available");
        }
        String res=SwitchStatements.switchwithintoption(3);
        System.out.println(res);
    }

    public static String switchwithintoption(int no)
    {
        String result="";
        switch (no)
        {
            case 1:result="name";break;
            case 2 :
                result="Age";
                break;
            case 3:
                result="Class";break;
            case 4:
                result="job";break;
            case 5:
               result="grade";break;
            case 6:
                result="salary";break;
            default:
                result="your option is not available";
        }
        return result;
    }
}
