package StringsPractice;

public class SplitingString {
public void String1() {
    String s = "india is my country";
    String reversecharacter = " ";
    for (int i = s.length() - 1; i >= 0; i--) {
        reversecharacter = reversecharacter + s.charAt(i);
        System.out.println("reverse character is:" + reversecharacter);
    }
    String reverseword = " ";
    String[] splitedstring = s.split("");
    for (int j = splitedstring.length - 1; j >= 0; j--) {
        reverseword = reverseword + splitedstring[j];
        // }
    }
}
    public void String2 () {
        String s = "Vemuri@Naveen@";
        String s1 = s.replace("@", "");
        System.out.println(s1);
    }

    public static void main(String[] args) {

            SplitingString obj= new SplitingString();
            obj.String1();
            SplitingString obj1= new SplitingString();
obj1.String2();
        }
}
