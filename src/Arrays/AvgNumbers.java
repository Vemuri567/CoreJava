package Arrays;

public class AvgNumbers {
    public static void main(String[] args) {


        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int length = numbers.length;
        int sum=0;
        for(int i=0; i< length ;i++)
        {
            System.out.println(numbers[i]);
            if(numbers[i]%2 ==0)
            {
                sum = sum + numbers[i];

            }

        }
         double avg = (double) sum / length;
        System.out.println("average of given numbers :" +avg);

        

    }
}





