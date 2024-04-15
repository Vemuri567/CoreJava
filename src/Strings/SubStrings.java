package Strings;

public class SubStrings {
    public int getindexposition(String originalString, String expectedstringposition){
        return originalString.indexOf(expectedstringposition);

    }
    public String getsubstring(String originalString , String  substring){
        String s = originalString;
        String exceptedsubstring = substring;
        String result="";
        if (s.contains(substring)) {
            int length = substring.length();
            int staringindexposition = s.indexOf(substring);
            result=s.substring(staringindexposition, length + staringindexposition);
        }
        return result;

    }
    public static void main(String[] args) {
        SubStrings obj = new SubStrings();
         int index = obj.getindexposition("my country is india and ", "india");
        String result= obj.getsubstring("my country is india and ", "india");
        System.out.println(result);

    }

}