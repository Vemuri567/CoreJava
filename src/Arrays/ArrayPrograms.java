package Arrays;

public class ArrayPrograms {
    public void GetValuesFromArray(){
        //Daatype[] variableName={no1,no2,n03};
        int[] a={1,2,3};

        String[] names={"anusha","prasanna","bhavani"};


        // variablename[index]
        String anushaname=names[0];
    }




    public void AddValuesinToarrayInRuntime(){
    //1 to 10
        //Daatype[] variableName=new DataType[size];
        //variableName[index]=value
        int[] sumarray=new int[10];
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
            sumarray[i-1]=sum;
        }
        //find length using arrayavriablename.length;
        //sumarray={1,3,6,...55};
         int length=sumarray.length;
        double avg=sum/length;
        System.out.println(avg);
        //iterate array
        for(int i=0;i<=length-1;i++){
            int op=sumarray[i];
            System.out.println(op);
        }

    }

    public  void First50PrimeNumbersUsingDoWhile() {
        int k=1;
        do{
            int count1=0;
            for(int j=1;j<=k;j++) {
                if (k % j == 0) {
                    count1++;
                }
            }
            if(k==1){
                if(count1==1){
                    System.out.println(k);
                }
            }
            if(k>1 && count1==2){
                System.out.println(k);
            }
            k++;
        }while(k<=50);
        for(int i=1;i<=50;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count ++;
                }

            }
            if(i==1){
                if(count==1){
                    System.out.println(i);
                }
            }
            if(count==2){
                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {
        ArrayPrograms obj=new ArrayPrograms();
        obj.AddValuesinToarrayInRuntime();
    }

}
