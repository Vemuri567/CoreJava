package OOPSConcpets.MethodChaining;

public class C1 implements A1,B1{
    @Override
    public B1 add(int a, int b) {
        return new C1();
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }
}
