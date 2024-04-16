package Strings;

public class Concatenation {
    public  String concat1(String s1, String s2){
        return s1+s2;

    }
    public int getlengthofthestring(String s){
       int length= s.length();
       return length;
    }
    public String convertuppercase(String s){
        String result= s.toUpperCase();
        return result;
    }
    public static void main(String[] args) {
        Concatenation obj=new Concatenation();
        String s1="core";
        String s2="java";
        System.out.println(s1+s2);
        System.out.println("the given letter are upper case:"+(s1+s2).toUpperCase());
        String s3=obj.concat1(s1,s2);
        if(s3.contains(s2)){
            System.out.println(true);
        }
       else {
            System.out.println(false);
        }
       int length= obj.getlengthofthestring("anusha");
       String uppercaseresult= obj.convertuppercase("india is our country");
        System.out.println("upper case result:"+uppercaseresult);
        System.out.println("length of the string is: "+obj.getlengthofthestring(uppercaseresult));
        boolean startswith =uppercaseresult.startsWith("INDIA");
        System.out.println("starts with string india is:"+startswith);

    }
}
