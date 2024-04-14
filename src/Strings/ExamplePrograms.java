package Strings;

public class ExamplePrograms {
    public static void main(String[] args) {
        //find the length if the string
        String s= "java is super";
        System.out.println("length of the given string :"+ s.length());
        // trim method is used for remove staring space and ending space in a given string
        String S1= " java is super ";
        System.out.println("length of the given string is : "+ S1.trim().length());
        //To find the count of the numbers of words
        String[] splitedstring= s.split(" ");
        System.out.println("words of the given string :" + splitedstring.length);
        //Number of occurences (or)duplicate Charcter in a given string
        String s2= "Hello world";
        String duplicateString="";
        for(int i=0;i<=s2.length()-1;i++)
        {
            char ch=s2.charAt(i);
            if(!duplicateString.contains(String.valueOf(ch))){
                duplicateString=duplicateString+ch;
            }
            System.out.println(duplicateString);
    }
}
}
