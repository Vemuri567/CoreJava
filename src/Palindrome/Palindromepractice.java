package Palindrome;

public class Palindromepractice {
    public void palindromes() {
        int year = 151;
        String year1 = String.valueOf(year);
        int length = year1.length();
        String reverseyear = "";
        for (int i = year1.length() - 1; i >= 0; i--) {
            reverseyear = reverseyear + year1.charAt(i);
        }
        if (year1.equals(reverseyear))
            System.out.println("given number is palindrome:");
        else
            System.out.println("given number is not palindrome:");
    }

    public void Palindrome2() {

        int year = 153;
        String year1 = String.valueOf(year);
        int length = year1.length();
        String reverseyear = "";
        for (int i = year1.length() - 1; i >= 0; i--) {
            reverseyear = reverseyear + year1.charAt(i);
        }
        if (year1.equals(reverseyear))
            System.out.println("given number is palindrome:");
        else
            System.out.println("given number is not palindrome:");

}

    public static void main(String[] args) {

        Palindromepractice obj=new Palindromepractice();
        obj.palindromes();
        obj.Palindrome2();
    }
}