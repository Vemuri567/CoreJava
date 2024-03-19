package Methods;

public class MethodsWithParameters {
    public float addition(float a,int b)
    {
        float sum=a+b;
        return sum;
    }

    public int totalAmount(int a,int b)
    {
        return  a+b;
    }



    public static void main(String[] args) {
        MethodsWithParameters obj=new MethodsWithParameters();
        float sum=obj.addition(20.5f,30);
        int result=obj.totalAmount(20,40);
        if(result==50)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
