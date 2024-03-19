package Methods;

public class Parameters {
    public static void main(String[] args) {

        Parameters m = new Parameters();




        int m1 = m.Multi(40, 20, 3);
        if (m1 == 2400) {
            System.out.println(m1);
            System.out.println("multiplication is true");

        } else {
            System.out.println("multiplication is false");
        }
        Parameters n = new Parameters();
        float n1 = n.Div(50.2f, 2.5f);
        System.out.println("Division is");
        System.out.print(n1);
        Parameters s = new Parameters();
        System.out.println(s.Sname("name", "address"));
        Parameters i=new Parameters();
        i.Conditions(10,20);
        if (10 < 20) {
            System.out.println("20 value is big");

        } else {
            System.out.println("10 value is big");
        }
    }

    public int Multi(int a, int b, int c) {
        int mul = a * b * c;
        return mul;
    }

    public float Div(float x, float y) {
        float div = x / y;
        return div;

    }

    public String Sname(String s1, String s2) {
        return s1;
    }

    public void Conditions(int i1, int i2) {

    }

}