package AccessModifier;

public class PublicAccessModifier {
    /*Methods

    AccessModifier returntype methodname(){}; --- without parameters
    AccessModifier returntype methodname(datatype variableName); ----with single parameter
    AccessModifier returntype methodname(datatype variableName,datatype variable2); ----with multiple parameters

    AccessModifier static returntype methodname(); --- without parameters
    AccessModifier static returntype methodname(datatype variableName); ----with single parameter
    AccessModifier static returntype methodname(datatype variableName,datatype variable2); ----with multiple parameters*/

    public void addTwoNumbers()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(a+b);

    }

}
