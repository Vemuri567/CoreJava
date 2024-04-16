package Strings;

public class SubStringIndexOf {
    public static void main(String[] args) {
        String s="all roses are beautiful";
        String expectedsubstring="roses";
        int expectedsubstringlength=expectedsubstring.length();
        System.out.println(expectedsubstringlength);
        int startingindex=s.indexOf("roses");
        System.out.println(s.indexOf("all roses are beautiful",startingindex+1));
        System.out.println(s.substring(startingindex,expectedsubstringlength+startingindex));
    }
}
