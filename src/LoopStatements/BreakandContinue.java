package LoopStatements;

public class BreakandContinue {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        //if sum of given array is gretaer than 12 then print true or false
        //index 3 don't consider that value
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
            if(i==3){
                continue;
            }
            sum=sum+a[i];
            if(sum>12)
            {
                System.out.println(true);
                break;
            }
        }
       if(sum<12)
       {
           System.out.println(false);
       }

    }
}

