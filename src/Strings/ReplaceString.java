package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceString {
    public static void main(String[] args) {
        String s="pothineni ravishankar";
        String op="pothinani ravishankar";
        System.out.println(s.replace("pothineni","pothinani"));
        String s1="123@4567@89";
        System.out.println(s1.replaceFirst("@",""));
        System.out.println(s1.replace("@",""));
        //System.out.println(s1.replace('@',''));
        String s2="123@naveen +vemuri#java*";
        /*s2=s2.replace("@","");
        s2=s2.replace("+","");
        s2=s2.replace("#","");
        s2=s2.replace("*","");
        System.out.println(s2);*/
        String s3="abc123def";
        System.out.println(s2.replaceAll("\\d",""));
        String s4="Cheese Milk! 12345? cutter 3456";
        String[] splittedString=s4.split(" ");
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        int count=0;
        for(int i=0;i<=splittedString.length-1;i++)
        {
            boolean f=Pattern.matches("[^A-Za-z0-9]",splittedString[i]);
            Matcher m = p.matcher(splittedString[i]);
            // boolean b = m.matches();
            boolean b = m.find();
            if(!b)
            {
                System.out.println(splittedString[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
