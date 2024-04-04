package LoopStatements;

public class DoWhile {
    public void avgof100nos(){
        int i=1;
        int sum=0;
        do{
         sum=sum+i;
         i++;
        } while(i<=100);
        System.out.println("sum of 100 nos is "+sum);
        float avg=(float)sum/100;
        System.out.println("avg of 100 nos is "+avg);
    }
    public void factorialofgivenno(int no){
        int i=1;
        int fact=1;
        do{
            fact=fact*i;
            i++;
        }while(i<=no);
        System.out.println("factorialofgivenno is "+fact);
    }
    public void evenoddstardot() {
        char ch = '*';
        int i=0;
        do {
            int j=1;
            while(j<=i){
                System.out.print(ch);
                j++;
            }
            System.out.println();
            i++;
        }while(i<=5);
    }
    public void fibonacci(){
        int a=0,b=1,c;
        int i=1;
        System.out.print("fibonacci series is: "+a);
        System.out.print(" "+b);
        do{
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            i++;
        }while(i<=7);
        System.out.println();
    }


    public static void main(String[] args) {
        DoWhile obj=new DoWhile();
        obj.avgof100nos();
        obj.factorialofgivenno(5);
        obj.evenoddstardot();
        obj.fibonacci();
    }

}
