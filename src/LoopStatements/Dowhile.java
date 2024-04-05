package LoopStatements;

public class Dowhile {
    public void sumOf10Nos(){
        int sum=0;
        int i=1;
        do{
            sum=sum+i;
            i++;
        }while(i<=0);
        System.out.println(sum);
    }

    public void sumOf10NosInWhileLoop(){
        int sum=0;
        int i=1;
        while(i<=0){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Dowhile obj=new Dowhile();
        obj.sumOf10Nos();
        obj.sumOf10NosInWhileLoop();
    }
}
