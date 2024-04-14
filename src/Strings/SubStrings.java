package Strings;

public class SubStrings {
    public static void main(String[] args) {
        String name="VemuriNaveen";
        /**two ways of a substring :: stringvariable.substring(startindex)
         stringvariable.substring(startindex,endindex)
         startindex is include and endindex is exclude

         */
        String name1=name.substring(0);
        System.out.println(name.substring(0));
        System.out.println(name.substring(4));
        System.out.println(name.substring(0,3));
        System.out.println(name.length());
        String s="higoodmorninghowareyou";
        /** Find inex in a string::string.indexof(startchar)**/
        if(s.contains("goodmorning"))
        {
            String substring="goodmorning";
            int substringlength=substring.length();
            int startindexpos=s.indexOf("goodmorning");
            System.out.println(s.substring(startindexpos,substringlength+startindexpos));
        }
        if(s.contains("g")){
            int startindexpos=s.indexOf('g');
            System.out.println(s.indexOf('g'));
            int endindex=s.indexOf('g',startindexpos+1);
            System.out.println(s.indexOf('g',startindexpos+1));
            System.out.println(s.substring(startindexpos,endindex+1));
        }
    }
}
