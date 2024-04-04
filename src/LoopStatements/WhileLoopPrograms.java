package LoopStatements;

public class WhileLoopPrograms {
    public void factorial() {
        int fact = 1;
        int i = 1;
        while (i <= 7) {
            fact = fact * i;
            i++;
        }
        System.out.println("The value of 7! is: " + fact);
    }

    public void fibonacci() {
        int a = 0, b = 1, c;
        int i = 1;
        System.out.print("The fibonacci series is: ");
        System.out.print(a);
        System.out.print(" " + b);
        while (i <= 10) {
            c = a + b;
            a = b;
            b = c;
            i++;
            System.out.print(" " + c);
        }
    }

    public void starpattern() {
        char ch = '*';
        int i, j;
        i = 1;
        System.out.println("The star pattern is");
        while (i <= 5) {
            j = 1;
            while (j <= i) {
                System.out.print(ch);
                j++;
            }
            System.out.println();
            i++;

        }
    }
    public void sumof10nos(){
        int sum=0;
        int i=1;
        System.out.print("sumof10nos is: ");
        while(i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
    public void avgoffirst10nos(){
        int sum=0;
        int i=1;
        while(i<=10){
            sum=sum+i;
            i++;
        }
        float avg=(float)sum/10;
        System.out.println("avgoffirst10nos is: " +avg);
    }

    public void evenoddnumber(){
        int i=0;
        while(i<=10){
            if(i%2==0){
                System.out.println("Even number is  "+i);
            }
            else if(i%2==1){
                System.out.print("odd number is "+i);
            }
            System.out.println();

            i++;
        }

    }


    public static void main(String[] args){
        WhileLoopPrograms obj=new WhileLoopPrograms();
        obj.factorial();
        obj.fibonacci();
        obj.starpattern();
        obj.sumof10nos();
        obj.avgoffirst10nos();
        obj.evenoddnumber();
    }

}
