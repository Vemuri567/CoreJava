package Strings;

public class StringExamples {

    public static void main(String[] args) {
        //string declararions by using 2 ways
        String s="india";
        String s1=new String("India");
        System.out.println("given string s1 value is:"+s1);
        System.out.println("given string s value is:"+s);
        //to find length of a string
        System.out.println("length of s string:"+s.length());
        System.out.println("Length of s1 string:"+s1.length());
        //to get all chars in a string into upper case
        System.out.println("All characters in a string to Uppercase:"+s.toUpperCase());
        System.out.println("All characters in a string to lowercase:"+s.toLowerCase());
        //to get particular character from a string
        System.out.println("Retrrieve particular character:"+s.charAt(0));
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch=s.charAt(i);
            System.out.println("Character at index position "+i+"is:"+ch);
        }
        //Reverse characters of a string
        String result="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            result=result+ch;
        }
        System.out.println("Reverse characters of a string:"+result);
        //contains method to verify whether your given value is available in a string or not
        System.out.println("Verify d char in a string:"+s.contains("d"));
        System.out.println("Verify r char in a string:"+s.contains("r"));
        //remove duplicate characters in a string
        String duplicateString="";
        for(int i=0;i<=s.length()-1;i++)
        {
            /*String s3="123";
            System.out.println("convert string to int:"+Integer.valueOf(s3));
            int a=5;
            System.out.println("Convert int into string:"+String.valueOf(a));*/
            char ch=s.charAt(i);
            //to convert charcter datattype value into string: String.valueOf(charcter)
            if(!duplicateString.contains(String.valueOf(ch))){
                duplicateString=duplicateString+ch;
            }
            System.out.println(duplicateString);
        }
        String s4="abc"+123;
        System.out.println(s4);
        String s5=1+2+"abc"+4+5;
        System.out.println(s5);

        String s6="India is my country";
    }
}
