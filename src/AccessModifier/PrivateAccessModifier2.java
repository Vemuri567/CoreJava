package AccessModifier;

public class PrivateAccessModifier2 {
    public void additionSubtraction()
    {
        PublicAccessModifier obj=new PublicAccessModifier();
        obj.addTwoNumbers();
        PrivateAccessModifier obj1=new PrivateAccessModifier();
        //obj1.addTwoNumbers(); -- we can't access addtwonumbersmethod because it is private
        int d=11;
        int e=12;
        System.out.println(d-e);
    }
}
