package Strings;

public class Palindrom {
    public static void main(String[] args) {
        String s="madam";
        int length=s.length();
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("given string is palindrom");
        }
        else{
            System.out.println("given string is not palindrom");
        }
    }
}
