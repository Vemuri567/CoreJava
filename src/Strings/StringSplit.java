package Strings;

public class StringSplit {
    public static void main(String[] args) {
        String s = "Naveen@Vemuri@";
        System.out.println("length of given string is:" + s.length());
        String[] split = s.split("@");
        for(int i = 0; i < split.length; i++){
            System.out.print(split[i]);
        }
    }
}