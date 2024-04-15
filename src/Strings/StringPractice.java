package Strings;

public class StringPractice {
    public void Upperstring() {
        String s = "Automation testing tools";
        String s1 = s.toUpperCase();
        System.out.println("Convert into lower to upper:"+s1);
    }

    public void Lowerstring() {
        String s = "AUTOMATION TESTING TOOL";
        String s1 = s.toLowerCase();
        System.out.println("convert into upper to lowercase:"+s1);
    }

    public void Containgstring()
    {
        String s = "AUTOMATION TESTING TOOL";
        String s1="testing";
        boolean s2=s.contains(s1);
        System.out.println("testing contains:"+s2);
    }
    public void Indexofstring()
    {
        String s="I have learning";
        int s1=s.indexOf("v");
        System.out.println("Index of a string:"+s1);
    }
    public void lengthofstring()
    {
        String s="Rainbow colours are seven";
        int s2=s.length();
        System.out.println("length of the string is"+s2);
    }
    public void concatenationofstring()
    {
        String s="prasanna";
        String s1="samineni";
        String s2=s+s1;
        System.out.println("concatenation of two strings are:"+s2);

    }
    public void getstrings(){
        String s= "India123 is456 my789 country";
        String s1= s.replace(" ","@");
        System.out.println(s1);
    }
    public void Indexposition(){
        String s="hi all, how are you";
        int s1=s.indexOf('l');
        System.out.println(" l index position is:"+s1);

    }
    public void Substrings(){
        String s="India is my country is";
        String substring="are";
        if(s.contains(substring)){
            int length=substring.length();
            int starting_index_position=s.indexOf(substring);
            System.out.println(s.substring(starting_index_position,length+starting_index_position));
        }
        else {
            System.out.println(substring+"is not available in the string:"+s);
        }
    }

    public static void main(String[] args) {
        StringPractice obj = new StringPractice();
        obj.Upperstring();
        obj.Lowerstring();
        obj.Containgstring();
        obj.Indexofstring();
        obj.lengthofstring();
        obj.concatenationofstring();
        obj.getstrings();
        obj.Indexposition();
        obj.Substrings();
    }
}
