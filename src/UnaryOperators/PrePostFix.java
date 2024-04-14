package UnaryOperators;

public class PrePostFix {
    public static void main(String[] args) {
        int x=10;
        x=x++;
        System.out.println(x++);//postfix
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
    }
}
