package WhileCondition;

public class StarPattern {
    public void star(int x)
    {
        int i=1;
        char ch='*';
    while (i<=10)
    {
i++;

        System.out.println(ch);
    }
    }

    public static void main(String[] args) {
        StarPattern obj=new StarPattern();
        obj.star(10);
    }

}