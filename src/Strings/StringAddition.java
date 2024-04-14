package Strings;

public class StringAddition {
    public void summation(){
        String s="Vemuri123Naveen456";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                sum=sum+Character.getNumericValue(ch);
            }
        }
        System.out.println("string numeric addition is:"+sum);
    }

    public static void main(String[] args) {
        StringAddition obj=new StringAddition();
        obj.summation();
    }
}
