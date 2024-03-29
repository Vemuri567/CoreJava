package Conditions;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class EvenOdd {

    public int OddEven(int a) {
return a;
    }


    public static void main(String[] args) {
        EvenOdd i = new EvenOdd();
     int b=i.OddEven(17);
        if (b %2==0)
        {
            System.out.println("number is Even");
        }
        else if (b %1==0)
        {
            System.out.println("num is odd");
        }

    }

}
