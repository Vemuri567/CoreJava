package ConditionalStatements;

public class IfElse {
    /**verify whether the given two numbers are equal or not**/
    public boolean equalNoValidation(int a,int b)
    {
        boolean flag=false;
        if(a==b)
        {
            flag=true;
        }
        return flag;
    }
    /**
    >60% first class
    >50 <60  second class
    >35 <50  third class
    <35%  fail
     **/

    public String StudentGrade(int marksPercentage)
    {
        String grade="fail";
        if(marksPercentage>=60)
        {
            grade="first class";
        }
        else if(marksPercentage>50&&marksPercentage<60){
            grade="Second class";
        }
        else if(marksPercentage>35&&marksPercentage<50){
           grade="third class";
        }
        else{
            grade="fail";
        }
        return grade;
    }

    public void VerifyOddOrEven(int no)
    {
        if(no%2==0)
        {
            System.out.println("given no is even");
        }
        else {
            System.out.println("given no is odd");
        }
    }



    public static void main(String[] args)
    {
        IfElse obj=new IfElse();
        String grade=obj.StudentGrade(29);
        System.out.println(grade);
        obj.VerifyOddOrEven(1);
    }
}
