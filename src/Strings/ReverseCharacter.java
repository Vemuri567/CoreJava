package Strings;

public class ReverseCharacter {
    public static void main(String[] args) {
        String s = "india is my country";
        String reversecharacter = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversecharacter = reversecharacter+s.charAt(i);

        }
        System.out.println("reversecharacter is: "+reversecharacter);
        String reverseword ="";
       String[] splitedstring= s.split(" ");
       for(int j= splitedstring.length-1; j>=0; j--){
           reverseword = reverseword + " "  + splitedstring[j];
       }
        System.out.println("reverse of a word is: "+ reverseword);
    //Remove starting and ending space of a given string
        String s3= "    hello  world    ";
        System.out.println("Remove starting and ending space of a given string;"+s3.trim());
    }
}
