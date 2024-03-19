package Methods;

public class Parameters {
    public static void main(String[] args) {

Parameters m=new Parameters();
Parameters n=new Parameters();
Parameters s=new Parameters();
int m1=m.Multi(40,20,3);
if (m1==2400)
{
    System.out.println(m1);
    System.out.println("multiplication is true");

}
else
{
    System.out.println("multiplication is false");
}
System.out.println(n.Div(50.2f,2.5f));
System.out.println(s.Sname("name","address"));
    }

    public int Multi(int a, int b, int c)
    {
    int mul = a * b * c;
    return mul;
    }
    public float Div(float x, float y) {
        float div = x / y;
        return div;

    }
    public String Sname(String s1,String s2) {
   return s1;
    }
}

