package OOPSConcpets.MethodChaining;

public class D1 implements B1,A1{
    @Override
    public int mul(int a, int b) {
        return 0;
    }

    @Override
    public B1 add(int a, int b) {
        return new C1();
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }
}
