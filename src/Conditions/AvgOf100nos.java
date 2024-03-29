package Conditions;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class AvgOf100nos {
    public static void Avg (){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;

        }
        System.out.println(sum);
        float avg= (float) sum /100;
        System.out.println(avg);

    }

    public static void main(String[] args) {

        Avg();

    }
}