package OOPSConcpets.Interface;

public class Customer implements RBI,AmericanRBI{

    @Override
    public void xyz() {
        System.out.println("xyz");
        System.out.println(x);
    }

    @Override
    public void kyc() {
        System.out.println("kyc");
    }

    @Override
    public void minBalance() {
        System.out.println("minBalance");
    }

    @Override
    public void ROI() {
        System.out.println("ROI");
    }

    @Override
    public AmericanRBI findelement() {
        return null;
    }


    public void abc() {
        System.out.println("abc");
    }

    public void Customer(){
        System.out.println("customer");
    }
}
