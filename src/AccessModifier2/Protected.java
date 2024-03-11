package AccessModifier2;

import AccessModifier.ProtectedAccessModifier;
import AccessModifier.PublicAccessModifier;

public class Protected {
    public void getProtectedAccessModifer(){
        ProtectedAccessModifier obj=new ProtectedAccessModifier();
        PublicAccessModifier obj1=new PublicAccessModifier();
        obj1.addTwoNumbers();
    }
}
