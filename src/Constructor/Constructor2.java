package Constructor;

public class Constructor2 extends Constructors{
    int a,b;
    public Constructor2(int a,int b){
        super(a, b);
        this.a=a;
        this.b=b;
    }
    public int division(){
        int c=a/b;
        return c;

    }
}
