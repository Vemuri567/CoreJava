package Strings;
public class StringReplacePractice {
    public static void main(String[] args) {
        String s="bhavani &bandaru #123";
        System.out.println("String is:"+s );
        System.out.println(s.replace("&","+"));
        System.out.println(s.replaceAll("[\\d\\s]",""));
        System.out.println(s.replaceAll("[^a-z]",""));
        System.out.println(s.replaceAll("[a-z]",""));
        System.out.println(s.replaceAll("\\s[&#]",""));
        String s1="123#4567$98";
        System.out.println(s1.replaceFirst("#",""));
    }
}
