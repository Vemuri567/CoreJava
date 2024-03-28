package Methods;

public class Method2 {
    public static void main(String[] args) {

Method2 c=new Method2();
        Method2 d=new Method2();
c.div();
d.sname();
System.out.println(d.sname());
System.out.println(c.div());

}
public int div() {
    int a = 10;
    int b = 2;
    int c=a/b;
    return c;
}
protected static String sname()
{
    String s= "t";
    return s;
}
}