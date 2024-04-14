package Strings;

import ConditionalStatements.AllNumbers;

public class Assignmentsprograms {
    public void chracterscount() {
        //uppercase letters &lower case letters& specialcharcters &digits count
        String S = "JavA5is&*546p%eR";
        int UpperCaseCount = 0;
        int LowerCaseCount = 0;
        int DigitsCount = 0;
        int SpecialCharacterCount = 0;
        char [] characters = S.toCharArray();
        for (char ch : characters) {
            if ( Character.isUpperCase((ch)))
            {
                UpperCaseCount++;
            } else {
                if (Character.isLowerCase(ch)) {
                    LowerCaseCount++;
                } else {
                    if (Character.isDigit(ch)) {
                        DigitsCount++;
                    } else {
                        SpecialCharacterCount++;
                    }
                }
            }
        }//end for each loop

       System.out.println("Uppercase Count :"+UpperCaseCount);
        System.out.println("Lowercase Count :"+LowerCaseCount);
        System.out.println("Digitcase Count :"+DigitsCount);
        System.out.println("SpecialCharacter Count :"+SpecialCharacterCount);
} /* end of charcount method*/
    public static void main ( String [] args)
    {
        Assignmentsprograms obj = new Assignmentsprograms();
        obj.chracterscount ();
    }
}



